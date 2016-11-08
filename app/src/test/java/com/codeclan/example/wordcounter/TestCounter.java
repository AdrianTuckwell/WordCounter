package com.codeclan.example.wordcounter;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;

/**
 * Created by user on 08/11/2016.
 */

public class TestCounter {

    Counter counter;

    @Test
    public void testGetCount() {
        counter = new Counter();
        String phrase = "test test test";
        //assertEquals(3, counter.getCount(phrase));
        assertEquals(3,counter.getCount(phrase).intValue());
    }


}
