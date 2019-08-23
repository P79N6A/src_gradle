package com.tt.miniapphost.entity;

import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;
import org.json.JSONObject;

@AnyProcess
public class PreLoadAppEntity {
    private String appid;
    private String appmd5;
    private int apptype;
    @Nullable
    private String appurl;
    @Nullable
    private String appversion;
    private int downloadtype;
    @Nullable
    private JSONObject extsrclist;

    @AnyProcess
    public String getAppid() {
        return this.appid;
    }

    @AnyProcess
    public String getAppmd5() {
        return this.appmd5;
    }

    @AnyProcess
    public int getApptype() {
        return this.apptype;
    }

    @Nullable
    @AnyProcess
    public String getAppurl() {
        return this.appurl;
    }

    @Nullable
    @AnyProcess
    public String getAppversion() {
        return this.appversion;
    }

    @AnyProcess
    public int getDownloadtype() {
        return this.downloadtype;
    }

    @AnyProcess
    public void setAppid(String str) {
        this.appid = str;
    }

    @AnyProcess
    public void setAppmd5(String str) {
        this.appmd5 = str;
    }

    @AnyProcess
    public void setApptype(int i) {
        this.apptype = i;
    }

    @AnyProcess
    public void setAppurl(@Nullable String str) {
        this.appurl = str;
    }

    @AnyProcess
    public void setAppversion(@Nullable String str) {
        this.appversion = str;
    }

    @AnyProcess
    public void setDownloadtype(int i) {
        this.downloadtype = i;
    }

    @AnyProcess
    public void setExtsrclist(@Nullable JSONObject jSONObject) {
        this.extsrclist = jSONObject;
    }
}
