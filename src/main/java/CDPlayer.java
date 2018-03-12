public class CDPlayer {
    private String make;
    private String model;
    private int capacity;

    public CDPlayer(String make, String model, int capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }


    public String play() {
        return "Playing a CD";
    }
}
