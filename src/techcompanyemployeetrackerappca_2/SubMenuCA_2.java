/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package techcompanyemployeetrackerappca_2;

/**
 *
 * @author alper
 */
public enum SubMenuCA_2 {

    ADD_EMPLOYEE("Add new employee"), GENERATE_RANDOM_EMPLOYEE("Generate random employee"), RETURN("Turned back to top menu");
    
    private final String submenu;
    
    //constructor
    SubMenuCA_2(String submenu){
        this.submenu = submenu;
    }
    
    //getter for access to description from outside
    public String getSubmenu(){
        return submenu;
    }
    
    //That's make visible options menu in terminal for users
    public static void printSubmenu(){
        System.out.println("*** Add Employee Sub Menu ***\n");
        SubMenuCA_2[] options = SubMenuCA_2.values();
        for(int i = 0; i < options.length; i++){
            System.out.println((i+1)+". "+options[i]);
        }
    }
    
    /*
    values() puts in a array every constants in enum. 
    Also 1st index starts from 0 but in menu option 1st choice number 1 
    thats why ı put -1 to decrease to choice number.
    */
    public static SubMenuCA_2 fromInt(int choice){
        if(choice < 1 || choice > values().length){
            throw new IllegalArgumentException("Invalid menu option");
        }
        return values()[choice - 1];
    }
    
}
