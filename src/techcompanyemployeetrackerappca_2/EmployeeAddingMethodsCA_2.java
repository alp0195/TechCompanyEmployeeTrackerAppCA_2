package techcompanyemployeetrackerappca_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author alper
 */
public class EmployeeAddingMethodsCA_2 {
    
    //Title and Departmant options
    private static String[] TITLES = {"Head Manager", "Assistant Manager", "Team Lead"};
    private static String[] DEPARTMANTS = {"Customer Service", "Technical Support", "HR"};
    //File name decided when file created it's will get this name 
    private static String fileName = "EmployeeList.txt";
    
    //Manually adding employee method
    public static void addEmployee(String fileName, Scanner scanner) throws IOException{
        
        BufferedWriter writer = null; 
        
        try{
            writer = new BufferedWriter(new FileWriter(fileName, true));//true means; all records will save in file and it' not overwrite
            
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine().trim();
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine().trim();
            
            //as same as menu options I used same method to give option number for title selection
            System.out.println("Choose title: \n");
            for(int i = 0; i < TITLES.length; i++){
                System.out.println((i+1)+". "+TITLES[i]);
            }
            int chooseTitle = Integer.parseInt(scanner.nextLine());
            String title = TITLES[chooseTitle-1];
            
            //Also same method for departmant selection
            System.out.println("Choose departmant: \n");
            for(int i = 0; i < DEPARTMANTS.length; i++){
                System.out.println((i+1)+". "+DEPARTMANTS[i]);
            }
            int chooseDepartmant = Integer.parseInt(scanner.nextLine());
            String departmant = DEPARTMANTS[chooseDepartmant-1];
            
            //new record will write in file in this order
            String employeeSave = firstName + " "+ lastName + " | "+ title + " | "+departmant;
            writer.write(employeeSave);
            writer.newLine();
            System.out.println("New record added successfully.");
        
        }catch(IOException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error :"+ e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e.getMessage());
        }
        writer.close();
    }
    
    //Same route followed for random generation
    public static void generateRandom(String fileName) throws IOException{
        BufferedWriter writer = null;
        
        try{
            /*
            some random names and last names put into array so Random() method
            will choose from these arrays
            */
            String[] randomFirstName = {"Dominique","Karl","Chris","Chelsea",
                "Nikki","Leah","Nathan","Joel","Aaron","Emmet","Tom","Emily",
                "Amy","Robert","Jhon","Eddie","Bill","Rick","Katie","Darrach"};
            String[] randomLastName = {"Foster","McCall","Early","Murphy","McKeena",
                "Drake","O'Neil","O'Halloran","Green","Geller","Walker","Cash",
                "Brown","McNamara","Cruise","Hardy","O'Connel","Martin","Hale","White"};
            Random random = new Random();
            
            //This for how Random() method behave
            String firstName = randomFirstName[random.nextInt(randomFirstName.length)];
            String lastName = randomLastName[random.nextInt(randomLastName.length)];
            String title = TITLES[random.nextInt(TITLES.length)];
            String departmant = DEPARTMANTS[random.nextInt(DEPARTMANTS.length)];
            
            writer = new BufferedWriter(new FileWriter(fileName, true));
            String randomEmployeeSave = firstName + " "+ lastName + " | "+ title + " | "+ departmant;
            writer.write(randomEmployeeSave);
            writer.newLine();
            System.out.println("New random record added successfully.\n"+ randomEmployeeSave);
        
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        writer.close();
    }
    
    
}
