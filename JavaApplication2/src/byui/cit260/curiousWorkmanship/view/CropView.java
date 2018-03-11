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
 
 // Get reference to the Game object and the Crops object
 private static Game theGame = CuriousWorkmanship.getTheGame();
 private static CropData theCropData = theGame.getCropData();
    
     
 
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

     // Prompt the user to enter the number of acres to sell
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
    
    buyLandView();
    sellLandView();
    feedPeopleView();
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


} 
    
