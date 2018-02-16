/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.curiousWorkmanship.control;
import java.util.Random;
import byui.cit260.curiousWorkmanship.model.CropData;

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
         
        
        
        //      if acresToBuy < 0, return -1
            if(acresToBuy<0)
            return -1;
            
        //   if acresToBuy > 10 x numberOfPeople, return -1
            if(acresToBuy > 10 * population)
                return -1;
        
        //  if wheatInStore < landPrice x acresToBuy, return -1
            if(wheatInStore < landPrice*acresToBuy)
                return -1;
        
               
        //  acresOwned = acresOwned + acresToBuy
            acresOwned = acresOwned + acresToBuy;
            
        //  wheatInStore = wheatInStore - (acresToBuy x landPrice)
            wheatInStore = wheatInStore - (acresToBuy * landPrice);

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
        int wheatForPeople = cropData.getWheatForPeople();
        // if wheatToFeed < 0, return -1
           if (wheatToFeed < 0)
               return -1;
        // if wheatToFeed > wheatInStore, return -1
           if (wheatToFeed > wheatInStore)
               return -1;
        // wheatForPeople = wheatToFeed
           wheatForPeople = wheatToFeed;
        // wheatInStore = wheatInStore - wheatToFeed
           wheatInStore = wheatInStore - wheatToFeed;
        // return wheatInStore
           return wheatInStore;        
    }
}
