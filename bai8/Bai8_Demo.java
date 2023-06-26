package bai8;

import java.util.Scanner;

public class Bai8_Demo {
	static Scanner sc = new Scanner(System.in);
	public static void NhapCD(Bai08_CD cd) {
		System.out.print("Nhập mã CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        cd.setTuaCD(sc.nextLine());
        System.out.print("Nhập số bài hát : ");
        cd.setSoBaiHat(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        cd.setGiaThanh(sc.nextFloat());
	}
	
	public static void main(String[] args) {
		Bai08_CD cd[] = null;
		int a, n =0;
		boolean flag = true;
		
		do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin CD \n" +
                    "2.Xuất danh sách Album.\n" + "3.Tính tổng giá thành \n" + "4.Tổng số lượng CD \n" +
                    "5.Sắp xếp giảm dần theo giá thành\n"+"6.Sắp xếp tăng dần theo tựa CD\n"+"Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng CD : ");
                    n = sc.nextInt();
                    cd = new Bai08_CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        cd[i] = new Bai08_CD();
                        NhapCD(cd[i]);
                      }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Số bài hát", "Giá thành");
                    for (int i = 0; i < n; i++) {
                        cd[i].hienThiCD();
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += cd[i].getGiaThanh();
                    }
                    System.out.println("" +
                            "Tổng giá thành là : " + tong);
                    break;
                case 4:
                    System.out.println("Tổng số lượng CD là : " + n);
                    break;
                case 5:
                    Bai8_CD temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getGiaThanh() < cd[j].getGiaThanh()) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                    break;
                case 6:
                    temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getTuaCD().compareTo(cd[j].getTuaCD())>0) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Nhập số 2 để kiểm tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
}
