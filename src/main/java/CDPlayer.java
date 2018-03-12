public class CDPlayer extends Component implements IPlayer{

    private int capacity;

    public CDPlayer(String make, String model, int capacity) {
        super(make, model);
        this.capacity = capacity;
    }

    @Override
    public String play() {
        return "Playing a CD";
    }

    @Override
    public String pause() {
        return "Pausing CD";
    }

    @Override
    public String fastForward() {
        return "Fast-forwarding CD";
    }

    @Override
    public String rewind() {
        return "Rewinding CD";
    }

    @Override
    public String eject() {
        return "CD has been ejected";
    }
}
