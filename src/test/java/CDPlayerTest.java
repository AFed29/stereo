import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "PS-LX300", 6);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("PS-LX300", cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing a CD", cdPlayer.play());
    }

}
