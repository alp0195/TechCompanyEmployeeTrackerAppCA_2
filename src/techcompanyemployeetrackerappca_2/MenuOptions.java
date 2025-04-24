/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package techcompanyemployeetrackerappca_2;

/**
 *
 * @author alper
 */
//enum for MenuOptions defines all options for menu
public enum MenuOptions {
    
    //all enum constants comes with definition to show which is user will see.
    SORT("Sort Employees in the file (Alphabetically by Name)"), SHUFFLE("Shuffle Employees in the file"), 
    SEARCH("Search Employee"), ADD_EMPLOYEE_MENU("Add Employee"), EXIT("Exiting program...");
    
    //final variable which is hold description
    private final String topmenu;
    
    //constructor
    MenuOptions(String topmenu){
        this.topmenu = topmenu;
    }
    
    //getter for access to description from outside
    public String getTopmenu(){
        return this.topmenu;
    }
}
