import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Info implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Pelin ohjeet:");
	JButton button = new JButton("EXIT");
	
	Info(){
		
		button.setBounds(340, 20, 80, 45);
		button.addActionListener(this);
		label.setBounds(220, 110, 80, 25);
		frame.add(label);
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			frame.dispose();
			Paneeli paneeli = new Paneeli();
		}
		
	}

}