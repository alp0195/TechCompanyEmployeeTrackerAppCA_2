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
    
    //That's make visible options menu in terminal for users
    public static void printMenu(){
        System.out.println("*** Employee Menu ***\n");
        MenuOptions[] options = MenuOptions.values();
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1)+". "+ options[i].getTopmenu());
        }
    }
    
    /*values() puts in a array every constants in enum. 
    Also 1st index starts from 0 but in menu option 1st choice number 1 
    thats why ı put -1 to decrease to choice number.
    */
    public static MenuOptions fromInt(int choice){
        if(choice < 1 || choice > values().length){
            throw new IllegalArgumentException("Invalid menu option");
        }
        return values()[choice - 1];
    }
}
