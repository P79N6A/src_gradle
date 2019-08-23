package com.huawei.android.pushagent.a;

public class c extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public a f24987a;

    public enum a {
        Err_unKnown,
        Err_Device,
        Err_Connect,
        Err_Read
    }

    public c() {
        this.f24987a = a.Err_unKnown;
    }

    public c(String str) {
        super(str);
        this.f24987a = a.Err_unKnown;
    }

    public c(String str, a aVar) {
        this(str);
        this.f24987a = aVar;
    }

    public c(Throwable th) {
        super(th);
        this.f24987a = a.Err_unKnown;
    }

    public c(Throwable th, a aVar) {
        this(th);
        this.f24987a = aVar;
    }
}
