package MyVecorDraw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PRect implements IShape
{
	int x, y, x1, y1;
	int width;
	int clr;
	String type = "Rectangle";
	
	@Override
	public void init(int x, int y, int x1, int y1, Color clr, int w) 
	{
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this. y1 = y1;
		this.width = w;
		//this.clr = clr.getRGB();
		this.clr = clr.getRGB();
	}

	@Override
	public void draw ( Graphics2D gg)
	{
		gg.setColor(new Color((clr >> 16) & 0xff, (clr >> 8) & 0xff, clr  & 0xff));
		//gg.setColor(clr);
		gg.setStroke(new BasicStroke(width));
		if ((x1 < x && y > y1 ) || (x < x1 && y > y1))
		{
			int xd = x;
			x = x1;
			x1 = xd;
			
			xd = y ;
			y = y1;
			y1 = xd;
		}
		//else
		if (x1 < x && y < y1) 
				{
					int yd = y;
					y = y1;
					y1 = yd;

				}
				
		gg.drawRect(x, y,   x1 - x , y1 - y );
		
	}

}
