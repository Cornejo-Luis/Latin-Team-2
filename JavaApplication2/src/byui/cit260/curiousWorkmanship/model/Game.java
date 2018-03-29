/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author joyce
 */
public class Game implements Serializable{
    //class instance variables
    public  Map theMap;
    private Player thePlayer;
    private CropData cropData;
    public static ArrayList<ListItem> animals;
    public static ArrayList<ListItem> tools;
    public static ArrayList<ListItem> provisions;
    private boolean done = false; //28-03-18 

    
    private CropData theCrops = null;
    
        // the getCrops() method
        // Purpose: get a reference to the crop object
        // Parameters: none
        // Returns: a reference to a crop object
        public CropData getCrop()
        {
            return theCrops;
        }

        // the setCrops() method
        // Purpose: store a reference to a crop object
        // Parameters: a reference to a crop object
        // Returns: none    
        public void setCrop(CropData _cropRef)
        {
            theCrops = _cropRef;
        }


    //constructor
    public Game() {
    }
    
    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

       
}
