package ua.com.khai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class District {

    List<Building> districtList = new ArrayList<>();

    public void create(){
        Scanner sc=new Scanner(System.in);
        int i = 3;
        int j=2;
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
                    Office office =new Office();
                    System.out.println("If you want to fill fields in random way, enter 1");
                    System.out.println("If you want to fill fields from file, enter 2");
                    j=sc.nextInt();
                    if(j==1) {
                        randomOffice(office);
                    }else if(j==2){
                        fileOffice(office);
                    }
                    System.out.println("Office was added");
                }
                case 2 -> {
                    //ТУТ РАНДОМНОЕ ИЛИ ИЗ ФАЙЛА ЗАПОЛНЕНИЕ
                    Residential residential = new Residential();
                    System.out.println("If you want to fill fields in random way, enter 1");
                    System.out.println("If you want to fill fields from file, enter 2");
                    j=sc.nextInt();
                    if(j==1) {
                        randomResidential(residential);
                    }else if(j==2) {
                        fileResidential(residential);

                    }
                    System.out.println("Residential was added");
                }
                case 3 -> {
                    //ТУТ РАНДОМНОЕ ИЛИ ИЗ ФАЙЛА ЗАПОЛНЕНИЕ
                    Warehouse warehouse = new Warehouse();
                    System.out.println("If you want to fill fields in random way, enter 1 ");
                    System.out.println("If you want to fill fields from file, enter 2 ");
                    j=sc.nextInt();
                    if(j==1) {
                        randomWarehouse(warehouse);
                    }else if(j==2) {
                        fileWarehouse(warehouse);
                    }
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

    public void randomOffice(Office office){
        String [] arrendators={"Sony Pictures","Apple","NIX","Epam","A-Level","Samsung","Asus","HP","Space-X","LG"};
        Random random = new Random();
        int n = random.nextInt(0,arrendators.length);
        office.setCompanyArendator(arrendators[n]);
        n=random.nextInt(1,10);
        office.setNumArendators(n);
        n=random.nextInt(300,700);
        office.setPriceRent(n);
        n=random.nextInt(200,900);
        office.setNumberOfRoom(n);
        n=random.nextInt(40,200);
        office.setLength(n);
        n=random.nextInt(40,200);
        office.setWidth(n);
        add(office);

    }

    public void randomResidential(Residential residential){
        Random random = new Random();
        int n = random.nextInt(200,900);
        residential.setNumberOfRoom(n);
        n = random.nextInt(2,13);
        residential.setKindergarten(n);
        n = random.nextInt(1,6);
        residential.setMalls(n);
        n = random.nextInt(2,9);
        residential.setPlayground(n);
        n = random.nextInt(1,3);
        residential.setSchools(n);
        n=random.nextInt(40,200);
        residential.setLength(n);
        n=random.nextInt(40,200);
        residential.setWidth(n);
        add(residential);
    }

    public void randomWarehouse(Warehouse warehouse){
        Random random = new Random();
        int n = random.nextInt(200,900);
        warehouse.setNumberOfRoom(n);
        n = random.nextInt(2,11);
        warehouse.setBoxWithAppliances(n);
        n = random.nextInt(100,300);
        warehouse.setArea((double)n);
        n = random.nextInt(1,7);
        warehouse.setBoxWithFood(n);
        n = random.nextInt(1,10);
        warehouse.setBoxWithTools(n);
        n=random.nextInt(40,200);
        warehouse.setLength(n);
        n=random.nextInt(40,200);
        warehouse.setWidth(n);
        add(warehouse);
    }

    public void fileOffice(Office office){
        String [] arrendators={"Sony Pictures","Apple","NIX","Epam","A-Level","Samsung","Asus","HP","Space-X","LG"};
       try (FileReader fileReader = new FileReader("test_project/src/main/java/ua/com/khai/office.txt")){
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String c;
           List<Integer> listNum=new ArrayList<Integer>();
           while((c = bufferedReader.readLine()) != null){
               listNum.add(Integer.valueOf(c));
           }
           office.setCompanyArendator(arrendators[listNum.get(0)]);
           office.setNumArendators(listNum.get(1));
           office.setPriceRent(listNum.get(2));
           office.setNumberOfRoom(listNum.get(3));
           office.setLength(listNum.get(4));
           office.setWidth(listNum.get(5));
           add(office);
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }

    public void fileResidential(Residential residential){
        try (FileReader fileReader = new FileReader("test_project/src/main/java/ua/com/khai/residential.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String c;
            List<Integer> listNum=new ArrayList<Integer>();
            while((c = bufferedReader.readLine()) != null){
                listNum.add(Integer.valueOf(c));
            }
            residential.setNumberOfRoom(listNum.get(0));
            residential.setKindergarten(listNum.get(1));
            residential.setMalls(listNum.get(2));
            residential.setPlayground(listNum.get(3));
            residential.setSchools(listNum.get(4));
            residential.setLength(listNum.get(5));
            residential.setWidth(listNum.get(6));
            add(residential);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fileWarehouse(Warehouse warehouse){
        try (FileReader fileReader = new FileReader("test_project/src/main/java/ua/com/khai/warehouse.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String c;
            List<Integer> listNum=new ArrayList<Integer>();
            while((c = bufferedReader.readLine()) != null){
                listNum.add(Integer.valueOf(c));
            }
            warehouse.setNumberOfRoom(listNum.get(0));
            warehouse.setBoxWithAppliances(listNum.get(1));
            warehouse.setArea((double)listNum.get(2));
            warehouse.setBoxWithFood(listNum.get(3));
            warehouse.setBoxWithTools(listNum.get(4));
            warehouse.setLength(listNum.get(5));
            warehouse.setWidth(listNum.get(6));
            add(warehouse);


    } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }



}
