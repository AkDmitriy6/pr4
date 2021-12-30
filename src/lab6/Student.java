package lab6;

public class Student {
    int Mark;

    public Student(int Mark) {
        this.Mark = Mark;
    }


    @Override
    public String toString() {
        return String.valueOf(Mark);
    }
}
