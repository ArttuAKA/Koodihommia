import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Helppo implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Arvauspeli");
	JButton button = new JButton("Etusivulle");
	JButton info = new JButton("INFO");
	JButton helppo = new JButton("Helppo");
	JButton vaikea = new JButton("Vaikea");
	
	JRadioButton A = new JRadioButton("A");
	JRadioButton B = new JRadioButton("B");
	JRadioButton C = new JRadioButton("C");
	
	ButtonGroup group = new ButtonGroup(); 

	Helppo(){
		
		A.setBounds(111, 202, 40, 40);
		B.setBounds(111, 242, 40, 40);
		C.setBounds(111, 282, 40, 40);
		info.setBounds(10, 20, 80, 25);
		button.setBounds(400, 20, 80, 25);
		info.addActionListener(this);
		button.addActionListener(this);
		
		group.add(A);
		group.add(B);
		group.add(C);
		frame.add(info);
		frame.add(button);
		frame.add(A);
		frame.add(B);
		frame.add(C);
		
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
		
	}
}