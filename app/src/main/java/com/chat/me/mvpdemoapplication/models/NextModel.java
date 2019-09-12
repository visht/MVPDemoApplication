package com.chat.me.mvpdemoapplication.models;

/**
 * Created by vishal on 12/09/19.
 */

public class NextModel {

    private String h_no, pincode, locality;

    public String getH_no() {
        return h_no;
    }

    public void setH_no(String h_no) {
        this.h_no = h_no;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "H.No - " + h_no + "\n pincode - " + pincode + "\n Locality - " + locality;
    }
}
