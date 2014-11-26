
import TurtleGraphics.Pen;

public class Rect extends AbstractShape{
    
      private double xPos, yPos, width, height;
    
    public Rect(){
        super();
        width=1;
        height=1;
    }
    
    public Rect(double x, double y, double w, double h){
        super(x,y);
        width=w;
        height=h;
    }
    
    public double area() {
      return width * height;
    }
    public double perim() {
        return height + height + width + width;
    }

   
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
      }

    public void stretchBy(double factor) {
        height*=factor;
        width*=factor;
    }
    
    public String toString(){
        String str = "This is a Rectangle\n";
        str += "Width: " + width;
        str += "\tHeight: " + height
        + "\nArea: " + area() + "\tPerimeter: " + perim();
        return str;
    }
}
