public class CDPlayer extends Component{

    private int capacity;

    public CDPlayer(String make, String model, int capacity) {
        super(make, model);
        this.capacity = capacity;
    }

    public String play() {
        return "Playing a CD";
    }

}
