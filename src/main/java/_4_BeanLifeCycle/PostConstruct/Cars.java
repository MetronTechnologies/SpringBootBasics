package _4_BeanLifeCycle.PostConstruct;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Cars {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    public Cars(){
        L.info("This is a car");
    }

    public Cars(String carName) {
        L.info("This is a "+ carName);
    }

}
