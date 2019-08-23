package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

public final class aq extends k {
    private static Map<String, String> i = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public long f79446a;

    /* renamed from: b  reason: collision with root package name */
    public byte f79447b;

    /* renamed from: c  reason: collision with root package name */
    public String f79448c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f79449d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f79450e = "";

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f79451f;
    public String g = "";
    public boolean h = true;

    static {
        i.put("", "");
    }

    public final void a(i iVar) {
        this.f79446a = iVar.a(this.f79446a, 0, true);
        this.f79447b = iVar.a(this.f79447b, 1, true);
        this.f79448c = iVar.b(2, false);
        this.f79449d = iVar.b(3, false);
        this.f79450e = iVar.b(4, false);
        this.f79451f = (Map) iVar.a(i, 5, false);
        this.g = iVar.b(6, false);
        this.h = iVar.a(7, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79446a, 0);
        jVar.a(this.f79447b, 1);
        if (this.f79448c != null) {
            jVar.a(this.f79448c, 2);
        }
        if (this.f79449d != null) {
            jVar.a(this.f79449d, 3);
        }
        if (this.f79450e != null) {
            jVar.a(this.f79450e, 4);
        }
        if (this.f79451f != null) {
            jVar.a(this.f79451f, 5);
        }
        if (this.g != null) {
            jVar.a(this.g, 6);
        }
        jVar.a(this.h, 7);
    }
}
