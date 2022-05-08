package ua.com.khai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        District district = new District();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, user!!");
        while (true) {
            System.out.println("If you want to create district, enter 1");
            System.out.println("If you want to delete district, enter 2");
            System.out.println("If you want to show district, enter 3");
            System.out.println("If you want to show Office buildings in district, enter 4");
            System.out.println("If you want to show Residential buildings in district, enter 5");
            System.out.println("If you want to show Warehouse buildings in district, enter 6");
            System.out.println("If you want to exit, enter 0");
            int i = sc.nextInt();
            switch (i) {
                case 1 -> district.create();
                case 2 -> district.delete();
                case 3 -> System.out.println(district.show());
                case 4 -> System.out.println(district.getOffice());
                case 5 -> System.out.println(district.getResidential());
                case 6 -> System.out.println(district.getWarehouse());
                case 0 -> System.exit(0);
            }
        }
    }
}
