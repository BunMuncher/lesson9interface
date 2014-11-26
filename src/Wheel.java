
import TurtleGraphics.Pen;

public class Wheel extends Circle{
    private int spokes;
    
    public Wheel(){
        super();
        spokes = 0;
    }
    public Wheel(double xLoc, double yLoc, double r, int s){
        super(xLoc,yLoc,r);
        spokes = s;
    }
    public void draw (Pen p){
        super.draw(p);
        for(int i = 1; i <=spokes; i++){
            p.up();
            p.move(xPos, yPos);
            p.setDirection(i * 360/spokes);
            p.down();
            p.move(rad);
        }
    }
    public void setSpokes(int s){
        spokes = s;
    }
    public String toString(){
        String str = "Wheel\n" + "Radius: " + rad + "\n" + "spokes: " + spokes + "\n"
                + "(X,Y) position: (" + xPos + "," + yPos + ")\n"
                + "Area: " + area() + "\tPerimeter: " + perim();
        return str;
    }
}
