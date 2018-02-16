/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.control;

import byui.cit260.curiousWorkmanship.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nimrod
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
  /*  @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of buyland method, of class CropControl.
     */
    @Test
    public void testBuyland() {
        System.out.println("buyland");
        
        //-----Test Case 1 ------
        System.out.println("\tTest case 1");
        //define some variables of the game
        CropData cropyData = new CropData(); // constructor
        cropyData.setWheatInStore(1000);
        cropyData.setAcresOwned(2800);
        cropyData.setPopulation(4);
        
        int acresToBuy =10;
        //random function
        int landPrice =20;
        //value we expected
        int expResult =2810;
        //call the method and assign the value into a variable
        int result = CropControl.buyland(acresToBuy, landPrice, cropyData);
        //a camparation is made to know if the result is the expected
        assertEquals(expResult,result,2810);
        //print the result
        System.out.println(result);
        
        //-----Test Case 2 ------
        System.out.println("\tTest case 2");
        //define some variables of the game
        CropData cropyData2 = new CropData(); // constructor
        cropyData2.setWheatInStore(1000);
        cropyData2.setAcresOwned(2800);
        cropyData2.setPopulation(4);
        
        acresToBuy =-5;
        //random function
        landPrice =20;
        //value we expected
        expResult =-1;
        //call the method and assign the value into a variable
        result = CropControl.buyland(acresToBuy, landPrice, cropyData2);
        //a camparation is made to know if the result is the expected
        assertEquals(expResult,result,-1);
        //print the result
        System.out.println(result);
        
        
        //-----Test Case 3 ------
        System.out.println("\tTest case 3");
        //define some variables of the game
        CropData cropyData3 = new CropData(); // constructor
        cropyData3.setWheatInStore(1000);
        cropyData3.setAcresOwned(2800);
        cropyData3.setPopulation(6);
        
        acresToBuy =3000;
        //random function
        landPrice =20;
        //value we expected
        expResult =-1;
        //call the method and assign the value into a variable
        result = CropControl.buyland(acresToBuy, landPrice, cropyData3);
        //a camparation is made to know if the result is the expected
        assertEquals(expResult,result,-1);
        //print the result
        System.out.println(result);
        
        
        //-----Test Case 4 ------
        System.out.println("\tTest case 4");
        //define some variables of the game
        CropData cropyData4 = new CropData(); // constructor
        cropyData4.setWheatInStore(1000);
        cropyData4.setAcresOwned(2000);
        cropyData4.setPopulation(10);
        
        acresToBuy =100;
        //random function
        landPrice =10;
        //value we expected
        expResult =2100;
        //call the method and assign the value into a variable
        result = CropControl.buyland(acresToBuy, landPrice, cropyData4);
        //a camparation is made to know if the result is the expected
        assertEquals(expResult,result,2100);
        //print the result
        System.out.println(result);
        
        
        //-----Test Case 5 ------
        System.out.println("\tTest case 5");
        //define some variables of the game
        CropData cropyData5 = new CropData(); // constructor
        cropyData5.setWheatInStore(1000);
        cropyData5.setAcresOwned(2000);
        cropyData5.setPopulation(10);
        
        acresToBuy =0;
        //random function
        landPrice =10;
        //value we expected
        expResult =2000;
        //call the method and assign the value into a variable
        result = CropControl.buyland(acresToBuy, landPrice, cropyData5);
        //a camparation is made to know if the result is the expected
        assertEquals(expResult,result,2000);
        //print the result
        System.out.println(result);
        
    }
    
}
