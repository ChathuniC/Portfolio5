package Portfolio_5;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Click on the Button");
		f.setLayout(new BorderLayout());
		f.add(b,BorderLayout.CENTER);
		b.addActionListener(
				event -> System.out.println("Button...." + event.getActionCommand()));
		
		f.pack();
		
		f.setVisible(true);
	}

}
