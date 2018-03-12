public class Stereo {
    private String name;
    private CDPlayer cdPlayer;
    private CassettePlayer cassettePlayer;
    private Radio radio;
    private int volume;

    public Stereo(String name, CDPlayer cdPlayer, CassettePlayer cassettePlayer, Radio radio) {
        this.name = name;
        this.cdPlayer = cdPlayer;
        this.cassettePlayer = cassettePlayer;
        this.radio = radio;
        this.volume = 5;
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public String pauseCD() {
        return cdPlayer.pause();
    }

    public String fastForwardCD() {
        return cdPlayer.fastForward();
    }

    public String rewindCD() {
        return cdPlayer.rewind();
    }

    public String ejectCD() {
        return cdPlayer.eject();
    }

    public void raiseVolume(int i) {
        this.volume += i;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
