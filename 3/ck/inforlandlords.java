package ck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class inforlandlords extends JFrame{
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
	JTable tbland = new JTable();
	JScrollPane sp = new JScrollPane(tbland);
	public inforlandlords() {
		jframelandlords();
		buttonlandlord();
		tbland.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int row = tbland.getSelectedRow();
				tfCMll.setText((String)tbland.getValueAt(row, 0));
				tfnamell.setText((String)tbland.getValueAt(row, 1));
				tfaddressll.setText((String)tbland.getValueAt(row, 2));
				((JTextField)dcbirthdayll.getDateEditor().getUiComponent()).setText(tbland.getValueAt(row,3).toString());
				tfsdt.setText((String)tbland.getValueAt(row, 4));
				tfemailland.setText((String)tbland.getValueAt(row, 5));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	
	}
	
	public void jframelandlords() {
		JPanel pncmnd = new JPanel();
		pncmnd.add(lbCMll);
		pncmnd.add(tfCMll);
		lbCMll.setForeground(Color.BLUE);
		pncmnd.setLayout(new GridLayout(1,2));
		
		JPanel pnnamell = new JPanel();
		pnnamell.add(lbnamell);
		pnnamell.add(tfnamell);
		lbnamell.setForeground(Color.BLUE);
		pnnamell.setLayout(new GridLayout(1,2));
		
		JPanel pnaddress = new JPanel();
		pnaddress.add(lbaddressll);
		pnaddress.add(tfaddressll);
		lbaddressll.setForeground(Color.BLUE);
		pnaddress.setLayout(new GridLayout(1,2));
		
		JPanel pnemail = new JPanel();
		pnemail.add(lbemailland);
		pnemail.add(tfemailland);
		lbemailland.setForeground(Color.BLUE);
		pnemail.setLayout(new GridLayout(1,2));
		
		JPanel pnbirthdayl = new JPanel();
		pnbirthdayl.add(lbbirthdayll);
		pnbirthdayl.add(dcbirthdayll);
		lbbirthdayll.setForeground(Color.BLUE);
		pnbirthdayl.setLayout(new GridLayout(1,2));
		
		JPanel pnsdt = new JPanel();
		pnsdt.add(lbsdt);
		pnsdt.add(tfsdt);
		lbsdt.setForeground(Color.BLUE);
		pnsdt.setLayout(new GridLayout(1,2));
		
		JPanel pnbt = new JPanel();
		pnbt.add(btadd);
		pnbt.add(btupdate);
		pnbt.add(btdelete);
		pnbt.add(btfind);
		pnbt.add(btnew);
		pnbt.add(btSee);
		pnbt.add(btcancel);
		pnbt.add(btback);
		
		btfind.setBackground(Color.PINK);
		btupdate.setBackground(Color.PINK);
		btSee.setBackground(Color.PINK);
		btnew.setBackground(Color.PINK);
		btdelete.setBackground(Color.PINK);
		btadd.setBackground(Color.PINK);
		btcancel.setBackground(Color.PINK);
		btback.setBackground(Color.PINK);
		pnbt.setLayout(new GridLayout(2,4));
		
		JPanel pnall = new JPanel();
		pnall.add(pncmnd);
		pnall.add(pnnamell);
		pnall.add(pnaddress);
		pnall.add(pnbirthdayl);
		pnall.add(pnsdt);
		pnall.add(pnemail);
		pnall.setLayout(new GridLayout(6,1));
		Border bdpnall = BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder tbdpnall= BorderFactory.createTitledBorder(bdpnall, "Input Information Landlords");
		pnall.setBorder(tbdpnall);
		pnall.setBackground(Color.WHITE);
		
		JPanel pntable = new JPanel();
		Border bd = BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder tbdcus= BorderFactory.createTitledBorder(bd, "Information Landlords");
		pntable.setBorder(tbdcus);
		pntable.add(sp);
		pntable.setBackground(Color.WHITE);
		f4.setLocation(200,100);
		
		Container cont4 = f4.getContentPane();
		cont4.add(pnall, BorderLayout.CENTER);
		cont4.add(pntable, BorderLayout.EAST);
		cont4.add(pnbt, BorderLayout.SOUTH);
		f4.pack();
		f4.setSize(900,500);
		f4.setVisible(true);
		DisplayLandlords();
	}
	public void buttonlandlord() {
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforlandlords();
				f4.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn =new ConnectDBck();
				 SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
				 try {
				 Date selectedDate = (Date) dcbirthdayll.getDate();
					java.sql.Date Birthday = convertUtilToSql(selectedDate);
					int record = cn.executeDB("Insert into inforlandlords values('"+tfCMll.getText()+"','"+tfnamell.getText()+"','"+tfaddressll.getText()+"','"+Birthday+"','"+tfsdt.getText()+"','"+tfemailland.getText()+"')");
					if (record>0) JOptionPane.showMessageDialog(null, "Insert Success");
				 }catch(Exception e1) {
					 e1.printStackTrace();
				 }
					DisplayLandlords();
				
			}

			private java.sql.Date convertUtilToSql(Date selectedDate) {
				// TODO Auto-generated method stub
				java.sql.Date sDate = new java.sql.Date(selectedDate.getTime());
		        return sDate;
			}
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				try {
					int record = cn.executeDB("Delete from inforlandlords where CMNDland = '"+tfCMll.getText()+"' or "
							+ "FullName = '"+tfnamell+"' or PhoneNumber = '"+tfsdt.getText()+"' or Email = '"+tfemailland.getText()+"'");
					if (record>0) JOptionPane.showMessageDialog(null, "Delete Success");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DisplayLandlords();
			}
		});
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				try {
					if(tfnamell.getText().length() !=0) {
						int record = cn.executeDB("Update inforlandlords set FullName = '"+tfnamell.getText()+"' where CMNDland = '"+tfCMll.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update full name was Fail");
					}
					if(tfaddressll.getText().length()!=0) {
						int record = cn.executeDB("Update inforlandlords set Address = '"+tfaddressll.getText()+"' where CMNDland = '"+tfCMll.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update address was Fail");
					}
					if(tfemailland.getText().length()!=0) {
						int record = cn.executeDB("Update inforlandlords set Email = '"+tfemailland.getText()+"' where CMNDland = '"+tfCMll.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update email was Fail");
					}
					if (tfsdt.getText().length()!=0) {
						int record = cn.executeDB("Update inforlandlords set PhoneNumber = '"+tfsdt.getText()+"' where CMNDland = '"+tfCMll.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update Phone Number was Fail");
					}
					if(((JTextField)dcbirthdayll.getDateEditor().getUiComponent()).getText().length()!=0) {
						int record = cn.executeDB("Update inforlandlords set Birthday = '"+((JTextField)dcbirthdayll.getDateEditor().getUiComponent()).getText()+"' where CMNDland = '"+tfCMll.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update Birthday of landlord was Fail");
					}
					}catch(Exception e2) {
					e2.printStackTrace();
				}
				DisplayLandlords();
			}
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DisplayLandlordsfind();
			}
		});
		btSee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtable();
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
	public void DisplayLandlords() {
		ConnectDBck conn = new ConnectDBck();
	// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
		rs=conn.listAll("Select * from inforlandlords");
		String column[] = {"CMND LandLords", "Full Name","Address","Birthday",
			"Phone Number","Email"};
        DefaultTableModel tm = new DefaultTableModel (column, 0);
        try {
			while (rs.next()) {
				Object data[]= {rs.getString("CMNDland"), rs.getString("FullName"),rs.getString("Address"),rs.getString("Birthday")
						,rs.getString("PhoneNumber"),rs.getString("Email")};    
				
				
				tm.addRow(data);
			
			}
			tbland.setModel(tm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void DisplayLandlordsfind() {
		ConnectDBck conn = new ConnectDBck();
	// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
		rs=conn.listAll("Select * from inforlandlords where CMNDland = '"+tfCMll.getText()+"'"
				+ "or FullName = '"+tfnamell.getText()+"' or Address = '"+tfaddressll.getText()+"'"
						+ "or PhoneNumber = '"+tfsdt.getText()+"' or Email = '"+tfemailland.getText()+"'");
		String column[] = {"CMND LandLords", "Full Name","Address","Birthday",
			"Phone Number","Email"};
        DefaultTableModel tm = new DefaultTableModel (column, 0);
       
		
        try {
			while (rs.next()) {
				Object data[]= {rs.getString("CMNDland"), rs.getString("FullName"),rs.getString("Address"),rs.getString("Birthday")
						,rs.getString("PhoneNumber"),rs.getString("Email")};    
				tm.addRow(data);
			}
			tbland.setModel(tm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void jtable() {
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
				new inforlandlords();
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
				"Phone Number","Email"};
	        DefaultTableModel tm = new DefaultTableModel (column, 0);
	        try {
				while (rs.next()) {
					Object data[]= {rs.getString("CMNDland"), rs.getString("FullName"),rs.getString("Address"),rs.getString("Birthday")
							,rs.getString("PhoneNumber"),rs.getString("Email")};    
					
					
					tm.addRow(data);
				
				}
				tblandlord.setModel(tm);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
