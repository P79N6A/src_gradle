package com.ss.android.sdk.activity.a;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class a implements Serializable {
    @SerializedName("ad_landing_page_auto_jump_allow_list")
    List<String> autoJumpAllowList;
    @SerializedName("ad_landing_page_auto_jump_intercept_list")
    List<String> autoJumpInterceptList;
    @SerializedName("ad_landing_page_click_jump_interval")
    int autoJumpInterval;
    @SerializedName("ad_landing_page_click_jump_interval_tips")
    String autoJumpIntervalTips;
    @SerializedName("ad_landing_page_click_jump_control_enabled")
    boolean clickControlEnabled = true;
    @SerializedName("ad_landing_page_click_jump_allow_list")
    List<String> clickJumpAllowList;
    @SerializedName("ad_landing_page_auto_jump_control_enabled")
    boolean jumpControlEnabled = true;
    @SerializedName("ad_landing_page_pause_list")
    List<String> pauseList;

    public List<String> getAutoJumpAllowList() {
        return this.autoJumpAllowList;
    }

    public List<String> getAutoJumpInterceptList() {
        return this.autoJumpInterceptList;
    }

    public int getAutoJumpInterval() {
        return this.autoJumpInterval;
    }

    public String getAutoJumpIntervalTips() {
        return this.autoJumpIntervalTips;
    }

    public List<String> getClickJumpAllowList() {
        return this.clickJumpAllowList;
    }

    public List<String> getPauseList() {
        return this.pauseList;
    }

    public boolean isClickControlEnabled() {
        return this.clickControlEnabled;
    }

    public boolean isJumpControlEnabled() {
        return this.jumpControlEnabled;
    }

    public void setAutoJumpAllowList(List<String> list) {
        this.autoJumpAllowList = list;
    }

    public void setAutoJumpInterceptList(List<String> list) {
        this.autoJumpInterceptList = list;
    }

    public void setAutoJumpInterval(int i) {
        this.autoJumpInterval = i;
    }

    public void setAutoJumpIntervalTips(String str) {
        this.autoJumpIntervalTips = str;
    }

    public void setClickControlEnabled(boolean z) {
        this.clickControlEnabled = z;
    }

    public void setClickJumpAllowList(List<String> list) {
        this.clickJumpAllowList = list;
    }

    public void setJumpControlEnabled(boolean z) {
        this.jumpControlEnabled = z;
    }

    public void setPauseList(List<String> list) {
        this.pauseList = list;
    }
}
