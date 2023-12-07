package com.example.lab9.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class RequestHeatLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String quantity;
    private String requestTime;
    private String requestStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public RequestHeatLevel() {
    }

    public RequestHeatLevel(String quantity, String requestTime, String requestStatus, User user) {
        this.quantity = quantity;
        this.requestTime = requestTime;
        this.requestStatus = requestStatus;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RequestHeatLevel{" +
                "id=" + id +
                ", quantity='" + quantity + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", requestStatus='" + requestStatus + '\'' +
                ", user=" + user +
                '}';
    }
}
