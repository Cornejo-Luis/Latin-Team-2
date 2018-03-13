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
public class GameMenuView extends MenuView{
    
    // The GameMenuView method
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ========================================================= 
    
    public GameMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: GAME MENU        *\n" +
                "**********************************\n" +
                " 1 - View the map\n" +
                " 2 - Display/Print a list\n" +
                " 3 - Move to a new location\n" +
                " 4 - Manage the Crops \n" +
                " 5 - Return to the Main menu\n",     
        5);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
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
                return;
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
         
            //Create a new ListMenuView object.
            ListMenuView printList = new ListMenuView();
            // Display the List
            printList.displayMenuView();
        
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
        CropView.runCropsView();
    } 
       
}
