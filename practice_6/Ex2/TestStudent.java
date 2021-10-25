package Ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args)
    {
        Ex2.Student st[] = new Ex2.Student[30];
        List<Ex2.Student> stu = new ArrayList<>();
        for (int i = 0; i < 30; i++)
        {
            st[i] = new Ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu.add(new Ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
        }
        Comparator<Student> comp = new SortingStudentsByGPA();
        stu.sort(comp);
        System.out.println("Id: Балл:");
        for (Student i: stu)
        {
            System.out.println(i);
        }
    }
}
