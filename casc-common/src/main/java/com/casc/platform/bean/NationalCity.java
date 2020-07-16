package com.casc.platform.bean;

import java.io.Serializable;

public class NationalCity implements Serializable {
    int id;
    String cityname;
    double composite;
    int AQI;
    int PM2_5;
    int PM_10;
    int SO2;
    int NO2;
    int CO;
    int O3_8H;
    int O3;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setComposite(double composite) {
        this.composite = composite;
    }

    public void setAQI(int AQI) {
        this.AQI = AQI;
    }

    public void setPM2_5(int PM2_5) {
        this.PM2_5 = PM2_5;
    }

    public void setPM_10(int PM_10) {
        this.PM_10 = PM_10;
    }

    public void setSO2(int SO2) {
        this.SO2 = SO2;
    }

    public void setNO2(int NO2) {
        this.NO2 = NO2;
    }

    public void setCO(int CO) {
        this.CO = CO;
    }

    public void setO3_8H(int o3_8H) {
        O3_8H = o3_8H;
    }

    public void setO3(int o3) {
        O3 = o3;
    }

    public int getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    public double getComposite() {
        return composite;
    }

    public int getAQI() {
        return AQI;
    }

    public int getPM2_5() {
        return PM2_5;
    }

    public int getPM_10() {
        return PM_10;
    }

    public int getSO2() {
        return SO2;
    }

    public int getNO2() {
        return NO2;
    }

    public int getCO() {
        return CO;
    }

    public int getO3_8H() {
        return O3_8H;
    }

    public int getO3() {
        return O3;
    }
}
