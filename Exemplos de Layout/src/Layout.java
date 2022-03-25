import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Layout extends JFrame {
	public Layout() {
		   JFrame frame = new JFrame();
		   frame.setTitle("Minha janela");
		   frame.setSize(400,400);
		   frame.setLocation(400,400);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setVisible(true);
		   
		   frame.setLayout(new BorderLayout());
		   frame.add(BorderLayout.NORTH, new JButton("North"));
		   frame.add(BorderLayout.CENTER, new JButton("CENTER"));
		   frame.add(BorderLayout.SOUTH, new JButton("SOUTH"));
		   frame.add(BorderLayout.EAST, new JButton("EAST"));
		   frame.add(BorderLayout.WEST, new JButton("WEST"));
		   
		   
}
	   public static void main(String[] args) {
		   new Layout();
	   }
}
