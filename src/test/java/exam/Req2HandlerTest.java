package exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Req2HandlerTest {

    @Test
    void testHandle() {
        String stringInput1 = "abcccbad";
        String stringInput2 = "aaa";
        String stringInput3 = "aabcccbbaaadddb";
        String stringInput4 = "aaaaaaaaaaaaaaaaaaaaa";
        String stringInput5 = "aa";
        String stringInput6 = "a";
        String stringInput7 = "";
        String stringInput8 = "abdcccccbad";

        Req2Handler req2Handler = new Req2Handler();
        String output1 = req2Handler.handle(stringInput1);
        String output2 = req2Handler.handle(stringInput2);
        String output3 = req2Handler.handle(stringInput3);
        String output4 = req2Handler.handle(stringInput4);
        String output5 = req2Handler.handle(stringInput5);
        String output6 = req2Handler.handle(stringInput6);
        String output7 = req2Handler.handle(stringInput7);
        String output8 = req2Handler.handle(stringInput8);

        Assertions.assertEquals("d", output1);
        Assertions.assertEquals("", output2);
        Assertions.assertEquals("b", output3);
        Assertions.assertEquals("", output4);
        Assertions.assertEquals("aa", output5);
        Assertions.assertEquals("a", output6);
        Assertions.assertEquals("", output7);
        Assertions.assertEquals("abddbad", output8);
    }
}