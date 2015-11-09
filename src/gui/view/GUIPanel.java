package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;


/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Nov 9, 2015
 */

public class GUIPanel extends JPanel
{
	private GuiController baseController;
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
	}
}
