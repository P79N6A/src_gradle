package com.ss.android.common.config;

import com.meituan.robust.ChangeQuickRedirect;

public class ConnectHost {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String host;
    private String schema;
    private int weight;

    public String getHost() {
        return this.host;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }
}
