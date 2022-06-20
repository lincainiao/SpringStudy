package com.lin.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Occupation {
    @Value("model")
    private String occupation;

    @Override
    public String toString() {
        return "Occupation{" +
                "occupation='" + occupation + '\'' +
                '}';
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
