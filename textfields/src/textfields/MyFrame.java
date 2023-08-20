package textfields;

import java.awt.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JTextField textfield;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(250,400));
		textfield.setFont(new Font("Consolas", Font.PLAIN,35));
		textfield.setForeground(new Color(0x00FF00));
		textfield.setBackground(Color.black);
		textfield.setCaretColor(Color.white);
		textfield.setText("User name");
		
		
		this.add(button);
		this.add(textfield);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== button) {
			System.out.println("Naber " + textfield.getText());
			button.setEnabled(false);
			textfield.setEditable(false);

		}
	}

}
