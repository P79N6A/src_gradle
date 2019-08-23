package com.amap.api.services.a;

import java.io.File;

public class dz extends ec {

    /* renamed from: b  reason: collision with root package name */
    private int f6857b;

    /* renamed from: c  reason: collision with root package name */
    private String f6858c;

    /* access modifiers changed from: protected */
    public boolean a() {
        if (a(this.f6858c) < this.f6857b) {
            return false;
        }
        return true;
    }

    public int a(String str) {
        int i;
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            i = file.list().length;
            return i;
        } catch (Throwable th) {
            ca.c(th, "fus", "gfn");
            i = 0;
        }
    }

    public dz(int i, String str, ec ecVar) {
        super(ecVar);
        this.f6857b = i;
        this.f6858c = str;
    }
}
