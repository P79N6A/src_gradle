package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class ak extends k {
    private static ArrayList<aj> A = new ArrayList<>();
    private static Map<String, String> B = new HashMap();
    private static Map<String, String> C = new HashMap();
    private static Map<String, String> v = new HashMap();
    private static ai w = new ai();
    private static ah x = new ah();
    private static ArrayList<ah> y = new ArrayList<>();
    private static ArrayList<ah> z = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public String f79418a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f79419b;

    /* renamed from: c  reason: collision with root package name */
    public String f79420c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f79421d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f79422e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f79423f = "";
    public String g = "";
    public Map<String, String> h;
    public String i = "";
    public ai j;
    public int k;
    public String l = "";
    public String m = "";
    public ah n;
    public ArrayList<ah> o;
    public ArrayList<ah> p;
    public ArrayList<aj> q;
    public Map<String, String> r;
    public Map<String, String> s;
    public String t = "";
    private boolean u = true;

    static {
        v.put("", "");
        y.add(new ah());
        z.add(new ah());
        A.add(new aj());
        B.put("", "");
        C.put("", "");
    }

    public final void a(i iVar) {
        this.f79418a = iVar.b(0, true);
        this.f79419b = iVar.a(this.f79419b, 1, true);
        this.f79420c = iVar.b(2, true);
        this.f79421d = iVar.b(3, false);
        this.f79422e = iVar.b(4, false);
        this.f79423f = iVar.b(5, false);
        this.g = iVar.b(6, false);
        this.h = (Map) iVar.a(v, 7, false);
        this.i = iVar.b(8, false);
        this.j = (ai) iVar.a((k) w, 9, false);
        this.k = iVar.a(this.k, 10, false);
        this.l = iVar.b(11, false);
        this.m = iVar.b(12, false);
        this.n = (ah) iVar.a((k) x, 13, false);
        this.o = (ArrayList) iVar.a(y, 14, false);
        this.p = (ArrayList) iVar.a(z, 15, false);
        this.q = (ArrayList) iVar.a(A, 16, false);
        this.r = (Map) iVar.a(B, 17, false);
        this.s = (Map) iVar.a(C, 18, false);
        this.t = iVar.b(19, false);
        this.u = iVar.a(20, false);
    }

    public final void a(j jVar) {
        jVar.a(this.f79418a, 0);
        jVar.a(this.f79419b, 1);
        jVar.a(this.f79420c, 2);
        if (this.f79421d != null) {
            jVar.a(this.f79421d, 3);
        }
        if (this.f79422e != null) {
            jVar.a(this.f79422e, 4);
        }
        if (this.f79423f != null) {
            jVar.a(this.f79423f, 5);
        }
        if (this.g != null) {
            jVar.a(this.g, 6);
        }
        if (this.h != null) {
            jVar.a(this.h, 7);
        }
        if (this.i != null) {
            jVar.a(this.i, 8);
        }
        if (this.j != null) {
            jVar.a((k) this.j, 9);
        }
        jVar.a(this.k, 10);
        if (this.l != null) {
            jVar.a(this.l, 11);
        }
        if (this.m != null) {
            jVar.a(this.m, 12);
        }
        if (this.n != null) {
            jVar.a((k) this.n, 13);
        }
        if (this.o != null) {
            jVar.a((Collection<T>) this.o, 14);
        }
        if (this.p != null) {
            jVar.a((Collection<T>) this.p, 15);
        }
        if (this.q != null) {
            jVar.a((Collection<T>) this.q, 16);
        }
        if (this.r != null) {
            jVar.a(this.r, 17);
        }
        if (this.s != null) {
            jVar.a(this.s, 18);
        }
        if (this.t != null) {
            jVar.a(this.t, 19);
        }
        jVar.a(this.u, 20);
    }
}
