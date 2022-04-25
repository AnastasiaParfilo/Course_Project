package ua.com.khai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class District {

    List<Building> districtList = new ArrayList<>();

    public void create(){
        Scanner sc=new Scanner(System.in);
        int i = 3;
        while (i != 0) {
            System.out.println();
            System.out.println("Please choose some building to add");
            System.out.println("If you want to add Office, enter 1");
            System.out.println("If you want to add Residential, enter 2");
            System.out.println("If you want to add Warehouse, enter 3");
            System.out.println("If don't want to add, enter 0");
            System.out.println();
            i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    //ТУТ РАНДОМНОЕ ИЛИ ИЗ ФАЙЛА ЗАПОЛНЕНИЕ
                    System.out.println("Office was added");
                }
                case 2 -> {
                    //ТУТ РАНДОМНОЕ ИЛИ ИЗ ФАЙЛА ЗАПОЛНЕНИЕ

                    System.out.println("Residential was added");
                }
                case 3 -> {
                    //ТУТ РАНДОМНОЕ ИЛИ ИЗ ФАЙЛА ЗАПОЛНЕНИЕ
                    System.out.println("Warehouse was added");
                }
                default -> System.out.println();
            }
        }
    }
    public void delete(){
        districtList.clear();
    }
    public void add(Building building){
        districtList.add(building);
    }

    public void remove(Building building){
        districtList.remove(building);
    }
    public List<Building> getOffice(){
        return districtList.stream().filter(p -> p.getClass().equals(Office.class)).collect(Collectors.toList());
    }
    public List<Building> getResidential(){
        return districtList.stream().filter(p -> p.getClass().equals(Residential.class)).collect(Collectors.toList());
    }
    public List<Building> getWarehouse(){
        return districtList.stream().filter(p -> p.getClass().equals(Warehouse.class)).collect(Collectors.toList());
    }
    public List<Building> show(){
        return districtList;
    }
}
