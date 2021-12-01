package OOPs;

import java.util.Scanner;

public class Van {
	private int id;
	private String name;
	private double price;
	private double extraOut;
	private int quantity;
	public Van() {
		this.input();
	}
	public Van(int id, String name, double price, double extraOut, int quantity) {
		this.id = id;
		this.name=name;
		this.price = price;
		this.extraOut = extraOut;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
public void input(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of object of class Van");
		int n = sc.nextInt();
		for(int i = 1; i<=n;i++ ) {
	
	        System.out.print("Nhap ID: ");
	        this.id = sc.nextInt();
	          
	        sc.nextLine();
			System.out.println("Enter name");
			this.name = sc.nextLine();
			System.out.println("Enter price");
			double price = Double.parseDouble(sc.nextLine());
			System.out.println("Enter ectraOut");
			double extraOut = Double.parseDouble(sc.nextLine());
			System.out.println("Enter quantity");
			int quantity = Integer.parseInt(sc.nextLine());
			}
	}



	public double priceForSale() {
		double priceforsale = 0;
		if(this.quantity>=50) {
			priceforsale = this.price + this.extraOut + this.extraOut*10/100;
		}else {
			priceforsale = this.price + this.extraOut;
		}
		return priceforsale ;
	}


}
