package com.amap.api.services.core;

import com.amap.api.services.a.ai;
import com.amap.api.services.a.bh;
import com.amap.api.services.a.j;

public class ServiceSettings {

    /* renamed from: c  reason: collision with root package name */
    private static ServiceSettings f6990c;

    /* renamed from: a  reason: collision with root package name */
    private String f6991a = "zh-CN";

    /* renamed from: b  reason: collision with root package name */
    private int f6992b = 1;

    /* renamed from: d  reason: collision with root package name */
    private int f6993d = 20000;

    /* renamed from: e  reason: collision with root package name */
    private int f6994e = 20000;

    public int getConnectionTimeOut() {
        return this.f6993d;
    }

    public String getLanguage() {
        return this.f6991a;
    }

    public int getProtocol() {
        return this.f6992b;
    }

    public int getSoTimeOut() {
        return this.f6994e;
    }

    public static ServiceSettings getInstance() {
        if (f6990c == null) {
            f6990c = new ServiceSettings();
        }
        return f6990c;
    }

    public void destroyInnerAsynThreadPool() {
        try {
            ai.b();
        } catch (Throwable th) {
            j.a(th, "ServiceSettings", "destroyInnerAsynThreadPool");
        }
    }

    private ServiceSettings() {
    }

    public void setApiKey(String str) {
        bh.a(str);
    }

    public void setProtocol(int i) {
        this.f6992b = i;
    }

    public void setConnectionTimeOut(int i) {
        if (i < 5000) {
            this.f6993d = 5000;
        } else if (i > 30000) {
            this.f6993d = 30000;
        } else {
            this.f6993d = i;
        }
    }

    public void setLanguage(String str) {
        if ("en".equals(str) || "zh-CN".equals(str)) {
            this.f6991a = str;
        }
    }

    public void setSoTimeOut(int i) {
        if (i < 5000) {
            this.f6994e = 5000;
        } else if (i > 30000) {
            this.f6994e = 30000;
        } else {
            this.f6994e = i;
        }
    }
}
