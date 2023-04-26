package com.argusoft.cms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;

@Entity
@Table(name="ordrList")
public class OrderList{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="createdAt")
    private Timestamp createdAt;
    @Column(name="quantity")
    private int quantity;
    @Column(name="cost")
    private int cost;
    @Column(name="isReady")
    private boolean isReady;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId",referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private UserDetail user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "itemId",referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Menu item;

    public OrderList() {
    }

    public OrderList(int id, Timestamp createdAt, int quantity, int cost, boolean isReady, UserDetail user, Menu item) {
        this.id = id;
        this.createdAt = createdAt;
        this.quantity = quantity;
        this.cost = cost;
        this.isReady = isReady;
        this.user = user;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public UserDetail getUser() {
        return user;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }

    public Menu getItem() {
        return item;
    }

    public void setItem(Menu item) {
        this.item=item;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", isReady=" + isReady +
                ", user=" + user +
                ", item=" + item +
                '}';
    }
}
