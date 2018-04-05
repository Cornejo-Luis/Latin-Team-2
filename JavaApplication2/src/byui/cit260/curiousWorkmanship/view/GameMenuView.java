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
        //Game.Map.getTheMap();
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
        // Display a message to enter coordinates
        System.out.println("\nPlease type your coordinates: " +
                            "\nEnter the x coordinate:"
                            );
        
        int cols = keyboard.nextInt();
        
        System.out.println("\nEnter the y coordinate:");
        
        int rows = keyboard.nextInt();
        
        String description;
        
        if (cols == 1 && (rows > 0 && rows<=2)) {
            description = "\nYou are on the Desert. The desert serve us a" +
                        "\nnatural protecction from beasts and the Lamanites ";
        } else if (cols == 1 && ( rows > 2 && rows <= 5)){
            description = "\nYou are on the borders near to the Lamanites. If you" +
                        "\nwant to keep yourselve save, you must return from"+ 
                        "\nwhere you came.  ";
        } else if(cols == 2 && ( rows > 0 && rows <= 5)){
            description = "\nYou are on an undeveloped land .Fifteen years ago, City of Aaron embarked" +
                          "\non a grand project to cultivate farmland in the desert and create new towns." + 
                          "\nBut massive projects like this undeveloped land have" +
                          "\nlanguished due to mismanagement and corruption." ;
        } else if(cols == 3 && rows == 1){
            description = "\nYou are on the fertile banks of the River." +
                          "\nIn the spring this low farmland floods and is covered with rich" +
                          "\nnew soil. Wheat is planted as far as you can see."; 
        } else if(cols == 3 && ( rows > 1 && rows < 5)){
            description = "\nThe village is one of the most extreme examples" +
                          "\nof City of Aaron plan to green its deserts,"+ 
                          "\nor take once-uninhabitable earth and convert it to farmland. "; 
        } else if(cols == 3 && rows == 5){
            description = "\nYou are on the Ruler's Court." +
                          "\nYou can come here whenever you feel the town is in danger.";  
        } else if(cols == 4 && rows == 1){
            description = "\nYou are on The City’s Granary and Storehouse." +
                          "\nThis is all you have in store. Be wise when spending it.";  
        } else if(cols == 4 && ( rows > 1 && rows <= 5)){
            description = "\nYou are standing in one of the city’s wheat fields." +
                          "\nThere is nothing but wheat as far as the eye can see." +
                          "\nWe hope to have a bountiful harvest this year."; 
        } else {
            description = "\nYou are on the River. The river is the source" +
                          "\nof life for our city. The river marks the eastern " +
                          "\nboundary of the city - it is wilderness to the East.";
        }
        
        System.out.print(description);
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
