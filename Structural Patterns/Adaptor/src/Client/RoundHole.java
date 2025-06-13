package Client;

public class RoundHole {


    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public boolean isFit(RoundPeg roundPeg){
        return roundPeg.getRadius()<this.radius;
    }
}
