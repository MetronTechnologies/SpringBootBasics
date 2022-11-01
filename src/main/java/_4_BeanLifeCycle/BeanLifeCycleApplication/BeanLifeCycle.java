package _4_BeanLifeCycle.BeanLifeCycleApplication;


import _4_BeanLifeCycle.PostConstruct.CarCompany;
import _4_BeanLifeCycle.PreDestroy.School;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("_4_BeanLifeCycle.PostConstruct, _4_BeanLifeCycle.PreDestroy")
public class BeanLifeCycle {

    public static void main(String [] args) {
        ApplicationContext applicationContext = SpringApplication.run(BeanLifeCycle.class, args);
        CarCompany carCompany = applicationContext.getBean(CarCompany.class);
        carCompany.carType();

        School school = applicationContext.getBean(School.class);
        school.schoolType();
    }

}
