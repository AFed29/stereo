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

    @Test
    public void canPause() {
        assertEquals("Pausing CD", cdPlayer.pause());
    }

    @Test
    public void canFastForward() {
        assertEquals("Fast-forwarding CD", cdPlayer.fastForward());
    }

    @Test
    public void canRewind() {
        assertEquals("Rewinding CD", cdPlayer.rewind());
    }

    @Test
    public void canEject() {
        assertEquals("CD has been ejected", cdPlayer.eject());
    }

}
