package _2_TightCoupling.TightCouplingApplication;

import _2_TightCoupling.TightCouplingApps.BinarySearchImpl;
import _2_TightCoupling.TightCouplingApps.BubbleSortAlgorithm;
import _2_TightCoupling.TightCouplingApps.QuickSortAlgorithm;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("_2_TightCoupling.TightCouplingApps")
public class TightCouplingApp {
    //      what are the beans?
    //      what are the dependencies of a bean?
    //      where to search for beans? No need for this because all the beans are in the same package
    public static void main(String[] args) {

        int[] testArray = {1, 2, 3};
        

//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());//QuickSortAlgorithm or BubbleSortAlgorithm
//        String binarySearchResult = binarySearch.binarySearch(testArray, 3);
//        System.out.println(binarySearchResult);

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TightCouplingApp.class)) {
            BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);
            String binarySearchResult = binarySearchBean.binarySearch(testArray, 3);
            System.out.println(binarySearchResult);
        }
    }

}

//QuickSortAlgorithm or BubbleSortAlgorithm is an instance of an object
// BinarySearchImpl is a bean
// Before springboot mechanisms, the algorithms would have to be switched manually.
//@Component tells spring what the beans are
//@Autowired tells spring what the dependencies of the beans
// It is either autowiring by name or autowiring by type (either of them is a must)
// It is either the @Autowired annotation combined with any of line 39 is used or the constructor of the class is used
//Spring ApplicationContext is what manages the beans for spring
//Debug mode can be used to find the steps 
//@Primary can be used to add more importance to a bean
//@ComponentScan is used when all the involvong packages are not in the same package
//I discovered that the @Qualifier works well with getter and setter and the no getter and setter method of injecting beans
