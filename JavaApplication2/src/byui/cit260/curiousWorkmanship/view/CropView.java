/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.model.*;
import byui.cit260.curiousWorkmanship.control.*;
import java.util.Scanner;
import curiousWorkmanship.CuriousWorkmanship;

/**
 *
 * @author nimrod
 */
public class CropView {
    
    
  // Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);   
 private String TheList;
private int max; 
 
 // Get reference to the Game object and the Crops object
 private static Game theGame = CuriousWorkmanship.getTheGame();
 private static CropData theCropData = theGame.getCropData();
    
 public CropView() {
        TheList = "\n" +
           "**********************************\n" +
           "* CITY OF AARON: Manage the Crop Menu  *\n" +
           "**********************************\n" +
           " 1 - Buy Land\n" +
           " 2 – Sell Land\n" +
           " 3 - Pay Offerings\n" +
           " 4 - Feed People\n" +               
           " 5 – Plant Crops\n" +
           " 6 - Show Starved View\n" +
           " 7 - Run Crops\n" +
           " 8 - Display Crop Report\n" +
           " 9 - Return to the Game Menu.\n"; 

        max = 10;
    }
    
    
    public void displayCropView()
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
            // if the option is 1, display the buy Land
            case 1: 
                buyLandView();
                break;
            // if the option is 2, display the sell land
            case 2: 
                sellLandView();
                break;
            // if the option is 3, display the pay offerings
            case 3: 
                payOfferingsView();
                break;
            // if the option is 4, display feed people
            case 4: 
                feedPeopleView();
                break;
            // if the option is 5, display the plant crops
            case 5: 
                plantCropsView();
                break;
            // if the option is 6, display the starved View 
            case 6: 
                showStarvedView();
                break;
            // if the option is 7, display the run crops
            case 7: 
                runCropsView();
                break;
            // if the option is 8, display crop report
            case 8: 
                displayCropReport();
                break;    
            // if the option is 9, go back to the Game Menu.
            case  9: 
                GameMenuView gmv = new GameMenuView();
                gmv.displayMenuView();
        }
    }
    
 
 // The buyLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 public static void buyLandView()
 {
    // Get the cost of land for this round.
    int price = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int toBuy;
    toBuy = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyland(toBuy, price, theCropData);
   
 }
 
  /*------------ The sellLandView method--------------*/
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    //author: nimrod
 public static void sellLandView()
 {
    // Get the cost of land for this round.
    int price = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     System.out.print("\nHow many acres of land do you wish to sell? "); 

    //  Get the user’s input and save it.
    int toSell;
    toSell = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.sellLand(price, toSell, theCropData);
   
 }
 
  /*------------ The sellLandView method end--------------*/

/*------------ The payOffering method--------------*/
    // Purpose: interface with the user input for 
    // Parameters: 
    // Returns: 
    //author: nimrod
 public static void payOfferingsView()
 {
     // Prompt the user to enter the number of acres to buy
     System.out.println("payOfferingView"); 
 }
 
  /*------------ The payOfferingView() method end--------------*/

 
// The feedPeopleView method
// Purpose: interface with the user input for feedin the people
// Parameters: none
// Returns: none
 public static void feedPeopleView()
 {
    
    // Prompt the user to enter the number of bushels of grain he/she wants to give to the people
     System.out.print("\nHow many bushels of grain do you want to give to the people? "); 

    //  Get the user’s input and save it.
    int wheatForPeople = keyboard.nextInt();

    // Call the feedPeople( ) method in the control layer
    CropControl.feedPeople(wheatForPeople, theCropData);
   
 }
 
 // The plantCropsView method
// Purpose: interface with the user input for plant crops
// Parameters: none
// Returns: none
 public static void plantCropsView()
 {
    
    // Prompt the user to enter the number of acres to plant
     System.out.print("\nhow many acres of land do you want to plant? "); 

    //  Get the user’s input and save it.
    int acresToPlant = keyboard.nextInt();

    // Call the plantcrops( ) method in the control layer
    CropControl.plantcrops(acresToPlant, theCropData);
   
 }


/*------------ The showStarvedView method--------------*/
    // Purpose: interface with the user input for 
    // Parameters: 
    // Returns: 
    //author: nimrod
 public static void showStarvedView()
 {
     // Prompt the user to enter the number of acres to buy
     System.out.println("showStarvedView"); 
 }
 
  /*------------ The showStarvedView method end--------------*/ 
 
 
 // The runCropsView method()
// Purpose: runs the Hamurabi game
// Parameters: none
// Returns: none
public static void runCropsView()
{
    // call the buyLandView( ) method
    buyLandView( );
    // add calls to the other crop view methods
            //Help menu (called from the main menu)
            
            
            //Game menu (called from the main menu)
            
            
            //Display/Print List menu (called from the game menu)

    
    // as they are written
    // call the feedPeopleView( ) method
    feedPeopleView( );
    
    // call the plantCropsView( ) method
    plantCropsView();
 /*
sellLandView()
feedPeopleView()
plantCropsView()
showStarvedView()
displayCropsReportView()
    */

}
/*------------ The displayCropReport() method--------------*/
    // Purpose: interface with the user input for 
    // Parameters: 
    // Returns: 
    //author: nimrod
 public static void displayCropReport()
 {
     // Prompt the user to enter the number of acres to buy
     System.out.println("displayCropReport"); 
 }
 
  /*------------ The displayCropReport method end--------------*/ 
 

} 
    
