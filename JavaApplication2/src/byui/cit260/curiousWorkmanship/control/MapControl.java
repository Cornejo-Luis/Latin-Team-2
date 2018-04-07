/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.control;

import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.Location;
import byui.cit260.curiousWorkmanship.model.Map;

/**
 *
 * @author nimrod
 */
public class MapControl {
    // size of the Locations array
        private static final int MAX_ROW = 5;
        private static final int MAX_COL = 5;
    
    // reference to a Game object
        private static Game theGame;
    
       public static void createMap ( ) {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
         // create a string that will go in the Location objects
        // create a string that will go in the Location objects
        // that contain the river
        String river = "\nYou are on the River. The river is the source" +
                              "\nof life for our city. The river marks the eastern " +
                              "\nboundary of the city - it is wilderness to the East.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");  

        // set this location object in each cell of the array in column 4      
        for(int i = 0; i < MAX_ROW; i++)
        {
                theMap.setLocation(i, 4, loc);
        }
        
        /*--------------------------*/
        
        // define the string for the Desert location
        String desert = "\nYou are on the Desert. The desert serve us a" +
                        "\nnatural protecction from beasts and the Lamanites ";

        // create a new Location object
        loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(desert);
        loc.setSymbol("---");  

        // set this location       
        for(int i = 0; i < 2; i++)
        {
                theMap.setLocation(i, 0, loc);
        }
        /*--------------------------*/

        
        // define the string for the Borders of the Lamanites location
        String border = "\nYou are on the borders near to the Lamanites. If you" +
                        "\nwant to keep yourselve save, you must return from"+ 
                        "\nwhere you came.  ";

        // create a new Location object
        loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(border);
        loc.setSymbol("|=|");  

        // set this location       
        for(int i = 2; i < MAX_ROW; i++)
        {
                theMap.setLocation(i, 0, loc);
        }
        /*--------------------------*/
        
        // define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the River." +
        "\nIn the spring this low farmland floods and is covered with rich" +
        "\nnew soil. Wheat is planted as far as you can see."; 

        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        theMap.setLocation(0, 2, loc);
        
        
        // define the string for the Ruler's Court
        String court = "\nYou are in the Ruler's Court." +
        "\nYou can come here whenever you feel the town is in danger."; 

        // set a court location with a hint
        loc = new Location();
        loc.setDescription(court + "\nOne peson needs at least twenty bushels of wheat to live.");
        loc.setSymbol("|V|");
        theMap.setLocation(4, 2, loc);
        
        // define the string for the Ruler's Court
        String granary = "\nYou are in The City’s Granary and Storehouse." +
        "\nThis is all you have in store. Be wise when spending it."; 

        // set a court location with a hint
        loc = new Location();
        loc.setDescription(granary + "\nOne peson can take care of ten acres.");
        loc.setSymbol(".-.");
        theMap.setLocation(0, 3, loc);
        
        // define the string for the Ruler's Court
        String wheatField = "\nYou are standing in one of the city’s wheat fields." +
        "\nThere is nothing but wheat as far as the eye can see." +
        "\nWe hope to have a bountiful harvest this year."; 

        // set a court location with a hint
        loc = new Location();
        loc.setDescription(wheatField);
        loc.setSymbol("vvv");
        for(int i = 1; i < MAX_ROW; i++)
        {
           theMap.setLocation(i, 3, loc);
        }
        
        
        /*--------------------------*/
       
        // define the string for undevelop Land location
        String undevelopLand = "\nYou are standing on an undeveloped land." +
                         "\nFifteen years ago, City of Aaron embarked on a grand project to cultivate farmland in" +
                        "\nthe desert and create new towns. But massive projects like undevelopeland have "+ 
                        "\nlanguished due to mismanagement and corruption.  ";

        // create a new Location object
        loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(undevelopLand);
        loc.setSymbol("???");  

        // set this location       
        for(int i = 0; i < MAX_ROW; i++)
        {
                theMap.setLocation(i, 1, loc);
        }
        /*--------------------------*/
        
        // define the string for undevelop Land location
        String village ="\nYou are in the village." +
                        "\nThe village is one of the most extreme examples" +
                        "\nof City of Aaron plan to green its deserts,"+ 
                        "\nor take once-uninhabitable earth and convert it to farmland. ";

        // create a new Location object
        loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(village);
        loc.setSymbol("¬_¬");  

        // set this location       
        for(int i = 1; i < 4; i++)
        {
                theMap.setLocation(i, 2, loc);
        }
        
        /*--------------------------*/
        /*
        create!! slide number 50
        */
        
        
        theGame.setTheMap(theMap);


    }
    
}
