package com.argusoft.cms.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

public class UserDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phoneNo", unique = true)
    private String phoneNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "userType", nullable = false, columnDefinition = "roles default 'Employee'")
    private Roles userType;

    //------------------------------------mapp to table orderList and feedback
    @OneToMany(mappedBy = "user")
    private List<OrderList> orders;


    //    ---------------------------------getters for fields
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Roles getUserType() {
        return userType;
    }
//    -----------------------------getter for mapped fields

    public List<OrderList> getOrders() {
        return orders;
    }


//    ---------------------------------setters for fields

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setUserType(Roles userType) {
        this.userType = userType;
    }
//    ------------------------setter for mapped fields

    public void setOrders(List<OrderList> orders) {
        this.orders = orders;
    }

//    --------------------------constructors

    public UserDetail() {
    }

    //      ---------------------------add mapped fields in this constructor

    public UserDetail(Long id, String name, String email, String phoneNo, Roles userType, List<OrderList> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.userType = userType;
        this.orders = orders;
    }
}

