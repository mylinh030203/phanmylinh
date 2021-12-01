package OOPs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class VanList {
	private static final VanList VanList = null;
	public static void main(String[] args) {
		System.out.println("+------------------ Menu -------------------------+");
        System.out.println("| 1) Them 5 object Van                            |");
        System.out.println("| 2) In ra danh sach Van                          |");
        System.out.println("| 3) In danh sach Van priceForSale lon hon 20     |");
        System.out.println("| 4) Tinh tong so Van co trong danh sach          |");
        System.out.println("| 5) Thoat                                        |");
        System.out.println("+-------------------------------------------------+");
        Scanner sc = new Scanner(System.in);
        
       
        int i=1;
        while(i<3) {
        	 System.out.println("Enter menu ");
             int menu = sc.nextInt();
        switch(menu) {
        case 1:{
        	add();
        break;
        }
        case 2:output(); break;
        case 3:output(); break;
        }
        i++;
	}
	}
	
	 static ArrayList<Van> VList = new ArrayList<Van>();
	 static Van e = new Van();
	public static void add(){
		VList.add(e);
		
		Scanner sc= new Scanner(System.in);

		for(int i = 1; i<=5;i++ ) {
			System.out.println("Enter ID");
			int id =Integer.parseInt(sc.nextLine());
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter price");
			double price = Double.parseDouble(sc.nextLine());
			System.out.println("Enter ectraOut");
			double extraOut = Double.parseDouble(sc.nextLine());
			System.out.println("Enter quantity");
			int quantity = Integer.parseInt(sc.nextLine());
			Van p = new Van(id,  name, price,  extraOut,  quantity);
			VList.add(p);
			
			
		}
	}
	public static void output() {
		for(Van list:VList) {
			System.out.println("ID is "+list.getId()+ ", Name is "+ list.getName()+" priceforsale "+list.priceForSale());
			
		}
	}
	public static void outputpFS() {
		for(Van listpFS:VList) {
			if(listpFS.priceForSale()>20) {
				System.out.println("ID is "+listpFS.getId()+ ", Name is "+ listpFS.getName()+" priceforsale "+listpFS.priceForSale());
			}
		}
	}

	
	
 
	

}
