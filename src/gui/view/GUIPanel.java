package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import javax.swing.JButton;
import javax.swing.SpringLayout; //For layout
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.*;


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
	private SpringLayout baseLayout;
	
	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("words can be typed here");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	/**
	 * Helper method for arranging the panel.
	 * Dumping ground for generated code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -49, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 129, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -67, SpringLayout.NORTH, firstButton);
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow, this is the most amazing click event ever! WOW!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
//				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
//				changeRandomColor();
			}
		});

		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				
			}
		});
	}
}
