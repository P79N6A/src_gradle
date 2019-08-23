package com.ss.android.ugc.aweme.commerce;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("encrypt_key")
    public String encryptKey;
    @SerializedName("phone_id")
    public String phoneId;
    @SerializedName("phone_number")
    public String phoneNumber;

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public String getPhoneId() {
        return this.phoneId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEncryptKey(String str) {
        this.encryptKey = str;
    }

    public void setPhoneId(String str) {
        this.phoneId = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}
