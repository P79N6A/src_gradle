package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.s;
import com.squareup.picasso.v;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.concurrent.atomic.AtomicInteger;

public final class w {
    private static final AtomicInteger h = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final v.a f27473a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27474b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27475c;

    /* renamed from: d  reason: collision with root package name */
    public int f27476d;

    /* renamed from: e  reason: collision with root package name */
    public int f27477e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f27478f;
    public Drawable g;
    private final s i;
    private boolean j;
    private int k;
    private int l;
    private Object m;

    w() {
        this.f27475c = true;
        this.f27473a = new v.a(null, 0, null);
    }

    private Drawable a() {
        if (this.f27476d != 0) {
            return a.a(this.i.f27440d.getResources(), this.f27476d);
        }
        return this.f27478f;
    }

    private v a(long j2) {
        int andIncrement = h.getAndIncrement();
        v c2 = this.f27473a.c();
        c2.f27461a = andIncrement;
        c2.f27462b = j2;
        boolean z = this.i.m;
        if (z) {
            c2.b();
        }
        v a2 = this.i.a(c2);
        if (a2 != c2) {
            a2.f27461a = andIncrement;
            a2.f27462b = j2;
            if (z) {
                a2.a();
                new StringBuilder("into ").append(a2);
            }
        }
        return a2;
    }

    public final w a(int i2, int i3) {
        this.f27473a.a(i2, i3);
        return this;
    }

    public final w a(o oVar, o... oVarArr) {
        if (oVar != null) {
            this.k = oVar.index | this.k;
            int i2 = 0;
            while (i2 <= 0) {
                o oVar2 = oVarArr[0];
                if (oVar2 != null) {
                    this.k = oVar2.index | this.k;
                    i2++;
                } else {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public final w a(p pVar, p... pVarArr) {
        if (pVar != null) {
            this.l = pVar.index | this.l;
            int i2 = 0;
            while (i2 <= 0) {
                p pVar2 = pVarArr[0];
                if (pVar2 != null) {
                    this.l = pVar2.index | this.l;
                    i2++;
                } else {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    public final void a(ImageView imageView, e eVar) {
        ImageView imageView2 = imageView;
        e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        ad.a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f27473a.a()) {
            this.i.a(imageView2);
            if (this.f27475c) {
                t.a(imageView2, a());
            }
        } else {
            if (this.f27474b) {
                if (!this.f27473a.b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f27475c) {
                            t.a(imageView2, a());
                        }
                        this.i.a(imageView2, new h(this, imageView2, eVar2));
                        return;
                    }
                    this.f27473a.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            v a2 = a(nanoTime);
            String a3 = ad.a(a2);
            if (o.shouldReadFromMemoryCache(this.k)) {
                Bitmap a4 = this.i.a(a3);
                if (a4 != null) {
                    this.i.a(imageView2);
                    t.a(imageView, this.i.f27440d, a4, s.d.MEMORY, this.j, this.i.l);
                    if (this.i.m) {
                        a2.b();
                        new StringBuilder("from ").append(s.d.MEMORY);
                    }
                    if (eVar2 != null) {
                        eVar.a();
                    }
                    return;
                }
            }
            if (this.f27475c) {
                t.a(imageView2, a());
            }
            k kVar = new k(this.i, imageView, a2, this.k, this.l, this.f27477e, this.g, a3, this.m, eVar, this.j);
            this.i.a((a) kVar);
        }
    }

    public w(s sVar, Uri uri, int i2) {
        this.f27475c = true;
        if (!sVar.n) {
            this.i = sVar;
            this.f27473a = new v.a(uri, i2, sVar.k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }
}
