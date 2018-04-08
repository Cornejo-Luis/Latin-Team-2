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
import exceptions.CropException;

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
        int toBuy;
        boolean paramsNotOkay;
        do
        {
       paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to buy? ");  
       toBuy = keyboard.nextInt();
       try
       {
            CropControl.buyland(toBuy, price,theCropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
            }
        } while(paramsNotOkay);

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
    boolean paramsNotOkay;
     // Prompt the user to enter the number of acres to sell
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     int toSell;
        do
        {
            paramsNotOkay = false;
            // Prompt the user to enter the number of acres to sell
            System.out.print("\nHow many acres of land do you wish to sell? "); 
            toSell = keyboard.nextInt();

            try
            {
                    // Call the buyLand( ) method in the control layer to buy the land
                   CropControl.sellLand(price, toSell, theCropData);
             }
             catch(CropException a)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(a.getMessage());
             paramsNotOkay = true;
            }
        } while(paramsNotOkay);
   
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
        boolean paramsNotOkay;
        do
        {
        paramsNotOkay = false;
        // Prompt the user to enter the number of bushels of grain he/she wants to give to the people
        System.out.print("\nHow many bushels of grain do you want to give to the people? ");  
        //  Get the user’s input and save it.
        int wheatForPeople = keyboard.nextInt();
        try
        {
            CropControl.feedPeople(wheatForPeople,theCropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
            }
        } while(paramsNotOkay);
 }
 
 // The plantCropsView method
// Purpose: interface with the user input for plant crops
// Parameters: none
// Returns: none
 public static void plantCropsView()
 {
    boolean paramsNotOkay;
        do
        {
        paramsNotOkay = false;
        // Prompt the user to enter the number of acres to plant
        System.out.print("\nhow many acres of land do you want to plant? "); 
     
        //  Get the user’s input and save it.
        int acresToPlant = keyboard.nextInt();
        try
        {
            // Call the plantcrops( ) method in the control layer
            CropControl.plantcrops(acresToPlant, theCropData);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
            }
        } while(paramsNotOkay);
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
     
     int starved = theCropData.getNumStarved();
     int population = theCropData.getPopulation();
     if( starved > 0.5 * population) {
         System.out.println("You have starved too many people...Game Over !!"); 
     } 
     else {
     }
 }
 
  /*------------ The showStarvedView method end--------------*/ 
  
// The runCropsView method()
// Purpose: runs the Hamurabi game
// Parameters: none
// Returns: none
public static void runCropsView()
{
    int population = theCropData.getPopulation();
    int acresOwned = theCropData.getAcresOwned();
    int wheatInStore = theCropData.getWheatInStore();
    int years=theCropData.getYear();
    for (int i=1;i<12;i++)
    {
        System.out.println("\n--------- City of Aaron the "+i+ " year of your reign ------------");
        
        System.out.println("Population is now "+population+" inhabitants");
        System.out.println("The City now owns "+acresOwned+" acres of land");
        System.out.println("Now you have "+wheatInStore+" bushels in store");
    
        buyLandView();
        sellLandView();
        feedPeopleView();
        plantCropsView();
        
        years = i;
        System.out.println("year #"+years);
    }
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
    
