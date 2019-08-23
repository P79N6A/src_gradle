package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.a.b;
import com.alibaba.sdk.android.httpdns.a.e;
import com.alibaba.sdk.android.httpdns.a.g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private String[] f5090a;

    /* renamed from: b  reason: collision with root package name */
    private long f5091b;

    /* renamed from: b  reason: collision with other field name */
    private String f23b;

    /* renamed from: c  reason: collision with root package name */
    private long f5092c;

    c(e eVar) {
        this.f23b = eVar.j;
        this.f5092c = com.alibaba.sdk.android.httpdns.a.c.a(eVar.l);
        if (eVar.f5085a != null && eVar.f5085a.size() > 0) {
            int size = eVar.f5085a.size();
            if (size > 0) {
                this.f5091b = com.alibaba.sdk.android.httpdns.a.c.a(eVar.f5085a.get(0).n);
                this.f5090a = new String[size];
                for (int i = 0; i < size; i++) {
                    this.f5090a[i] = eVar.f5085a.get(i).m;
                }
            }
        }
    }

    c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f23b = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ips");
        int length = jSONArray.length();
        this.f5090a = new String[length];
        for (int i = 0; i < length; i++) {
            this.f5090a[i] = jSONArray.getString(i);
        }
        this.f5091b = jSONObject.getLong("ttl");
        this.f5092c = System.currentTimeMillis() / 1000;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f5091b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public e m8a() {
        e eVar = new e();
        eVar.j = this.f23b;
        eVar.l = String.valueOf(this.f5092c);
        eVar.k = b.g();
        if (this.f5090a != null && this.f5090a.length > 0) {
            eVar.f5085a = new ArrayList<>();
            for (String str : this.f5090a) {
                g gVar = new g();
                gVar.m = str;
                gVar.n = String.valueOf(this.f5091b);
                eVar.f5085a.add(gVar);
            }
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public String[] m9a() {
        return this.f5090a;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f5092c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public boolean m10b() {
        return b() + a() < System.currentTimeMillis() / 1000;
    }

    public String toString() {
        String str = "host: " + this.f23b + " ip cnt: " + this.f5090a.length + " ttl: " + this.f5091b;
        for (int i = 0; i < this.f5090a.length; i++) {
            str = str + "\n ip: " + this.f5090a[i];
        }
        return str;
    }
}
