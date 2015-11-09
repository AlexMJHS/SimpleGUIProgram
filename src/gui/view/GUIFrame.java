package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Nov 9, 2015
 */
public class GUIFrame extends JFrame
{
	private GuiController baseController;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}
	
}
