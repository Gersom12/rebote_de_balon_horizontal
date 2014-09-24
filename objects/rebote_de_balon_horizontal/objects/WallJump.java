package rebote_de_balon_horizontal.objects;

import java.awt.Color;
import java.awt.Graphics;


public class WallJump extends Circle{
	
	Color color;
	public WallJump(){
		
		tamaño = 100;
		Pared = 0.75f;
		color = Color.YELLOW;
	}

	@Override
	public void DetectarPared()
	{
			
		
		if(posicionX+tamaño> 800)
			{
			
					Rebotar();
			        CambiarColor();
					
			}
		
			
	}
	
	public void Rebotar(){
		velocidadX = 5f;
	}
	
	public void CambiarColor()
	{
		color = Color.blue;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(posicionX,posicionY,tamaño,tamaño);
	}

}
