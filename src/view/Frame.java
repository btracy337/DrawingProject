package view;

import javax.swing.*;
import controller.Controller;

public class Frame extends JFrame
{
	private Controller app;
	private DrawingAppPanel panelApp;

	public Frame(Controller app)
	{
		super();
		this.app = app;
		this.panelApp = new DrawingAppPanel(app);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(panelApp);
		this.setSize(1000,1000);
		this.setResizable(false);
		this.setTitle("DrawingApplication");
		this.setVisible(true);
	}
}
