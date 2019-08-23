package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class i implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private List<String> f80642b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<String> f80643c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private long f80644d = 0;

    /* renamed from: e  reason: collision with root package name */
    private long f80645e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f80646f = 0;
    private String g = null;

    public List<String> b() {
        return this.f80642b;
    }

    public List<String> d() {
        return this.f80643c;
    }

    public long e() {
        return this.f80644d;
    }

    public long f() {
        return this.f80645e;
    }

    public long g() {
        return this.f80646f;
    }

    public String h() {
        return this.g;
    }

    public String a() {
        return d.a(this.f80642b);
    }

    public String c() {
        return d.a(this.f80643c);
    }

    public i() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[key: ");
        stringBuffer.append(this.f80642b);
        stringBuffer.append("] [label: ");
        stringBuffer.append(this.f80643c);
        stringBuffer.append("][ totalTimeStamp");
        stringBuffer.append(this.g);
        stringBuffer.append("][ value");
        stringBuffer.append(this.f80645e);
        stringBuffer.append("][ count");
        stringBuffer.append(this.f80646f);
        stringBuffer.append("][ timeWindowNum");
        stringBuffer.append(this.g);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void a(long j) {
        this.f80644d = j;
    }

    public void c(long j) {
        this.f80646f = j;
    }

    public void b(long j) {
        this.f80645e = j;
    }

    public void a(List<String> list) {
        this.f80642b = list;
    }

    public void b(String str) {
        this.g = str;
    }

    public void b(List<String> list) {
        this.f80643c = list;
    }

    public void a(l lVar) {
        this.f80646f = 1;
        this.f80642b = lVar.a();
        a(lVar.b());
        this.f80645e = lVar.c();
        this.f80644d = System.currentTimeMillis();
        this.g = q.a(System.currentTimeMillis());
    }

    public void a(String str) {
        try {
            if (this.f80643c.size() < n.a().b()) {
                this.f80643c.add(str);
            } else {
                this.f80643c.remove(this.f80643c.get(0));
                this.f80643c.add(str);
            }
            if (this.f80643c.size() > n.a().b()) {
                for (int i = 0; i < this.f80643c.size() - n.a().b(); i++) {
                    this.f80643c.remove(this.f80643c.get(0));
                }
            }
        } catch (Exception unused) {
        }
    }

    public void a(f fVar, l lVar) {
        a(lVar.b());
        this.f80646f++;
        this.f80645e += lVar.c();
        this.f80644d += lVar.d();
        fVar.a(this, false);
    }

    public i(List<String> list, long j, long j2, long j3, List<String> list2, String str) {
        this.f80642b = list;
        this.f80643c = list2;
        this.f80644d = j;
        this.f80645e = j2;
        this.f80646f = j3;
        this.g = str;
    }
}
