package com.example.lab9.model;

import jakarta.persistence.*;

@Entity
public class AnswerOnRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private float measuredHeatLevel;

    private String answerTime;

    private String answerStatus;

    @ManyToOne
    @JoinColumn (name = "requestheatquality_id")
    private RequestAirLevel requestHeatLevel;

    @ManyToOne
    @JoinColumn (name = "safeEcoBot_id")
    private EcoHeatBot ecoHeatBot;

    public AnswerOnRequest() {
    }

    public AnswerOnRequest(float measuredHeatLevel, String answerTime, String answerStatus, RequestHeatLevel requestHeatLevel, EcoHeatBot ecoHeatBot) {
        this.measuredHeatLevel = measuredHeatLevel;
        this.answerTime = answerTime;
        this.answerStatus = answerStatus;
        this.requestHeatLevel = requestHeatLevel;
        this.ecoHeatBot = ecoHeatBot;
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
        this.measuredHeatevel = measuredHeatLevel;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public String getAnswerStatus() {
        return answerStatus;
    }

    public void setAnswerStatus(String answerStatus) {
        this.answerStatus = answerStatus;
    }

    public RequestHeatLevel getRequestHeatLevel() {
        return requestHeatLevel;
    }

    public void setRequestHeatLevel(RequestHeatLevel requestHeatLevel) {
        this.requestHeatLevel = requestHeatLevel;
    }

    public EcoHeatBot getHeatEcoBot() {
        return ecoHeatBot;
    }

    public void setSafeEcoBot(EcoHeatBot ecoHeatBot) {
        this.ecoHeatBot = ecoHeatBot;
    }

    @Override
    public String toString() {
        return "AnswerOnRequest{" +
                "id=" + id +
                ", measuredHeatLevel=" + measuredHeatLevel +
                ", answerTime='" + answerTime + '\'' +
                ", answerStatus='" + answerStatus + '\'' +
                ", requestHeatLevel=" + requestHeatLevel +
                ", ecoHeatBot=" + ecoHeatBot +
                '}';
    }
}
