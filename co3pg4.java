import java.applet.Applet;
import java.awt.*;
public class co3pg4 extends Applet
{
  public void paint(Graphics g)
{
  g.setColor(Color.green);
  g.fillRect(25,40,100,50);
  g.drawRect(265,40,50,50);  
        
  g.setColor(Color.red);
  g.fillRoundRect(25,125,100,50,15,15);     

  g.drawOval(25,205,100,50);
  g.setColor(Color.yellow);
  g.fillOval(265,205,70,70); 
			
  int xPoints[] = {250,320,170,250};
  int yPoints[] = {100,150,150,100};
			  
  g.setColor(Color.blue);
  g.fillPolygon(xPoints, yPoints, 3);
  
	
}
}

/* <applet code = "co3pg4" height = 500 width =500>  
   </applet> */
