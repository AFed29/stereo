import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before() {
        radio = new Radio("LG", "LAS655K");
    }

    @Test
    public void hasMake() {
        assertEquals("LG", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("LAS655K", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Tuned into Radio 1", radio.tune("Radio 1"));
    }

}
