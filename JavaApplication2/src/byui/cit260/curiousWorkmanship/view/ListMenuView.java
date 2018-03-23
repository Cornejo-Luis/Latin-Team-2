/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.ListItem;
import curiousWorkmanship.CuriousWorkmanship;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nimrod
 */
public class ListMenuView extends MenuView{
    
    // The ListMenuView constructor
    // Purpose: displays the list, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================    

    public ListMenuView() {
        super("\n" +
           "**********************************\n" +
           "* CITY OF AARON: Print List  *\n" +
           "**********************************\n" +
           " 1 - Animals in the storehouse\n" +
           " 2 – Tools in the storehouse\n" +
           " 3 - Provisions in the storehouse\n" +
           " 4 – View the development team\n" +
           " 5 - Return to the Game Menu.\n", 
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
                return;
        }
    }
    
    // The viewAnimals method
    // Purpose: display animals
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewAnimals()
    {
        Game theGame = CuriousWorkmanship.getTheGame( );
        ArrayList<ListItem> animals = theGame.getAnimals();
        for( int i=0; i < animals.size(); i++ ) {
            ListItem item = animals.get(i);
            System.out.println("\nAnimal: " + item.getName() +
                           "\nQuantity: " + item.getNumber());
        }
    }
    // The viewTools method
    // Purpose: display tools
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewTools()
    {
        Game theGame = new Game();
        ArrayList<ListItem> tools = theGame.getTools();
        System.out.println(tools);
    }
    
    // The viewProvisions method
    // Purpose: display provisions
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewProvisions()
    {
        Game theGame = new Game();
        ArrayList<ListItem> provisions = theGame.getProvisions();
        System.out.println(provisions);
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
