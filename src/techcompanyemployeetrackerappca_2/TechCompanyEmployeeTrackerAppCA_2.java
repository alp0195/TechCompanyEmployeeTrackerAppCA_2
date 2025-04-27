/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techcompanyemployeetrackerappca_2;
import java.util.*;
import static techcompanyemployeetrackerappca_2.MenuOptionsCA_2.ADD_EMPLOYEE_MENU;
import static techcompanyemployeetrackerappca_2.MenuOptionsCA_2.EXIT;
import static techcompanyemployeetrackerappca_2.MenuOptionsCA_2.SEARCH;
import static techcompanyemployeetrackerappca_2.MenuOptionsCA_2.SHUFFLE;
import static techcompanyemployeetrackerappca_2.MenuOptionsCA_2.SORT;
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
        SubMenuCA_2 selected1 = null;
        
        do{ //menu will run until user choose option 5
            MenuOptionsCA_2.printMenu();
            System.out.println("Please enter a number to select an option.");
            int userInput;        
        
            try{
                userInput = Integer.parseInt(scanner.nextLine());
                selected = MenuOptionsCA_2.fromInt(userInput);
                System.out.println(selected.getTopmenu());
                switch(selected){
            
                    case SORT:
                        try{
                            // Reads employee list from file
                            ArrayList<String> employeeList = FileReaderCA_2.readEmployeeList("EmployeeList.txt");
                            //for sorting created SortMethodCA_2 object
                            SortMethodCA_2<String> sorted = new SortMethodCA_2<>();
                            //these all adding in a sorted object which is read from file
                            sorted.addAll(employeeList);
                            //recursiveInsertionSort() with this method will do sorting of list
                            sorted.recursiveInsertionSort();
                            
                            //İt's print first 20 element of sorted list
                            for(int i= 0; i < sorted.size() && i<20; i++){
                                System.out.println(sorted.get(i));
                            }
                            
                        }catch(Exception e){
                            System.out.println("Error while sorting: "+ e.getMessage());
                        }
                    break;
                    case SHUFFLE:
                    break;
                    case SEARCH:
                    break;
                    case ADD_EMPLOYEE_MENU:
                    //sub menu options will run in there
                    do{
                        SubMenuCA_2.printSubmenu();
                        System.out.println("Please enter a number to select an option.");
                        int userInput1;
                    
                        try{
                            userInput1 = Integer.parseInt(scanner.nextLine());
                            selected1 = SubMenuCA_2.fromInt(userInput1);
                            System.out.println(selected1.getSubmenu());
                            switch(selected1){
                                case ADD_EMPLOYEE:
                                try{
                                    EmployeeAddingMethodsCA_2.addEmployee("EmployeeList.txt", scanner);
                                }catch(Exception e){
                                    System.out.println("Error adding employee manually: "+ e.getMessage());
                                }
                                break;
                                case GENERATE_RANDOM_EMPLOYEE:
                                try{
                                    EmployeeAddingMethodsCA_2.generateRandom("EmployeeList.txt");
                                }catch(Exception e){
                                    System.out.println("Error generating employee randomly: "+ e.getMessage());
                                }
                                break;
                                case RETURN:
                                break;
                            }
                        }catch(IllegalArgumentException e){
                            System.out.println("Invalid option has chosen.");
                        }
                    //when user choose return option program turn back to top menu
                    }while(selected1 != SubMenuCA_2.RETURN);
                    break;
                    case EXIT:
                    System.out.println("Exited from program...");
                    break;
        }
            
            }catch(IllegalArgumentException e){
                System.out.println("Invalid option has chosen.");
            }
        }while(selected != MenuOptionsCA_2.EXIT);
        
        
    }
    
}
