package lab6;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

// выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].Mark;

// разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].Mark > opora) {
                i++;
            }

            while (array[j].Mark < opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

// вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.Mark> o2.Mark)
            return -1;
        else if (o1.Mark < o2.Mark)
            return 1;
        else return 0;
    }
}