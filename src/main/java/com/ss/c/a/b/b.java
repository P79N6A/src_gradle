package com.ss.c.a.b;

import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f78293a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f78294b;

    /* renamed from: c  reason: collision with root package name */
    public int f78295c;

    /* renamed from: d  reason: collision with root package name */
    public int f78296d;

    /* renamed from: e  reason: collision with root package name */
    private a f78297e;

    /* renamed from: f  reason: collision with root package name */
    private d[] f78298f;

    public final void b() {
        this.f78296d = 0;
        this.f78297e = null;
    }

    public final d a() {
        if (this.f78298f == null || this.f78298f.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f78298f.length; i++) {
            if (this.f78298f[i].f78301a != null) {
                return this.f78298f[i];
            }
        }
        return null;
    }

    public final d a(String str) {
        if (this.f78298f == null || this.f78298f.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f78298f.length; i++) {
            if (this.f78298f[i].a() == str) {
                return this.f78298f[i];
            }
        }
        return null;
    }

    public final void a(d[] dVarArr) {
        this.f78298f = dVarArr;
        this.f78296d = 0;
        this.f78295c = 2;
        ArrayList arrayList = new ArrayList();
        for (d dVar : dVarArr) {
            if (dVar.f78301a != null) {
                arrayList.add(dVar.f78301a);
            }
            if (dVar.f78302b != null) {
                arrayList.add(dVar.f78302b);
            }
        }
        this.f78294b = new String[arrayList.size()];
        arrayList.toArray(this.f78294b);
    }

    public final String a(int i, String str, String str2) {
        if (this.f78295c == 3 || this.f78293a != null) {
            return this.f78293a.a(i, str, str2);
        }
        return null;
    }
}
