
import TurtleGraphics.Pen;

public class Circle extends AbstractShape {

    protected double rad;

    public Circle() {
        super();
        rad = 1;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        rad = r;
    }

    public double area() {
        return Math.PI * rad * rad;
    }

    public void draw(Pen p) {
        double side = 2.0 * Math.PI * rad / 120.0;
        p.up();
        p.move(xPos + rad, yPos - side/2.0);
        p.setDirection(90);
        p.down();

        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }
    
    public void stretchBy(double factor) {
        rad *= factor;
    }

    public String toString() {
        String str = "This is a CIRCLE\n";
        str += "Radius: " + rad;
        str += "\n" + super.toString();
        return str;
    }

}
