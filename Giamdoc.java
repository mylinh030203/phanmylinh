package OOPs;

import java.util.Scanner;

class Giamdoc extends person {
	private double hesochucvu;
	public Giamdoc() {
		super();
	}

	public double getHesochucvu() {
		return hesochucvu;
	}

	public void setHesochucvu(double hesochucvu) {
		this.hesochucvu = hesochucvu;
	}
	
	public void nhapdulieu() {
		Scanner sc= new Scanner(System.in);
		super.nhapdulieu();
		System.out.println("Nhap he so chuc vu");
		this.hesochucvu = sc.nextDouble();
		sc.nextLine();
		
	}
	public String toString() {
		return (super.toString()+"\n he so chuc vu = "+this.hesochucvu);
	}
}
class Quandoc extends person{
	private int soluongnv;

	public int getSoluongnv() {
		return soluongnv;
	}

	public void setSoluongnv(int soluongnv) {
		this.soluongnv = soluongnv;
	}
	public void nhapdulieu() {
		Scanner sc= new Scanner(System.in);
		super.nhapdulieu();
		System.out.println("Nhap so luong nhan vien quan ly");
		this.soluongnv = sc.nextInt();
		sc.nextLine();
}
	public String toString() {
		return (super.toString()+"\n so luong nhan vien = "+this.soluongnv);
	}
}
class nhanvien extends person{
	private String tendv;

	public String getTendv() {
		return tendv;
	}

	public void setTendv(String tendv) {
		this.tendv = tendv;
	}
	public void nhapdulieu() {
		Scanner sc= new Scanner(System.in);
		super.nhapdulieu();
		System.out.println("Nhap ten don vi quan ly");
		this.tendv = sc.nextLine();
	}
	public String toString() {
		return (super.toString()+"\n ten don vi = "+this.tendv);
	}
	
}
