package Ex3;

import Ex2.SortingStudentsByGPA;
import Ex2.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args)
    {
       Ex2.Student st[] = new Ex2.Student[30];
        List<Ex2.Student> stu1 = new ArrayList<>();
        List<Ex2.Student> stu2 = new ArrayList<>();
        for (int i = 0; i < 30; i++)
        {
            st[i] = new Ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu1.add(new Ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
            stu2.add(new Ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
        }
        Comparator<Ex2.Student> comp = new SortingStudentsByGPA();
        stu1.sort(comp);
        stu2.sort(comp);
        List<Ex2.Student> stu3 = new ArrayList<>();
        int position1 = 0, position2 = 0;
        for (int i = 0; i < stu1.size() + stu2.size(); i++)
        {
            if (position1 == stu1.size())
            {
                stu3.add(stu2.get(position2));
                position2++;
            }
            else if (position2 == stu2.size())
            {
                stu3.add(stu1.get(position1));
                position1++;
            }
            else if (stu1.get(position1).getBal() > stu2.get(position2).getBal())
            {
                stu3.add(stu1.get(position1));
                position1++;
            }
            else
            {
                stu3.add(stu2.get(position2));
                position2++;
            }
        }
        System.out.println("Id: Ball:");
        for (Student i : stu3)
        {
            System.out.println(i);
        }
    }

}
