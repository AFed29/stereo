import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {
    Mp3Player mp3Player;
    Stereo stereo;
    CDPlayer cdPlayer;
    CassettePlayer cassettePlayer;
    Radio radio;

    @Before
    public void before() {
        mp3Player = new Mp3Player();
        radio = new Radio("LG", "LAS655K");
        cassettePlayer = new CassettePlayer("Hitachi", "DE-57");
        cdPlayer = new CDPlayer("Sony", "PS-LX300", 6);
        stereo = new Stereo("Home Hi-Fi", cdPlayer, cassettePlayer, radio);
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("Connected to Home Hi-Fi", mp3Player.connect(stereo));
    }
}
