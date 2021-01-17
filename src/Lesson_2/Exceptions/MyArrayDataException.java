package Lesson_2.Exceptions;

public class MyArrayDataException  extends Exception{
    private int i,j;

    public MyArrayDataException(String message, int i, int j) {
        super("В ячейке [" + i + "," + j + "] " + message);
        this.i = i;
        this.j = j;
    }
}
