package com.zut.zyg.pojo;

public class Car {
    private String band;
    private String color;
    private float outputVolume;

//    public Car(String band, String color, float outputVolume) {
//        this.band = band;
//        this.color = color;
//        this.outputVolume = outputVolume;
//    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getOutputVolume() {
        return outputVolume;
    }

    public void setOutputVolume(float outputVolume) {
        this.outputVolume = outputVolume;
    }
}
