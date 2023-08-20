import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		
		this.setTitle("Sen Recep Baltaş mısın?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); //prevent frame from being resized
		this.setSize(420,420); //sets dimension 
		this.setVisible(true); //make frame visible
		
		ImageIcon image = new ImageIcon("palyaço.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.green);
		
	}
}
