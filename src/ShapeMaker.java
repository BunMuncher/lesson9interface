import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;

public class ShapeMaker {
    
    public static void main(String[] args) {
        Shape s;
        double r,x,y,w,h;
        KeyboardReader k = new KeyboardReader();
        int choice;
        
        Pen p = new StandardPen(new SketchPadWindow(400,400));
       // s = new Circle(10,10,5);
       while(true)
       {
           choice=k.readInt("1 For Rect, 2 for Circle: ");
           if(choice==1 || choice==2) break;
       }
       if (choice==1)
       {
           w=k.readInt("Enter width of Rect: ");
           h=k.readInt("Enter height of Rect: ");
         //  s=new Rect(0,0,w,h);
       }
       else
       {
           r=k.readInt("Enter radius of Circle: ");
          // s=new Circle(0,0,r);
       }
       while(true)
       {
           //s.draw(p);
           x=k.readDouble("New x?: ");
           y=k.readDouble("New y?: ");
           p.setColor(Color.white);
           //s.draw(p);
           //s.move(x, y);
           p.setColor(Color.blue);
          // s.draw(p);
       }
       
    }
    
}
