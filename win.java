import java.awt.*;
import java.awt.event.*;

class win extends Frame implements WindowListener
{
	win()
	{
		super("Window Fream");
		setSize(700 , 700);
		setVisible(true);
		addWindowListener(this);	
	}
	
	public void windowActivated(WindowEvent e)
	{
		
	}
	public void windowDeactivated(WindowEvent e)
	{
		
	}
	public void windowIconified(WindowEvent e)
	{
		
	}	
	public void windowDeiconified(WindowEvent e)
	{
		
	}
	public void windowOpened(WindowEvent e)
	{
		
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{
		
	}
	public static void main(String arg[])
	{
		win w=new win();
	}
}