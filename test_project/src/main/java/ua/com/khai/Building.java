package ua.com.khai;

import java.util.ArrayList;
import java.util.List;

public abstract class Building {

    private Integer numberOfRoom;
    private Integer length;
    private Integer width;

    private List<String> listOfPeople = new ArrayList<>();
    private String name;
    private String lastName;
    private Integer numberOfPeople;

    public Integer getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(Integer numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public List<String> getListOfPeople() {
        return listOfPeople;
    }
    @Override
    public String toString() {
        return "Building{" +
                ", numberOfRoom=" + numberOfRoom +
                ", length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }


    public Integer areaOfRoom() {
        Integer area = length * width;
        return area;
    }

    public Integer perimOfRoom() {
        Integer perim = length + length + width + width;
        return perim;
    }

    public Integer areaOfBuilding() {
        Integer area = numberOfRoom * areaOfRoom();
        return area;
    }

    public void addPeople(String name, String lastName) {
        listOfPeople.add(name + " " + lastName);
    }
}

