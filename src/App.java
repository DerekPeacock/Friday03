import helpers.ConsoleColours;
import helpers.InputReader;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        printHeading(" CO452 Programming Concepts 2022/23");
        
        executeMenuChoice();
    }

    private static void printHeading(String title) 
    {
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println(" ==================================");
        System.out.println(title);
        System.out.println(" ==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

    }

    private static void executeMenuChoice()
    {
        boolean appIsRunning = true;

        printHeading(" My Brilliant Songs App");

        while(appIsRunning == true)
        {
            int choice = getMenuChoice();

            switch(choice)
            {
                case 1: addSong(); break;
                case 2: deleteSong(); break;
                case 3: printAllSongs(); break;
                case 4: printPopSongs(); break;
                case 5: appIsRunning = false; break;
            }
        }
    }

    private static int getMenuChoice()
    {
        int choice = 0;
        boolean isValid = false;

        while(isValid == false)
        {
            System.out.println("\n Please select your choice > ");
            System.out.println("\n 1. Add Song");
            System.out.println(" 2. Delete Song");
            System.out.println(" 3. Print All Songs");
            System.out.println(" 4. Print Popular Songs");
            System.out.println(" 5. Quit\n");

            choice = InputReader.getInt("Please enter your choice (1 to 5) > ");
            
            if(choice < 1 || choice > 5)
            {
                System.out.println("\n Invalid choice try again!\n");
            }
            else isValid = true;
        }

        return choice;
    }

    private static void printPopSongs() 
    {
        // TODO
        System.out.println("\n\n Print Popular Songs \n");
    }

    private static void printAllSongs() 
    {
        // TODO
        System.out.println("\n\n Print All Songs \n");
    }

    private static void deleteSong() 
    {
        // TODO
        System.out.println("\n\n Delete Old Song \n");
    }

    private static void addSong() 
    {
        // TODO
        System.out.println("\n\n Add New Song \n");
    }
}
