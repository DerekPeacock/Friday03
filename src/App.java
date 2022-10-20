import helpers.ConsoleColours;
import helpers.InputReader;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);
        
        printHeading();
        
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
        printTitle(" My Brilliant Songs App");

        int choice = 0;
        boolean isValid = false;

        while(isValid == false)
        {
            System.out.println(" 1. Add Song");
            System.out.println(" 2. Delete Song");
            System.out.println(" 3. Print All Songs");
            System.out.println(" 4. Print Popular Songs");
            System.out.println(" 5. Quit");

            choice = InputReader.getInt("\n Please enter your choice (1 to 5) > ");
            
            if(choice < 1 || choice > 5)
            {
                System.out.println("\n Invalid choice try again!\n");
            }
            else isValid = true;
        }

        return choice;
    }

    private static void printHeading() 
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);

        System.out.println(" ===================================");
        System.out.println(" CO452 Prograsmming Concepts 2022-23");
        System.out.println(" ===================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
    }

    private static void printTitle(String title)
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_WHITE);        
        System.out.println();
        System.out.println(title);
        System.out.println(" -----------------");
        System.out.println();
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BLACK);        
    }

    private static void printPopSongs() 
    {
        // TODO
        printTitle(" Print Popular Songs");
    }

    private static void printAllSongs() 
    {
        // TODO
        printTitle(" Print All Songs");
    }

    private static void deleteSong() 
    {
        // TODO
        printTitle("\n\n Delete Old Song");
    }

    private static void addSong() 
    {
        // TODO
        printTitle("\n\n Add New Song");
    }
}
