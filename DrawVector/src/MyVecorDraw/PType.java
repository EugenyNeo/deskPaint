package MyVecorDraw;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PType extends JPanel 
{
	//PData data= null;
	public  PType(PCommand cmd) 
	{
		
				
		setLayout(null);
		setBackground(Color.red);
		
		JButton btnCur = new JButton("Кривая");
		JButton btnRec = new JButton("Прямоугольник");
		JButton btnRdRect = new JButton("Круглый прямоугольник");
		JButton btnEli = new JButton("Элипс");
		JButton btnLin = new JButton("Прямая");
		
		//PCommand cmd = new PCommand();
		
		btnCur.setBounds( 10, 20, 180, 20 );
		//btnCur.setBounds( 10, 200, 180, 200 );
		btnCur.setActionCommand("curve");
		btnCur.addActionListener(cmd.aType);

		btnRec.setBounds( 10, 55, 180, 20 );
		//btnRec.setBounds( 10, 235, 180, 200 );
		btnRec.setActionCommand("rectangle");
		btnRec.addActionListener(cmd.aType);

		btnRdRect.setBounds( 10, 90, 180, 20 );
		//btnRdRect.setBounds( 10, 270, 180, 200 );
		btnRdRect.setActionCommand("roundRect");
		btnRdRect.addActionListener(cmd.aType);
		
		btnEli.setBounds( 10, 125, 180, 20 );
		//btnEli.setBounds( 10, 305, 180, 200 );
		btnEli.setActionCommand("ellipse");
		btnEli.addActionListener(cmd.aType);

		btnLin.setBounds( 10, 160, 180, 20 );
		//btnLin.setBounds( 10, 340, 180, 200 );
		btnLin.setActionCommand("line");
		btnLin.addActionListener(cmd.aType);

		add(btnCur);
		add(btnRec);
		add(btnRdRect);
		add(btnEli);
		add(btnLin);
		
		
	/*	btnCur.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				PData.type = "Curve";
			}                                                        
		}); 
		btnRec.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				PData.type = "Rectangle";
			}                                                        
		}); 
		btnEli.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				PData.type = "Ellipse";
			}                                                        
		}); 
		btnRdRect.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				PData.type = "RoundRect";
			}                                                        
		}); 
		btnLin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)               
			{                                                        
				PData.type = "Line";
			}                                                        
		}); */
		
	}
}

