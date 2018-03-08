/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import java.util.Scanner;

/**
 *
 * @author nimrod
 */
public class ListMenuView {
    
    
    Scanner keyboard = new Scanner(System.in);
    private String TheList;
    private int max;
    
    // The  method
    // Purpose: displays the list, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================    

    public ListMenuView() {
        TheList = "\n" +
           "**********************************\n" +
           "* CITY OF AARON: Print List  *\n" +
           "**********************************\n" +
           " 1 - Animals in the storehouse\n" +
           " 2 – Tools in the storehouse\n" +
           " 3 - Provisions in the storehouse\n" +
           " 4 – Authors of this game\n" +
           " 5 - Return to the Game Menu.\n"; 

        max = 5;
    }
    
    
    public void displayMenuView()
    {
        int menuOption = 0;
        do
        {
         // Display the list
        System.out.println(TheList);
         // Prompt the user and get the user’s input
        menuOption = getMenuOption();
         // Perform the desired action
        doAction(menuOption);
         // Determine and display the next view
        } while (menuOption != max);
    }
    
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
            int userInput;
        // begin loop
            do
            {    
            // get user input from the keyboard
                userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
                if(userInput < 1 || userInput > max)
                {
                System.out.println("\noption must be between 1 and " + max);
                }   
        // loop back to the top if input was not valid
            } while(userInput < 1 || userInput > max);
        // return the value input by the user
            return userInput;      
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
        switch(option)
        {
            // if the option is 1, display the animals
            case 1: 
                viewAnimals();
                break;
            // if the option is 2, display the tools
            case 2: 
                viewTools();
                break;
            // if the option is 3, display the provisions
            case 3: 
                viewProvisions();
                break;
            // if the option is 4, display authors
            case 4: 
                viewAuthors();
                break;
            // if the option is 5, go back to the Game Menu.
            case  5: 
                GameMenuView gmv = new GameMenuView();
                gmv.displayMenuView();
        }
    }
    
    // The viewAnimals method
    // Purpose: display animals
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewAnimals()
    {
        System.out.println("\nDisplay the viewAnimals option selected.");
    }
    
    // The viewTools method
    // Purpose: display tools
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewTools()
    {
        System.out.println("\nDisplay the viewTools option selected.");
    }
    
    // The viewProvisions method
    // Purpose: display provisions
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewProvisions()
    {
        System.out.println("\nDisplay the viewHowMmap option selected.");
    }
    
    // The viewAuthors method
    // Purpose: display authors
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewAuthors()
    {
        System.out.println("\nDisplay the viewAuthors option selected.");
    }
    
   
}
