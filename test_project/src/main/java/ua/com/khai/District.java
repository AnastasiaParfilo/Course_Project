package ua.com.khai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class District {

    List<Building> districtList = new ArrayList<>();

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
    public List<Building> getAll(){
        return districtList;
    }
}
