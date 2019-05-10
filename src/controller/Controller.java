package controller;

import javax.swing.JOptionPane;

public class Controller
{
public void start()
{
	
}
public void handleErrors(Exception error)
{
	JOptionPane.showMessageDialog(null, error.getMessage());
}
}
