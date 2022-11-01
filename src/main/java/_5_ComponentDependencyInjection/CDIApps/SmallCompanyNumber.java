package _5_ComponentDependencyInjection.CDIApps;


import org.springframework.context.annotation.Primary;
import javax.inject.Named;

@Named
@Primary
public class SmallCompanyNumber implements CompanyNumber{

    public int numberPicker(int[] array){
        int greatest = Integer.MAX_VALUE;
        int smallest = 0;
        for (int i : array) {
            if (i < greatest) {
                greatest = i;
                smallest = greatest;
            }
        }
        return smallest;
    }

}
