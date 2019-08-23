package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class v {
    private static final long s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    int f27461a;

    /* renamed from: b  reason: collision with root package name */
    long f27462b;

    /* renamed from: c  reason: collision with root package name */
    int f27463c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f27464d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27465e;

    /* renamed from: f  reason: collision with root package name */
    public final String f27466f;
    public final List<ab> g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final Bitmap.Config q;
    public final s.e r;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27467a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f27468b;

        /* renamed from: c  reason: collision with root package name */
        public List<ab> f27469c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap.Config f27470d;

        /* renamed from: e  reason: collision with root package name */
        private Uri f27471e;

        /* renamed from: f  reason: collision with root package name */
        private int f27472f;
        private String g;
        private int h;
        private int i;
        private boolean j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private s.e o;

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f27471e == null && this.f27472f == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (this.h == 0 && this.i == 0) {
                return false;
            }
            return true;
        }

        public final v c() {
            if (this.f27468b && this.f27467a) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f27467a && this.h == 0 && this.i == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f27468b && this.h == 0 && this.i == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.o == null) {
                    this.o = s.e.NORMAL;
                }
                v vVar = r2;
                v vVar2 = new v(this.f27471e, this.f27472f, this.g, this.f27469c, this.h, this.i, this.f27467a, this.f27468b, this.j, this.k, this.l, this.m, this.n, this.f27470d, this.o, (byte) 0);
                return vVar;
            }
        }

        public final a a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.h = i2;
                this.i = i3;
                return this;
            }
        }

        a(Uri uri, int i2, Bitmap.Config config) {
            this.f27471e = uri;
            this.f27472f = i2;
            this.f27470d = config;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.h == 0 && this.i == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return "[R" + this.f27461a + ']';
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (c() || this.m != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        long nanoTime = System.nanoTime() - this.f27462b;
        if (nanoTime > s) {
            return b() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return b() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        if (this.f27465e > 0) {
            sb.append(this.f27465e);
        } else {
            sb.append(this.f27464d);
        }
        if (this.g != null && !this.g.isEmpty()) {
            for (ab a2 : this.g) {
                sb.append(' ');
                sb.append(a2.a());
            }
        }
        if (this.f27466f != null) {
            sb.append(" stableKey(");
            sb.append(this.f27466f);
            sb.append(')');
        }
        if (this.h > 0) {
            sb.append(" resize(");
            sb.append(this.h);
            sb.append(',');
            sb.append(this.i);
            sb.append(')');
        }
        if (this.j) {
            sb.append(" centerCrop");
        }
        if (this.k) {
            sb.append(" centerInside");
        }
        if (this.m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.m);
            if (this.p) {
                sb.append(" @ ");
                sb.append(this.n);
                sb.append(',');
                sb.append(this.o);
            }
            sb.append(')');
        }
        if (this.q != null) {
            sb.append(' ');
            sb.append(this.q);
        }
        sb.append('}');
        return sb.toString();
    }

    private v(Uri uri, int i2, String str, List<ab> list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Bitmap.Config config, s.e eVar) {
        this.f27464d = uri;
        this.f27465e = i2;
        this.f27466f = str;
        if (list == null) {
            this.g = null;
        } else {
            this.g = Collections.unmodifiableList(list);
        }
        this.h = i3;
        this.i = i4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = z4;
        this.q = config;
        this.r = eVar;
    }

    /* synthetic */ v(Uri uri, int i2, String str, List list, int i3, int i4, boolean z, boolean z2, boolean z3, float f2, float f3, float f4, boolean z4, Bitmap.Config config, s.e eVar, byte b2) {
        this(uri, i2, str, list, i3, i4, z, z2, z3, f2, f3, f4, z4, config, eVar);
    }
}
