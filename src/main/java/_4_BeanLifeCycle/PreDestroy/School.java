package _4_BeanLifeCycle.PreDestroy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class School {

    private Logger L = LoggerFactory.getLogger(this.getClass());

    SchoolName schoolName;

    public School(SchoolName schoolName){
        this.schoolName = schoolName;
    }

    public SchoolName getSchool(){
        return schoolName;
    }

    public void setSchoolName(SchoolName sName){
        this.schoolName = sName;
    }

    public void schoolType(){
        L.info("The type of school is a university");
    }

    @PreDestroy
    public void preDestroyMethod(){
        L.info("This is the predestroy method");
    }

}
