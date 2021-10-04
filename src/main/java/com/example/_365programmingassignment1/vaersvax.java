package com.example._365programmingassignment1;

public class vaersvax {
    int vaersID;
    String vaxType;
    String vaxManu;
    //String or int vaxLot and VaxDose and vaxRoute
    String vaxSite;
    String vaxName;

    public vaersvax(int vaersID, String vaxType, String vaxManu, String vaxSite, String vaxName) {
        this.vaersID = vaersID;
        this.vaxType = vaxType;
        this.vaxManu = vaxManu;
        this.vaxSite = vaxSite;
        this.vaxName = vaxName;
    }

    public vaersvax() {

    }

    //getters

    public int getVaersID() {
        return vaersID;
    }

    public String vaxManu() {
        return vaxManu;
    }

    public String getVaxSite() {
        return vaxSite;
    }

    public String getVaxName() {
        return vaxName;
    }

    public String getVaxType() {
        return vaxType;
    }

    //setters


    public void setVaersID(int vaersID) {
        this.vaersID = vaersID;
    }

    public void setVaxManu(String vaxManu) {
        this.vaxManu = vaxManu;
    }

    public void setVaxName(String vaxName) {
        this.vaxName = vaxName;
    }

    public void setVaxSite(String vaxSite) {
        this.vaxSite = vaxSite;
    }

    public void setVaxType(String vaxType) {
        this.vaxType = vaxType;
    }

    public String toString() {
        return "[" + vaersID + "," + vaxManu + "," + vaxName + "," + vaxSite + "," + vaxType + "]";

    }


}
