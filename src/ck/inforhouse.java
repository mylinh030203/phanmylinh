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
import ck.ConnectDBck;

public class inforhouse extends JFrame{
	JFrame f5 = new JFrame("Information House");
	JLabel lbID = new JLabel("ID House");
	JTextField tfID = new JTextField(15);
	JLabel lbaddressh = new JLabel("Address House");
	JTextField tfaddressh = new JTextField(15);
	JLabel lbarea = new JLabel("House Area");
	JTextField tfarea = new JTextField(15);
	JLabel lbdeposits = new JLabel("Deposits");
	JTextField tfdeposits = new JTextField(15);
	JButton btadd = new JButton ("Add");
	JButton btdelete = new JButton ("Delete");
	JButton btnew = new JButton ("New");
	JButton btupdate = new JButton ("Update");
	JButton btfind = new JButton ("Find");
	JButton btSee = new JButton ("See");
	JButton btcancel = new JButton ("Cancel");
	JButton btback = new JButton("Back");
	JLabel lbcmndland = new JLabel("CMND Landlord");
	JTextField tfcmndland = new JTextField(15); 
	JLabel lbmax = new JLabel("Quantity member Max");
	JTextField tfmax = new JTextField(15);
	JLabel lbnow = new JLabel("Quantity member Now");
	JTextField tfnow = new JTextField(15);
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	JTable tbhouse = new JTable();
	JScrollPane sp = new JScrollPane(tbhouse);
	public inforhouse() {
		jframehouse();
		buttonhouse();
		tbhouse.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int row = tbhouse.getSelectedRow();
				tfID.setText((String)tbhouse.getValueAt(row, 0));
				tfaddressh.setText((String)tbhouse.getValueAt(row, 1));
				tfarea.setText((String)tbhouse.getValueAt(row, 2));
				tfdeposits.setText((String)tbhouse.getValueAt(row, 3));
				tfcmndland.setText((String)tbhouse.getValueAt(row, 4));
				tfmax.setText((String)tbhouse.getValueAt(row, 5));
				tfnow.setText((String)tbhouse.getValueAt(row, 6));
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
	public void DisplayHouse() {
		ConnectDBck conn = new ConnectDBck();
	// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
		rs=conn.listAll("Select * from inforhouse");
		String column[] = {"ID House", "Address House","House Area","Deposits",
			"CMND Landlord","Quantity member Max","Quantity member Now"};
        DefaultTableModel tm = new DefaultTableModel (column, 0);
       
		
        try {
			while (rs.next()) {
				Object data[]= {rs.getString("IDHouse"), rs.getString("AddressHouse"),rs.getString("HouseArea"),rs.getString("Deposits"),rs.getString("CMNDland"),rs.getString("QuantityMax"),rs.getString("QuantityNow")};    
				
				
				tm.addRow(data);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tbhouse.setModel(tm);
	}
	
	public void DisplayHousefind() {
		ConnectDBck conn = new ConnectDBck();
	// trong sql thì phải dùng DefaultTableModel nếu k sẽ bị trùng dữ liệu
		rs=conn.listAll("Select * from inforhouse where IDHouse = '"+tfID.getText()+"' or AddressHouse = '"+tfaddressh.getText()+"'"
				+ "or HouseArea = '"+tfarea.getText()+"' or Deposits = '"+tfdeposits.getText()+"' or CMNDland = '"+tfcmndland.getText()+"'or MemberMax = "+tfmax.getText()+" ");
		String column[] = {"ID House", "Address House","House Area","Deposits",
			"CMND Landlord","Quantity member Max","Quantity member Now"};
        DefaultTableModel tm = new DefaultTableModel (column, 0);
       
		
        try {
			while (rs.next()) {
				Object data[]= {rs.getString("IDHouse"), rs.getString("AddressHouse"),rs.getString("HouseArea"),rs.getString("Deposits"),rs.getString("CMNDland"),rs.getString("QuantityMax"),rs.getString("QuantityNow")};    
				
				
				tm.addRow(data);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tbhouse.setModel(tm);
	}
	public void jtable() {
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
		TitledBorder tbdh= BorderFactory.createTitledBorder(bd2, "Information House");
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
				new inforhouse();
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tbhouse1.setModel(tm);
		
	}
	public void jframehouse() {

		JPanel pnid = new JPanel();
		pnid.add(lbID);
		pnid.add(tfID);
		pnid.add(lbaddressh);
		pnid.add(tfaddressh);
		pnid.add(lbarea);
		pnid.add(tfarea);
		pnid.add(lbdeposits);
		pnid.add(tfdeposits);
		pnid.add(lbcmndland);
		pnid.add(tfcmndland);
		pnid.add(lbmax);
		pnid.add(tfmax);
		pnid.add(lbnow);
		pnid.add(tfnow);
		pnid.setLayout(new GridLayout(7,2));
		lbID.setForeground(Color.BLUE);
		lbaddressh.setForeground(Color.BLUE);
		lbarea.setForeground(Color.BLUE);
		lbdeposits.setForeground(Color.BLUE);
		lbcmndland.setForeground(Color.BLUE);
		lbmax.setForeground(Color.BLUE);
		lbnow.setForeground(Color.BLUE);
		Border bd = BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder tbdhouse= BorderFactory.createTitledBorder(bd, "Input Information House");
		pnid.setBorder(tbdhouse);
		pnid.setBackground(Color.WHITE);
		
		JPanel pnbt = new JPanel();
		pnbt.add(btadd);
		pnbt.add(btupdate);
		pnbt.add(btdelete);
		pnbt.add(btfind);
		pnbt.add(btnew);
		pnbt.add(btSee);
		pnbt.add(btcancel);
		pnbt.add(btback);
		pnbt.setLayout(new GridLayout(2,4));
		btadd.setBackground(Color.PINK);
		btnew.setBackground(Color.PINK);
		btdelete.setBackground(Color.PINK);
		btupdate.setBackground(Color.PINK);
		btfind.setBackground(Color.PINK);
		btSee.setBackground(Color.PINK);
		btcancel.setBackground(Color.PINK);
		btback.setBackground(Color.PINK);
		
		
		
		
		JPanel pninfor = new JPanel();
		Border bdhouse = BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder tbdcus= BorderFactory.createTitledBorder(bdhouse, "Information Landlords");
		pninfor.setBorder(tbdcus);
		pninfor.add(sp);
		pninfor.setBackground(Color.WHITE);
		f5.setLocation(200,100);
		
		Container cont5 = f5.getContentPane();
		cont5.add(pnid,BorderLayout.CENTER);
		cont5.add(pninfor,BorderLayout.EAST);
		cont5.add(pnbt,BorderLayout.SOUTH);
		DisplayHouse();
		f5.pack();
		f5.setSize(950,550);
		f5.setVisible(true);
	}
	public void buttonhouse() {
		btnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforhouse();
				f5.dispose();
			}
		});
		btadd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm dữ liệu
				ConnectDBck cn = new ConnectDBck();
				try {
					
					int record = cn.executeDB("Insert into inforhouse values('"+tfID.getText()+"','"+tfaddressh.getText()+"','"+tfarea.getText()+"','"+tfdeposits.getText()+"','"+tfcmndland.getText()+"',"+tfmax.getText()+","+tfnow.getText()+")");
					if (record>0) JOptionPane.showMessageDialog(null, "Insert Success");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DisplayHouse();
			}
		});
		btdelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				try {
					int record = cn.executeDB("Delete from inforhouse where IDHouse = '"+tfID.getText()+"'");
					if (record>0) JOptionPane.showMessageDialog(null, "Delete Success");
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DisplayHouse();
			}
		});
		btupdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck cn = new ConnectDBck();
				try {
					if(tfaddressh.getText().length() !=0) {
						int record = cn.executeDB("Update inforhouse set AddressHouse = '"+tfaddressh.getText()+"' where IDHouse = '"+tfID.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update house address was Fail");
					}
					if(tfarea.getText().length()!=0) {
						int record = cn.executeDB("Update inforhouse set HouseArea = '"+tfarea.getText()+"' where IDHouse = '"+tfID.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update house area was Fail");
					}
					if(tfdeposits.getText().length()!=0) {
						int record = cn.executeDB("Update inforhouse set Deposits = '"+tfdeposits.getText()+"' where IDHouse = '"+tfID.getText()+"'");
						if (record>0) ;
						else JOptionPane.showMessageDialog(null, "Update deposite was Fail");
					}
					if (tfcmndland.getText().length()!=0) {
						int record = cn.executeDB("Update inforhouse set CMNDland = '"+tfcmndland.getText()+"' where IDHouse = '"+tfID.getText()+"'");
						if (record>0);
						else JOptionPane.showMessageDialog(null, "Update CMND of landlord was Fail");
					}
					
				}catch(Exception e2) {
					e2.printStackTrace();
				}
				DisplayHouse();
			}
		});
		btfind.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				DisplayHousefind();
			}
		});
		btSee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtable();
				f5.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
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
