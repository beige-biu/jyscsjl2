package com.wenyu.jyxcsjl2.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EnergyRecycleAvg {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recordDate;

    private String plcyrhsai400001f;

    private String plcyrhsai400003f;

    private String plcyrhsai400007f;

    private String plcyrhsai400011f;

    private String plcyrhsai400005f;

    private String plcyrhsai400009f;

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getPlcyrhsai400001f() {
        return plcyrhsai400001f;
    }

    public void setPlcyrhsai400001f(String plcyrhsai400001f) {
        this.plcyrhsai400001f = plcyrhsai400001f;
    }

    public String getPlcyrhsai400003f() {
        return plcyrhsai400003f;
    }

    public void setPlcyrhsai400003f(String plcyrhsai400003f) {
        this.plcyrhsai400003f = plcyrhsai400003f;
    }

    public String getPlcyrhsai400007f() {
        return plcyrhsai400007f;
    }

    public void setPlcyrhsai400007f(String plcyrhsai400007f) {
        this.plcyrhsai400007f = plcyrhsai400007f;
    }

    public String getPlcyrhsai400011f() {
        return plcyrhsai400011f;
    }

    public void setPlcyrhsai400011f(String plcyrhsai400011f) {
        this.plcyrhsai400011f = plcyrhsai400011f;
    }

    public String getPlcyrhsai400005f() {
        return plcyrhsai400005f;
    }

    public void setPlcyrhsai400005f(String plcyrhsai400005f) {
        this.plcyrhsai400005f = plcyrhsai400005f;
    }

    public String getPlcyrhsai400009f() {
        return plcyrhsai400009f;
    }

    public void setPlcyrhsai400009f(String plcyrhsai400009f) {
        this.plcyrhsai400009f = plcyrhsai400009f;
    }
}