package ck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class inforcustomer extends JFrame {
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
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("Reset");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btcancel = new JButton ("Cancel");
	JButton btback = new JButton("Back");
	JButton btsee = new JButton("See");
	JLabel lbinfor = new JLabel("Information of Tenant");
	JLabel lbemail = new JLabel("Email");
	JTextField tfemail = new JTextField(20);
	JLabel lbgender = new JLabel("Gender");
	JRadioButton rmale = new JRadioButton("Male");
	JRadioButton rfemale = new JRadioButton("Female");
	ButtonGroup bg = new ButtonGroup();
	
	
	JTable tbcus = new JTable();
	JScrollPane sp = new JScrollPane(tbcus);	
	
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	
	public inforcustomer() {
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
		lbgender.setForeground(Color.BLUE);
		pngender.setLayout(new GridLayout(1,3));
		
		JPanel pncmndl = new JPanel();
		pncmndl.add(lbcmndland);
		pncmndl.add(tfcmndland);
		lbcmndland.setForeground(Color.BLUE);
		pncmndl.setLayout(new GridLayout(1,2));
		
		JPanel pnbton = new JPanel();
		pnbton.add(btback);
		btback.setBackground(Color.PINK);
		pnbton.add(btcancel);
		btcancel.setBackground(Color.PINK);
		pnbton.add(btfind);
		btfind.setBackground(Color.PINK);
		pnbton.add(btupdate);
		btupdate.setBackground(Color.PINK);
		pnbton.add(btnew);
		btnew.setBackground(Color.PINK);
		pnbton.add(btdelete);
		btdelete.setBackground(Color.PINK);
		pnbton.add(btadd);
		btadd.setBackground(Color.PINK);
		pnbton.add(btsee);
		btsee.setBackground(Color.PINK);
		pnbton.setLayout(new GridLayout(2,4));
		
		JPanel pntable = new JPanel();
		sp.setPreferredSize(new Dimension(720, 500));
		Border bd = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder tbdcus= BorderFactory.createTitledBorder(bd, "Information Customer");
		pntable.setBorder(tbdcus);
		pntable.add(sp);
		pntable.setBackground(Color.WHITE);
		
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
		Border bdpnall = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder tbdpnall= BorderFactory.createTitledBorder(bdpnall, "Input Information Customer");
		pnall.setBorder(tbdpnall);
		pnall.setBackground(Color.WHITE);
		
		f2.setLocation(100,20);
		
		Container cont2 =  f2.getContentPane();
		cont2.add(pnall,BorderLayout.WEST);
		cont2.add(pntable,BorderLayout.CENTER);
		cont2.add(pnbton, BorderLayout.SOUTH);
		
		f2.pack();
		f2.setSize(1200,600);
		f2.setVisible(true);
		DisplayCustomer();
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				new inforcustomer();
				
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
							// ps= conn.prepareStatement(sql);
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
							if(record >0) JOptionPane.showMessageDialog(null, "Success");
							else JOptionPane.showMessageDialog(null, "Fail");
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				DisplayCustomer();
					
				
			}

			private java.sql.Date convertUtilToSql(Date selectedDate) {
				java.sql.Date sDate = new java.sql.Date(selectedDate.getTime());
		        return sDate;
			}
		});
		
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// chỉnh sủa csdl
				ConnectDBck cn =new ConnectDBck();
				String HomeTown = jcbaddress.getSelectedItem().toString();
					  try {
						  if(HomeTown != "Home Town") {
							  int record = cn.executeDB("Update Inforcustomer set HomeTown = '"+HomeTown+"'"
										+ " where CMNDcus = '"+tfcmnd.getText()+"'");
							  if (record>0)  JOptionPane.showMessageDialog(null, "Success");
							  else JOptionPane.showMessageDialog(null, "Fail");	
						  }
						  if(tfsdt.getText().length()!=0) {
							  int record = cn.executeDB("Update Inforcustomer set PhoneNumber = '"+tfsdt.getText()+"'"
										+ " where CMNDcus = '"+tfcmnd.getText()+"'");
							  if (record>0)  JOptionPane.showMessageDialog(null, "Success");
							  else JOptionPane.showMessageDialog(null, "Fail");
						  }
						  if(tfemail.getText().length()!=0) {
							  int record = cn.executeDB("Update Inforcustomer set Email = '"+tfemail.getText()+"'"
										+ " where CMNDcus = '"+tfcmnd.getText()+"'");
							  if (record>0)  JOptionPane.showMessageDialog(null, "Success");
							  else JOptionPane.showMessageDialog(null, "Fail");
						  }
						  if(tffullname.getText().length()!=0) {
								  int record = cn.executeDB("Update Inforcustomer set FullName = '"+tffullname.getText()+"'"
											+ " where CMNDcus = '"+tfcmnd.getText()+"'");
								  if (record>0)  JOptionPane.showMessageDialog(null, "Success");
								 else JOptionPane.showMessageDialog(null, "Fail");
						  }
						  if(tftimerent.getText().length()!=0) {
							  int record = cn.executeDB("Update Inforcustomer set TimeRental = '"+tftimerent.getText()+"'"
										+ " where CMNDcus = '"+tfcmnd.getText()+"'");
							  if (record>0)  JOptionPane.showMessageDialog(null, "Success");
							 else JOptionPane.showMessageDialog(null, "Fail");
					  }
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					  DisplayCustomer();
				
			}

			
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				try {
					int record = cn.executeDB("Delete from Inforcustomer where CMNDcus = '"+tfcmnd.getText()+"'"
							+ "or FullName = '"+tffullname.getText()+"' or PhoneNumber = '"+tfsdt.getText()+"'"
									+ " or Email = '"+tfemail.getText()+"' ");
					if (record>0) JOptionPane.showMessageDialog(null, "Success");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DisplayCustomer();
			}
			
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// tìm kiếm
				DisplayCustomerfind();
				
			}
		});
	
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f2.dispose();
			}
		});
		btback.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose();
				f2.dispose();
			}
		});
		btsee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtable();
				f2.dispose();
			}
		});
	}
	public void DisplayCustomer()  {
		ConnectDBck conn = new ConnectDBck();
		rs=conn.listAll("Select * from Inforcustomer");
		String column[] = {"CMNDcus", "FullName","Birthday","Gender","HomeTown",
				"PhoneNumber","Email","TimeRental","TimeStart","IDHouse","CMNDland"};	
	        DefaultTableModel tm = new DefaultTableModel (column, 0);
	        try {
				while (rs.next()) {
					Object data[]= {rs.getString("CMNDcus"), rs.getString("FullName")
							,rs.getString("Birthday"),rs.getString("Gender"),rs.getString("HomeTown")
							,rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("TimeRental")
							,rs.getString("TimeStart"),rs.getString("IDHouse"),rs.getString("CMNDland")};
					
					tm.addRow(data);
					
				}
				tbcus.setModel(tm);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        
	}
	public void DisplayCustomerfind()  {
		ConnectDBck conn = new ConnectDBck();
		String HomeTown = jcbaddress.getSelectedItem().toString();
		rs=conn.listAll("Select * from Inforcustomer where FullName = '"+tffullname.getText()+"' or "
				+ "CMNDcus = '"+tfcmnd.getText()+"'or HomeTown = '"+HomeTown+"' or PhoneNumber = '"+tfsdt.getText()+"'"
						+ "or Email = '"+tfemail.getText()+"' or IDHouse = '"+tfIDH.getText()+"' or CMNDland = '"+tfcmndland.getText()+"'or TimeRental = "
								+ "'"+tftimerent.getText()+"'");
	

		String column[] = {"CMNDcus", "FullName","Birthday","Gender","HomeTown",
				"PhoneNumber","Email","TimeRental","TimeStart","IDHouse","CMNDland"};	
	        DefaultTableModel tm = new DefaultTableModel (column, 0);
	        try {
				while (rs.next()) {
					Object data[]= {rs.getString("CMNDcus"), rs.getString("FullName")
							,rs.getString("Birthday"),rs.getString("Gender"),rs.getString("HomeTown")
							,rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("TimeRental")
							,rs.getString("TimeStart"),rs.getString("IDHouse"),rs.getString("CMNDland")};
					
					tm.addRow(data);
					
				}
				tbcus.setModel(tm);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	        
	        public void jtable() {
	    		JFrame ftbcus = new JFrame();
	    		JTable tbcustomer = new JTable();
	    		JScrollPane spll = new JScrollPane(tbcustomer);
	    		JButton btback = new JButton("Back");
	    		JButton btcancel = new JButton("Cancel");
	    		ftbcus.setLocation(0,100);
	    		
	    		JPanel pntb = new JPanel();
	    		spll.setPreferredSize(new Dimension(1300, 450));
	    		Border bd2 = BorderFactory.createLineBorder(Color.CYAN);
	    		TitledBorder tbdll= BorderFactory.createTitledBorder(bd2, "Information Landlords");
	    		pntb.setBorder(tbdll);
	    		pntb.add(spll);
	    		
	    		JPanel pnbt = new JPanel();
	    		pnbt.add(btback);
	    		pnbt.add(btcancel);
	    		Container conttb = ftbcus.getContentPane();
	    		conttb.add(pntb);
	    		conttb.add(pnbt, BorderLayout.SOUTH);
	    		ftbcus.setSize(1350,500);
	    		ftbcus.setVisible(true);
	    		btback.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e) {
	    				new inforcustomer();
	    				ftbcus.dispose();
	    			}
	    		});
	    		btcancel.addActionListener(new ActionListener(){
	    			public void actionPerformed(ActionEvent e) {
	    				
	    				ftbcus.dispose();
	    			}
	    		});
	    		
	    		ConnectDBck con = new ConnectDBck();
	    		rs=con.listAll("Select * from Inforcustomer");
	    		String column[] = {"CMNDcus", "FullName","Birthday","Gender","HomeTown",
	    				"PhoneNumber","Email","TimeRental","TimeStart","IDHouse","CMNDland"};	
	    	        DefaultTableModel tm = new DefaultTableModel (column, 0);
	    	        try {
	    				while (rs.next()) {
	    					Object data[]= {rs.getString("CMNDcus"), rs.getString("FullName")
	    							,rs.getString("Birthday"),rs.getString("Gender"),rs.getString("HomeTown")
	    							,rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("TimeRental")
	    							,rs.getString("TimeStart"),rs.getString("IDHouse"),rs.getString("CMNDland")};
	    					
	    					tm.addRow(data);
	    					
	    				}
	    				tbcustomer.setModel(tm);
	    			} catch (SQLException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    		
	    	}
	        
	}
	/*private java.sql.Date convertUtilToSql(Date selectedDate) {
		java.sql.Date BDate = new java.sql.Date(selectedDate.getTime());
        return BDate;
        mouseactionlistener
        set biểu tượng
      
	}*/
	
	
	
