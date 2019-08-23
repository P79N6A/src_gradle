package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ap;
import com.google.common.collect.ar;
import com.google.common.collect.bg;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class br<E> extends ap<E> {

    /* renamed from: a  reason: collision with root package name */
    static final br<Object> f24701a = new br<>(new bm());

    /* renamed from: b  reason: collision with root package name */
    final transient bm<E> f24702b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f24703c;
    @LazyInit

    /* renamed from: d  reason: collision with root package name */
    private transient ar<E> f24704d;

    final class a extends ar.b<E> {
        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return br.this.f24702b.f24678c;
        }

        private a() {
        }

        public final boolean contains(@NullableDecl Object obj) {
            return br.this.contains(obj);
        }

        /* access modifiers changed from: package-private */
        public final E a(int i) {
            return br.this.f24702b.b(i);
        }

        /* synthetic */ a(br brVar, byte b2) {
            this();
        }
    }

    static class b implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            ap.a aVar = new ap.a(this.elements.length);
            for (int i = 0; i < this.elements.length; i++) {
                aVar.a(this.elements[i], this.counts[i]);
            }
            return aVar.a();
        }

        b(bg<?> bgVar) {
            int size = bgVar.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (bg.a aVar : bgVar.entrySet()) {
                this.elements[i] = aVar.getElement();
                this.counts[i] = aVar.getCount();
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f24703c;
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return new b(this);
    }

    public final ar<E> elementSet() {
        ar<E> arVar = this.f24704d;
        if (arVar != null) {
            return arVar;
        }
        a aVar = new a(this, (byte) 0);
        this.f24704d = aVar;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final bg.a<E> a(int i) {
        return this.f24702b.d(i);
    }

    public final int count(@NullableDecl Object obj) {
        return this.f24702b.b(obj);
    }

    br(bm<E> bmVar) {
        this.f24702b = bmVar;
        long j = 0;
        for (int i = 0; i < bmVar.f24678c; i++) {
            j += (long) bmVar.c(i);
        }
        this.f24703c = com.google.common.f.a.a(j);
    }
}
