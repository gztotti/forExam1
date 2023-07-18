package exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Req2HandlerTest {

    @Test
    void testHandle() {
        StringBuffer stringBufferInput1 = new StringBuffer("abcccbad");
        StringBuffer stringBufferInput2 = new StringBuffer("aaa");
        StringBuffer stringBufferInput3 = new StringBuffer("aabcccbbaaadddb");
        StringBuffer stringBufferInput4 = new StringBuffer("aaaaaaaaaaaaaaaaaaaaa");
        StringBuffer stringBufferInput5 = new StringBuffer("aa");
        StringBuffer stringBufferInput6 = new StringBuffer("a");
        StringBuffer stringBufferInput7 = new StringBuffer("");
        StringBuffer stringBufferInput8 = new StringBuffer("abdcccccbad");

        Req2Handler req2Handler = new Req2Handler();
        String output1 = req2Handler.handle(stringBufferInput1).toString();
        String output2 = req2Handler.handle(stringBufferInput2).toString();
        String output3 = req2Handler.handle(stringBufferInput3).toString();
        String output4 = req2Handler.handle(stringBufferInput4).toString();
        String output5 = req2Handler.handle(stringBufferInput5).toString();
        String output6 = req2Handler.handle(stringBufferInput6).toString();
        String output7 = req2Handler.handle(stringBufferInput7).toString();
        String output8 = req2Handler.handle(stringBufferInput8).toString();

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