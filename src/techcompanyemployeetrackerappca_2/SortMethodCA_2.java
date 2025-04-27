/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techcompanyemployeetrackerappca_2;
import java.util.*;
/**
 *
 * @author alper
 * This method gets support from ArrayList and its apply recursive 
 * insertion sort algorithm. 
 */
public class SortMethodCA_2<ElementType> extends ArrayList<ElementType> {
    
    //This method starts sorting 
    public void recursiveInsertionSort(){
        recursiveInsertionSortCall(size());
    }
    
    //Main part
    //This is sort of first n element of list
    private void recursiveInsertionSortCall(int n){
        //if there is no element to sort, process stops
        if(n <= 1){
            return;
        }
        
        //it makes recursive call for sort first (n-1) elemets
        recursiveInsertionSortCall(n-1);
        //(n-1)th element located right place 
        ElementType keyElement = get(n-1);//choose last element to sort
        recursiveInsert(n-2, keyElement);//it's the locatation function
    }
    //This method located keyElement in a right position with recursive way.
    private void recursiveInsert(int index, ElementType keyElement){
        //if it's comes to 1st line of list or finds to right position in the list
        if(index <0 || ((Comparable) get(index)).compareTo((Comparable) keyElement)<= 0){
            set(index+1, keyElement);//it' located to keyElement in a right position
            return;
        }
        //if it's not in right position swap to right this element
        set(index+1, get(index));
        //its control again from 1 side left position
        recursiveInsert(index-1, keyElement);
    }
}
