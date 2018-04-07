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
import byui.cit260.curiousWorkmanship.model.Map;
import byui.cit260.curiousWorkmanship.model.CropData;
import byui.cit260.curiousWorkmanship.view.CropView;
import static byui.cit260.curiousWorkmanship.view.CropView.runCropsView;
import byui.cit260.curiousWorkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.Game;

/**
 *
 * @author Luis
 */
public class GameMenuView extends MenuView{
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
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
        Game theGame = CuriousWorkmanship.getTheGame( );
        Map theMap = theGame.getTheMap();
        
        System.out.println("        *** Village Map ***");
        for(int i=0; i<MAX_ROW; i++){
            System.out.print("|");
                for(int j=0; j<MAX_COL; j++){
                        String description = theMap.getLocation(i,j).getSymbol();
                        System.out.print(description);
                        if(j!= MAX_COL-1) 
                            System.out.print("\t");
            }
            System.out.println("|");
        }

        System.out.println(
                "\n  Key:\n"
                + "  |V| - Court\n"
                + "  !!! - Farm Land\n"
                + "  ~~~ - River\n"
                + "  --- - desert\n"
                + "  |=| - Lamanite Border\n"
                + "  vvv - Wheat Field\n"
                + "  .-. - Granary $ Storehouse\n"
                + "  ??? - Undeveloped land\n"
                + "  ¬_¬ - Village");
        
       
    }
    

    
    
    // The viewPrintList method
    // Purpose: list some storehouse's stuffs
    // Parameters: none
    // Returns: none
    //modified: @Nimrod
    public void viewPrintList()
    { 
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
        Game theGame = CuriousWorkmanship.getTheGame( );
        Map theMap = theGame.getTheMap();
        Player thePlayer = theGame.getThePlayer();
        
        //Get current location
        int playerCol = thePlayer.getCol();
        int playerRow = thePlayer.getRow();
        String initLoca = theMap.getLocation(playerRow,playerCol).getDescription();
        //Display current location
        System.out.println("\nRight now your coordinates are (" + playerCol + ", " + playerRow + ")."+
                            initLoca);
        
        // Display a message to enter coordinates
        System.out.println("\nEnter the coordinates of the location you want to move to. ");
        //Display a message to enter the x coordinate
        System.out.println("\nEnter the x coordinate(0-4):");                  
        int cols = keyboard.nextInt();
        //Display a message to enter the y coordinate
        System.out.println("\nEnter the y coordinate(0-4):");
        int rows = keyboard.nextInt();
        //Get description according to coordinates
        String description = theMap.getLocation(rows,cols).getDescription();
        String message = description + "\nYour new coordinates are (" + cols + ", " + rows + ")."; 
        
        //Save new coordinates
        thePlayer.setCol(cols);
        thePlayer.setRow(rows);
        
        //Display description and new coordinates
        System.out.println(message);
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
