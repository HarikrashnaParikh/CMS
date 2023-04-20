package com.argusoft.cms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity
@Table(name="menu")
public class Menu {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "itemName")
    private String itemName;

    @Column(name = "itemType")
    private String itemType;
    @Column(name = "price")
    private int price;
    @Column(name = "available")
    private boolean available;



}
