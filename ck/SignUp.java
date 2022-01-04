package ck;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;


public class SignUp {
	JFrame f= new JFrame("Sign Up");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lbusername = new JLabel("Username");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("Password");
	JTextField tfpassword = new JTextField(15);
	JButton btforget = new JButton("Forgotten Password");
	JButton btsignup = new JButton("Sign Up");
	public SignUp() {
		f.setLocation(200,500);
		f.setLayout(new GridLayout(4,2));
		Container cont =  f.getContentPane();
		cont.add(lbsignup);
		cont.add(lb);
		cont.add(lbusername);
		cont.add(tfusername);
		cont.add(lbpassword);
		cont.add(tfpassword);
		cont.add(btforget);
		cont.add(btsignup);
		f.pack();
		f.setSize(500,200);
		f.setVisible(true);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}

}
