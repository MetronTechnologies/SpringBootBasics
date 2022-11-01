package _8_ExternalFileProperties.EFPApplication;


import _8_ExternalFileProperties.EFPApps.EFPApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("_8_ExternalFileProperties.EFPApps")
@PropertySource("classpath:app.properties")
public class EFPApplication {

    private static Logger L = LoggerFactory.getLogger(EFPApplication.class);

    public static void main(String [] args) {
        try(AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(EFPApplication.class)){
            EFPApp efpApp = configApplicationContext.getBean(EFPApp.class);
            String efp = efpApp.service();
            L.info("{}", efp);
        }
    }


}
