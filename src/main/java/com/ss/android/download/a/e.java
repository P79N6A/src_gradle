package com.ss.android.download.a;

import java.lang.ref.SoftReference;
import java.util.HashMap;

public final class e<K, V> implements d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a f28436a;

    /* renamed from: b  reason: collision with root package name */
    public final a f28437b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<K, a> f28438c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28439d;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public a f28440a;

        /* renamed from: b  reason: collision with root package name */
        public a f28441b;

        /* renamed from: c  reason: collision with root package name */
        K f28442c;

        /* renamed from: d  reason: collision with root package name */
        SoftReference<V> f28443d;

        a() {
        }
    }

    public e() {
        this(16);
    }

    private static void a(a aVar) {
        aVar.f28440a.f28441b = aVar.f28441b;
        aVar.f28441b.f28440a = aVar.f28440a;
        aVar.f28441b = null;
        aVar.f28440a = null;
    }

    public e(int i) {
        this.f28438c = new HashMap<>();
        if (i > 1) {
            this.f28439d = i;
            this.f28436a = new a<>();
            this.f28437b = new a<>();
            this.f28436a.f28441b = this.f28437b;
            this.f28437b.f28440a = this.f28436a;
            return;
        }
        throw new IllegalArgumentException("capacity must be great than one");
    }

    public final V a(K k) {
        a aVar = this.f28438c.get(k);
        if (aVar == null) {
            return null;
        }
        V v = aVar.f28443d.get();
        if (v == null) {
            this.f28438c.remove(k);
            if (!(aVar.f28440a == null || aVar.f28441b == null)) {
                a(aVar);
            }
            return null;
        }
        if (!(aVar.f28440a == null || aVar.f28441b == null || aVar.f28440a == this.f28436a)) {
            a(aVar);
            a(this.f28436a, aVar);
        }
        return v;
    }

    public final void a(int i) {
        while (this.f28438c.size() > 8 && this.f28437b.f28440a != this.f28436a) {
            this.f28438c.remove(this.f28437b.f28440a.f28442c);
            a(this.f28437b.f28440a);
        }
    }

    private static void a(a aVar, a aVar2) {
        aVar2.f28440a = aVar;
        aVar2.f28441b = aVar.f28441b;
        aVar2.f28441b.f28440a = aVar2;
        aVar.f28441b = aVar2;
    }

    public final void a(K k, V v) {
        if (k != null && v != null) {
            a aVar = this.f28438c.get(k);
            if (aVar != null) {
                if (v != aVar.f28443d.get()) {
                    aVar.f28443d = new SoftReference<>(v);
                }
                aVar.f28442c = k;
                if (!(aVar.f28440a == null || aVar.f28441b == null || aVar.f28440a == this.f28436a)) {
                    a(aVar);
                    a(this.f28436a, aVar);
                }
                return;
            }
            a aVar2 = new a();
            aVar2.f28442c = k;
            aVar2.f28443d = new SoftReference<>(v);
            this.f28438c.put(k, aVar2);
            a(this.f28436a, aVar2);
            if (this.f28438c.size() > this.f28439d && this.f28437b.f28440a != this.f28436a) {
                this.f28438c.remove(this.f28437b.f28440a.f28442c);
                a(this.f28437b.f28440a);
            }
        }
    }
}
