/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techcompanyemployeetrackerappca_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author alper
 */
public class FileReaderCA_2 {
    
    /*
    This class reads the file and puts all lines in a arraylist.
    File name just variable so it will give us flexibility.
    When we need to work with different file so we just need to put new file name in 
    new method
    */
    public static ArrayList<String> readEmployeeList(String fileName) throws IOException {
        ArrayList<String> employeeList = new ArrayList<>();
        BufferedReader myReader = new BufferedReader(new FileReader(fileName));
        String line;
        
        //reader will read until file finish
        while((line = myReader.readLine()) !=null){
            //after trim spaces removed if is's not empty line will add in employeeList
            if(!line.trim().isEmpty()){
                employeeList.add(line.trim());
            }
        }
        myReader.close();
        return employeeList;
    }
    
}
