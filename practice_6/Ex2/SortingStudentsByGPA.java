package Ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Ex2.Student>
{
    @Override
    public int compare(Ex2.Student o1, Ex2.Student o2)
    {
        return -(o1.getBal() - o2.getBal());
    }
}