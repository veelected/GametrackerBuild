package com.example.xenogoldtracker;

public class bladeList {
    String bladeName;
    String bladeRole;


    public bladeList(String bladeName, String bladeRole) {
        this.bladeName = bladeName;
        this.bladeRole = bladeRole;
    }

    public String getBladeName() {
        return bladeName;
    }

    public void setBladeName(String bladeName) {
        this.bladeName = bladeName;
    }

    public String getBladeRole() {
        return bladeRole;
    }

    public void setBladeRole(String bladeRole) {
        this.bladeRole = bladeRole;
    }
}
