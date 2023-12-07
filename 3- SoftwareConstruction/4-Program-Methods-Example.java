package com.example.lab9.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EcoHeatBot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private float measuredHeatLevel;
    private float analyzeHeat;
    private String provideRecommendation;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> user;

    public String checkHeat(String requestor, String quantity) {
        String result = "";
        int heatIndex = 5;

        if (quantity.length() > 20 || !requestor.matches("^[a-zA-Z\\s]+$") || requestor.isBlank()) {
            result = "Помилка авторизації";
        } else {
            result = "Your Heat quantity is perfect today." +
                    "Your Eco Rating is " + heatIndex ;
        }
        return result;
    }



    public EcoHeatBot() {
    }

    public EcoHeatBot(float measuredHeatLevel, float analyzeHeat, String provideRecommendation, List<User> user) {
        this.measuredHeatLevel = measuredHeatLevel;
        this.analyzeHeat = analyzeHeat;
        this.provideRecommendation = provideRecommendation;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMeasuredHeatLevel() {
        return measuredHeatLevel;
    }

    public void setMeasuredHeatLevel(float measuredHeatLevel) {
        this.measuredHeatLevel = measuredHeatLevel;
    }

    public float getAnalyzeHeat() {
        return analyzeHeat;
    }

    public void setAnalyzeHeat(float analyzeHeat) {
        this.analyzeHeat = analyzeHeat;
    }

    public String getProvideRecommendation() {
        return provideRecommendation;
    }

    public void setProvideRecommendation(String provideRecommendation) {
        this.provideRecommendation = provideRecommendation;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "EcoHeatBot{" +
                "id=" + id +
                ", measuredHeatLevel=" + measuredHeatLevel +
                ", analyzeHeat=" + analyzeHeat +
                ", provideRecommendation='" + provideRecommendation + '\'' +
                ", user=" + user +
                '}';
    }
}
