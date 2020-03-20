import java.awt.Graphics;

public class Square extends Shape {
	public Square (int x, int y, int w, int h)
	{
		super (x, y, w, h); //Subclass constructor needs to call the super class constructor and pass value to super class to make it initialized
	}
	
	//Implement abstract method
	public void draw (Graphics g)
	{
		g.drawRect(getX() - getWidth() /2 , getY() - getHeight() /2, getWidth(), getHeight()); 
	}
}
