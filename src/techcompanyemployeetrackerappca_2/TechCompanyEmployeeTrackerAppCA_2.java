/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techcompanyemployeetrackerappca_2;
import java.util.Scanner;
/**
 *
 * @author alper
 */
public class TechCompanyEmployeeTrackerAppCA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuOptionsCA_2 selected = null;
        
        do{ //menu will run until user choose option 5
            MenuOptionsCA_2.printMenu();
            System.out.println("Please enter a number to select an option.");
            int userInput;        
        
            try{
                userInput = Integer.parseInt(scanner.nextLine());
                selected = MenuOptionsCA_2.fromInt(userInput);
                System.out.println(selected.getTopmenu());
            
            }catch(IllegalArgumentException e){
                System.out.println("Invalid option has chosen.");
            }
        }while(selected != MenuOptionsCA_2.EXIT);
        
        switch(selected){
            
            case SORT:
                break;
            case SHUFFLE:
                break;
            case SEARCH:
                break;
            case ADD_EMPLOYEE_MENU:
                break;
            case EXIT:
                System.out.println("Exited from program...");
                break;
        }
    }
    
}
