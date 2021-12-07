package OOPs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Sinhvien{
	private String hoten;
	private String namsinh;
	private double diemtoan;
	private double diemanhvan;
	private double diemtinhoc;
	public Sinhvien() {
		
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public double getDiemtoan() {
		return diemtoan;
	}
	public void setDiemtoan(double diemtoan) {
		this.diemtoan = diemtoan;
	}
	public double getDiemanhvan() {
		return diemanhvan;
	}
	public void setDiemanhvan(double diemanhvan) {
		this.diemanhvan = diemanhvan;
	}
	public double getDiemtinhoc() {
		return diemtinhoc;
	}
	public void setDiemtinhoc(double diemtinhoc) {
		this.diemtinhoc = diemtinhoc;
	}
	public void nhapThongtin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		this.hoten =sc.nextLine();
		System.out.println("Enter Year of Birth ");
		this.namsinh = sc.nextLine();
		System.out.println("Enter mark Math ");
		this.diemtoan = sc.nextDouble();
		System.out.println("Enter mark English ");
		this.diemanhvan = sc.nextDouble();
		System.out.println("Enter mark Information technology");
		this.diemtinhoc = sc.nextDouble();
		sc.nextLine();
	}
	public double diemTB() {
		double diemTB;
		diemTB= (this.diemanhvan+this.diemtinhoc+this.diemtoan)/3;
		return diemTB;
	}
	public void inThongtin() {
		System.out.println("Name is "+this.hoten);
		System.out.println("Year of Birth is "+this.namsinh);
		System.out.println("Average is "+diemTB());
	}
	public String toString() {
		return ("Name is "+this.hoten+"\n"+"Year of Birth is "+this.namsinh+"\n"+"Average is "+diemTB());
	}
}

public class IT5sv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinhvien[] sv = new Sinhvien[3];
	
		for(int i=0; i<3;i++) {
			sv[i]= new Sinhvien();
			sv[i].nhapThongtin();
			sv[i].inThongtin();
			if(sv[i].getDiemanhvan()>0 && sv[i].getDiemtinhoc()>0 && sv[i].getDiemtoan()>0&&sv[i].diemTB()>5) {
				sv[i].inThongtin();
				System.out.println("Is eligible for class");
			}else {
				sv[i].inThongtin();
				System.out.println("Isn't eligible for class");
			}
			
		}
		for(int i=0; i<3; i++) {
			sv[i].toString();
		}
		Arrays.sort(sv, new Comparator<Sinhvien>() {
			public int compare(Sinhvien o1, Sinhvien o2) {
				double diem1 = o1.diemTB();
				double diem2 = o2.diemTB();
				return (int)(diem2-diem1);
			}
		});
		System.out.println("Sinh vien co diem trung binh cao nhat la "+sv[0]);
		
	}

}
