package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.2 Nov 9, 2015 updated the setupFrame to load the contentPane with a GUIPanel.
 */
public class GUIFrame extends JFrame
{
	private GuiController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //Must be first line of setupFrame! Installs he panel in the frame.
		this.setSize(400,400);           //Find a good size for the app.
		this.setTitle("Simple App");
		this.setResizable(false);        //Advisable not required.
		this.setVisible(true);           //Must be last line of setupFrame!
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}
	
}
