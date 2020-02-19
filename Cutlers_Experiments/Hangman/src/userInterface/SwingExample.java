package userInterface;
import javax.swing.*;
import javax.swing.JButton;

public class SwingExample {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new MainFrame("Hangman Example Window");
				JButton b = new JButton("Letter");
				b.setBounds(10, 10, 10, 10);
				frame.add(b);
				frame.setSize(500, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
	}
}
