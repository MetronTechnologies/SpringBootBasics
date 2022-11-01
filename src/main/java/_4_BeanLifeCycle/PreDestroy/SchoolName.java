package _4_BeanLifeCycle.PreDestroy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SchoolName {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    public SchoolName(){
        L.info("This is oxford university");
    }

}
