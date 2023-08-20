import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Guı {
	
	public static void main(String[] args) {
		
		/*JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Sen Recep Baltaş mısın?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420,420); //sets dimension 
		frame.setVisible(true); //make frame visible
		
		ImageIcon image = new ImageIcon("palyaço.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.green);
		
		*/
		/*ImageIcon image = new ImageIcon("palyaço.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		
		
		JLabel label = new JLabel();
		label.setText("Sen Recep Baltaş mısın?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text left,center,right of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text top center,Bottom of imageicon
		label.setForeground(new Color(0x00FF00)); //sent font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20));// set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set bacground color
		label.setOpaque(true); 
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal " " " " "
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimension
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		*/
		
		ImageIcon icon = new ImageIcon("indir (1).png");
		
		
		
		JLabel label = new JLabel();
		label.setText("Herkese merhaba arkadaşlar. Ben Recep Baltaş");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 75, 75);
		
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);

		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);

		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
		
		
		
		
		
	}

}
