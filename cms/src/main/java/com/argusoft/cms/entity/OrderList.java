package com.argusoft.cms.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orderList")
public class OrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "cost")
    private int cost;

    @Column(name = "isReady")
    private boolean isReady;
//      -------------------------mapped fields
    @ManyToOne
    @JoinColumn(name = "itemId", referencedColumnName = "id")
    private Menu item;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserDetail user;

//    -------------------setter for fields

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
//    -------------------setter for mapped fields

    public void setItem(Menu item) {
        this.item = item;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }
//    ------------------------getter for fields

    public Long getId() {
        return id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCost() {
        return cost;
    }

    public boolean isReady() {
        return isReady;
    }
//    ---------------------------getter for mapped field

    public Menu getItem() {
        return item;
    }

    public UserDetail getUser() {
        return user;
    }
//    ----------------------------------constructors

    public OrderList() {
    }

    public OrderList(Long id, Timestamp createdAt, int quantity, int cost, boolean isReady, Menu item, UserDetail user) {
        this.id = id;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.cost = cost;
        this.isReady = isReady;
        this.item = item;
        this.user = user;
    }
//    -----------------------------------to string

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", isReady=" + isReady +
                ", item=" + item +
                ", user=" + user +
                '}';
    }
}
