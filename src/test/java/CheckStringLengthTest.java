import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringLengthTest {
    @Test
    public void checksum(){
        //Given
        int testint1 =5;
        int testint2 =5;
        //when
        int result =CheckStringLengthApp.sum(testint1,testint2);
        //then
        assertEquals(10, result);
    }
    @Test
    public void greaterthanhundred(){
        //Given
        int firstvalue =671;
        int secondvalue =18;
        //when
        boolean result =CheckStringLengthApp.check100(firstvalue, secondvalue);
        //then
        assertEquals(true,result);
    }

}
