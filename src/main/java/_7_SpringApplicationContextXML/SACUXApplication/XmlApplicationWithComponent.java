package _7_SpringApplicationContextXML.SACUXApplication;

import _7_SpringApplicationContextXML.SACUXApps.XmlApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationWithComponent {

    private static Logger L = LoggerFactory.getLogger(XmlApplicationWithComponent.class);

    public static void main(String [] args) {
        try(ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            String[] beanNames = xmlApplicationContext.getBeanDefinitionNames();
            XmlApplication xmlBean = xmlApplicationContext.getBean(XmlApplication.class);
            L.info("{} -> {}", xmlBean, xmlBean.getXmlApp());
            L.info("Beans loaded are -> {}", (Object) beanNames);
        }
    }

}
