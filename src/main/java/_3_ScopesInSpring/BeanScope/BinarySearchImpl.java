/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3_ScopesInSpring.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 *
 * @author JayPc
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    
    @Qualifier("swell")
    @Autowired
    private SortAlgorithm sortAlgorithm;

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
    
}
