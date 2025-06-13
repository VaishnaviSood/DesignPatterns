public class CarManual implements Builder{

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int numSeats) {
        System.out.println("Car has "+numSeats+"seats");
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("Car has "+engine+" engine");
    }

    @Override
    public void setTripComputer(String tripComputer) {
        System.out.println("Car has "+tripComputer+" trip computer");
    }

    @Override
    public void setGPS(String gps) {
        System.out.println("Car has "+gps+" GPS");
    }
}
