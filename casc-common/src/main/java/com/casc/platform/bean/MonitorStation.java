package com.casc.platform.bean;

import java.io.Serializable;

public class MonitorStation implements Serializable {
    Integer id;
    String station;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Integer getId() {
        return id;
    }

    public String getStation() {
        return station;
    }
}
