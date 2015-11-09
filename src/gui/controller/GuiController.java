package gui.controller;

import gui.view.GUIFrame;

/**
 * GuiController for the Simple GUI Application
 * @author Alejandro Magallanes
 * @version 0.1 Nov 9, 2015
 */

public class GuiController
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GuiController and initializes the GUIFrame.
	 */
	public GuiController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		 
	}
	
}
