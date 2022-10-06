package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        BaiTap bai2 = new BaiTap();
        int n;
        do {

            System.out.println("\n-----------------Menu-----------------");
            System.out.println("1. Câu 1");
            System.out.println("2. Câu 2");
            System.out.println("3. Câu 3");
            System.out.println("4. Câu 4");
            System.out.println("5. Câu 5");
            System.out.println("6. Câu 6");
            System.out.println("Nhập lựa chọn: ");
            n = sc.nextInt();
            switch (n)
            {
                case 1:
                    bai2.square();
                    break;
                case 2:
                    bai2.hien();
                    break;
                case 3:
                    bai2.kiemTraSNT();
                    break;
                case 4:
                    bai2.soNguyenTo();
                    break;
                case 5:
                    bai2.mangChieu();
                    break;
                case 6:
                    bai2.check();
                    break;
                default:
                    System.out.println("Vui lòng bạn chọn lại:");
            }
        }while (n != 0);


    }
}
