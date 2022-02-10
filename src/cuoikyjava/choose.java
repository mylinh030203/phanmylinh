package cuoikyjava;

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


public class choose extends JFrame{
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
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new choose();
	}

}
class Inforcustomer extends JFrame {
	JFrame f2 = new JFrame("Information Customers");
	JLabel lbcmnd = new JLabel("CMND Customer");
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
	JLabel lbtimerent = new JLabel("Time Rental");
	JTextField tftimerent = new JTextField(10);
	JLabel lbtimestart = new JLabel("Time Start");
	JDateChooser cltimestart = new JDateChooser();
	JLabel lbbirthday = new JLabel ("Birthday");
	JDateChooser clbirthday = new JDateChooser();
	JLabel lbsdt = new JLabel("Phone Number");
	JTextField tfsdt = new JTextField(15);
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	JButton btcancel = new JButton ("Cancel");
	JButton btback = new JButton("Back");
	JLabel bl2a = new JLabel();
	JLabel bl2b = new JLabel();
	JLabel bl2c = new JLabel();
	JLabel lbinfor = new JLabel("Information of Tenant");
	JLabel lbemail = new JLabel("Email");
	JTextField tfemail = new JTextField(15);
	JLabel lbIDH = new JLabel("ID House");
	JTextField tfIDH = new JTextField(15);
	JLabel lbcmndland = new JLabel("CMND Landlord");
	JTextField tfcmndland = new JTextField(15); 
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public Inforcustomer() {
		f2.setLocation(300,20);
		f2.setLayout(new GridLayout(11,3));
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
		cont2.add(lbsdt);
		cont2.add(tfsdt);
		cont2.add(btcancel);
		cont2.add(lbemail);
		cont2.add(tfemail);
		cont2.add(btback);
		cont2.add(lbIDH);
		cont2.add(tfIDH);
		cont2.add(bl2c);
		cont2.add(lbcmndland);
		cont2.add(tfcmndland);
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
		
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// chỉnh sủa csdl
				f2.dispose();
			}
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// xóa csdl
				f2.dispose();
			}
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// tìm kiếm
				f2.dispose();
			}
		});
		btSee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// xem thông tin
				f2.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// thêm vào cơ sở dữ liệu
				f2.dispose();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose();
				f2.dispose();
			}
		});
	}
}
/////////////////////////////////////////////////////////////////
class inforlandlords extends JFrame{
	JFrame f4 = new JFrame("Information Landlords");
	JLabel lb =new JLabel();
	JLabel lbCMll = new JLabel("CMND Landlord");
	JTextField tfCMll = new JTextField(10);
	JLabel lbnamell = new JLabel("Full Name");
	JTextField tfnamell = new JTextField(10);
	JLabel lbaddressll = new JLabel("Address");
	JTextField tfaddressll = new JTextField(10);
	JLabel lbbirthdayll = new JLabel ("Birthday");
	JDateChooser dcbirthdayll = new JDateChooser();
	JLabel lbsdt = new JLabel("Phone Number");
	JTextField tfsdt = new JTextField(15);
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	JButton btcancel = new JButton ("Cancel");
	JLabel lbemailland = new JLabel("Email");	
	JTextField tfemailland = new JTextField(15);
	JButton btback = new JButton("Back");
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public inforlandlords() {
		f4.setLocation(400,100);
		f4.setLayout(new GridLayout(7,3));
		Container cont4 = f4.getContentPane();
		cont4.add(lbCMll);
		cont4.add(tfCMll);
		cont4.add(btadd);
		cont4.add(lbnamell);
		cont4.add(tfnamell);
		cont4.add(btdelete);
		cont4.add(lbaddressll);
		cont4.add(tfaddressll);
		cont4.add(btnew);
		cont4.add(lbbirthdayll);
		cont4.add(dcbirthdayll);
		cont4.add(btupdate);
		cont4.add(lbsdt);
		cont4.add(tfsdt);
		cont4.add(btfind);
		cont4.add(lbemailland);
		cont4.add(tfemailland);
		cont4.add(btSee);
		cont4.add(lb);
		cont4.add(btcancel);
		cont4.add(btback);
		f4.pack();
		f4.setSize(700,300);
		f4.setVisible(true);
		PreparedStatement ps;
		Connection conn;
		ResultSet rs;
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforlandlords();
				f4.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm vào csdl
				f4.dispose();
			}
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm vào csdl
				f4.dispose();
			}
		});
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//chỉnh sủa csdl
				f4.dispose();
			}
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//tìm kiếm
				f4.dispose();
			}
		});
		btSee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//xem dữ liệu
				f4.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//xem dữ liệu
				f4.dispose();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose();
				f4.dispose();
			}
		});
	}
}
////////////////////////////////////////////////////
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
	JButton btcancel = new JButton ("Cancel");
	JLabel lbcmnd = new JLabel("CMND");
	JTextField tfcmnd = new JTextField(15);
	JButton btback = new JButton("Back");
	JLabel lbcmndland = new JLabel("CMND Landlord");
	JTextField tfcmndland = new JTextField(15); 
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public inforhouse() {
		f5.setLocation(400,100);
		f5.setLayout(new GridLayout(10,2));
		Container cont5 = f5.getContentPane();
		cont5.add(lbID);
		cont5.add(tfID);
		cont5.add(lbaddressh);
		cont5.add(tfaddressh);
		cont5.add(lbarea);
		cont5.add(tfarea);
		cont5.add(lbdeposits);
		cont5.add(tfdeposits);
		cont5.add(lbcmnd);
		cont5.add(tfcmnd);
		cont5.add(lbcmndland);
		cont5.add(tfcmndland);
		cont5.add(btadd);
		cont5.add(btdelete);
		cont5.add(btnew);
		cont5.add(btupdate);
		cont5.add(btfind);
		cont5.add(btSee);
		cont5.add(btcancel);
		cont5.add(btback);
		f5.pack();
		f5.setSize(700,300);
		f5.setVisible(true);
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforhouse();
				f5.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm dữ liệu
				f5.dispose();
			}
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//xóa dữ liệu
				f5.dispose();
			}
		});
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//chỉnh sửa dữ liệu
				f5.dispose();
			}
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//tìm kiếm dữ liệu
				f5.dispose();
			}
		});
		btSee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//xem dữ liệu
				f5.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm dữ liệu
				f5.dispose();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose();
				f5.dispose();
			}
		});
	}
}

/*	cont2.add(lbcmnd);
cont2.add(tfcmnd);
cont2.add(btadd);*/
/*	cont2.add(lbfullname);
cont2.add(tffullname);
cont2.add(btdelete);*/
/*	cont2.add(lbaddress);
cont2.add(jcbaddress);
cont2.add(btnew);*/
/*	cont2.add(lbbirthday);
cont2.add(clbirthday);
cont2.add(btupdate);*/
/*	cont2.add(lbtimestart);
cont2.add(cltimestart);
cont2.add(btfind);*/
/*	cont2.add(lbtimerent);
cont2.add(tftimerent);
cont2.add(btSee);*/
/*	cont2.add(lbsdt);
cont2.add(tfsdt);
cont2.add(btcancel);*/
/*	cont2.add(lbemail);
cont2.add(tfemail);
cont2.add(btback);*/
/*	cont2.add(lbIDH);
cont2.add(tfIDH);
cont2.add(bl2c);
cont2.add(lbcmndland);
cont2.add(tfcmndland);*/

