package SpringBoot.SpringBootBasics;

import org.junit.jupiter.api.Test;
import _9_JUnit1.JUnitApplication;

public class _9_JUnit1 {

    @Test
    public void testapp(){
        JUnitApplication jUnitApplication= new JUnitApplication();
        int [] numbers = {1, 2, 3 ,4, 5};
        System.out.println(jUnitApplication.sum(numbers));
    }

}

/*
        Apart from the @Test assertation, there are also other assertations like
        @After
        @Before
        @AfterClass
        @BeforeClass
*/
