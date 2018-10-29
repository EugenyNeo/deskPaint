package MyPack;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PRectangle implements IPShape
{
	int x, y, x1, y1;
	int width;
	int clr;
	String type = "rectangle";
	@Override
	public void init(int x, int y, int x1, int y1, Color clr, int w) 
	{
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this. y1 = y1;
		this.width = w;
		this.clr = clr.getRGB();
		
	}

	@Override
	public void draw(Graphics2D gr)
	{
		gr.setColor(new Color(clr));
		gr.setStroke(new BasicStroke(width));
		if (_)
		gr.drawRect(x, y, x1, y1);
		
	}

}
