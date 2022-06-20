package com.lin.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Uniform {
    @Value("black and white")
    private String uniform;

    @Override
    public String toString() {
        return "Uniform{" +
                "uniform='" + uniform + '\'' +
                '}';
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }
}
