package com.casc.platform.bean;

import java.io.Serializable;

public class County implements Serializable {
    Integer id;
    String area;
    Double composite;
    Integer AQI;
    Integer PM2_5;
    Integer PM_10;
    Integer SO2;
    Integer NO2;
    Integer CO;
    Integer O3_8H;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setComposite(Double composite) {
        this.composite = composite;
    }

    public void setAQI(Integer AQI) {
        this.AQI = AQI;
    }

    public void setPM2_5(Integer PM2_5) {
        this.PM2_5 = PM2_5;
    }

    public void setPM_10(Integer PM_10) {
        this.PM_10 = PM_10;
    }

    public void setSO2(Integer SO2) {
        this.SO2 = SO2;
    }

    public void setNO2(Integer NO2) {
        this.NO2 = NO2;
    }

    public void setCO(Integer CO) {
        this.CO = CO;
    }

    public void setO3_8H(Integer o3_8H) {
        O3_8H = o3_8H;
    }

    public Integer getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public Double getComposite() {
        return composite;
    }

    public Integer getAQI() {
        return AQI;
    }

    public Integer getPM2_5() {
        return PM2_5;
    }

    public Integer getPM_10() {
        return PM_10;
    }

    public Integer getSO2() {
        return SO2;
    }

    public Integer getNO2() {
        return NO2;
    }

    public Integer getCO() {
        return CO;
    }

    public Integer getO3_8H() {
        return O3_8H;
    }
}
