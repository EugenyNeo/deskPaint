
package MyVecorDraw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;



public class PDraw extends JPanel implements MouseListener, MouseMotionListener

{
	int x;
	int y;
//	int x2, y2; 
	ArrayList<IShape> pp = new ArrayList<IShape>();
	//Graphics2D gg;
	//BufferedImage bi = new BufferedImage(1010, 620, BufferedImage.SCALE_DEFAULT);

	public PDraw(PCommand cmd)
	{

		setBounds(220,10,1010, 620);
		setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
		//Graphics2D gg = (Graphics2D) bi.getGraphics();
		//gg = (Graphics2D) getGraphics();
		//gg.setColor(Color.white);
		
		//gg.fillRect(220, 10, 1010, 620);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
			PData data = PData.getInstace();
			int x2 = e.getX();
			int y2 = e.getY();	
			//IShape shp; = new PCurve();
			Graphics2D gg = (Graphics2D) getGraphics();
			if(data.getType().equals("Curve"))
			{
				IShape shp = new PCurve();
				if (shp != null)
				{
					shp.init(x, y, x2, y2, data.getColor(), data.getWidth());
					shp.draw(gg);
					x = x2;
					y = y2;
					pp.add(shp);
				}
			}
			repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;//getGraphics();
		for(IShape  shape : pp)
		{
			shape.draw(gg);
		}
	}

	/*private void Draw(int x2, int y2)
	{
		IShape p;
		PData data = PData.getInstace();
		if(data.getType().equals("Line"))
		{
			p = new PLine();
			
		}
		else if(data.getType() == "Rectangle")
		{
			System.out.println("Создаем прямоугольник");
			p = new PRect();
		}
		else if(data.getType().equals("RoundRect"))
		{
			
			p = new PRoundRect();
		}
		else if (data.getType().equals("Ellipse"))
		{
			p = new PEllipse();
		}
		else 
		{
			System.out.println("Кривая");
			p = new PCurve();
		}
		p.init(x, y, x2, y2, data.getColor(), data.getWidth());
		System.out.println("Я уже здесь");
		p.draw( gg);
		pp.add(p);
	}*/

	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		PData data = PData.getInstace();
		IShape shp = null;
		Graphics2D gg = (Graphics2D) getGraphics();
	//	gg.setColor(new Color(data.color));
		gg.setColor(data.getColor());
		gg.setStroke(new BasicStroke(data.getWidth()));
		
		switch(data.getType())
		{
		case "Line" : shp = new PLine(); break;
		case "Rectangle" : shp = new PRect(); break;
		case "RoundRect" : shp = new PRoundRect(); break;
		case "Ellipse" : shp = new PEllipse(); break;
		}
				
		if (shp != null)
		{
			
			int x1 = e.getX();
			int y1 = e.getY();
			shp.init(x, y, x1, y1, data.getColor(), data.getWidth());
			shp.draw(gg);
			pp.add(shp);
			x = x1;
			y = y1;
		/*if(!data.getType().equals("Curve"))
		{
			int x2 = e.getX();
			int y2 = e.getY();
			
			Draw(x2, y2);
			x = x2;
			y = y2;
		}*/
		}
		repaint();

		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {}

}
