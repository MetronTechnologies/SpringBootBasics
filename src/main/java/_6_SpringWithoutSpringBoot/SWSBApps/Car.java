package _6_SpringWithoutSpringBoot.SWSBApps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    public Car(){
        L.info("This is a model Y");
    }

}
