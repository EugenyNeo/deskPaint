package MyPaint;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PCommand 
{
	PData data = null;
	public PCommand (PData data)
		{
		this.data = data;
		}
	ActionWidth aWidth = new ActionWidth();
	ActionColor aColor = new ActionColor();
	ActionType aType = new ActionType();
	class ActionColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
					switch(str)
				{
					case "btnRed": data.color = Color.red; break;
					case "btnGreen": data.color = Color.green;break;
					case "btnYellow": data.color = Color.yellow;break;
					default: data.color = Color.black;
				}
			
		}
	}
	 class ActionWidth implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();
						switch(str)
					{
						case "Lines5": data.width = 5; break;
						case "Lines10": data.width = 10;break;
						case "Lines15": data.width = 15;break;
						default: data.width = 1;
					}
				
			}
		}
	 class ActionType implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String str = e.getActionCommand();
						switch(str)
					{
						case "btnCur": data.type = "Curve"; break;
						case "btnRec": data.type = "Rectangle";break;
						case "btnCle": data.type = "Circle";break;
						case "btnEli": data.type = "Ellipse"; break;
						case "btnLin": data.type = "Line"; break;
						default: data.type = "Curve";
					}
				
			}
		}
}
