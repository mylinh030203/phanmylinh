package ck;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ck.ConnectDBck;




public class SignUp extends JFrame {
	
	JFrame f= new JFrame("Login");
	JLabel lbsignup = new JLabel("Login");
	JLabel lb = new JLabel();
	JLabel lb1 = new JLabel();
	JLabel lbusername = new JLabel("Username");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("Password");
	JPasswordField tfpassword = new JPasswordField(15);
	JButton btcancel = new JButton("Cancel");
	JButton btsignup = new JButton("Sign Up");
	JButton btlogin = new JButton("Login");
	
	//
	
	//
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public SignUp() {
		f.setLocation(200,20);
		JPanel pnsignup = new JPanel();
		pnsignup.add(lb1);
		pnsignup.add(lbsignup);
		pnsignup.add(lb);
		pnsignup.setLayout(new GridLayout(1,3));
		
		JPanel pntext = new JPanel();
		pntext.add(lbusername);
		pntext.add(tfusername);
		pntext.add(lbpassword);
		pntext.add(tfpassword);
		pntext.add(btlogin);
		pntext.add(btsignup);
		pntext.setLayout(new GridLayout(3,2));
		 
		 
		
		 ImageIcon icon = new ImageIcon("D://HK1//forRENT.png");
		 JPanel pnicon = new JPanel();
		 JLabel lbicon = new JLabel(icon);
		 pnicon.add(lbicon);
		    
		 
		
		Container cont =  f.getContentPane();
		cont.add(pnsignup, BorderLayout.NORTH);
		cont.add(pntext, BorderLayout.CENTER);
		
		cont.add(pnicon, BorderLayout.WEST);
		
		
		lbsignup.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 40));
		pntext.setBackground(Color.WHITE);
		pnsignup.setBackground(Color.WHITE);
		lbsignup.setForeground(Color.PINK);
		lbusername.setForeground(Color.BLUE);
		lbpassword.setForeground(Color.BLUE);
		btcancel.setForeground(Color.BLUE);
		btsignup.setForeground(Color.BLUE);
		btlogin.setForeground(Color.BLUE);
		btcancel.setBackground(Color.LIGHT_GRAY);
		btsignup.setBackground(Color.LIGHT_GRAY);
		btlogin.setBackground(Color.LIGHT_GRAY);
		f.pack();
		f.setSize(700,300);
		f.setVisible(true);
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck connect = new ConnectDBck();
				new Inforcustomer1();
				
				f.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btlogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
					String username= tfusername.getText();
					String password= new String (tfpassword.getText());
					if (username.equals("linhptm") && password.endsWith("phanthimylinh")) {
						new choose();
						f.dispose();
					}
					else if (username.equals("havana") && password.endsWith("lona123")) {
						new choose();
						f.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong password");	
					}
				//new choose();
			}
		});
	}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new SignUp();
		//	new choose();
		}
	
	}
///////////////////////////////////////////////////////

	
	


class choose extends JFrame{
	JFrame f3 = new JFrame("Choose");
	JLabel lbchoose = new JLabel("Choose Object");
	JLabel lb = new JLabel();
	JLabel lb1 = new JLabel();
	JButton btcustomer = new JButton("Choose Customers");
	JButton btlandlords = new JButton("Choose Landlords");
	JButton bthouse = new JButton("Choose House");
	JButton btcancel = new JButton("Cancel");
	public choose() {
		JPanel pnchoose = new JPanel();
		pnchoose.add(lb);
		pnchoose.add(lbchoose);
		pnchoose.add(lb1);
		pnchoose.setBackground(Color.WHITE);
		pnchoose.setLayout(new GridLayout(1,3));
		f3.setLocation(300,20);
		f3.setLayout(new GridLayout(5,1));
		Container cont3 =  f3.getContentPane();
		
		cont3.add(pnchoose);
		cont3.add(btcustomer);
		cont3.add(btlandlords);
		cont3.add(bthouse);
		cont3.add(btcancel);
		lbchoose.setForeground(Color.BLUE);
		btcustomer.setBackground(Color.PINK);
		btcancel.setBackground(Color.PINK);
		bthouse.setBackground(Color.PINK);
		btlandlords.setBackground(Color.PINK);
		cont3.setBackground(Color.WHITE);
		lbchoose.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,30));
		f3.pack();
		f3.setSize(550,200);
		f3.setVisible(true);
		btcustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforcustomer();
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
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f3.dispose();
			}
		});
	}
	
}

/*class newAccount extends JFrame{
	JFrame fsignup = new JFrame("Sign Up");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lbusernamecus = new JLabel("Username");
	JTextField tfusernamecus = new JTextField(15);
	JLabel lbpasswordcus = new JLabel("Password");
	JPasswordField tfpasswordcus = new JPasswordField(15);
	JLabel lbemailcus = new JLabel("Email");	
	JTextField tfemailcus = new JTextField(15);
	JButton btcancel = new JButton("Cancel");
	JButton btsignup = new JButton("Sign Up");
	JButton btback = new JButton("Back");
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public newAccount() {
		fsignup.setLocation(300,20);
		fsignup.setLayout(new GridLayout(6,2));
		Container contlogin = fsignup.getContentPane();
		contlogin.add(lbsignup);
		contlogin.add(lb);
		contlogin.add(lbusernamecus);
		contlogin.add(tfusernamecus);
		contlogin.add(lbpasswordcus);
		contlogin.add(tfpasswordcus);
		contlogin.add(lbemailcus);
		contlogin.add(tfemailcus);
		contlogin.add(btcancel);
		contlogin.add(btsignup);
		contlogin.add(btback);
		fsignup.pack();
		fsignup.setSize(400,200);
		fsignup.setVisible(true);
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				fsignup.dispose();
			}
		});
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				int record = cn.executeDB("Insert into AccCustomer values ('"+tfusernamecus.getText()+"','"+tfpasswordcus.getText()+"','"+tfemailcus.getText()+"')");
				cn.executeDB("Insert into Inforcustomer (Email) values('"+tfemailcus.getText()+"')");
				if (record >0) JOptionPane.showMessageDialog(null, "Sign up success");
				else JOptionPane.showMessageDialog(null, "Fail");
				fsignup.dispose();
				new Inforcustomer1();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new SignUpCustomer();
				fsignup.dispose();
			}
		});
	}
	
}*/
class Inforcustomer1 extends JFrame {
	JFrame f2 = new JFrame("Information Customers");
	JLabel lbcmnd = new JLabel("CMND Customer");
	JTextField tfcmnd = new JTextField(20);
	JLabel lbfullname = new JLabel("Full Name");
	JTextField tffullname = new JTextField(20);
	JLabel lbaddress = new JLabel("Home Town");
	String[] address = {"Home Town","An Giang", "Bà rịa – Vũng tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu","Bắc Ninh", "	Bến Tre", "	Bình Định"
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
	JTextField tftimerent = new JTextField(20);
	JLabel lbtimestart = new JLabel("Time Start");
	JDateChooser cltimestart = new JDateChooser();
	JLabel lbbirthday = new JLabel ("Birthday");
	JDateChooser clbirthday = new JDateChooser();
	JLabel lbsdt = new JLabel("Phone Number");
	JTextField tfsdt = new JTextField(20);
	JLabel lbIDH = new JLabel("ID House");
	JTextField tfIDH = new JTextField(20);
	JLabel lbcmndland = new JLabel("CMND Landlord");
	JTextField tfcmndland = new JTextField(20); 
	JButton btadd = new JButton ("Complete");
	JButton btnew = new JButton ("Reset");
	JButton btseeH = new JButton ("See House");
	JButton btseeL = new JButton("See Landlord");
	JButton btcancel = new JButton ("Cancel");
	JButton btback = new JButton("Back");
	JLabel lbinfor = new JLabel("Information of Tenant");
	JLabel lbemail = new JLabel("Email");
	JTextField tfemail = new JTextField(20);
	JLabel lbgender = new JLabel("Gender");
	JRadioButton rmale = new JRadioButton("Male");
	JRadioButton rfemale = new JRadioButton("Female");
	ButtonGroup bg = new ButtonGroup();
	Connection conn;
	ResultSet rs;
	PreparedStatement ps;
	JTable tbhouse = new JTable();
	JScrollPane sph = new JScrollPane(tbhouse);
	JTable tbland = new JTable();
	JScrollPane spl = new JScrollPane(tbland);
	public Inforcustomer1() {
		JPanel pncmnd = new JPanel();
		pncmnd.add(lbcmnd);
		pncmnd.add(tfcmnd);
		
		lbcmnd.setForeground(Color.BLUE);
		pncmnd.setLayout(new GridLayout(1,2));
		
		JPanel pnname = new JPanel();
		pnname.add(lbfullname);
		pnname.add(tffullname);
		lbfullname.setForeground(Color.BLUE);
		pnname.setLayout(new GridLayout(1,2));
		
		JPanel pnaddress = new JPanel();
		pnaddress.add(lbaddress);
		pnaddress.add(jcbaddress);
		lbaddress.setForeground(Color.BLUE);
		pnaddress.setLayout(new GridLayout(1,2));
		
		JPanel pnbirthday = new JPanel();
		pnbirthday.add(lbbirthday);
		pnbirthday.add(clbirthday);
		lbbirthday.setForeground(Color.BLUE);
		pnbirthday.setLayout(new GridLayout(1,2));
		
		JPanel pntimestart = new JPanel();
		pntimestart.add(lbtimestart);
		pntimestart.add(cltimestart);
		lbtimestart.setForeground(Color.BLUE);
		pntimestart.setLayout(new GridLayout(1,2));
		
		JPanel pntimerent = new JPanel();
		pntimerent.add(lbtimerent);
		pntimerent.add(tftimerent);
		lbtimerent.setForeground(Color.BLUE);
		pntimerent.setLayout(new GridLayout(1,2));
		
		JPanel pnsdt = new JPanel();
		pnsdt.add(lbsdt);
		pnsdt.add(tfsdt);
		lbsdt.setForeground(Color.BLUE);
		pnsdt.setLayout(new GridLayout(1,2));
		
		JPanel pnemail = new JPanel();
		pnemail.add(lbemail);
		pnemail.add(tfemail);
		lbemail.setForeground(Color.BLUE);
		pnemail.setLayout(new GridLayout(1,2));
		
		JPanel pnID = new JPanel();
		pnID.add(lbIDH);
		pnID.add(tfIDH);
		lbIDH.setForeground(Color.BLUE);
		pnID.setLayout(new GridLayout(1,2));
		
		JPanel pngender = new JPanel();
		pngender.add(lbgender);
		pngender.add(rmale);
		pngender.add(rfemale);
		bg.add(rmale);
		bg.add(rfemale);
		bg.setSelected(rmale.getModel(), true);
		lbgender.setForeground(Color.BLUE);
		pngender.setLayout(new GridLayout(1,3));
		
		JPanel pncmndl = new JPanel();
		pncmndl.add(lbcmndland);
		pncmndl.add(tfcmndland);
		lbcmndland.setForeground(Color.BLUE);
		pncmndl.setLayout(new GridLayout(1,2));
		
		JPanel pnbton = new JPanel();
		pnbton.add(btadd);
		pnbton.add(btnew);
		pnbton.add(btcancel);
		pnbton.add(btback);
		pnbton.add(btseeH);
		pnbton.add(btseeL);
		btcancel.setBackground(Color.PINK);
		btback.setBackground(Color.PINK);
		btnew.setBackground(Color.PINK);
		btseeL.setBackground(Color.PINK);
		btseeH.setBackground(Color.PINK);
		btadd.setBackground(Color.PINK);
	
		pnbton.setLayout(new GridLayout(6,1));

		JPanel pnall = new JPanel();
		pnall.add(pncmnd);
		pnall.add(pnname);
		pnall.add(pnbirthday);
		pnall.add(pngender);
		pnall.add(pnaddress);
		pnall.add(pnsdt);
		pnall.add(pnemail);
		pnall.add(pntimerent);
		pnall.add(pntimestart);
		pnall.add(pnID);
		pnall.add(pncmndl);
		pnall.setLayout(new GridLayout(11,1));
		pnall.setBackground(Color.WHITE);
		
		f2.setLocation(100,20);
		
		Container cont2 =  f2.getContentPane();
		cont2.add(pnall,BorderLayout.CENTER);
		cont2.add(pnbton, BorderLayout.SOUTH);
		
		f2.pack();
		f2.setSize(700,500);
		f2.setVisible(true);
	
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Inforcustomer1();
				f2.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f2.dispose();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new SignUp();
				f2.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				ConnectDBck cn =new ConnectDBck();
				conn = cn.connect();
				// thêm vào cơ sở dữ liệu
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
			       String HomeTown = jcbaddress.getSelectedItem().toString();
			       String Gender ="";
			       if(rmale.isSelected()) Gender = rmale.getText();
			       if(rfemale.isSelected()) Gender = rfemale.getText();
					Date selectedDate = (Date) clbirthday.getDate();
					java.sql.Date Birthday = convertUtilToSql(selectedDate);
					Date selectedDatestart = (Date) cltimestart.getDate();
					java.sql.Date TimeStart = convertUtilToSql(selectedDatestart);
					
					 try {
					
						checkOrdetemail(tfemail.getText());
							// ps= conn.prepareStatement(sql);
						ResultSet rss = cn.listAll("Select * from inforhouse where IDHouse = '"+tfIDH.getText()+"' and QuantityNow = QuantityMax");
							if (rss.next()) {
								JOptionPane.showMessageDialog(null, "House is full member");
							} else {
								ps = conn.prepareStatement("exec sp_Addcus ?,?,?,?,?,?,?,?,?,?,? ");
							ps.setString(1, tfcmnd.getText());
							ps.setString(2, tffullname.getText());
							ps.setDate(3, Birthday);
							ps.setString(4, Gender);
							ps.setString(5, HomeTown);
							ps.setString(6, tfsdt.getText());
							ps.setString(7, tfemail.getText());
							ps.setString(8, tftimerent.getText());
							ps.setDate(9, TimeStart);
							ps.setString(10, tfIDH.getText());
							ps.setString(11, tfcmndland.getText());
							int record = ps.executeUpdate();
							if(record >0) JOptionPane.showMessageDialog(null, "Insert Success");
							else JOptionPane.showMessageDialog(null, "Insert Fail");
							if(tfIDH.getText().length()!=0) {
								cn.executeDB("update inforhouse set QuantityNow = (QuantityNow + 1) where IDHouse = '"+tfIDH.getText()+"'");
							}
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					 
			}

			private java.sql.Date convertUtilToSql(Date selectedDate) {
				java.sql.Date sDate = new java.sql.Date(selectedDate.getTime());
		        return sDate;
			}
		});
		btseeH.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtablehouse();
				f2.dispose();
			}
		});
		btseeH.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtablelandlords();
				f2.dispose();
			}
		});
		
	}
	public void jtablehouse() {
	JFrame ftb = new JFrame();
	JTable tbhouse1 = new JTable();
	JScrollPane sph = new JScrollPane(tbhouse1);
	JButton btback = new JButton("Back");
	JButton btcancel = new JButton("Cancel");
	btback.setForeground(Color.BLUE);
	btcancel.setForeground(Color.BLUE);
	btback.setBackground(Color.PINK);
	btcancel.setBackground(Color.PINK);
	ftb.setLocation(200,100);
	
	JPanel pntb = new JPanel();
	sph.setPreferredSize(new Dimension(850, 450));
	Border bd2 = BorderFactory.createLineBorder(Color.CYAN);
	TitledBorder tbdh= BorderFactory.createTitledBorder(bd2, "Information Landlords");
	pntb.setBorder(tbdh);
	pntb.add(sph);
	
	JPanel pnbt = new JPanel();
	pnbt.add(btback);
	pnbt.add(btcancel);
	Container conttb = ftb.getContentPane();
	conttb.add(pntb);
	conttb.add(pnbt, BorderLayout.SOUTH);
	ftb.setSize(900,500);
	ftb.setVisible(true);
	btback.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			new Inforcustomer1();
			ftb.dispose();
		}
	});
	btcancel.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			ftb.dispose();
		}
	});
	ConnectDBck con = new ConnectDBck();
	// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
		rs=con.listAll("Select * from inforhouse");
		String column[] = {"ID House", "Address House","House Area","Deposits",
			"CMND Landlord","Quantity member Max","Quantity member Now"};
        DefaultTableModel tm = new DefaultTableModel (column, 0);
       
		
        try {
			while (rs.next()) {
				Object data[]= {rs.getString("IDHouse"), rs.getString("AddressHouse"),rs.getString("HouseArea"),rs.getString("Deposits"),rs.getString("CMNDland"),rs.getString("QuantityMax"),rs.getString("QuantityNow")};    
				
				
				tm.addRow(data);
			
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tbhouse1.setModel(tm);
	
}
	public void jtablelandlords() {
		JFrame ftb = new JFrame();
		JTable tblandlord = new JTable();
		JScrollPane spll = new JScrollPane(tblandlord);
		JButton btback = new JButton("Back");
		JButton btcancel = new JButton("Cancel");
		ftb.setLocation(200,100);
		
		JPanel pntb = new JPanel();
		spll.setPreferredSize(new Dimension(850, 450));
		Border bd2 = BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder tbdll= BorderFactory.createTitledBorder(bd2, "Information Landlords");
		pntb.setBorder(tbdll);
		pntb.add(spll);
		
		btback.setForeground(Color.BLUE);
		btcancel.setForeground(Color.BLUE);
		btback.setBackground(Color.PINK);
		btcancel.setBackground(Color.PINK);
		JPanel pnbt = new JPanel();
		pnbt.add(btback);
		pnbt.add(btcancel);
		Container conttb = ftb.getContentPane();
		conttb.add(pntb);
		conttb.add(pnbt, BorderLayout.SOUTH);
		ftb.setSize(900,500);
		ftb.setVisible(true);
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Inforcustomer1();
				ftb.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				ftb.dispose();
			}
		});
		ConnectDBck con = new ConnectDBck();
		// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
			rs=con.listAll("Select * from inforlandlords");
			String column[] = {"CMND LandLords", "Full Name","Address","Birthday",
				"Phone Number","Email","Number Of House"};
	        DefaultTableModel tm = new DefaultTableModel (column, 0);
	        try {
				while (rs.next()) {
					Object data[]= {rs.getString("CMNDland"), rs.getString("FullName"),rs.getString("Address"),rs.getString("Birthday")
							,rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("NumberOfHouses")};    
					
					
					tm.addRow(data);
				
				}
				tblandlord.setModel(tm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	   public void checkOrdetemail(String str ) throws Exception {
	 		String emailulg = "^[\\w-]+@([\\w- ]+\\.)+[\\w-]+$";
	 		//^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$
	 		Boolean b = str.matches(emailulg);
	 		if(b==false) {
	 			JOptionPane.showMessageDialog(null, "Dia chi Email khong hop le");
	 			throw new Exception("Dia chi Email khong hop le");
	 		}
	 	}
}
//


/*
 *	Object data[]= {rs.getString("CMNDcus"), rs.getString("FullName"),rs.getString("Birthday"),rs.getString("Gender"),rs.getString("HomeTown"),rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("TimeRental"),rs.getString("TimeStart"),rs.getString("IDHouse"),rs.getString("CMNDland")};    
	String column[] = {"CMNDcus", "FullName","Birthday","Gender","HomeTown",
				"PhoneNumber","Email","TimeRental","TimeStart","IDHouse","CMNDland"};		
			
 
 * 
 */
