package com.bytedance.android.livesdk.effect.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class LocalFilterModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int coverResId;
    private String filterFilePath;
    private String id;
    private String name;

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i) {
        this.coverResId = i;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i, String str2, String str3) {
        this.id = str;
        this.coverResId = i;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
