/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Luis, Nimrod, Joyce team
// Date last modified: February 2018
//-------------------------------------------------------------
package byui.cit260.curiousWorkmanship.view;
import byui.cit260.curiousWorkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.Game;
import java.util.Scanner;
import curiousWorkmanship.CuriousWorkmanship;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.CropData;

/**
 *
 * @author joyce
 */
public class MainMenuView extends MenuView{

    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================

    public MainMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: MAIN GAME MENU  *\n" +
                "**********************************\n" +
                " 1 - Start new game\n" +
                " 2 - Get and start a saved game\n" +
                " 3 - Get help on playing the game\n" +
                " 4 - Save game\n" +
                " 5 - Quit\n",     
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
            // if the option is 1, call startNewGame( )  
            case 1: // create and start a new game
                startNewGame();
                break;
            // if the option is 2, call startSavedGame( )
            case 2: // get and start a saved game
                startSavedGame();
                break;
            // if the option is 3, call displayHelpMenu( )
            case 3: // get help menu
                displayHelpMenuView();
                break;
            // if the option is 4, call displaySaveGame( )
            case 4: // save game
                displaySaveGameView();
                break;
            // if the option is 5, display a goodbye message
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
    } 
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================      
    public void startNewGame()
    {
        // Show banner page
        System.out.println(
            "\n********************************************************\n" +
            "* Welcome to the City of Aaron. You have been summoned *\n" +
            "* by the High Priest to assume your role as ruler of   *\n" +
            "* the city. Your responsibility is to buy land, sell   *\n" +
            "* land, determine how much wheat to plant each year,   *\n" +
            "* and how much to set aside to feed the people. You     *\n" +
            "* will also be required to pay an annual tithe on the  *\n" +
            "* that is harvested. If you fail to provide      *\n" +
            "* enough wheat for the people to eat, people will die  *\n" +
            "* and your workforce will be diminished. Plan very     *\n" +
            "* carefully or you may find yourself in trouble with   *\n" +
            "* the people. And oh, watch out for plagues and rats!  *\n" +
            "********************************************************\n");  

            // Get player name, create player object, and save it in the Game
            String name;
            System.out.println("\nPlease type in your first name: ");
            name = keyboard.next();

            // welcome message
            System.out.println("\nWelcome " + name + ", have fun playing.");

            // call the createNewGame( ) method. Pass the name as a parameter
             GameControl.createNewGame(name);

            //show the game menu
            GameMenuView gmv = new GameMenuView();
            gmv.displayMenuView();

    }

    
    // The savedGame method
    // Purpose: save game 
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }
     
    // The displayHelpMenuView method
    // Purpose: display Help Menu View
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
        //Create a new HelpMenuView object.
        HelpMenuView theHelpMenu = new HelpMenuView();
        theHelpMenu.displayMenuView();
    }
    
     // The displaySaveGameView method
    // Purpose: display Save Game View
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displaySaveGameView()
    {
        System.out.println("\nDisplay Save Game View option selected.");
    }
 
}
