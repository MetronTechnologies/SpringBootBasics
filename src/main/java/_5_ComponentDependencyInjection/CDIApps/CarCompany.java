package _5_ComponentDependencyInjection.CDIApps;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CarCompany {

//    @Inject
//    SmallCompanyNumber scn;
//
//    @Inject
//    GreatCompanyNumber gcn;
//
//    public CarCompany(SmallCompanyNumber smallCompanyNumber, GreatCompanyNumber greatCompanyNumber) {
//        this.scn = smallCompanyNumber;
//        this.gcn = greatCompanyNumber;
//    }

    @Inject
    CompanyNumber companyNumber;

    public int smallestNumber(){
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int number = companyNumber.numberPicker(numbers);
        return number;
    }

}
