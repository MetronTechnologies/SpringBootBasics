package _7_SpringApplicationContextXML.SACUXApplication;

import _7_SpringApplicationContextXML.SACUXApps.XmlApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("_7_SpringApplicationContextXML.SACUXApps")
public class XmlMainApplication {

    private static Logger L = LoggerFactory.getLogger(XmlMainApplication.class);

    public static void main(String [] args){
        try(ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
            XmlApplication xmlApplication = xmlApplicationContext.getBean(XmlApplication.class);
            L.info("{}", xmlApplication);
        }
    }

}
