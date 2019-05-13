package controller;

import javax.swing.JOptionPane;
import view.Frame;
public class Controller
{
public void start()
{
	Frame frame = new Frame(this);
}
public void handleErrors(Exception error)
{
	JOptionPane.showMessageDialog(null, error.getMessage());
}
}
