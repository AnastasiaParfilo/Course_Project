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
            System.out.println("If you want to exit, enter 0");
            int i = sc.nextInt();
            switch (i){
                case 1 -> district.create();
                case 2 -> district.delete();
                case 3 -> System.out.println(district.show());
                case 0 -> System.exit(0);
            }
        }

    }
}
