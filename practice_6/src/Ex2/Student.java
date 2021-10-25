package Ex2;

public class Student {
    private int idNumber;
    private int bal;

    public Student(int idNumber, int bal)
    {
        this.idNumber = idNumber;
        this.bal = bal;
    }


    public void setBal(int bal)
    {
        this.bal = bal;
    }

    public int getBal()
    {
        return bal;
    }

    public int getidNumber()
    {
        return idNumber;
    }

    public void setidNumber(int iDNumber)
    {
        this.idNumber = iDNumber;
    }

    @Override
    public String toString()
    {
        return idNumber + " " + bal;
    }
}
