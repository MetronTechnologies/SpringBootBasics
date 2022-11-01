package _8_ExternalFileProperties.EFPApps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class EFPApp {

    @Value("${external.value}")
    private String externalValue;

    public String service(){
        return externalValue;
    }

}
