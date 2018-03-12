import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;


    @Before
    public void before() {
        Radio radio = new Radio("LG", "LAS655K");
        CassettePlayer cassettePlayer = new CassettePlayer("Hitachi", "DE-57");
        CDPlayer cdPlayer = new CDPlayer("Sony", "PS-LX300", 6);
        stereo = new Stereo("Home Hi-Fi", cdPlayer, cassettePlayer, radio);
    }

    @Test
    public void canPlayCD() {
        assertEquals("Playing a CD", stereo.playCD());
    }

    @Test
    public void canPauseCD() {
        assertEquals("Pausing CD", stereo.pauseCD());
    }

    @Test
    public void canFastForwardCD() {
        assertEquals("Fast-forwarding CD", stereo.fastForwardCD());
    }

    @Test
    public void canRewindCD() {
        assertEquals("Rewinding CD", stereo.rewindCD());
    }

    @Test
    public void canEjectCD() {
        assertEquals("CD has been ejected", stereo.ejectCD());
    }

    @Test
    public void canRaiseVolume() {
        stereo.raiseVolume(1);
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canPlayCassette() {
        assertEquals("Playing a cassette", cassettePlayer.play());
    }
}
