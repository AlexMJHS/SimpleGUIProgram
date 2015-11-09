package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Nov 9, 2015
 */

public class GUIPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
