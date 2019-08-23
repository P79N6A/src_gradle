package com.ss.android.ugc.aweme.poi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.map.a;
import com.ss.android.ugc.aweme.map.a.b;
import com.ss.android.ugc.aweme.map.a.c;
import com.ss.android.ugc.aweme.map.d;
import com.ss.android.ugc.aweme.map.g;
import com.ss.android.ugc.aweme.map.h;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.poi.model.ag;
import java.util.Locale;

public class MapLayout extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f59836b;

    /* renamed from: c  reason: collision with root package name */
    public a f59837c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f59838d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59839e;

    /* renamed from: f  reason: collision with root package name */
    h f59840f;
    private m g;
    private boolean h;
    private boolean i;
    private Locale j;

    public final void a(View view, ag agVar, Bitmap bitmap, f fVar) {
        View view2 = view;
        ag agVar2 = agVar;
        Bitmap bitmap2 = bitmap;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{view2, agVar2, bitmap2, fVar2}, this, f59836b, false, 64968, new Class[]{View.class, ag.class, Bitmap.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, agVar2, bitmap2, fVar2}, this, f59836b, false, 64968, new Class[]{View.class, ag.class, Bitmap.class, f.class}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(view2, new h(agVar2.latitude, agVar2.longitude), bitmap2, (a.C0634a) new d(fVar2));
        }
    }

    public final void a(e eVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59836b, false, 64969, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z)}, this, f59836b, false, 64969, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(a(eVar), z);
        }
    }

    public final void a(final k kVar) {
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f59836b, false, 64971, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, f59836b, false, 64971, new Class[]{k.class}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a((a.b) new a.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59847a;

                public final void a(Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f59847a, false, 64978, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f59847a, false, 64978, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (kVar != null) {
                        kVar.a(bitmap);
                    }
                }
            });
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64953, new Class[0], Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64954, new Class[0], Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64955, new Class[0], Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59839e = true;
            this.f59837c.c();
            if (this.f59838d) {
                g();
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64956, new Class[0], Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.d();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64957, new Class[0], Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.f();
        }
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64959, new Class[0], Void.TYPE);
            return;
        }
        this.f59837c.d();
        this.f59837c = null;
        removeAllViews();
        e.a().a("key_container_poi");
    }

    public float getZoomBig() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64960, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64960, new Class[0], Float.TYPE)).floatValue();
        } else if (this.f59837c == null) {
            return 10.0f;
        } else {
            return 14.0f;
        }
    }

    public float getZoomSmall() {
        if (!PatchProxy.isSupport(new Object[0], this, f59836b, false, 64961, new Class[0], Float.TYPE)) {
            return this.f59837c == null ? 10.0f : 10.0f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64961, new Class[0], Float.TYPE)).floatValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59836b, false, 64952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59836b, false, 64952, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59837c == null) {
            b(null);
            if (this.f59850a != null) {
                this.f59850a.U_();
            }
        }
        this.f59839e = false;
        if (this.f59837c != null) {
            this.f59837c.e();
        }
    }

    public void setOnMapZoomGestureListener(m mVar) {
        this.g = mVar;
    }

    public MapLayout(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        if (this.f59837c != null) {
            this.f59837c.f55013d = z;
        }
    }

    public static g a(e eVar) {
        if (eVar == e.RouteDrive) {
            return g.RouteDrive;
        }
        if (eVar == e.RouteTransit) {
            return g.RouteTransit;
        }
        return g.RouteWalking;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f59836b, false, 64951, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f59836b, false, 64951, new Class[]{Bundle.class}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(bundle);
        }
    }

    private void b(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f59836b, false, 64950, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f59836b, false, 64950, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f59838d = false;
        if (this.h) {
            this.f59837c = new c(this);
        } else {
            this.f59837c = new b(this);
        }
        this.f59837c.a(bundle, this.i, this.j, (d) new b(this));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f59836b, false, 64972, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f59836b, false, 64972, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 261 && this.g != null) {
            this.g.f();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnMapClickListener(l lVar) {
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f59836b, false, 64963, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, this, f59836b, false, 64963, new Class[]{l.class}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a((com.ss.android.ugc.aweme.map.c) new c(lVar));
        }
    }

    public MapLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void a(Bitmap bitmap, double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f59836b, false, 64964, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3)}, this, f59836b, false, 64964, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(bitmap, d2, d3);
        }
    }

    public final void a(double d2, double d3, double d4, double d5) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f59836b, false, 64965, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)}, this, f59836b, false, 64965, new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(d2, d3, d4, d5);
        }
    }

    public final void a(Bitmap bitmap, double d2, double d3, float f2, g gVar) {
        final g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), gVar2}, this, f59836b, false, 64962, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap, Double.valueOf(d2), Double.valueOf(d3), Float.valueOf(f2), gVar2}, this, f59836b, false, 64962, new Class[]{Bitmap.class, Double.TYPE, Double.TYPE, Float.TYPE, g.class}, Void.TYPE);
        } else if (this.f59837c != null) {
            this.f59837c.a(bitmap, d2, d3, f2, (com.ss.android.ugc.aweme.map.e) new com.ss.android.ugc.aweme.map.e() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59841a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f59841a, false, 64976, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f59841a, false, 64976, new Class[0], Void.TYPE);
                    }
                }
            });
        }
    }

    public final void a(Bundle bundle, boolean z, boolean z2, Locale locale, h hVar) {
        Locale locale2 = locale;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{bundle, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), locale2, hVar2}, this, f59836b, false, 64949, new Class[]{Bundle.class, Boolean.TYPE, Boolean.TYPE, Locale.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle, Byte.valueOf(z), Byte.valueOf(z2), locale2, hVar2}, this, f59836b, false, 64949, new Class[]{Bundle.class, Boolean.TYPE, Boolean.TYPE, Locale.class, h.class}, Void.TYPE);
            return;
        }
        this.h = z;
        this.i = z2;
        this.j = locale2;
        this.f59840f = hVar2;
        b(bundle);
    }
}
