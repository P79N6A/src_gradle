package com.amap.api.mapcore2d;

import android.content.Context;
import java.util.Map;

public final class ga extends eq {

    /* renamed from: f  reason: collision with root package name */
    Map<String, String> f6213f;
    String g = "";
    byte[] h;
    byte[] i;
    boolean j;
    String k;
    Map<String, String> l;
    boolean m;

    public ga(Context context, cy cyVar) {
        super(context, cyVar);
    }

    public final void a(String str) {
        this.k = str;
    }

    public final void a(Map<String, String> map) {
        this.l = map;
    }

    public final void b(String str) {
        this.g = str;
    }

    public final void b(Map<String, String> map) {
        this.f6213f = map;
    }

    public final void b(byte[] bArr) {
        this.h = bArr;
    }

    public final byte[] b() {
        return this.h;
    }

    public final byte[] c() {
        return this.i;
    }

    public final Map<String, String> e() {
        return this.f6213f;
    }

    public final Map<String, String> f() {
        return this.l;
    }

    public final String g() {
        return this.g;
    }

    public final boolean h() {
        return this.j;
    }

    public final String j() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final boolean k() {
        return this.m;
    }

    public final void n() {
        this.j = true;
    }

    public final void o() {
        this.m = true;
    }
}
