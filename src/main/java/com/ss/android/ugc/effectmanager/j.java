package com.ss.android.ugc.effectmanager;

import android.support.annotation.Nullable;
import com.ss.android.ugc.effectmanager.effect.b.a;
import com.ss.android.ugc.effectmanager.effect.b.b;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.b.h;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.b.l;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.b.o;
import com.ss.android.ugc.effectmanager.effect.b.q;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, a> f77507a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<String, h> f77508b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, n> f77509c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.effectmanager.effect.b.j> f77510d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, q> f77511e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, o> f77512f = new HashMap();
    public Map<String, l> g;
    public Map<String, b> h;
    public Map<String, f> i;
    public Map<String, k> j;
    private Map<String, g> k = new HashMap();
    private Map<String, i> l = new HashMap();

    public final void a(String str, o oVar) {
        if (this.f77512f == null) {
            this.f77512f = new HashMap();
        }
        this.f77512f.put(str, oVar);
    }

    public final void a(String str, l lVar) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.put(str, lVar);
    }

    public final void a() {
        for (String put : this.f77507a.keySet()) {
            this.f77507a.put(put, null);
        }
        for (String put2 : this.k.keySet()) {
            this.k.put(put2, null);
        }
        for (String put3 : this.f77508b.keySet()) {
            this.f77508b.put(put3, null);
        }
        for (String put4 : this.l.keySet()) {
            this.l.put(put4, null);
        }
        for (String put5 : this.f77509c.keySet()) {
            this.f77509c.put(put5, null);
        }
        for (String put6 : this.f77510d.keySet()) {
            this.f77510d.put(put6, null);
        }
        for (String put7 : this.f77512f.keySet()) {
            this.f77512f.put(put7, null);
        }
        for (String put8 : this.f77511e.keySet()) {
            this.f77511e.put(put8, null);
        }
        if (this.g != null) {
            this.g.clear();
        }
    }

    @Nullable
    public final b c(String str) {
        if (this.h == null) {
            return null;
        }
        return this.h.get(str);
    }

    public final i a(String str) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        return this.l.get(str);
    }

    public final g b(String str) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        return this.k.get(str);
    }

    public final void a(String str, a aVar) {
        if (this.f77507a == null) {
            this.f77507a = new HashMap();
        }
        this.f77507a.put(str, aVar);
    }

    public final void a(String str, f fVar) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(str, fVar);
    }

    public final void a(String str, g gVar) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        this.k.put(str, gVar);
    }

    public final void a(String str, h hVar) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        this.f77508b.put(str, hVar);
    }

    public final void a(String str, i iVar) {
        if (this.l == null) {
            this.l = new HashMap();
        }
        this.l.put(str, iVar);
    }

    public final void a(String str, k kVar) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(str, kVar);
    }
}
