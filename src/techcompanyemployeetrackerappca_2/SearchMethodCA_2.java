/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techcompanyemployeetrackerappca_2;
import java.util.*;
/**
 *
 * @author alper
 */
public class SearchMethodCA_2<ElemType> extends ArrayList<ElemType> {
    
    //binary search method search with name
    public int binarySearch_recursive(String key, int start, int end){
        if(start > end){
            return -1;
        }
        
        int middle = (start + end) / 2;
        
        String line = (String) get(middle);
        String namePart = line.split("\\|")[0].trim();
        
        int comparison = namePart.compareToIgnoreCase(key);
        
        if(comparison == 0){
            return middle;
        }else if(comparison > 0){
            return binarySearch_recursive(key, start, middle -1);
        }else{
            return binarySearch_recursive(key, middle + 1, end);
        }
    }
    
    //supportive method to find related line and prints information on the line
    public void printEmployeeInfo(String fullName){
        int index = binarySearch_recursive(fullName, 0, size()-1);
        
        if(index != -1){
            String found = (String) get(index);
            String[] parts = found.split("\\|");
            
            System.out.println("Employee found:\\n");
            System.out.println("Name: "+parts[0].trim());
            System.out.println("Title Type: "+parts[1].trim());
            System.out.println("Departmant: "+parts[2].trim());
        }else{
            System.out.println("Employee not found!");
        }
    }
}
