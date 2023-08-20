import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JCheckBox checkBox;
	ImageIcon icon;
	ImageIcon icon2;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		icon = new ImageIcon("Hisoka (1).png");
		icon2 = new ImageIcon("chorollo (1).png");

		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);

		checkBox = new JCheckBox();
		checkBox.setText("I'm not in danger, Skyler! ");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(icon);
		checkBox.setSelectedIcon(icon2);

		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected());

		}

	}

}
