import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "Bravia", 6);
    }

    @Test
    public void canPlay() {
        assertEquals("Playing a CD", cdPlayer.play());
    }
}
