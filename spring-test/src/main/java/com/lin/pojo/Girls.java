package com.lin.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Girls {
    @Value("zhizhi")
    private String name;
    private Occupation occupation;
    private Uniform uniform;

    @Override
    public String toString() {
        return "Girls{" +
                "name='" + name + '\'' +
                ", occupation=" + occupation +
                ", uniform=" + uniform +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
    }
}
