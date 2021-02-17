package Lesson_5.Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadTask {
    static final int threads = 2;
    static final int size = 10_000_000;
    static final int h = size / threads;
    static float[] arr = new float[size]; //for method1
    static float[] arr1 = new float[size]; //for method2

    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(Arrays.equals(arr, arr1));
    }

    public static float calculator(float array, int iterator) {
        return (float) (array * Math.sin(0.2f + iterator / 5) * Math.cos(0.2f + iterator / 5) * Math.cos(0.4f + iterator / 2));
    }

    public static void method1() {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = calculator(arr[i], i);
        }
        long b = System.currentTimeMillis();
        System.out.println("Первый метод завершил за " +((b - a)/1000.0) + " сек");
    }

    public static void method2() {
        Arrays.fill(arr1, 1);
        List<ThreadTest> thread = new ArrayList<>();
        int k = 0;
        int l = 0;
        long a = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            float[] array = new float[h];
            System.arraycopy(arr1, k, array, 0, h);
            thread.add(new ThreadTest(array, k));
            k = k + h;
        }
        for (ThreadTest t: thread) {
            t.start();
        }
        for (ThreadTest t: thread) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (ThreadTest t: thread) {
            System.arraycopy(t.a, 0, arr1, l, h );
            l = l + h;
        }
        long b = System.currentTimeMillis();
        System.out.println("Второй метод завершил за " +((b - a)/1000.0) + " сек");
    }

}


class ThreadTest extends Thread {
    float[] a; //массив
    int number;

    public ThreadTest(float[] a, int number) {
        this.a = a;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < a.length; i++) {
            a[i] = ThreadTask.calculator(a[i], number);
            number++;
        }
    }
}
