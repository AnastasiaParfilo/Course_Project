package ua.com.khai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        District district = new District();
        Office office1 = new Office();
        office1.setNumArendators(200);
        office1.setPriceRent(100);
        Residential residential = new Residential();
        residential.setNumberOfRoom(200);
        district.add(office1);
        district.add(residential);
        System.out.println(district.getOffice());
        district.remove(office1);
        System.out.println(district.getOffice());

    }
}
