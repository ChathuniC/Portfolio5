package Portfolio_5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI2 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Click on the Button");
		f.setLayout(new BorderLayout());
		f.add(b,BorderLayout.CENTER);

		
		b.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button......"+ e.getActionCommand());
		}
	});
	
		
		f.pack();
		
		f.setVisible(true);
	}

}
