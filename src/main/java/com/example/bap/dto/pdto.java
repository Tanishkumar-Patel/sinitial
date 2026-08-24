package com.example.bap.dto;

public class pdto {
    private String name;
    private String category;
    private String address;
    private Integer opening_balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(Integer opening_balance) {
        this.opening_balance = opening_balance;
    }
}
