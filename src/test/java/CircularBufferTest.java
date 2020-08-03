import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    private boolean result;
    private static CircularBuffer cb;

    @Before
    public void setUp(){
        cb = new CircularBuffer();
    }

    @Test
    public void create_new_buffer_should_empty() {
        result = cb.isEmpty();
        assertTrue("Buffer Not Available", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        result = cb.isFull();
        assertTrue("Buffer is Not Full", result);
    }

    @Test
    public void write_A_to_buffer_should_read_A() {

        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void set_15_size_buffer_size_should_change_to_15() {

        cb.setSize(15);
        assertEquals(15, cb.getBuffer().length);
    }

    @Test
    public void overwrite_data_in_oldest_data() {
       
        for (int i = 0; i < 11; i++) {
            cb.writeData((char) ('A' + i) + "");
        }
        result = cb.isFull();
        assertTrue("Buffer is Not Full", result);
        assertEquals("K", cb.readData());
    }


}