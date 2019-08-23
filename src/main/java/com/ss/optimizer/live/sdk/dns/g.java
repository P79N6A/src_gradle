package com.ss.optimizer.live.sdk.dns;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f78450a;

    /* renamed from: b  reason: collision with root package name */
    public j f78451b;

    /* renamed from: c  reason: collision with root package name */
    final List<String> f78452c = new ArrayList(10);

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, h> f78453d = new ArrayMap();

    /* renamed from: e  reason: collision with root package name */
    final List<String> f78454e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public String f78455f = null;
    private final Random g;
    private j h;

    /* access modifiers changed from: package-private */
    public final String a() {
        if (this.f78454e != null && !this.f78454e.isEmpty()) {
            return this.f78454e.get(this.g.nextInt(this.f78454e.size()));
        }
        if (this.h != null && this.h.f78465b != null && !this.h.f78465b.isEmpty()) {
            return this.h.f78465b.get(this.g.nextInt(this.h.f78465b.size()));
        }
        if (this.f78451b == null || this.f78451b.f78465b == null || this.f78451b.f78465b.isEmpty()) {
            return null;
        }
        return this.f78451b.f78465b.get(this.g.nextInt(this.f78451b.f78465b.size()));
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        this.f78452c.clear();
        if (this.h == null || this.f78451b == null) {
            return false;
        }
        if (this.h.f78465b.size() > 5) {
            this.f78452c.addAll(this.h.f78465b.subList(0, 5));
        } else {
            this.f78452c.addAll(this.h.f78465b);
        }
        ArrayList arrayList = new ArrayList(this.f78451b.f78465b);
        arrayList.removeAll(this.h.f78465b);
        int size = 10 - this.f78452c.size();
        if (arrayList.size() >= size) {
            this.f78452c.addAll(arrayList.subList(0, size));
        } else {
            this.f78452c.addAll(arrayList);
            int size2 = 10 - this.f78452c.size();
            if (this.h.f78465b.size() - 5 > size2) {
                this.f78452c.addAll(this.h.f78465b.subList(5, size2 + 5));
            } else if (this.h.f78465b.size() - 5 > 0) {
                this.f78452c.addAll(this.h.f78465b.subList(5, this.h.f78465b.size()));
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(j jVar) {
        this.h = jVar;
        return b();
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        if (this.h.f78465b.contains(str)) {
            return this.f78455f;
        }
        return "local_dns";
    }

    g(String str) {
        this.f78450a = str;
        this.g = new Random(System.currentTimeMillis());
    }
}
