package _4_BeanLifeCycle.PostConstruct;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class CarCompany {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Cars cars;

    public Cars getCars(){
        return cars;
    }

    public void setCars(Cars cars){
        this.cars= cars;
    }

    public void carType(){
        Cars cars1 = new Cars("tesla");
        L.info("{} --> is cars1", cars1);
        L.info("This is an electric car");
    }

    @PostConstruct
    public void postConstructMethod(){
        L.info("This is the post construct method");
    }

}
