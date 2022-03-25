import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exemplo extends JFrame{
	public Exemplo() {
		   JFrame frame = new JFrame();
		   frame.setTitle("Minha janela");
		   frame.setSize(400,400);
		   frame.setLocation(400,400);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setVisible(true);
		   frame.setLayout(new FlowLayout());
		   frame.add(new JButton("Campo 1"));
		   frame.add(new JButton("Campo 2"));
		   frame.add(new JButton("Campo 3"));
		   frame.add(new JButton("Campo 4"));
}
public static void main(String[] args) {
	 new Exemplo(); 
}
}