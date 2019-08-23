package com.bytedance.ies.geckoclient.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class PackageStatisticModel {
    @SerializedName("access_key")
    private String access_key;
    @SerializedName("channel")
    private String channel;
    @SerializedName("err_code")
    private String err_code;
    @SerializedName("err_msg")
    private String err_msg;
    @SerializedName("id")
    private int id;
    @SerializedName("patch_id")
    private int patch_id;
    @SerializedName("stats_type")
    private int stats_type;

    public PackageStatisticModel() {
    }

    public String getAccess_key() {
        return this.access_key;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getErr_code() {
        return this.err_code;
    }

    public String getErr_msg() {
        return this.err_msg;
    }

    public int getId() {
        return this.id;
    }

    public int getPatch_id() {
        return this.patch_id;
    }

    public int getStats_type() {
        return this.stats_type;
    }

    public void setAccess_key(String str) {
        this.access_key = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setErr_code(String str) {
        this.err_code = str;
    }

    public void setErr_msg(String str) {
        this.err_msg = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setPatch_id(int i) {
        this.patch_id = i;
    }

    public void setStats_type(int i) {
        this.stats_type = i;
    }

    public PackageStatisticModel(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.id = i;
        this.stats_type = i2;
        this.patch_id = i3;
        this.err_code = str;
        this.err_msg = str2;
        this.channel = str3;
        this.access_key = str4;
    }
}
