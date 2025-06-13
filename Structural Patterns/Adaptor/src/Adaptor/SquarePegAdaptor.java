package Adaptor;

import Client.RoundPeg;
import Service.SquarePeg;

public class SquarePegAdaptor extends RoundPeg {
    private SquarePeg squarePeg;
    private int radius;
    public SquarePegAdaptor(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
        radius = calculateRadius();
    }

    private int calculateRadius() {
        int length = squarePeg.getLength();
        int breadth = squarePeg.getBreadth();
        int radius = (int)(Math.sqrt((length*length)+(breadth*breadth)))/2;
        return radius;
    }

    @Override
    public int getRadius(){
        return radius;
    }
}
