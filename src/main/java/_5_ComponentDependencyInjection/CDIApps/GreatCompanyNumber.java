package _5_ComponentDependencyInjection.CDIApps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class GreatCompanyNumber implements CompanyNumber{
    private Logger L = LoggerFactory.getLogger(this.getClass());

    public int numberPicker(int[] array){
        int smallest = Integer.MIN_VALUE;
        int greatest = 0;
        for (int x: array){
            if(x > smallest){
                smallest = x;
                greatest = smallest;
            }
        }
        return greatest;
    }

}
