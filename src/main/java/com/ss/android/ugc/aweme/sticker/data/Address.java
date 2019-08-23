package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class Address implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address")
    public String address;
    @SerializedName("city")
    public String city;
    @SerializedName("district")
    public String district;
    @SerializedName("province")
    public String provice;
    @SerializedName("simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
