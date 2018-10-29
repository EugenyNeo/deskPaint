package MyPack;
import java.awt.Color;



public class PData 
{
	private static String type = "Line";
	private static int color = Color.black.getRGB();
	private  static int width = 1;
	
	private static PData instance = null;
	private PData()
	{
	
	}
	public static PData getInstace()
	{
		if (instance == null)
			instance = new PData();
		
		return instance;
	}
	
	/*public static PData getInstace() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public String getType()
	{
		return type;
	}
	
	public Color getColor()
	{
		return new Color(color);
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setType(String type)
	{
		 this.type = type;
	}
	public void setColor(Color clr)
	{
		this.color = clr.getRGB();
	}
	public void setWidth(int width)
	{
		this.width = width;
	}

}
