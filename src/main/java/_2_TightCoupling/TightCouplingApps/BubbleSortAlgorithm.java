/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_TightCoupling.TightCouplingApps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 *
 * @author JayPc
 */
@Component
@Primary
@Qualifier("swell")
public class BubbleSortAlgorithm implements SortAlgorithm {

    private ArrayList<Integer> basket = new ArrayList<>();

    @Override
    public int[] sort(int[] numbers) {
        return new int[] {numbers[numbers.length - 1]};
    }

    public ArrayList<Integer> basketSorter(int[] numbers) {
        for (int number : numbers) {
            basket.add(number * 2);
        }
        return basket;
    }

}
