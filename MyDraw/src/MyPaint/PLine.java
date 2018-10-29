package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PLine 
{
	int x,y,x2,y2;
	int width;
	Color clr;
	
	public PLine ( int x, int y, int x2, int y2, int width, Color clr )
	{
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.clr = clr;
		this.width = width;
	}
	public void draw ( Graphics2D gg)
	{
		gg.setColor(clr);
		gg.setStroke(new BasicStroke(width));
		gg.drawLine(x, y, x2, y2);
	}

}
