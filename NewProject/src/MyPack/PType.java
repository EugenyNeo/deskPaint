package MyPack;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PType extends JPanel 
{
	
	public  PType(PCommand cmd) 
	{
		
		
		setLayout(null);
		setBackground(Color.red);
		
		JButton btnCur = new JButton("Кривая");
		JButton btnRec = new JButton("Прямоугольник");
		JButton btnCle = new JButton("Круглый прямоугольник");
		JButton btnEli = new JButton("Элипс");
		JButton btnLin = new JButton("Прямая");
				
		btnCur.setBounds( 10, 20, 180, 20 );
		btnCur.setActionCommand("curve");
		btnCur.addActionListener(cmd.aType);

		btnRec.setBounds( 10, 55, 180, 20 );
		btnRec.setActionCommand("rectangle");
		btnRec.addActionListener(cmd.aType);

		btnCle.setBounds( 10, 90, 180, 20 );
		btnCle.setActionCommand("roundRect");
		btnCle.addActionListener(cmd.aType);
		
		btnEli.setBounds( 10, 125, 180, 20 );
		btnEli.setActionCommand("ellipse");
		btnEli.addActionListener(cmd.aType);

		btnLin.setBounds( 10, 160, 180, 20 );
		btnLin.setActionCommand("line");
		btnLin.addActionListener(cmd.aType);

		add(btnCur);
		add(btnRec);
		add(btnCle);
		add(btnEli);
		add(btnLin);
	
	}
}

