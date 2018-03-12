import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void before() {
        cassettePlayer = new CassettePlayer("Hitachi", "DE-57");
    }

    @Test
    public void hasMake() {
        assertEquals("Hitachi", cassettePlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("DE-57", cassettePlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing a cassette", cassettePlayer.play());
    }

}