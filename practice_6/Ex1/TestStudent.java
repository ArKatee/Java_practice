package Ex1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void insertionSort(Student[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            Student currentElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey].getIdNumber() > currentElem.getIdNumber())
            {
                arr[prevKey+1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currentElem;
        }
    }

    public static void main(String[] args)
    {
        Student st[] = new Student[30];
        List<Student> stu = new ArrayList<>();
        for (int i = 0; i < 30; i++)
        {
            st[i] = new Student((int) (Math.random() * 200));
            stu.add(new Student((int) (Math.random() * 200)));
        }
        insertionSort(st);
        System.out.println("Sorted id:");
        for (Student i : st)
        {
            System.out.println(i);
        }
    }
}
