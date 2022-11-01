package _3_ScopesInSpring.DependencyScope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {

//    @Autowired
    private SchoolBean schoolBean;

//        private SchoolBean quickSort;

    public School(SchoolBean quickSort){
        this.schoolBean = quickSort;
    }


    public SchoolBean getSchoolBean(){
        return schoolBean;
    }

    public void setSchoolBean(SchoolBean quickSort) {
        this.schoolBean = quickSort;
    }
}
