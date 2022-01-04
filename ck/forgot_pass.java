package ck;
import javax.swing.*;
import java.awt.*;
public class forgot_pass extends JFrame {
	JFrame f = new JFrame("Forgotten Password");
	JLabel lbforgotpass = new JLabel("Forgotten Password");
	JLabel lb1 = new JLabel();
	JLabel lbfind = new JLabel("Find your acount");
	JTextField tffind = new JTextField(10);
	JButton btcancel = new JButton("Cancel");
	JButton btsearch = new JButton("Search");
	public forgot_pass() {
		f.setLocation(250,250);
		f.setLayout(new GridLayout(3,2));
		Container con = f.getContentPane();
		con.add(lbforgotpass);
		con.add(lb1);
		con.add(lbfind);
		con.add(tffind);
		con.add(btcancel);
		con.add(btsearch);
		f.pack();
		f.setSize(500,200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new forgot_pass();
	}

}
