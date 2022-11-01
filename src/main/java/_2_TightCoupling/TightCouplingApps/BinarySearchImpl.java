/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_TightCoupling.TightCouplingApps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 *
 * @author JayPc
 */
@Component
public class BinarySearchImpl {
    
    @Qualifier("swell")
    @Autowired

//  Autowiring by type
    private SortAlgorithm sortAlgorithm;


//  Autowiring by name
//    private SortAlgorithm quickSort;


    // This is first method of bean injection. The constructor method of injecting beans
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.quickSort = sortAlgorithm;
//    }

  
    

    // This is second method of bean injection. The getter and setter method of injecting beans
    
    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }
//
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    
    
/*    
    The third method of bean injection is the no setter nor constructor method
*/

//    For autowiring by type
    public String binarySearch(int[] numbers, int searchNumber){
        int[] sort = sortAlgorithm.sort(numbers);
        for(int x: sort){
            System.out.println(x);
        }
        ArrayList<Integer> basket = sortAlgorithm.basketSorter(numbers);
        System.out.println(basket);
        System.out.println(sortAlgorithm);
        return "Binary Search Executed";
    }

//    For autowiring by name
//    public String binarySearch(int[] numbers, int searchNumber){
//        int[] sort = quickSort.sort(numbers);
//        for(int x: sort){
//            System.out.println(x);
//        }
//        ArrayList<Integer> basket = quickSort.basketSorter(numbers);
//        System.out.println(basket);
//        System.out.println(quickSort);
//        return "Binary Search Executed";
//    }
    
}
