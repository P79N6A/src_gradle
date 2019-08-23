package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

public final class am extends k {
    private static byte[] y;
    private static Map<String, String> z = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f79426a;

    /* renamed from: b  reason: collision with root package name */
    public String f79427b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f79428c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f79429d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f79430e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f79431f = "";
    public int g;
    public byte[] h;
    public String i = "";
    public String j = "";
    public Map<String, String> k;
    public String l = "";
    public long m;
    public String n = "";
    public String o = "";
    public String p = "";
    public long q;
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    private String x = "";

    static {
        byte[] bArr = new byte[1];
        y = bArr;
        bArr[0] = 0;
        z.put("", "");
    }

    public final void a(i iVar) {
        this.f79426a = iVar.a(this.f79426a, 0, true);
        this.f79427b = iVar.b(1, true);
        this.f79428c = iVar.b(2, true);
        this.f79429d = iVar.b(3, true);
        this.f79430e = iVar.b(4, false);
        this.f79431f = iVar.b(5, true);
        this.g = iVar.a(this.g, 6, true);
        this.h = iVar.c(7, true);
        this.i = iVar.b(8, false);
        this.j = iVar.b(9, false);
        this.k = (Map) iVar.a(z, 10, false);
        this.l = iVar.b(11, false);
        this.m = iVar.a(this.m, 12, false);
        this.n = iVar.b(13, false);
        this.o = iVar.b(14, false);
        this.p = iVar.b(15, false);
        this.q = iVar.a(this.q, 16, false);
        this.r = iVar.b(17, false);
        this.s = iVar.b(18, false);
        this.t = iVar.b(19, false);
        this.u = iVar.b(20, false);
        this.v = iVar.b(21, false);
        this.w = iVar.b(22, false);
        this.x = iVar.b(23, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79426a, 0);
        jVar.a(this.f79427b, 1);
        jVar.a(this.f79428c, 2);
        jVar.a(this.f79429d, 3);
        if (this.f79430e != null) {
            jVar.a(this.f79430e, 4);
        }
        jVar.a(this.f79431f, 5);
        jVar.a(this.g, 6);
        jVar.a(this.h, 7);
        if (this.i != null) {
            jVar.a(this.i, 8);
        }
        if (this.j != null) {
            jVar.a(this.j, 9);
        }
        if (this.k != null) {
            jVar.a(this.k, 10);
        }
        if (this.l != null) {
            jVar.a(this.l, 11);
        }
        jVar.a(this.m, 12);
        if (this.n != null) {
            jVar.a(this.n, 13);
        }
        if (this.o != null) {
            jVar.a(this.o, 14);
        }
        if (this.p != null) {
            jVar.a(this.p, 15);
        }
        jVar.a(this.q, 16);
        if (this.r != null) {
            jVar.a(this.r, 17);
        }
        if (this.s != null) {
            jVar.a(this.s, 18);
        }
        if (this.t != null) {
            jVar.a(this.t, 19);
        }
        if (this.u != null) {
            jVar.a(this.u, 20);
        }
        if (this.v != null) {
            jVar.a(this.v, 21);
        }
        if (this.w != null) {
            jVar.a(this.w, 22);
        }
        if (this.x != null) {
            jVar.a(this.x, 23);
        }
    }
}
