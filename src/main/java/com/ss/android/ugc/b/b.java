package com.ss.android.ugc.b;

import android.content.Context;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.b.a.c;
import com.ss.android.ugc.b.d.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77129a;

    /* renamed from: b  reason: collision with root package name */
    public a f77130b = new a();

    public final void a() {
        if (this.f77130b != null) {
            this.f77130b.a();
        }
    }

    public final void b() {
        if (this.f77130b != null) {
            this.f77130b.b();
        }
    }

    public b() {
        Context context = c.a().f77144c;
        if (this.f77130b != null) {
            this.f77130b.g = context;
        }
        String a2 = c.a().f77143b.a();
        String b2 = c.a().b();
        if (!a.a(a2)) {
            a.a(a2, false);
        }
        if (!a.a(b2)) {
            a.a(b2, false);
        }
        if (this.f77130b != null) {
            this.f77130b.h = b2;
        }
    }

    public final void a(com.ss.android.ugc.b.b.a aVar) {
        a(aVar, true);
    }

    public final void a(d dVar) {
        if (this.f77130b != null) {
            this.f77130b.f77154c = dVar;
        }
    }

    public final void b(com.ss.android.ugc.b.b.a aVar) {
        if (aVar.f77132b == 4 && this.f77130b != null) {
            if (this.f77129a) {
                this.f77130b.b(aVar);
                return;
            }
            this.f77130b.a(aVar);
        }
    }

    public final void a(com.ss.android.ugc.b.a.a aVar) {
        if (this.f77130b != null) {
            this.f77130b.f77153b = aVar;
        }
    }

    public final void a(com.ss.android.ugc.b.a.b bVar) {
        if (this.f77130b != null) {
            this.f77130b.f77156e = bVar;
        }
    }

    public final void a(c cVar) {
        if (this.f77130b != null) {
            this.f77130b.f77157f = cVar;
        }
    }

    public final void a(com.ss.android.ugc.b.a.d dVar) {
        if (this.f77130b != null) {
            this.f77130b.f77152a = dVar;
        }
    }

    public final void a(com.ss.android.ugc.b.b.a aVar, boolean z) {
        if (!(aVar == null || aVar.f77132b != 4 || this.f77130b == null)) {
            this.f77130b.a(aVar, z);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if (this.f77130b != null) {
            this.f77130b.a(str2, z);
        }
    }
}
