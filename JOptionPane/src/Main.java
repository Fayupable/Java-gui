import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);
		
		//int answer = JOptionPane.showConfirmDialog(null, "Recep Baltaş mısın?", "Technopat", JOptionPane.YES_NO_CANCEL_OPTION);
		//String name = JOptionPane.showInputDialog("Recep Baltaş mısın?");
		//System.out.println("31" + name);
		
		String[] responses = {"Recep Baltaşsın abimm","Değil misin :(", "31"};
		
		ImageIcon icon = new ImageIcon("Hisoka (1).png");
		
		JOptionPane.showOptionDialog(null,
				"Recep Baltaş",
				"secret message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
		

		
	}

}
