/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author nimrod
 */
public class Location implements Serializable{
    
    //-------class instance variables------
        private String description;
        private String symbol;
    
    //------Constructor------

        public Location() {
        }
        
    //-------Get Method----
    
        public String getDescription() {
            return description;
    }

        public String getSymbol() {
            return symbol;
    }

    //-------Set Method-------
    
        public void setDescription(String description) {
            this.description = description;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

    @Override
    public String toString() {
        return "location{"+ description+"}";
    }
    
    
    
}
