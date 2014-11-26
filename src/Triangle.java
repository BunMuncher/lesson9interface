
import TurtleGraphics.Pen;


public class Triangle extends AbstractShape{
    private double x2,y2,x3,y3;
    
    public Triangle(){
        super();
        x2=50;
        x3=100;
        y2=50;
        y3=0;
    }
    
    public double area() {
        return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3))/2;
    }
    public double perim() {
        return Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2)* (yPos - y2));
    }

   
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
    }

    
    public void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        x3 = (x3-xPos) * factor + xPos;
        y3 = (y3-yPos) * factor + yPos;
    }
    
    public void move(double x, double y){
        double xd = x-xPos;
        double yd = y-yPos;
        xPos=x;
        yPos=y;
        x2 = x2 + xd;
        y2 = y2 + yd;
        y3 = y3 + yd;
        x3 = x3 + xd;
    }
    
    public String toString(){
        String str = "this is a Triangle\n"
                + "(X,Y) position: (" + xPos + "," + yPos + ")\n"
                + "second (X,Y) position: (" + x2 + "," + y2 + ")\n"
                + "third (X,Y) position: (" + x3 + "," + y3 + ")\n"
                + "Area: " + area() + "\tPerimeter: " + perim();
        return str;
    }
}
