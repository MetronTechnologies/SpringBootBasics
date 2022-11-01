package SpringBoot.SpringBootBasics._10_MockitoTests;

import _10_Mockito1.Addition;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsingJustMockito {

    @Test
    public void MockitoTest1(){
        Addition add = mock(Addition.class);
        when(add.extraOperation()).thenReturn(new int[]{2, 5, 7});
    }

}
