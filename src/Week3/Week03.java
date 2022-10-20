package Week3;

import helpers.InputReader;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        createStudent();
    }
    public static Student createStudent() 
    {
        System.out.println("\n Creating new student\n");
        String id = InputReader.getString("Please enter your student id > ");
        String name = InputReader.getString("Please enter your student name > ");
        
        Student student = new Student(id, name);
        student.print();

        return student;
    }     
    
}
