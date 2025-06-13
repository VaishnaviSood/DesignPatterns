import Adaptor.SquarePegAdaptor;
import Client.RoundHole;
import Client.RoundPeg;
import Service.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(8);
        SquarePeg squarePeg = new SquarePeg(7,8);
        RoundHole roundHole = new RoundHole(7);
        RoundPeg squarePegAdaptor = new SquarePegAdaptor(squarePeg);
        System.out.println(squarePegAdaptor.getRadius());
        System.out.println("Round Peg with radius "+roundPeg.getRadius()+" fits in round hole with radius "
                +roundHole.getRadius()+" ? "+roundHole.isFit(roundPeg));
        System.out.println("Square Peg with length & breadth  "+squarePeg.getLength()+" "+squarePeg.getBreadth()+" fits in round hole with radius "
                +roundHole.getRadius()+" ? "+roundHole.isFit(squarePegAdaptor));

    }
}
