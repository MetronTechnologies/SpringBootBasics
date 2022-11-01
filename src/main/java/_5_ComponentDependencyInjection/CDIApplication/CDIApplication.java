package _5_ComponentDependencyInjection.CDIApplication;


import _5_ComponentDependencyInjection.CDIApps.CarCompany;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("_5_ComponentDependencyInjection.CDIApps")
public class CDIApplication {

    private static Logger L = LoggerFactory.getLogger(CDIApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);
        CarCompany carCompanyBean = applicationContext.getBean(CarCompany.class);
        int smallestNumber = carCompanyBean.smallestNumber();
        L.info("{}", smallestNumber);
    }


    /*
        @inject represents @Autowired
        @Named represents @Component and @Qualifier
        @Singleton defines a scope of singleton
    */

}
