package MyVecorDraw;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PPanel extends JPanel //implements MouseListener, MouseMotionListener

{
	int x, y;
	//BufferedImage bi = new BufferedImage(1245, 660, BufferedImage.TYPE_INT_ARGB);

	ArrayList<IShape> pp = new ArrayList<IShape>();
	public PPanel(PCommand cmd)
	{
		
		//setBounds(10,10,1245,660);
		setBounds(0,50,1400,900);
		setBackground(Color.lightGray);
		
	//	setBounds(220, 10, 1010, 620);
//		setBackground(Color.white);
	//	Graphics2D gg = (Graphics2D) bi.getGraphics();
		//gg.setColor(Color.white);
		
	//	gg.fillRect(220, 10, 1010, 620);

		//PData   data = new PData();
		//PCommand cmd = new PCommand();
		PType  pt   = new PType(cmd);
		PWidth pw   = new PWidth(cmd);
		PColor pc   = new PColor(cmd);
		PDraw  pd   = new PDraw(cmd);
		//PDraw1 pd = new PDraw1(cmd);
		//add(new PToolBar(cmd));


	
	setLayout(null);
	
	pt.setBounds(10, 10, 200, 200);
	//pt.setBounds(10, 190, 200, 380);
	pw.setBounds(10, 220, 200, 200);
	//pw.setBounds(10, 400, 200, 380);
	pc.setBounds(10, 430, 200, 200);
	//pc.setBounds(10, 610, 200,380);
	pd.setBounds(220, 10, 1010, 620);
	//pd.setBounds(220, 190, 1010, 800);
	
	
	
	add(pt);
	add(pw);
	add(pc);
	add(pd);

	
		
		addMouseListener(pd);
		addMouseMotionListener(pd);
	}

	/*@Override
	public void mouseDragged(MouseEvent e)
	{
		
		PLine line = new PLine(x, y, e.getX(), e.getY(), width, clr);
		line.draw((Graphics2D)bi.getGraphics());
//		Graphics2D gg = (Graphics2D) getGraphics();
//		gg.setColor(Color.black);
//		gg.setStroke(new BasicStroke(1));
//		gg.drawLine(x, y, x2, y2);
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
	public void paint(Graphics arg0)
	{
		super.paint(arg0);
		Graphics2D gg = (Graphics2D) arg0;
		gg.drawImage(bi,0,0,null);
	}
	
	
	@Override
	public void mouseMoved(MouseEvent arg0)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		x = arg0.getX();
		y = arg0.getY();
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub		
	}*/

}
