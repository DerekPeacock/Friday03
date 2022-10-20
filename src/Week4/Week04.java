package Week4;
import Week3.*;
import helpers.*;

public class Week04 
{

    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 4 Java Collections, Lists, Arrays ");
        System.out.println();
        System.out.println(" by Derek Peacock");
        System.out.println();

        executeMenuChoice();
    }
    
    private static void executeMenuChoice()
    {
        boolean appIsRunning = true;

        while(appIsRunning == true)
        {
            int choice = getMenuChoice();

            switch(choice)
            {
                case 1: addStudent();; break;
                case 2: deleteStudent(); break;
                case 3: printAllStudents(); break;
                case 4: appIsRunning = false; break;
            }
        }
    }

    private static int getMenuChoice()
    {
        System.out.println(" \nStudent Enrolment System\n");

        int choice = 0;
        boolean isValid = false;

        while(isValid == false)
        {
            System.out.println(" 1. Add Student");
            System.out.println(" 2. Delete Student");
            System.out.println(" 3. Print All Students");
            System.out.println(" 4. Quit");

            choice = InputReader.getInt("\n Please enter your choice (1 to 4) > ");
            
            if(choice < 1 || choice > 4)
            {
                System.out.println("\n Invalid choice try again!\n");
            }
            else isValid = true;
        }

        return choice;
    }

    private static void addStudent()
    {
        System.out.println("\n Adding new student\n");
        String id = InputReader.getString("Please enter your student id > ");
        String name = InputReader.getString("Please enter your student name > ");
        
        Student student = new Student(id, name);
        student.print();
    }

    private static void printAllStudents() 
    {
    }

    private static void deleteStudent() 
    {
    }
   
}
