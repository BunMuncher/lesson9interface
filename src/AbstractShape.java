
import TurtleGraphics.Pen;

abstract public class AbstractShape {

    protected double xPos, yPos;

    public AbstractShape() {
        xPos = 0;
        yPos = 0;
    }

    public AbstractShape(double y, double x) {
        xPos = x;
        yPos = y;
    }

    abstract public double area();

    abstract public void draw(Pen p);

    abstract public void stretchBy(double factor);

    public final double getxpos() {
        return xPos;
    }

    public final double getypos() {
        return yPos;
    }

    public final void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    public String toString() {
        return "X-Y Position: " + xPos + ", " + yPos + "\nArea: " + area();
    }

}
