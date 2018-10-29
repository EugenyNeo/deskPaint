package MyVecorDraw;

import java.awt.Color;

import javax.swing.JFrame;

public class PFrame extends JFrame
{
	PFrame()
	{
		setLayout(null);
		//setBounds(100,100,800,600);
		//setBounds(10, 10, 1280, 720);
		setBounds(10, 10, 1400, 900);
		setTitle("Painter Vector");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PData data = PData.getInstace();
		PCommand cmd = new PCommand();
		
		//PMenuBar pm = new PMenuBar(cmd);
		add(new PToolBar(cmd));
		add(new PPanel(cmd));
		setJMenuBar(new PMenuBar(cmd));
		add(new PToolBar(cmd));
		setVisible(true);
		
	}

}
