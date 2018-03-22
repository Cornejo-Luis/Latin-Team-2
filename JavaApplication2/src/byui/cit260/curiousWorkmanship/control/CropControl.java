/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.curiousWorkmanship.control;
import java.util.Random;
import byui.cit260.curiousWorkmanship.model.CropData;
import java.util.Scanner;
import exceptions.CropException;

/**
 *
 * @author nimrod
 */
public class CropControl {
    
    // constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    private static final int PEOPLE_PER_ACRE = 10;
    private static final int BUSHELS_PER_PERSON = 20;
    private static final int TO_PERCENT = 100;
    private static final int GROWTH_RANGE = 5;
    private static final int GROWTH_BASE = 1;
    
    //random number generator
    private static Random random = new Random();

    public static int calcLandCost() {
        
            int landPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
                                       
            return landPrice;

    }
    
    // The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and a 
//    reference to a CropData object
// Returns: the acres owned after the sale
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


        //wheatInStore = wheatInStore + acresToSell * landPrice
                int wheat = cropData.getWheatInStore();
                wheat+= (acresToSell * landPrice);
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

    public static void buyland(int acresToBuy, int landPrice, CropData cropData) throws CropException
    {
        int population = cropData.getPopulation();
        int wheatInStore = cropData.getWheatInStore();
        int acresOwned = cropData.getAcresOwned();
        
        //  if acresToBuy < 0, return -1
            if(acresToBuy<0)
            throw new CropException("A negative value was input");

            
        //  if acresToBuy > 10 x numberOfPeople, return -1
            if(acresToBuy > PEOPLE_PER_ACRE * population)
            throw new CropException("There is insufficient acres");

        
        //  if wheatInStore < landPrice x acresToBuy, return -1
            if(wheatInStore < landPrice*acresToBuy)
            throw new CropException("There is insufficient wheat to buy this much land");

        
        //  acresOwned = acresOwned + acresToBuy
            acresOwned = acresOwned + acresToBuy;
            
        //  wheatInStore = wheatInStore - (acresToBuy x landPrice)
            wheatInStore = wheatInStore - (acresToBuy * landPrice);
            
        //save values
            cropData.setWheatInStore(wheatInStore);
            cropData.setAcresOwned(acresOwned);
    }
     
    // The feedPeople method
    // Purpose: To feed the people
    // Parameters: the number of bushels of wheat to feed the people
    // Returns: the amount of wheat left after feeding the people.
    // Pre-conditions: number of bushels of wheat to feed the people must be positive
    // and <= the total amount of wheat

     public static void feedPeople(int wheatToFeed, CropData cropData) throws CropException
    {
        int wheatInStore = cropData.getWheatInStore();
        
        // if wheatToFeed < 0, return -1
           if (wheatToFeed < 0)
           throw new CropException("A negative value was input");
        // if wheatToFeed > wheatInStore, return -1
           if (wheatToFeed > wheatInStore)
           throw new CropException("The amount of wheat to feed exceeds the amount of wheat in store.");
        
        // wheatInStore = wheatInStore - wheatToFeed
           wheatInStore = wheatInStore - wheatToFeed;
        //save the values   
           cropData.setWheatInStore(wheatInStore);
           cropData.setWheatForPeople(wheatToFeed);
           
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
        if (acresToPlant>population * PEOPLE_PER_ACRE)
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
    
       public static int setOffering(int percentOffering){
       
          //condition 
          //If the number entered is less than 0, the program goes to step 1 
          //If the number entered is greater than 100, the program goes to step 1.
           if(percentOffering>=0 && percentOffering<=100)
           {     
                 //The numbered entered by the user is saved.
                 return percentOffering; 
           }
           else
               return -1;
        } 
       
       
        // The calcStarved method
         // Purpose: To calculate people who starved
         // Parameters: the number of people who starved
         // Returns: the number of people who starved
          
         public static int calcStarved(int wheatForPeople, byui.cit260.curiousWorkmanship.model.CropData cropData)
        {
            wheatForPeople = cropData.getWheatForPeople();
            int population = cropData.getPopulation();
            int peopleFed;
            int numStarved;
                        
            // peopleFed = wheatForPeople / 20;
               peopleFed = wheatForPeople / BUSHELS_PER_PERSON;
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
        
         public static int growPopulation( byui.cit260.curiousWorkmanship.model.CropData cropData)
        {
            int population = cropData.getPopulation();
                       
            //calculate the percentage of people who moved into the city
            int percentOfGrowth = random.nextInt(GROWTH_RANGE)+ (GROWTH_BASE);
            
            //calculate the number of people who moved into the city
            int newPeople;
            newPeople = population * percentOfGrowth / TO_PERCENT ;
            
            //add the number of people who moved into the city to the current population
            population += newPeople;
            
            //save the new population
            cropData.setPopulation(population);
            
            //return how many people moved into the city
            return newPeople;          
        }
         
          
         // The harvestCrops method
         // Purpose: To calulate the number of bushels of wheat harvested
         // Parameters: Acres planted, Offerings, Crop Yield
         // Returns: the number of bushels of wheat harvested.
         public static int harvestCrops(int cropYield, byui.cit260.curiousWorkmanship.model.CropData cropData )
         {
             int acresPlanted = cropData.getAcresPlanted();
             int offering = cropData.getOffering();
             int bushelsHarvested;
             
             if(offering > 12)
             {
                 //A random value between 2 and 5 bushels per acre
                 cropYield = random.nextInt(5)+ (2);
             }
             else if(offering<8)
             {
                 //A random value between 1 and 3 bushels per acre
                 cropYield = random.nextInt(3)+ (1);
             }
             else
             {  
                 //A random value between 2 and 4 bushels per acre
                 cropYield = random.nextInt(4)+ (2);
             }
             bushelsHarvested = cropYield*acresPlanted;
             
            return bushelsHarvested;
         }
        
}
