package _6_SpringWithoutSpringBoot.SWSBApps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class CarCompany {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Car car;

    public CarCompany(){
        L.info("This is the car company constructor");
    }

    public void cartype(){
//        Car car1 = new Car();
//        L.info("{}", car1);
        L.info("The car type is cybertruck");
    }

    public int carNumber(){
        return 5;
    }

    @PostConstruct
    public void postConstruct(){
        L.info("This is the post construct method");
    }

}
