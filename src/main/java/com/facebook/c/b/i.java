package com.facebook.c.b;

import com.facebook.c.b.a.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f23371a;

    /* renamed from: b  reason: collision with root package name */
    public final c f23372b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public j f23373a;

        /* renamed from: b  reason: collision with root package name */
        public j f23374b;

        public final i a() {
            return new i(this.f23373a, this.f23374b);
        }
    }

    public i(j jVar, j jVar2) {
        boolean z;
        boolean z2 = false;
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f23371a = c.a((j) com.facebook.c.c.c.a(jVar, z, "color_start"), c.b.START);
        this.f23372b = c.a((j) com.facebook.c.c.c.a(jVar2, jVar2 != null ? true : z2, "color_end"), c.b.END);
    }
}
