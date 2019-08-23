package com.mapbox.mapboxsdk.a;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f26386a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f26387b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f26388c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f26389d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f26390e;

    /* renamed from: f  reason: collision with root package name */
    public float f26391f;
    public boolean g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f26392a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f26393b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap f26394c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f26395d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f26396e;

        /* renamed from: f  reason: collision with root package name */
        public float f26397f;
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public List<C0303c> f26398a;

        b(C0303c... cVarArr) {
            this.f26398a = Arrays.asList(cVarArr);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.a.c$c  reason: collision with other inner class name */
    public interface C0303c {
        b a(c cVar);
    }

    static class d implements C0303c {
        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (cVar.c() + cVar.b() <= cVar.e()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            return new b(cVar.f26386a, c.a(cVar.f26388c, cVar.f26389d, cVar.f26391f), false);
        }
    }

    static class e implements C0303c {
        private e() {
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (cVar.c() + cVar.d() <= cVar.f()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            return new b(cVar.f26386a, c.a(cVar.f26388c, cVar.f26390e, cVar.f26391f), true);
        }
    }

    static class f implements C0303c {
        private f() {
        }

        /* synthetic */ f(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (cVar.b() + cVar.f26391f <= cVar.e()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new b(null, c.a(cVar.f26388c, cVar.f26389d, cVar.f26391f), false);
            }
            return null;
        }
    }

    static class g implements C0303c {
        private g() {
        }

        /* synthetic */ g(byte b2) {
            this();
        }

        public final b a(c cVar) {
            return new b(null, null, false);
        }
    }

    static class h implements C0303c {
        private h() {
        }

        /* synthetic */ h(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (cVar.d() + cVar.f26391f <= cVar.f()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new b(null, c.a(cVar.f26388c, cVar.f26390e, cVar.f26391f), true);
            }
            return null;
        }
    }

    static class i implements C0303c {
        private i() {
        }

        /* synthetic */ i(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (((float) cVar.f26387b.getWidth()) + (cVar.f26391f * 2.0f) + cVar.b() <= cVar.e()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            return new b(cVar.f26387b, c.a(cVar.f26388c, cVar.f26389d, cVar.f26391f), false);
        }
    }

    static class j implements C0303c {
        private j() {
        }

        /* synthetic */ j(byte b2) {
            this();
        }

        public final b a(c cVar) {
            boolean z;
            if (cVar.c() + cVar.d() <= cVar.f()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            return new b(cVar.f26387b, c.a(cVar.f26388c, cVar.f26390e, cVar.f26391f), true);
        }
    }

    public final float f() {
        return (float) this.f26388c.getWidth();
    }

    public final float b() {
        return ((float) this.f26389d.getMeasuredWidth()) + this.f26391f;
    }

    public final float c() {
        return ((float) this.f26386a.getWidth()) + (this.f26391f * 2.0f);
    }

    public final float d() {
        return ((float) this.f26390e.getMeasuredWidth()) + this.f26391f;
    }

    public final float e() {
        return (float) ((this.f26388c.getWidth() * 8) / 10);
    }

    public final b a() {
        b bVar = null;
        for (C0303c a2 : new b(new d((byte) 0), new e((byte) 0), new i((byte) 0), new j((byte) 0), new f((byte) 0), new h((byte) 0), new g((byte) 0)).f26398a) {
            bVar = a2.a(this);
            if (bVar != null) {
                break;
            }
        }
        this.g = bVar.f26385c;
        return bVar;
    }

    public static PointF a(Bitmap bitmap, TextView textView, float f2) {
        return new PointF(((float) (bitmap.getWidth() - textView.getMeasuredWidth())) - f2, (((float) bitmap.getHeight()) - f2) - ((float) textView.getMeasuredHeight()));
    }

    public c(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, TextView textView, TextView textView2, float f2) {
        this.f26388c = bitmap;
        this.f26386a = bitmap2;
        this.f26387b = bitmap3;
        this.f26389d = textView;
        this.f26390e = textView2;
        this.f26391f = f2;
    }
}
