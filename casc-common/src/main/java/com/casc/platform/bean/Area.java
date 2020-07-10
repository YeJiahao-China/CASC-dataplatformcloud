package com.casc.platform.bean;

import java.io.Serializable;

public class Area implements Serializable {
    Integer id;
    String area;
    Integer stationid;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public Integer getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public Integer getStationid() {
        return stationid;
    }
}
