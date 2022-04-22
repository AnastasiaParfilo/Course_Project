package ua.com.khai;

import java.util.ArrayList;
import java.util.List;

public class Office extends Building {
    private String companyArendator;
    private Integer numArendators;
    private Integer priceRent;

    private final List<String> listOfArendators = new ArrayList<>();

    public Integer costOfRent() {
        return getPriceRent() / numArendators;
    }


    public Integer getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(Integer priceRent) {
        this.priceRent = priceRent;
    }

    public String getCompanyArendator() {
        return companyArendator;
    }

    public void setCompanyArendator(String companyArendator) {
        this.companyArendator = companyArendator;
        listOfArendators.add(companyArendator);
        numArendators++;
    }

    public List<String> getListOfArendators() {
        return listOfArendators;
    }

    public Integer getNumArendators() {
        return numArendators;
    }

    public void setNumArendators(Integer numArendators) {
        this.numArendators = numArendators;
    }

    @Override
    public String toString() {
        return "Office{" +
                "companyArendator='" + companyArendator + '\'' +
                ", numArendators=" + numArendators +
                ", costOfRent=" + costOfRent() +
                ", listOfArendators=" + listOfArendators +
                '}';
    }
}

