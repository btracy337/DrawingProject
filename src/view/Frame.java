package view;

import javax.swing.*;
import controller.Controller;

public class Frame extends JFrame
{
	private Controller app;

	public Frame()
	{
		super();
		
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(1000,1000);
		this.setResizable(false);
		this.setTitle("DrawingApplication");
		this.setVisible(true);
	}
}
