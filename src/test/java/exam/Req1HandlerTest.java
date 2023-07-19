package exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Req1HandlerTest {

    @Test
    void testHandle() {

        String stringInput1 = "aabcccbbad";
        String stringInput2 = "aaa";
        String stringInput3 = "aabcccbbaaadddb";
        String stringInput4 = "aaaaaaaaaaaaaaaaaaaaa";
        String stringInput5 = "aa";
        String stringInput6 = "a";
        String stringInput7 = "";

        Req1Handler req1Handler = new Req1Handler();
        String output1 = req1Handler.handle(stringInput1);
        String output2 = req1Handler.handle(stringInput2);
        String output3 = req1Handler.handle(stringInput3);
        String output4 = req1Handler.handle(stringInput4);
        String output5 = req1Handler.handle(stringInput5);
        String output6 = req1Handler.handle(stringInput6);
        String output7 = req1Handler.handle(stringInput7);

        Assertions.assertEquals("d", output1);
        Assertions.assertEquals("", output2);
        Assertions.assertEquals("b", output3);
        Assertions.assertEquals("", output4);
        Assertions.assertEquals("aa", output5);
        Assertions.assertEquals("a", output6);
        Assertions.assertEquals("", output7);

    }
}