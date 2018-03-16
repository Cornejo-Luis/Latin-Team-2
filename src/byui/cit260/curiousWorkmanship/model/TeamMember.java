/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

/**
 *
 * @author joyce
 */
public enum TeamMember {
    Luis("Luis","player 1"),
    Nimrod("Nimrod","player 2"),
    Joyce("Joyce","player 3");
    
    private String name;
    private String title;

    TeamMember(String name, String title){
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }
    
}
