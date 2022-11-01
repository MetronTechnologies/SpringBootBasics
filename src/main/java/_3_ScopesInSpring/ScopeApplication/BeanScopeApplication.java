package _3_ScopesInSpring.ScopeApplication;


import _3_ScopesInSpring.BeanScope.BinarySearchImpl;
import _3_ScopesInSpring.DependencyScope.School;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("_3_ScopesInSpring.BeanScope, _3_ScopesInSpring.DependencyScope")
public class BeanScopeApplication {

    private static Logger L = LoggerFactory.getLogger(BeanScopeApplication.class);

    public static int[] testArray = {1, 2, 3};

    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(BeanScopeApplication.class);
        BinarySearchImpl firstBean = applicationContext.getBean(BinarySearchImpl.class); // first bean instance
        BinarySearchImpl secondBean = applicationContext.getBean(BinarySearchImpl.class); // second bean instance
        System.out.println(firstBean + " first bean");
        System.out.println(secondBean + " second bean");
        String firstBeanAns = firstBean.binarySearch(testArray, 4);
        System.out.println(firstBeanAns + "\n\n");

        School sc = applicationContext.getBean(School.class);
        School sc2 = applicationContext.getBean(School.class);

        L.info("{}", sc);
        L.info("{}", sc.getSchoolBean());
        L.info("{}", sc2);
        L.info("{}", sc2.getSchoolBean());
    }

}


/*
bean scope are
(1) Singleton - one instance per spring context
(2) Prototype - a new bean whenever requested
(3) request - gives one bean per http request
(4) session - gives one bean per http session
*/
