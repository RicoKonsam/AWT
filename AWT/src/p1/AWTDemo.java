package p1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AWTDemo extends JFrame
{
	public AWTDemo()
	{
		setTitle("My Frame");
		setLayout(new FlowLayout()); // showing multiple label
		setVisible(true);
		setSize(400,400);
		
		JLabel l1= new JLabel("hello world");
	//	JLabel l2= new JLabel("welcome");
	//	JLabel l3= new JLabel("hey");
		
		add(l1);
	//	add(l2);
	//	add(l3); 
		
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		
		add(t1);
		add(t2);
		
		JButton b = new JButton("Submit");
				
		add(b);
			
		ImageIcon icon = new ImageIcon("image/image.jpg");
		setIconImage(icon.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate the application when closed
		
	}

}
