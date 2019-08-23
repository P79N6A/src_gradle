package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

public final class an extends k {
    private static byte[] i;
    private static Map<String, String> j = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public byte f79432a;

    /* renamed from: b  reason: collision with root package name */
    public int f79433b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f79434c;

    /* renamed from: d  reason: collision with root package name */
    public String f79435d = "";

    /* renamed from: e  reason: collision with root package name */
    public long f79436e;

    /* renamed from: f  reason: collision with root package name */
    public String f79437f = "";
    public Map<String, String> g;
    private String h = "";

    static {
        byte[] bArr = new byte[1];
        i = bArr;
        bArr[0] = 0;
        j.put("", "");
    }

    public final void a(i iVar) {
        this.f79432a = iVar.a(this.f79432a, 0, true);
        this.f79433b = iVar.a(this.f79433b, 1, true);
        this.f79434c = iVar.c(2, false);
        this.f79435d = iVar.b(3, false);
        this.f79436e = iVar.a(this.f79436e, 4, false);
        this.h = iVar.b(5, false);
        this.f79437f = iVar.b(6, false);
        this.g = (Map) iVar.a(j, 7, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79432a, 0);
        jVar.a(this.f79433b, 1);
        if (this.f79434c != null) {
            jVar.a(this.f79434c, 2);
        }
        if (this.f79435d != null) {
            jVar.a(this.f79435d, 3);
        }
        jVar.a(this.f79436e, 4);
        if (this.h != null) {
            jVar.a(this.h, 5);
        }
        if (this.f79437f != null) {
            jVar.a(this.f79437f, 6);
        }
        if (this.g != null) {
            jVar.a(this.g, 7);
        }
    }
}
