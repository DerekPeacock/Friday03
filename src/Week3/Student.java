package Week3;

public class Student
{
    private String id;
    private String fullName;

    public Student(String id, String fullName) 
    {
        this.id = id;
        this.fullName = fullName;
    }

    public void print()
    {
        System.out.println(" \nStudent " + id + " " + fullName);
    }
}
