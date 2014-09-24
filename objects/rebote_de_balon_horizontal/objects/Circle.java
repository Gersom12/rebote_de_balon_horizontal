package rebote_de_balon_horizontal.objects;

import java.awt.Color;
import java.awt.Graphics;


public class Circle {
	
	public int posicionX, posicionY;
	public float velocidadX;
	public int tama�o;
	public float Pared;

	public Circle()
	{
		
	}
	
	public void Update()
	{
		AplicarPared();
		DetectarPared();
		ActualizarPosicion();
	}
	
	public void ActualizarPosicion()
	{
		posicionX = (int)velocidadX;

	}
	
	public void DetectarPared()
	{
		if(posicionX+tama�o > 600)
			System.out.println("Detecte Pared");
	}
	
	public void AplicarPared()
	{
		velocidadX += Pared;
	
			}
	
	
 	public void Draw (Graphics g){		 
 		
 		 g.setColor(Color.YELLOW);
		 g.fillOval(posicionX,posicionY,tama�o,tama�o);
 	}
}
	