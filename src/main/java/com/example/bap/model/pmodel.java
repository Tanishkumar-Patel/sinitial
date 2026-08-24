package com.example.bap.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class pmodel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Id
    @Column(unique = true) @NotBlank
    private String name;

    @NotBlank
    private String category;

    @NotBlank
    private String address;

    @NotNull
    private Integer opening_balance;

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getCategory() {
        return category;
    }

    public void setCategory(@NotBlank String category) {
        this.category = category;
    }

    public @NotBlank String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank String address) {
        this.address = address;
    }

    public @NotNull Integer getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(@NotNull Integer opening_balance) {
        this.opening_balance = opening_balance;
    }
}
