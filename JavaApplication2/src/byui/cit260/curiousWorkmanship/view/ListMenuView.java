/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.ListItem;
import curiousWorkmanship.CuriousWorkmanship;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author nimrod
 */
public class ListMenuView extends MenuView{
    
    Game theGame = CuriousWorkmanship.getTheGame( );
    // The ListMenuView constructor
    // Purpose: displays the list, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================    

    public ListMenuView() {
        super("\n" +
           "**********************************\n" +
           "* CITY OF AARON: Print List  *\n" +
           "**********************************\n" +
           " 1 - Animals in the storehouse\n" +
           " 2 – Tools in the storehouse\n" +
           " 3 - Provisions in the storehouse\n" +
           " 4 – View the development team\n" +
           " 5 - Save animals list.\n"+
           " 6 - Save tools list.\n"+   
           " 7 - Save provisions list.\n"+ 
           " 8 - Return to the Game Menu.\n",  
         8);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
    {
        switch(option)
        {
            // if the option is 1, display the animals
            case 1: 
                viewAnimals();
                break;
            // if the option is 2, display the tools
            case 2: 
                viewTools();
                break;
            // if the option is 3, display the provisions
            case 3: 
                viewProvisions();
                break;
            // if the option is 4, display authors
            case 4: 
                viewAuthors();
                break;
            // if the option is 5, save animal list 
            case 5: 
                saveAnimalList();
                break;
                 // if the option is 6, save tool list 
            case 6: 
                saveToolList();
                break;
                // if the option is 7, save provision list 
            case 7:
                saveProvisionList();
                // if the option is 6, go back to the Game Menu.
            case  8: 
                return;
        }
    }
    
    // The viewAnimals method
    // Purpose: display animals
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewAnimals()
    { 
        ArrayList<ListItem> animals = theGame.getAnimals();
            System.out.println("\n\n   Animal Inventory Report             ");
                // and output it
            System.out.printf("%n%-20s%10s", "Animal", "Quantity");
            System.out.printf("%n%-20s%10s", "------", "--------"); 
            //use a for loop to get the data from the ArrayList
            for (ListItem item : animals) {
                System.out.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }
        
    }
    // The viewTools method
    // Purpose: display tools
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewTools()
    {
        ArrayList<ListItem> tools = theGame.getTools();
        
        System.out.println("\n\n       Tool Report          ");
                // and output it
            System.out.printf("%n%-15s%10s", "Tool", "Quantity");
            System.out.printf("%n%-15s%10s", "------", "--------"); 
            //use a for loop to get the data from the ArrayList
            for (ListItem item : tools) {
                System.out.printf("%n%-15s%7d", item.getName(), item.getNumber());
            }
        
       
        /*alternative
        for( int i=0; i < tools.size(); i++ ) {
            ListItem item = tools.get(i);
            System.out.println("\nTool: " + item.getName() +
                           "\nQuantity: " + item.getNumber());
        }*/
    }
    
    // The viewProvisions method
    // Purpose: display provisions
    // Parameters: none
    // Returns: none
    // ===================================      
    public void viewProvisions()
    { 
        ArrayList<ListItem> provisions = theGame.getProvisions();
            System.out.println("\n\n   Provisions Inventory Report             ");
                // and output it
            System.out.printf("%n%-20s%10s", "Provisions", "Quantity");
            System.out.printf("%n%-20s%10s", "------", "--------"); 
            //use a for loop to get the data from the ArrayList
            for (ListItem item : provisions) {
                System.out.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }
        
    }
    
    
    
    // The viewAuthors method
    // Purpose: display authors
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewAuthors()
    {
        System.out.println("\nDisplay the viewAuthors option selected.");
    }
    
    // The saveAnimalList method
    // Purpose: save the animal list
    // Parameters: none
    // Returns: none
    // ===================================  
    public void saveAnimalList()
    {
        // declare a string to hold the file name
        String fileName;
        // declare a reference to a PrintWriter object
        PrintWriter outFile = null;
        // prompt the user for a file name, get and save the user’s input
        System.out.println("\n\nEnter the file name where you want to save this list:");
        keyboard.nextLine(); 
        fileName = keyboard.nextLine();

        try
        {
             // create the PrintWriter object
            outFile = new PrintWriter(fileName);
            
             // get a reference to the ArrayList you want to output
             ArrayList<ListItem> animals = theGame.getAnimals();

            // output a heading for the report
            outFile.println("\n\n   Animal Inventory Report             ");
            // and output it
            outFile.printf("%n%-20s%10s", "Animal", "Quantity");
            outFile.printf("%n%-20s%10s", "------", "--------"); 
            //use a for loop to get the data from the ArrayList
            for (ListItem item : animals) {
                outFile.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }
            
            System.out.println("\nReport was saved to " + fileName + " successfully!");
            outFile.flush();
        }
        
        catch(IOException e)
        {
            System.out.println("Error saving the Animal List to a file");
        }
        finally
        {
            if(outFile != null) {
                outFile.close();
              }
         }

    } 
    
  public void saveToolList()
    {
        
       
        // declare a reference to a PrintWriter object
        
        PrintWriter outFile = null;
        // declare a string to hold the file name
        String fileLocation = "tools.txt";
        
        try
        {
             // create the PrintWriter object
            outFile = new PrintWriter(fileLocation);
            // use a for loop to get the data from the ArrayList
            // and output it
                ArrayList<ListItem> tools = theGame.getTools();
                    for( int i=0; i < tools.size(); i++ ) {
                    ListItem item = tools.get(i);
                    outFile.printf("\nTool: " + item.getName() +
                                   "\nQuantity: " + item.getNumber());
                }
            
            outFile.flush();
            
        }
        catch(IOException e)
        {
            System.out.println("Error saving the Tool List to a file");
        }
        finally
        {
            if(outFile != null) {
                outFile.close();
              }
         }

    } 
  // The saveProvisionList method
    // Purpose: save the provision list
    // Parameters: none
    // Returns: none
    // ===================================  
    public void saveProvisionList()
    {
        // declare a string to hold the file name
        String fileName;
        // declare a reference to a PrintWriter object
        PrintWriter outFile = null;
        // prompt the user for a file name, get and save the user’s input
        System.out.println("\n\nEnter the file name where you want to save this list:");
        keyboard.nextLine(); 
        fileName = keyboard.nextLine();

        try
        {
             // create the PrintWriter object
            outFile = new PrintWriter(fileName);
            
             // get a reference to the ArrayList you want to output
             ArrayList<ListItem> provisions = theGame.getProvisions();

            // output a heading for the report
            outFile.println("\n\n   Provisions Inventory Report             ");
            // and output it
            outFile.printf("%n%-20s%10s", "Provisions", "Quantity");
            outFile.printf("%n%-20s%10s", "------", "--------"); 
            //use a for loop to get the data from the ArrayList
            for (ListItem item : provisions) {
                outFile.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }
            
            System.out.println("\nReport was saved to " + fileName + " successfully!");
            outFile.flush();
        }
        
        catch(IOException e)
        {
            System.out.println("Error saving the Provisions List to a file");
        }
        finally
        {
            if(outFile != null) {
                outFile.close();
              }
         }

    } 
}
