/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curiousWorkmanship;

import byui.cit260.curiousWorkmanship.view.MainMenuView;
import byui.cit260.curiousWorkmanship.control.CropControl;
import byui.cit260.curiousWorkmanship.model.ListItem;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.TeamMember;
import byui.cit260.curiousWorkmanship.model.CropData;
import byui.cit260.curiousWorkmanship.model.Game;
import static byui.cit260.curiousWorkmanship.model.TeamMember.Luis;
import byui.cit260.curiousWorkmanship.model.Location;

/**
 *
 * @author joyce
 */
public class CuriousWorkmanship {

    // variable for keeping a reference to the Game object
    private static Game theGame = null;

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CuriousWorkmanship.theGame = theGame;
    }

    // main function - entry point for the program
    // runs the main menu

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Player playerOne = new Player();   
        
        playerOne.setName("Fred Flinston");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        TeamMember.Luis.getName();
        TeamMember.Luis.getTitle();
        
        System.out.println(Luis.toString());
        
        ListItem itemOne = new ListItem();
        itemOne.setName("hammer");
        itemOne.setNumber(3);
        
        System.out.println(itemOne.toString());
        
        //---------  Class CropData --------------
        CropData firstData = new CropData();
        firstData.setYear(1);
        firstData.setPopulation(100);
        firstData.setAcresOwned(3);
        firstData.setCropYield(4);
        firstData.setWheatInStore(5);
        firstData.setNumberWhoDied(6);
        firstData.setNewPeople(7);
        firstData.setHarvest(8);
        firstData.setHarvestAfterOffering(9);
        firstData.setOffering(10);
        firstData.setOfferingBushels(11);
        firstData.setPeopleFed(12);
        firstData.setAcresPlanted(13);
        firstData.setNumStarved(14);
        firstData.setEatenByRats(15);
        firstData.setWheatForPeople(16);
        

        System.out.println(firstData.toString());
        
 
        //-------location class-------
         Location location = new Location();
        
         location.setDescription("The Ruler's Court");
         
         System.out.println(location.toString());
         
         */
                 
         //Main Menu View
         MainMenuView mmv = new MainMenuView();
         mmv.displayMenuView();

    }
    
}
