package com.springApplication.cars.model;

import java.util.List;

public class DealerDetailsModel {
    private String name;
    private String address;
    private String number;
    private List<CarDetailsModel> carsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<CarDetailsModel> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<CarDetailsModel> carsList) {
        this.carsList = carsList;
    }
}
