/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.curiousWorkmanship.control;
import java.util.Random;
import byui.cit260.curiousWorkmanship.model.CropData;
import java.util.Scanner;

/**
 *
 * @author nimrod
 */
public class CropControl {
    
    // constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    //random number generator
    private static Random random = new Random();

    public static int calcLandCost() {
        
            int landPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
                                       
            return landPrice;

    }
    
    // The sellLand method
    // Purpose: To sell land
    // Parameters: the price of land, the number of acres to sell, and a 
    // reference to the Crops object
    // Returns: the number of acres owned after the sale
    // Pre-conditions: acres to sell must be positive
    // and <= acresOwned
         
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    { 

        //if acresToSell < 0, return -1
          if(acresToSell < 0)
              return -1;
        
         //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
        return -1;
        
        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);
        
        //wheatInStore = wheatInStore + (acresToBuy x landPrice)
        int wheat = cropData.getWheatInStore();
        wheat-= (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);
        
        //return acresOwned
        return owned;
    }
    
    // The buyLand method
        // Purpose: To buy land
        // Parameters: the price of land, the number of acres to buy
        // Returns: the number of acres left after the purchase
        // Pre-conditions: acres to buy must be positive
        // and <= ten times the number of people

    public static int buyland(int acresToBuy, int landPrice, byui.cit260.curiousWorkmanship.model.CropData cropData)
    {

        int population = cropData.getPopulation();
        int wheatInStore = cropData.getWheatInStore();
        int acresOwned = cropData.getAcresOwned();
         
        
        //  if acresToBuy < 0, return -1
            if(acresToBuy<0)
            return -1;
            
        //  if acresToBuy > 10 x numberOfPeople, return -1
            if(acresToBuy > 10 * population)
                return -1;
        
        //  if wheatInStore < landPrice x acresToBuy, return -1
            if(wheatInStore < landPrice*acresToBuy)
                return -1;
        
      
        //  acresOwned = acresOwned + acresToBuy
            acresOwned = acresOwned + acresToBuy;
            
        //  wheatInStore = wheatInStore - (acresToBuy x landPrice)
            wheatInStore = wheatInStore - (acresToBuy * landPrice);
            
        //save values
            cropData.setWheatInStore(wheatInStore);
            cropData.setAcresOwned(acresOwned);
            
        //  return acresOwned
            return acresOwned;
            
        
    }
    
    // The feedPeople method
    // Purpose: To feed the people
    // Parameters: the number of bushels of wheat to feed the people
    // Returns: the amount of wheat left after feeding the people.
    // Pre-conditions: number of bushels of wheat to feed the people must be positive
    // and <= the total amount of wheat

     public static int feedPeople(int wheatToFeed, byui.cit260.curiousWorkmanship.model.CropData cropData)
    {
        int wheatInStore = cropData.getWheatInStore();
        
        // if wheatToFeed < 0, return -1
           if (wheatToFeed < 0)
               return -1;
        // if wheatToFeed > wheatInStore, return -1
           if (wheatToFeed > wheatInStore)
               return -1;
        
        // wheatInStore = wheatInStore - wheatToFeed
           wheatInStore = wheatInStore - wheatToFeed;
        //save the values   
           cropData.setWheatInStore(wheatInStore);
           cropData.setWheatForPeople(wheatToFeed);
        // return wheatInStore
           return wheatInStore;        
    }
     
     // The plantCrops method
        // Purpose: To plant crops
        // Parameters: bushels in storage, acres owned, population, acres to plant
        // Returns: the number of acres planted
        // Pre-conditions: acres must be positive
        // The City will have this much land to plant
        // The City will have enough wheat in storage to plant this many acre
        // The City will have enough population to plant
     
       public static int plantcrops(int acresToPlant,  byui.cit260.curiousWorkmanship.model.CropData cropData)
     {
        int population = cropData.getPopulation();
        int wheatInStore = cropData.getWheatInStore();
        int acresOwned = cropData.getAcresOwned();
        int bushelsToPlant = 0;
        
         //if acresToplant < 0, return -1
         if (acresToPlant<0)
             return -1;
         
        //if acresToPlant > acres_owned  return -1
        if(acresToPlant>acresOwned)
            return -1;
        
        //if acresToPlant > population * 10 return -1
        if (acresToPlant>population * 10)
            return -1;
                    
        //bushelsToPlant = acresToPlant / 2;
        bushelsToPlant = acresToPlant/2;
        
        //bushels_in_storage = bushels_inStorage - bushelsToPlant
        wheatInStore = wheatInStore - bushelsToPlant;
        
        //save the values
         cropData.setWheatInStore(wheatInStore);
         cropData.setAcresPlanted(acresToPlant);
         
        // return bushelsToPlant
        return bushelsToPlant;

     }
    
       public static void setOffering(int percentOffering){
       
           int m = 0;
           Scanner reader = new Scanner(System.in);
        //The program ask the user to input a percentage of harvest for offering
        
        do {
            System.out.println("Please enter the percentage you want to pay in tithes: ");  
           int n = reader.nextInt();
          //condition 
          //If the number entered is less than 0, the program goes to step 1 
          //If the number entered is greater than 100, the program goes to step 1.
           if(n>=0 && n<=100)
           {     m=1;
                 //The numbered entered by the user is saved.
                 percentOffering = n;
           }
           
        } while(m == 0);
       }
       
        // The calcStarved method
         // Purpose: To calculate people who starved
         // Parameters: the number of people who starved
         // Returns: the number of people who starved
          
         public static int calcStarved(int numStarved, byui.cit260.curiousWorkmanship.model.CropData cropData)
        {
            int wheatForPeople = cropData.getWheatForPeople();
            int population = cropData.getPopulation();
            int peopleFed;
                        
            // peopleFed = wheatForPeople / 20;
               peopleFed = wheatForPeople / 20;
            // numStarved = population - peopleFed;
               numStarved = population - peopleFed;
            // population = population - numStarved;
               population = population - numStarved;
            // save the values  
               cropData.setPopulation(population);
               cropData.setPeopleFed(peopleFed);
               cropData.setNumStarved(numStarved);
            // return numStarved
               return numStarved;        
    }
}
