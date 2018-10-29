package MyPack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public interface IPShape 
{
	void init (int x, int y, int x1, int y1, Color clr, int w);
	void draw (Graphics2D gr);
}
