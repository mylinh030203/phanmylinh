package OOPs;

import java.util.Date;
import java.util.Scanner;

public class person {
	protected String hoten;
	protected String ngaysinh;
	protected double hesoluong;
	public person() {
		
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public double getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}
	public void nhapdulieu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao ho ten");
		this.hoten = sc.nextLine();
		System.out.println("Nhap vao ngay sinh");
		this.ngaysinh = sc.nextLine();
		System.out.println("Nhap vao he so luong");
		this.hesoluong = sc.nextDouble();
		sc.nextLine();
	}
	public String toString() {
		return ("ho ten = "+this.hoten+"\n ngay sinh "+this.ngaysinh+"\n he so luong = "+this.hesoluong);
	}
}
