package ck;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ck.ConnectDBck;

public class SignUp extends JFrame {
	
	JFrame f= new JFrame("Sign Up");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lbusername = new JLabel("Username");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("Password");
	JTextField tfpassword = new JTextField(15);
	JButton btforget = new JButton("Forgotten Password");
	JButton btsignup = new JButton("Sign Up");
	//
	
	//
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
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
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck connect = new ConnectDBck();
				//int record = connect.executeDB("Insert into AccManeger(Username,Password) values('"+tfusername.getText()+"','"+tfpassword.getText()+"')");
				new choose();
				f.dispose();
			}
		});
		btforget.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			new	forgot_pass();
			f.dispose();
				
			}
		});
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}
	
	}
	

///
class Inforcustomer extends JFrame {
	JFrame f2 = new JFrame("Information Customers");
	JLabel lbcmnd = new JLabel("CMND");
	JTextField tfcmnd = new JTextField(10);
	JLabel lbfullname = new JLabel("Full Name");
	JTextField tffullname = new JTextField(10);
	JLabel lbaddress = new JLabel("Home Town");
	String[] address = {"An Giang", "Bà rịa – Vũng tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu","Bắc Ninh", "	Bến Tre", "	Bình Định"
, "	Bình Dương", "	Bình Phước", "	Bình Thuận", "	Cà Mau", "	Cần Thơ", "	Cao Bằng ", "	Đà Nẵng", "Đắk Lắk"
, "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội \r\n", "Hà Tĩnh\r\n", "Hải Dương\r\n"
, "Hải Phòng\r\n", "Hậu Giang\r\n", "Hòa Bình\r\n", "Hưng Yên\r\n", "Khánh Hòa\r\n", "Kiên Giang\r\n", "Kon Tum\r\n"
, "Lai Châu\r\n", "Lâm Đồng\r\n", "Lạng Sơn\r\n", "Lào Cai\r\n", "Long An\r\n", "Nam Định\r\n", "Nghệ An\r\n"
, "Ninh Bình\r\n", "Ninh Thuận\r\n", "Phú Thọ\r\n", "Phú Yên\r\n", "Quảng Bình\r\n", "Quảng Nam\r\n", "Quảng Ngãi\r\n"
, "Quảng Ninh\r\n", "Quảng Trị\r\n", "Sóc Trăng\r\n", "Sơn La\r\n", "Tây Ninh\r\n", "Thái Bình\r\n", "Thái Nguyên\r\n"
, "Thanh Hóa\r\n", "Thừa Thiên Huế\r\n", "Tiền Giang\r\n", "Thành phố Hồ Chí Minh\r\n", "Trà Vinh\r\n", "Tuyên Quang\r\n"
, "Vĩnh Long\r\n", "Vĩnh Phúc\r\n", "Yên Bái"};
	JComboBox jcbaddress = new JComboBox(address);
	JLabel lbtimerent = new JLabel("Time rental");
	JTextField tftimerent = new JTextField(10);
	JLabel lbtimestart = new JLabel("Time start");
	JDateChooser cltimestart = new JDateChooser();
	JLabel lbbirthday = new JLabel ("Birthday");
	JDateChooser clbirthday = new JDateChooser();
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	JLabel bl2a = new JLabel();
	JLabel bl2b = new JLabel();
	JLabel lbinfor = new JLabel("Information of Tenant");
	public Inforcustomer() {
		f2.setLocation(300,20);
		f2.setLayout(new GridLayout(7,3));
		Container cont2 =  f2.getContentPane();
		cont2.add(bl2a);
		cont2.add(lbinfor);
		cont2.add(bl2b);
		cont2.add(lbcmnd);
		cont2.add(tfcmnd);
		cont2.add(btadd);
		cont2.add(lbfullname);
		cont2.add(tffullname);
		cont2.add(btdelete);
		cont2.add(lbaddress);
		cont2.add(jcbaddress);
		cont2.add(btnew);
		cont2.add(lbbirthday);
		cont2.add(clbirthday);
		cont2.add(btupdate);
		cont2.add(lbtimestart);
		cont2.add(cltimestart);
		cont2.add(btfind);
		cont2.add(lbtimerent);
		cont2.add(tftimerent);
		cont2.add(btSee);
		
		f2.pack();
		f2.setSize(700,300);
		f2.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Inforcustomer();
				f2.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// thêm vào cơ sở dữ liệu
				f2.dispose();
			}
		});
		
		
	}
}
class inforlandlords extends JFrame{
	JFrame f4 = new JFrame("Information Landlords");
	JLabel lbCMll = new JLabel("CMND");
	JTextField tfCMll = new JTextField(10);
	JLabel lbnamell = new JLabel("Full Name");
	JTextField tfnamell = new JTextField(10);
	JLabel lbaddressll = new JLabel("Address");
	JTextField tfaddressll = new JTextField(10);
	JLabel lbbirthdayll = new JLabel ("Birthday");
	JDateChooser dcbirthdayll = new JDateChooser();
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	public inforlandlords() {
		f4.setLocation(400,00);
		f4.setLayout(new GridLayout(7,2));
		Container cont4 = f4.getContentPane();
		cont4.add(lbCMll);
		cont4.add(tfCMll);
		cont4.add(lbnamell);
		cont4.add(tfnamell);
		cont4.add(lbaddressll);
		cont4.add(tfaddressll);
		cont4.add(lbbirthdayll);
		cont4.add(dcbirthdayll);
		cont4.add(btadd);
		cont4.add(btdelete);
		cont4.add(btnew);
		cont4.add(btupdate);
		cont4.add(btfind);
		cont4.add(btSee);
		f4.pack();
		f4.setSize(700,300);
		f4.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforlandlords();
				f4.dispose();
			}
		});
	}
}
class inforhouse extends JFrame{
	JFrame f5 = new JFrame("Information House");
	JLabel lbID = new JLabel("ID House");
	JTextField tfID = new JTextField(10);
	JLabel lbaddressh = new JLabel("Address House");
	JTextField tfaddressh = new JTextField(10);
	JLabel lbarea = new JLabel("House Area");
	JTextField tfarea = new JTextField(10);
	JLabel lbdeposits = new JLabel("Deposits");
	JTextField tfdeposits = new JTextField(10);
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	public inforhouse() {
		f5.setLocation(400,100);
		f5.setLayout(new GridLayout(7,2));
		Container cont5 = f5.getContentPane();
		cont5.add(lbID);
		cont5.add(tfID);
		cont5.add(lbaddressh);
		cont5.add(tfaddressh);
		cont5.add(lbarea);
		cont5.add(tfarea);
		cont5.add(lbdeposits);
		cont5.add(tfdeposits);
		cont5.add(btadd);
		cont5.add(btdelete);
		cont5.add(btnew);
		cont5.add(btupdate);
		cont5.add(btfind);
		cont5.add(btSee);
		f5.pack();
		f5.setSize(700,300);
		f5.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforhouse();
				f5.dispose();
			}
		});
	}
}
class choose extends JFrame{
	JFrame f3 = new JFrame("Choose");
	JLabel lbchoose = new JLabel("Choose Object");
	JButton btcustomer = new JButton("Choose Customers");
	JButton btlandlords = new JButton("Choose Landlords");
	JButton bthouse = new JButton("Choose House");
	public choose() {
		f3.setLocation(300,20);
		f3.setLayout(new GridLayout(4,1));
		Container cont3 =  f3.getContentPane();
		cont3.add(lbchoose);
		cont3.add(btcustomer);
		cont3.add(btlandlords);
		cont3.add(bthouse);
		f3.pack();
		f3.setSize(300,300);
		f3.setVisible(true);
		btcustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Inforcustomer();
				f3.dispose();
			}
		});
		btlandlords.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforlandlords();
				f3.dispose();
			}
		});
		bthouse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforhouse();
				f3.dispose();
			}
		});
	}
	
}


/*
 * Khách hàng thuê nhà : CMND, Họ tên, quê quán, số tháng thuê, ngày tháng năm sinh,thời gian bắt đầu thuê(xong)
 * Chủ nhà cho thuê : CMND, Họ tên, Địa chỉ, ngày tháng năm sinh
 * Nhà cho thuê: ID nhà, địa chỉ nhà, diện tích, số tiền đặt cọc
 * 
 * 
 */
