package rebote_de_balon_horizontal;

import rebote_de_balon_horizontal.objects.WallJump;
import rebote_de_balon_horizontal.objects.Circle;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;
	Circle circle = new Circle();
	WallJump walljump= new WallJump();
	
	public Canvas()
	{
		
	}

 	public void paint(Graphics g) {
  		update(g);	
  		g.setColor(Color.black);
		 g.fillRect(0,0, getSize().width, getSize().height);	
		 circle.Draw(g);
		 walljump.Draw(g);
		 repaint();
 	}
	
 	public void update (Graphics g){	
		 circle.Update();
		 walljump.Update();
	 }

}