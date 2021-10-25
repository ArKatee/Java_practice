package Ex1;

public class Student {
    private int idNumber;

    public Student(int idNumber)
    {
        this.idNumber = idNumber;
    }


    public int getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public String toString()
    {
        return idNumber + " ";
    }
}
