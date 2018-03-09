/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// The HelpMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Joyce
// Date last modified: February 2018
//-------------------------------------------------------------
package byui.cit260.curiousWorkmanship.view;
import java.util.Scanner;
import curiousWorkmanship.CuriousWorkmanship;

/**
 *
 * @author joyce
 */
public class HelpMenuView extends MenuView{

    // The HelpMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    
    public HelpMenuView() {
        super("\n" +
           "**********************************\n" +
           "* CITY OF AARON: HELP GAME MENU  *\n" +
           "**********************************\n" +
           " 1 - What are the goals of the game?\n" +
           " 2 – Where is the city of Aaron?\n" +
           " 3 - How do I view the map?\n" +
           " 4 – How do I move to another location?\n" +
           " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
           " 6 - Back to the Main Menu.\n",     
        6);
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
            // if the option is 1, display what the goals of the game are
            case 1: 
                viewGoals();
                break;
            // if the option is 2, display where the city of Aaron is
            case 2: 
                viewWhere();
                break;
            // if the option is 3, display how the user views the map
            case 3: 
                viewHowMap();
                break;
            // if the option is 4, display how the user moves to another location
            case 4: 
                viewHowMove();
                break;
            // if the option is 5, display how the user displays a list of animals, 
            // provisions and tools in the city storehouse
            case  5: 
                viewHowList();
                break;
            // if the option is 6, go back to the Main Menu.
            case  6: 
                MainMenuView mmv = new MainMenuView();
                mmv.displayMenuView();
        }
    }
    
    // The viewGoals method
    // Purpose: display what the goals of the game are
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewGoals()
    {
        System.out.println("\nDisplay the viewGoals option selected.");
    }
    
    // The viewWhere method
    // Purpose: display where the city of Aaron is
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewWhere()
    {
        System.out.println("\nDisplay the viewWhere option selected.");
    }
    
    // The viewHowMap method
    // Purpose: display how the user views the map
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewHowMap()
    {
        System.out.println("\nDisplay the viewHowMmap option selected.");
    }
    
    // The viewHowMove method
    // Purpose: display how the user displays a list of animals, 
    // provisions and tools in the city storehouse
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewHowMove()
    {
        System.out.println("\nDisplay the viewHowMove option selected.");
    }
    
    // The viewHowList method
    // Purpose: display how the user moves to another location
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewHowList()
    {
        System.out.println("\nDisplay the viewHowList option selected.");
    } 



}
