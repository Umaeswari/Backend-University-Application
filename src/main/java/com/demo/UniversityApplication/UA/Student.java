package com.demo.UniversityApplication.UA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;

    private int score;
    private int hallTicket;


    public Student(String name, int score, int hallTicket) {
        this.name = name;
        this.score = score;
        this.hallTicket = hallTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHallTicket() {
        return hallTicket;
    }

    public void setHallTicket(int hallTicket) {
        this.hallTicket = hallTicket;
    }
}
