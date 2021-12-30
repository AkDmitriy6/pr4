package lab6;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        int low = 0;
        int high = students.length - 1;

        SortingStudentsByGPA.quickSort(students, low, high);

        System.out.println("Стало");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}