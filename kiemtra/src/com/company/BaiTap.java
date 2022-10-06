package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BaiTap {
    Scanner sc = new Scanner(System.in);

    // kiem tra snt
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //bai 1
    // hien ra hinh vuong va tam giac
    public void square() {

        // hien ra hinh vuong
        for (int i = 0; i < 4; i++) {
            System.out.println("****");
        }


        // hien ra hinh tam giac
        for (int i = 1; i <= 4; i++) {
            //in so ky tu sao
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    //    bai 2
    public void hien() {
        int dem = 0;
        String name = "You only live once, but if you do it right, once is enough";
        System.out.println(name);
        System.out.println("so tu trong chuoi la: " + name.length());
//        Ký tự o xuất hiện bao nhiêu lần và có index là bao nhiêu
        System.out.println("Các vị trí có ký tự e ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'o') {
                System.out.print(" " + (i + 1));
                dem++;
            }
        }
        System.out.println("\nKý tự o xuất hiện: " + dem);
    }
// bai 3
    public void kiemTraSNT() {
        int a;
        System.out.println("Kiem tra so nguyen to: ");
        a = sc.nextInt();
        if (isPrimeNumber(a))
            System.out.printf("%d Day la so nguyen to", a);
        else
            System.out.printf("%d Day khong  la so nguyen to", a);
    }

    //    bai 4
    public void soNguyenTo() {
        int dem = 0;
        int n = 10;
        int i = 2;
        // hien ra 10 so nguyen to dau tien
        System.out.println("Hien ra 10 so nguyen to dau tien");
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
                dem++;
            }
            i++;
        }
        System.out.println("\nHien ra so nguyen to <10");
        for (int j = 0; j < 10; j++) {
            if (isPrimeNumber(j))
                System.out.print(j + "\t");
        }


    }

    // bai 5
    public void mangChieu() {
        double sum = 0, sumHet = 0;
        int m, n, row, col;  //số dòng, số cột
        do {
            System.out.println("Nhập vào số dòng của ma trận A:");
            m = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận A:");
            n = sc.nextInt();
        } while (m < 1 || n < 1);

        int[][] a = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận A :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // dieu kien duong cheo chinh i =j
        System.out.println("Duong cheo chinh: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.print(a[i][j] + "\t");
            }
        }

        // tao them mang 1 mang 2 chieu  va thuc hien cong 2 mang A va B


        System.out.println("Nhập vào số dòng của ma trận B:");
        row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận B:");
        col = sc.nextInt();
        if (m != row && n != col) {
            System.out.println("Không thể thực hiện 2 ma trận");

        } else {
            int[][] b = new int[row][col];
            int[][] c = new int[row][col];

            System.out.println("Nhập các phần tử cho ma trận B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "," + j + "] = ");
                    b[i][j] = sc.nextInt();
                }
            }
            // cong hai ma tran a va b
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    c[i][j] = a[i][j] + b[i][j];

            System.out.println("Tổng ma trận :");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }
    }

    //bai 6 check sdt vs email
    public void check() {
        String email, sdt;
        System.out.println("Nhap email: ");
        sc.nextLine();
        email = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
        String EMAIL =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String SDT = "^0[98]{1}\\d{8}$";
        if (Pattern.matches(EMAIL, email))
            System.out.println("La email");
//
        else
            System.out.println("Khong phai dinh dang email");
        if (Pattern.matches(SDT, sdt)) {
            System.out.println("La dinh dang so dien thoai");
        } else
            System.out.println("Khong phai dinh dang so dien thoai");


    }
}
