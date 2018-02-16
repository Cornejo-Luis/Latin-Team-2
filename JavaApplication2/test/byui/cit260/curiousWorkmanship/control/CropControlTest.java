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
        CropData cropyData = new CropData();
        cropyData.setWheatInStore(1000);
        cropyData.setAcresOwned(2000);
        cropyData.setPopulation(10);
        
        int acresToBuy =100;
        int landPrice =10;
        int expResult =2100;
        int result = CropControl.buyland(acresToBuy, landPrice, cropyData);
        assertEquals(expResult,result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
      
       
        
    }
    
}
