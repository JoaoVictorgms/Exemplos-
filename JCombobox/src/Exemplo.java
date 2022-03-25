import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

;

public class Exemplo extends JFrame {
		   public Exemplo() {
			   setTitle("Minha janela");
			   setSize(400,400);
			   setLocation(400,400);
			   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   JMenuBar menu =  new JMenuBar();
               JComboBox c = new JComboBox();

			   c.addItem("Nota 1");
			   c.addItem("Nota 2");
			   c.addItem("Nota 3");
			   menu.add(c);
			   
			   setVisible(true);
			   setJMenuBar(menu);
			  
			   JRadioButton r = new JRadioButton();
			   r.setText("Acessar");
			   menu.add(r);
			   
			  JCheckBox a = new JCheckBox();
			  a.setText("Aprovado");
			  menu.add(a);
			  
			  JPanel p = new JPanel();
			  p.add(new JLabel("Digite seu nome:"));
			  p.add(new JTextField(10));
			  menu.add(p);
			  
			   
			   
}
		   public static void main(String[] args) {
			   new Exemplo();
		   }	  
	}
	
