/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curiousWorkmanship;

import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.TeamMember;
import static byui.cit260.curiousWorkmanship.model.TeamMember.Luis;

/**
 *
 * @author joyce
 */
public class CuriousWorkmanship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        
        playerOne.setName("Fred Flinston");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        TeamMember.Luis.getName();
        TeamMember.Luis.getTitle();
        
        System.out.println(Luis.toString());
        
    }
    
}
