package _6_SpringWithoutSpringBoot.SWSBApplication;


import _6_SpringWithoutSpringBoot.SWSBApps.CarCompany;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("_6_SpringWithoutSpringBoot.SWSBApps")
public class SWSBApplication {

    private static Logger L = LoggerFactory.getLogger(SWSBApplication.class);

    public static void main(String [] args){
        try(AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(SWSBApplication.class)){
            CarCompany ccBean = annotationContext.getBean(CarCompany.class);
            int x = ccBean.carNumber();
            L.info("{}", x);
            ccBean.cartype();
        }
    }



}
