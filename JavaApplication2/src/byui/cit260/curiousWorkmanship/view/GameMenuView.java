/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// The GameMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Luis
// Date last modified: February 2018
//-------------------------------------------------------------
package byui.cit260.curiousWorkmanship.view;
import byui.cit260.curiousWorkmanship.model.Game;
import java.util.Scanner;
import curiousWorkmanship.CuriousWorkmanship;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.Location;
import byui.cit260.curiousWorkmanship.model.CropData;
import byui.cit260.curiousWorkmanship.view.CropView;
import static byui.cit260.curiousWorkmanship.view.CropView.runCropsView;

/**
 *
 * @author Luis
 */
public class GameMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theGameMenu;
    private int max;
    
    // The GameMenuView method
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ========================================================= 
    
    public GameMenuView() {
        theGameMenu = "\n" +
                "**********************************\n" +
                "* CITY OF AARON: GAME MENU        *\n" +
                "**********************************\n" +
                " 1 - View the map\n" +
                " 2 - Display/Print a list\n" +
                " 3 - Move to a new location\n" +
                " 4 - Manage the Crops \n" +
                " 5 - Return to the Main menu\n";     
        max = 5;
    }
    
    public void displayMenuView()
    {
        int menuOption = 0;
        do
        {
             // Display the menu
                System.out.println(theGameMenu);
            
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
            // if the option is 1, call viewTheMap( )  
            case 1: // View the map
                viewTheMap();
                break;
            // if the option is 2, call viewPrintList( )
            case 2: // View/Print a list
                viewPrintList();
                break;
            // if the option is 3, call moveNewLocation( )
            case 3: // Move to a new location    
                moveNewLocation();
                break;
            // if the option is 4, call manageTheCrops( )
            case 4: // Manage the Crops 
                manageTheCrops();
                break;
            // if the option is 5, return to the Main game menu view
            case 5:
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
        }
    } 
    
        
    // The viewTheMaps method
    // Purpose: display what the maps of the game are
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewTheMap()
    {
        System.out.println("\nDisplay the viewTheMaps option selected.");
    }
    
    // The viewPrintList method
    // Purpose: Provides the user with a set of list options
    // Parameters: none
    // Returns: none
    // ===================================     
    
    // The viewPrintList method
    // Purpose: list some storehouse's stuffs
    // Parameters: none
    // Returns: none
    //modified: @Nimrod
    public void viewPrintList()
    {
      System.out.println("\nDisplay the viewPrintList option selected.");  
         //Create a new DisplayList object.
            DisplayList printList = new DisplayList();
            // Display the List
            printList.displayPrintDisplayList();
        
    }
    
    // The moveNewLocation method
    // Purpose: enter the coordinates of the location on the map that they want to move to
    // Parameters: none
    // Returns: none
   
    public void moveNewLocation()
    {
        //Create a new coordinates.
        Location theSymbol = new Location();
        
        String locationn;
        
        // Display a message to enter coordinates
        System.out.println("\nPlease type your coordinates: ");
        
        locationn = keyboard.next();
        
        // Save a reference to the location object in the Location object
        theSymbol.setSymbol(locationn);
        
//        if(locationn == CuriousWorkmanship.setSymbol());
//        {
//            return CuriousWorkmanship.setSymbol(theSymbol);
//        }
    }
    
    // The manageTheCrops method
    // Purpose: display Manage the Crops
    // Parameters: none
    // Returns: none
    // ===================================     
    public void manageTheCrops()
    {
        CropView theCropView = new CropView();
        theCropView.displayCropView();
    } 

    void displayGameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
