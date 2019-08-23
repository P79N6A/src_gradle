package com.mapbox.mapboxsdk.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.c;
import com.mapbox.android.gestures.f;
import com.mapbox.android.gestures.j;
import com.mapbox.android.gestures.k;
import com.mapbox.android.gestures.m;
import com.mapbox.android.gestures.n;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.o;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ab f26662a;

    /* renamed from: b  reason: collision with root package name */
    public final ac f26663b;

    /* renamed from: c  reason: collision with root package name */
    public final b f26664c;

    /* renamed from: d  reason: collision with root package name */
    public final f f26665d;

    /* renamed from: e  reason: collision with root package name */
    public o.m f26666e;

    /* renamed from: f  reason: collision with root package name */
    public o.n f26667f;
    final CopyOnWriteArrayList<Object> g = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<Object> h = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<Object> i = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<Object> j = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<Object> k = new CopyOnWriteArrayList<>();
    final CopyOnWriteArrayList<Object> l = new CopyOnWriteArrayList<>();
    public PointF m;
    public AndroidGesturesManager n;
    public boolean o;
    public Animator p;
    public Animator q;
    final List<Animator> r = new ArrayList();
    Handler s = new Handler();
    private final x t;
    private final CopyOnWriteArrayList<o.m> u = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<o.n> v = new CopyOnWriteArrayList<>();
    private Runnable w = new Runnable() {
        public final void run() {
            l.this.a();
        }
    };

    final class a extends c.b {
        private a() {
        }

        public final void b(com.mapbox.android.gestures.c cVar) {
            l.this.b();
            Iterator<Object> it2 = l.this.i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }

        public final boolean a(com.mapbox.android.gestures.c cVar) {
            if (!l.this.f26663b.h) {
                return false;
            }
            l.this.c();
            l.this.a("Pan", cVar.m);
            Iterator<Object> it2 = l.this.i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        /* synthetic */ a(l lVar, byte b2) {
            this();
        }

        public final boolean a(com.mapbox.android.gestures.c cVar, float f2, float f3) {
            if (!(f2 == 0.0f && f3 == 0.0f)) {
                l.this.f26665d.a(1);
                l.this.f26662a.a((double) (-f2), (double) (-f3), 0);
                Iterator<Object> it2 = l.this.h.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                Iterator<Object> it3 = l.this.i.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
            }
            return true;
        }
    }

    final class b extends j.b {

        /* renamed from: a  reason: collision with root package name */
        public PointF f26673a;

        /* renamed from: c  reason: collision with root package name */
        private final float f26675c;

        /* renamed from: d  reason: collision with root package name */
        private final float f26676d;

        /* renamed from: e  reason: collision with root package name */
        private final float f26677e;

        private void b(j jVar) {
            if (l.this.m != null) {
                this.f26673a = l.this.m;
            } else {
                this.f26673a = jVar.m;
            }
        }

        public final boolean a(j jVar) {
            if (!l.this.f26663b.f26610e) {
                return false;
            }
            l.this.c();
            if (l.this.f26663b.o) {
                l.this.n.f25938d.u = this.f26675c;
                l.this.n.f25938d.h();
            }
            b(jVar);
            l.this.a("Rotation", this.f26673a);
            Iterator<Object> it2 = l.this.j.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        public final boolean a(j jVar, float f2) {
            l.this.f26665d.a(1);
            b(jVar);
            double e2 = l.this.f26662a.e();
            double d2 = (double) f2;
            Double.isNaN(d2);
            double d3 = e2 + d2;
            ab abVar = l.this.f26662a;
            float f3 = this.f26673a.x;
            float f4 = this.f26673a.y;
            NativeMapView nativeMapView = abVar.f26592a;
            double d4 = (double) f3;
            double d5 = (double) f4;
            if (!nativeMapView.a("setBearing")) {
                nativeMapView.a(d3, d4, d5, 0);
            }
            Iterator<Object> it2 = l.this.j.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        public final void b(j jVar, float f2) {
            boolean z;
            if (l.this.f26663b.o) {
                l.this.n.f25938d.u = this.f26677e;
            }
            Iterator<Object> it2 = l.this.j.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            if (!l.this.f26663b.l || Math.abs(f2) < this.f26676d) {
                l.this.b();
                return;
            }
            if (f2 < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            float max = Math.max(1.5f, Math.min(20.0f, (float) Math.pow((double) f2, 2.0d)));
            long log = (long) (Math.log((double) (1.0f + max)) * 500.0d);
            if (z) {
                max = -max;
            }
            l lVar = l.this;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{max, 0.0f});
            ofFloat.setDuration(log);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ab abVar = l.this.f26662a;
                    double e2 = l.this.f26662a.e();
                    double floatValue = (double) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    Double.isNaN(floatValue);
                    abVar.a(e2 + floatValue, b.this.f26673a.x, b.this.f26673a.y, 0);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    l.this.b();
                }

                public final void onAnimationCancel(Animator animator) {
                    l.this.f26662a.c();
                }

                public final void onAnimationStart(Animator animator) {
                    l.this.f26662a.c();
                    l.this.f26665d.a(3);
                }
            });
            lVar.q = ofFloat;
            l.this.a(l.this.q);
        }

        public b(float f2, float f3, float f4) {
            this.f26675c = f2;
            this.f26676d = f3;
            this.f26677e = f4;
        }
    }

    final class c extends n.a {

        /* renamed from: b  reason: collision with root package name */
        private final float f26681b;

        /* renamed from: c  reason: collision with root package name */
        private PointF f26682c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26683d;

        private void c(n nVar) {
            if (l.this.m != null) {
                this.f26682c = l.this.m;
            } else if (this.f26683d) {
                this.f26682c = new PointF(l.this.f26663b.c() / 2.0f, l.this.f26663b.b() / 2.0f);
            } else {
                this.f26682c = nVar.m;
            }
        }

        public final boolean a(n nVar) {
            boolean z;
            if (!l.this.f26663b.g) {
                return false;
            }
            l.this.c();
            if (nVar.k.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f26683d = z;
            if (this.f26683d) {
                l.this.o = false;
                l.this.n.h.a(false);
            }
            if (l.this.f26663b.n) {
                l.this.n.f25939e.g = 40.3f;
            }
            c(nVar);
            l.this.a("Pinch", this.f26682c);
            Iterator<Object> it2 = l.this.k.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        public final boolean b(n nVar) {
            boolean z;
            l.this.f26665d.a(1);
            c(nVar);
            float scaleFactor = nVar.g.getScaleFactor();
            boolean z2 = this.f26683d;
            double log = Math.log((double) scaleFactor) / Math.log(1.5707963267948966d);
            if (z2) {
                if (log < 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                log = com.mapbox.mapboxsdk.utils.e.a(Math.abs(log), 0.0d, 0.15000000596046448d);
                if (z) {
                    log = -log;
                }
            }
            l.this.f26662a.a(log, this.f26682c);
            Iterator<Object> it2 = l.this.k.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        c(float f2) {
            this.f26681b = f2;
        }

        public final void a(n nVar, float f2, float f3) {
            if (this.f26683d) {
                l.this.n.h.a(true);
            }
            if (l.this.f26663b.n) {
                l.this.n.f25939e.g = 15.3f;
            }
            Iterator<Object> it2 = l.this.k.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            float abs = Math.abs(f2) + Math.abs(f3);
            if (!l.this.f26663b.k || abs < this.f26681b) {
                l.this.b();
                return;
            }
            double d2 = (double) abs;
            boolean z = nVar.i;
            Double.isNaN(d2);
            double log = (double) ((float) Math.log((d2 / 1000.0d) + 1.0d));
            if (z) {
                Double.isNaN(log);
                log = -log;
            }
            double d3 = log;
            double d4 = l.this.f26662a.d();
            long abs2 = (long) ((Math.abs(d3) * 1000.0d) / 4.0d);
            l.this.p = l.this.a(d4, d3, this.f26682c, abs2);
            l.this.a(l.this.p);
        }
    }

    final class d extends k.b {
        private d() {
        }

        public final boolean a(k kVar) {
            if (!l.this.f26663b.f26611f) {
                return false;
            }
            l.this.c();
            l.this.a("Pitch", kVar.m);
            l.this.n.h.a(false);
            Iterator<Object> it2 = l.this.l.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }

        public final void b(k kVar) {
            l.this.b();
            l.this.n.h.a(true);
            Iterator<Object> it2 = l.this.l.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }

        /* synthetic */ d(l lVar, byte b2) {
            this();
        }

        public final boolean a(k kVar, float f2) {
            l.this.f26665d.a(1);
            double f3 = l.this.f26662a.f();
            double d2 = (double) (f2 * 0.1f);
            Double.isNaN(d2);
            double a2 = com.mapbox.mapboxsdk.utils.e.a(f3 - d2, 0.0d, 60.0d);
            ab abVar = l.this.f26662a;
            Double valueOf = Double.valueOf(a2);
            abVar.f26593b.a(valueOf.floatValue());
            NativeMapView nativeMapView = abVar.f26592a;
            double doubleValue = valueOf.doubleValue();
            if (!nativeMapView.a("setPitch")) {
                nativeMapView.nativeSetPitch(doubleValue, 0);
            }
            Iterator<Object> it2 = l.this.l.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return true;
        }
    }

    final class e extends m.a {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private e() {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            l.this.f26662a.c();
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            l.this.b(new PointF(motionEvent.getX(), motionEvent.getY()));
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            PointF pointF;
            if (motionEvent.getActionMasked() == 0) {
                l.this.o = true;
            }
            if (motionEvent.getActionMasked() != 1) {
                return super.onDoubleTapEvent(motionEvent);
            }
            if (!l.this.f26663b.g || !l.this.f26663b.j || !l.this.o) {
                return false;
            }
            l.this.f26662a.c();
            l.this.f26665d.a(1);
            if (l.this.m != null) {
                pointF = l.this.m;
            } else {
                pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            }
            l.this.a(pointF, false);
            l.this.a("DoubleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (!l.this.f26664c.a(pointF)) {
                if (l.this.f26663b.p) {
                    l.this.f26664c.c();
                }
                l.this.a(pointF);
            }
            l.this.a("SingleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        /* synthetic */ e(l lVar, byte b2) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            float f4 = f2;
            float f5 = f3;
            if (!l.this.f26663b.h) {
                return false;
            }
            Iterator<Object> it2 = l.this.g.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            if (!l.this.f26663b.m) {
                return false;
            }
            float f6 = l.this.f26663b.f26609d;
            double hypot = Math.hypot((double) (f4 / f6), (double) (f5 / f6));
            if (hypot < 1000.0d) {
                return false;
            }
            l.this.f26662a.c();
            l.this.f26665d.a(1);
            double f7 = l.this.f26662a.f();
            double d2 = 0.0d;
            if (f7 != 0.0d) {
                d2 = f7 / 10.0d;
            }
            double d3 = d2 + 1.5d;
            double d4 = (double) f4;
            Double.isNaN(d4);
            double d5 = (double) f6;
            Double.isNaN(d5);
            double d6 = (double) f5;
            Double.isNaN(d6);
            Double.isNaN(d5);
            l.this.f26662a.a((d4 / d3) / d5, (d6 / d3) / d5, (long) (((hypot / 7.0d) / d3) + 150.0d));
            return true;
        }
    }

    final class f implements f.a {
        private f() {
        }

        /* synthetic */ f(l lVar, byte b2) {
            this();
        }

        public final boolean a(com.mapbox.android.gestures.f fVar, int i) {
            PointF pointF;
            if (!l.this.f26663b.g || i != 2) {
                return false;
            }
            l.this.f26662a.c();
            l.this.f26665d.a(1);
            l.this.a("TwoFingerTap", fVar.m);
            if (l.this.m != null) {
                pointF = l.this.m;
            } else {
                pointF = fVar.m;
            }
            l.this.b(pointF, false);
            return true;
        }
    }

    public final void a(String str, PointF pointF) {
        aa d2 = com.mapbox.mapboxsdk.d.d();
        if (d2 != null) {
            CameraPosition a2 = this.f26662a.a();
            if (a2 != null) {
                double d3 = a2.zoom;
                if (d3 >= 0.0d && d3 <= 25.5d) {
                    LatLng a3 = this.t.a(pointF);
                    d2.a(str, a3.a(), a3.b(), d3);
                }
            }
        }
    }

    public final void c() {
        if (d()) {
            this.f26662a.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.s.removeCallbacksAndMessages(null);
        this.r.clear();
        b(this.p);
        b(this.q);
        b();
    }

    public final void b() {
        if (d()) {
            this.f26665d.a();
        }
    }

    private boolean d() {
        if ((!this.f26663b.h || !this.n.h.o) && ((!this.f26663b.g || !this.n.f25938d.o) && ((!this.f26663b.f26610e || !this.n.f25939e.o) && (!this.f26663b.f26611f || !this.n.f25940f.o)))) {
            return true;
        }
        return false;
    }

    private static void b(Animator animator) {
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(PointF pointF) {
        if (this.f26667f != null) {
            this.f26667f.a(this.t.a(pointF));
        }
        Iterator<o.n> it2 = this.v.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.t.a(pointF));
        }
    }

    public final void a(Animator animator) {
        this.r.add(animator);
        this.s.removeCallbacksAndMessages(null);
        this.s.postDelayed(this.w, 150);
    }

    /* access modifiers changed from: package-private */
    public final void a(PointF pointF) {
        if (this.f26666e != null) {
            this.f26666e.a(this.t.a(pointF));
        }
        Iterator<o.m> it2 = this.u.iterator();
        while (it2.hasNext()) {
            it2.next().a(this.t.a(pointF));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(PointF pointF, boolean z) {
        a(true, pointF, z);
    }

    /* access modifiers changed from: package-private */
    public final void b(PointF pointF, boolean z) {
        a(false, pointF, z);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, boolean z) {
        if (z) {
            e eVar = new e(this, (byte) 0);
            a aVar = new a(this, (byte) 0);
            c cVar = new c(context.getResources().getDimension(C0906R.dimen.ig));
            b bVar = new b(context.getResources().getDimension(C0906R.dimen.f8if), context.getResources().getDimension(C0906R.dimen.ie), context.getResources().getDimension(C0906R.dimen.i5));
            d dVar = new d(this, (byte) 0);
            f fVar = new f(this, (byte) 0);
            this.n.a((m.b) eVar);
            this.n.a((c.a) aVar);
            this.n.a((n.b) cVar);
            this.n.a((j.a) bVar);
            this.n.a((k.a) dVar);
            this.n.a((f.a) fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AndroidGesturesManager androidGesturesManager, boolean z) {
        if (z) {
            HashSet hashSet = new HashSet();
            hashSet.add(3);
            hashSet.add(1);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(3);
            hashSet2.add(2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(1);
            hashSet3.add(6);
            androidGesturesManager.a((Set<Integer>[]) new Set[]{hashSet, hashSet2, hashSet3});
        }
        this.n = androidGesturesManager;
    }

    private void a(boolean z, PointF pointF, boolean z2) {
        double d2;
        b(this.p);
        double d3 = this.f26662a.d();
        if (z) {
            d2 = 1.0d;
        } else {
            d2 = -1.0d;
        }
        this.p = a(d3, d2, pointF, 300);
        if (z2) {
            this.p.start();
        } else {
            a(this.p);
        }
    }

    public final Animator a(double d2, double d3, final PointF pointF, long j2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) d2, (float) (d2 + d3)});
        ofFloat.setDuration(j2);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.this.f26662a.b((double) ((Float) valueAnimator.getAnimatedValue()).floatValue(), pointF);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                l.this.f26662a.c();
            }

            public final void onAnimationEnd(Animator animator) {
                l.this.b();
            }

            public final void onAnimationStart(Animator animator) {
                l.this.f26662a.c();
                l.this.f26665d.a(3);
            }
        });
        return ofFloat;
    }

    l(Context context, ab abVar, x xVar, ac acVar, b bVar, f fVar) {
        this.f26664c = bVar;
        this.f26662a = abVar;
        this.t = xVar;
        this.f26663b = acVar;
        this.f26665d = fVar;
        if (context != null) {
            a(new AndroidGesturesManager(context), true);
            a(context, true);
        }
    }
}
