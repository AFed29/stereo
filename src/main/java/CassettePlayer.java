public class CassettePlayer extends Component implements IPlayer {

    public CassettePlayer(String make, String model) {
       super(make, model);
    }

    @Override
    public String play() {
        return "Playing a cassette";
    }

    @Override
    public String pause() {
        return "Pausing cassette";
    }

    @Override
    public String fastForward() {
        return "Fast-forwarding cassette";
    }

    @Override
    public String rewind() {
        return "Rewinding cassette";
    }

    @Override
    public String eject() {
        return "Cassette has been ejected";
    }

}