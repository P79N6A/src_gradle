package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f27381a;

    /* renamed from: b  reason: collision with root package name */
    public final v f27382b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<T> f27383c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f27384d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27385e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27386f;
    final int g;
    final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    /* renamed from: com.squareup.picasso.a$a  reason: collision with other inner class name */
    static class C0319a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        final a f27387a;

        public C0319a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f27387a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract void a(Bitmap bitmap, s.d dVar);

    /* access modifiers changed from: package-private */
    public void b() {
        this.l = true;
    }

    /* access modifiers changed from: package-private */
    public final s.e d() {
        return this.f27382b.r;
    }

    /* access modifiers changed from: package-private */
    public final T c() {
        if (this.f27383c == null) {
            return null;
        }
        return this.f27383c.get();
    }

    a(s sVar, T t, v vVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        C0319a aVar;
        this.f27381a = sVar;
        this.f27382b = vVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C0319a(this, t, sVar.j);
        }
        this.f27383c = aVar;
        this.f27385e = i2;
        this.f27386f = i3;
        this.f27384d = z;
        this.g = i4;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }
}
