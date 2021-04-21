import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Paneeli implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JButton aloita = new JButton("Aloita");
	JButton lopeta = new JButton("Lopeta");
	JButton info = new JButton("INFO");
	JLabel label = new JLabel("Arvauspeli");
	
	

	Paneeli(){
		
		aloita.setBounds(60, 200, 150, 80);
		lopeta.setBounds(300, 200, 150, 80);
		info.setBounds(10, 20, 80, 25);
		label.setBounds(220, 20, 80, 25);
		aloita.addActionListener(this);
		info.addActionListener(this);
		lopeta.addActionListener(this);
		
		frame.add(info);
		frame.add(aloita);
		frame.add(lopeta);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==aloita) {
			frame.dispose();
			Kakkos kakkos = new Kakkos();
		}
		if (e.getSource()==info) {
			frame.dispose();
			Info info = new Info();
		}
		if (e.getSource()==lopeta) {
			System.exit(0);
			
		}
	}
	
	

}
