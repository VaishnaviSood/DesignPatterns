public class Car implements Builder{


    private int seats;
    private String engine;
    private String tripComputer;
    private String gps;
    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int numSeats) {
        this.seats = numSeats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    public Car getCar(){
        return this;
    }
}
