import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Kakkos implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Arvauspeli");
	JButton button = new JButton("Etusivulle");
	JButton info = new JButton("INFO");
	JButton helppo = new JButton("Helppo");
	JButton vaikea = new JButton("Vaikea");
	
	
	
	Kakkos(){
		
		
		helppo.setBounds(170, 150, 150, 80);
		vaikea.setBounds(170, 250, 150, 80);
		info.setBounds(10, 20, 80, 25);
		button.setBounds(400, 20, 80, 25);
		info.addActionListener(this);
		button.addActionListener(this);
		helppo.addActionListener(this);
		
		label.setBounds(220, 20, 80, 25);
		frame.add(label);
		frame.add(info);
		frame.add(button);
		frame.add(helppo);
		frame.add(vaikea);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==info) {
			frame.dispose();
			Info info = new Info();
		}
		if (e.getSource()==button) {
			frame.dispose();
			Paneeli paneeli = new Paneeli();
		}
		if (e.getSource()==helppo) {
			frame.dispose();
			Helppo helppo = new Helppo();
		}
	}

}
