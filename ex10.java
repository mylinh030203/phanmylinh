package OOPs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giamdoc GD = new Giamdoc();
		Quandoc QD = new Quandoc();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap vao so luong nhan vien ");
		int n = sc.nextInt();
		person[] NV= new person[3+n];
		nhanvien[] nv = new nhanvien[n];
		NV[0]= new Giamdoc();
		NV[1]= new Quandoc();
		NV[2]= new Quandoc();
		NV[0].nhapdulieu();
		NV[1].nhapdulieu();
		NV[2].nhapdulieu();
		for(int i=3; i<n+3; i++) {
			NV[i] =  new nhanvien();
			NV[i].nhapdulieu();
			nv[i-3]= (nhanvien) NV[i];
			//System.out.println(nv[i].toString());
			
		}
		for(int i=0; i<n+3; i++) {
			System.out.println(NV[i].toString());
		}
		
		//sap xep theo giamr dan. neu sap xep tang dan thi dung 1-2
		Arrays.sort(NV, new Comparator<person>() {
			@Override
			public int compare(person o1, person o2) {
				double tongluong_1 = o1.hesoluong;
				double tongluong_2 = o2.hesoluong;
				if(o1.getClass()==Giamdoc.class) {
					tongluong_1= (tongluong_1+ ((Giamdoc)o1).getHesochucvu())*1150000;
				}
				tongluong_1=tongluong_1*1150000;
				if(o2.getClass()==Giamdoc.class) {
					tongluong_2= (tongluong_2+ ((Giamdoc)o2).getHesochucvu())*1150000;
				}
				tongluong_2=tongluong_2*1150000;
				return (int)(tongluong_2 - tongluong_1);
			}
		});
		System.out.println("tong luong lon nhat la "+NV[0]);
		System.out.println("nhan su co thang sinh 12 la ");
		Arrays.stream(NV).filter(t->t.getNgaysinh().split("/")[1].equals("12"))
        .collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("nhan su co ho Huynh la ");
		Arrays.stream(NV).filter(e->e.getHoten().split(" ")[0].equals("Huynh"))
        .collect(Collectors.toList()).forEach(System.out::println);
		//doan can chinh
		System.out.println("in ra cac nhan vien o phong ke toan ");
		Arrays.stream(nv).filter(g->g.getTendv().equals("ke toan"))
        .collect(Collectors.toList()).forEach(System.out::println);
	}

}
