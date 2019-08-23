package com.ss.android.ugc.aweme.poi.ui;

import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.map.e;
import com.ss.android.ugc.aweme.poi.map.g;
import com.ss.android.ugc.aweme.poi.map.n;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;

public class PoiOptimizedRoutePresenter extends PoiRoutePresenter implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60460a;
    private boolean l = true;
    private boolean m;
    @BindView(2131496327)
    ImageView mRouteBusImg;
    @BindView(2131496328)
    View mRouteBusLayout;
    @BindView(2131496330)
    ImageView mRouteDriveImg;
    @BindView(2131496331)
    View mRouteDriveLayout;
    @BindView(2131496341)
    ImageView mRouteWalkingImg;
    @BindView(2131496342)
    View mRouteWalkingLayout;
    @Nullable
    @BindView(2131497081)
    View mShareBtn;
    private boolean n;

    public final n h() {
        return this;
    }

    public final boolean g() {
        return this.m;
    }

    public final int i() {
        if (this.j) {
            return C0906R.layout.yq;
        }
        return C0906R.layout.yp;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66097, new Class[0], Void.TYPE);
            return;
        }
        if (this.j) {
            n();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66087, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteDriveLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteDrive);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66088, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteBusLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteTransit);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66089, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteWalkingLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteWalking);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66094, new Class[0], Void.TYPE);
        } else if (this.n) {
            this.m = false;
            MapLayout mapLayout = this.f60493c;
            if (PatchProxy.isSupport(new Object[0], mapLayout, MapLayout.f59836b, false, 64967, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mapLayout, MapLayout.f59836b, false, 64967, new Class[0], Void.TYPE);
            } else if (mapLayout.f59837c != null) {
                mapLayout.f59837c.g();
            }
            if (this.g != null) {
                this.f60493c.a(h.a(this.f60495e, this.f60496f, (p.a) this), this.g[0], this.g[1], l(), (g) null);
            }
            this.n = false;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66093, new Class[0], Void.TYPE);
        } else if (!this.n && j() && this.g != null) {
            this.n = true;
            a(this.g[0], this.g[1]);
            if (this.j) {
                this.m = true;
                if (PatchProxy.isSupport(new Object[0], this, f60460a, false, 66096, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60460a, false, 66096, new Class[0], Void.TYPE);
                } else if (this.f60494d != null) {
                    this.f60493c.a(this.m);
                    Object obj = null;
                    switch (this.f60494d) {
                        case RouteDrive:
                            obj = this.mRouteDriveLayout.getTag();
                            break;
                        case RouteTransit:
                            obj = this.mRouteBusLayout.getTag();
                            break;
                        case RouteWalking:
                            obj = this.mRouteWalkingLayout.getTag();
                            break;
                    }
                    if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                        this.f60493c.a(this.f60494d, true);
                        c(this.f60494d);
                        a(this.f60494d);
                    }
                }
                m();
                if (p.d()) {
                    this.f60493c.a(this.h, this.i, this.g[0], this.g[1]);
                }
            }
        }
    }

    public final boolean a(PoiStruct poiStruct) {
        if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f60460a, false, 66085, new Class[]{PoiStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f60460a, false, 66085, new Class[]{PoiStruct.class}, Boolean.TYPE)).booleanValue();
        }
        boolean a2 = super.a(poiStruct);
        this.f60493c.a(false);
        return a2;
    }

    @OnClick({2131496331, 2131496328, 2131496342})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60460a, false, 66086, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60460a, false, 66086, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.c30) {
            b();
        } else if (id == C0906R.id.c2x) {
            c();
        } else if (id == C0906R.id.c3a) {
            d();
        } else {
            super.onClick(view);
        }
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60460a, false, 66095, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f60460a, false, 66095, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (!this.l) {
            this.mRouteTab.setAlpha(f3);
            if (f3 > 0.0f) {
                this.mRouteTab.setVisibility(0);
            } else {
                this.mRouteTab.setVisibility(8);
            }
            if (!p.d() && this.mShareBtn != null) {
                this.mShareBtn.setAlpha(f2);
                if (f2 > 0.0f) {
                    this.mShareBtn.setClickable(true);
                    this.mShareBtn.setVisibility(0);
                    return;
                }
                this.mShareBtn.setClickable(false);
                this.mShareBtn.setVisibility(4);
            }
        }
    }

    public final void a(e eVar, int i) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f60460a, false, 66092, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f60460a, false, 66092, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
        } else if (j()) {
            String str = "";
            switch (eVar) {
                case RouteDrive:
                    if (i < 0) {
                        str = "drive";
                        break;
                    } else {
                        this.l = false;
                        this.mRouteDriveLayout.setVisibility(0);
                        this.mRouteDriveLayout.setTag(Boolean.TRUE);
                        this.mRouteDrive.setText(a(i));
                        break;
                    }
                case RouteTransit:
                    if (i < 0) {
                        str = "transit";
                        break;
                    } else {
                        this.l = false;
                        this.mRouteBusLayout.setVisibility(0);
                        this.mRouteBusLayout.setTag(Boolean.TRUE);
                        this.mRouteBus.setText(a(i));
                        break;
                    }
                case RouteWalking:
                    if (i < 0) {
                        str = "walk";
                        break;
                    } else {
                        this.l = false;
                        this.mRouteWalkingLayout.setVisibility(0);
                        this.mRouteWalkingLayout.setTag(Boolean.TRUE);
                        this.mRouteWalking.setText(a(i));
                        break;
                    }
            }
            if (i >= 0) {
                if (g()) {
                    this.mRouteTab.setVisibility(0);
                    if (this.mShareBtn != null && !p.d()) {
                        this.mShareBtn.setVisibility(4);
                        this.mShareBtn.setClickable(false);
                    }
                }
                if (eVar == this.f60494d && g()) {
                    a(eVar, true);
                }
            } else {
                com.ss.android.ugc.aweme.app.n.a("poi_route_plan_log", c.a().a("plan", str).a("status", (Integer) 0).b());
            }
        }
    }

    public final void a(e eVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60460a, false, 66090, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z)}, this, f60460a, false, 66090, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
        } else if (eVar != null) {
            switch (eVar) {
                case RouteDrive:
                    View view = this.mRouteDriveLayout;
                    ImageView imageView = this.mRouteDriveImg;
                    TextView textView = this.mRouteDrive;
                    if (z) {
                        i = 2130839545;
                    } else {
                        i = 2130839544;
                    }
                    a(view, imageView, textView, i, z);
                    return;
                case RouteTransit:
                    View view2 = this.mRouteBusLayout;
                    ImageView imageView2 = this.mRouteBusImg;
                    TextView textView2 = this.mRouteBus;
                    if (z) {
                        i2 = 2130839502;
                    } else {
                        i2 = 2130839501;
                    }
                    a(view2, imageView2, textView2, i2, z);
                    return;
                case RouteWalking:
                    View view3 = this.mRouteWalkingLayout;
                    ImageView imageView3 = this.mRouteWalkingImg;
                    TextView textView3 = this.mRouteWalking;
                    if (z) {
                        i3 = 2130839886;
                    } else {
                        i3 = 2130839885;
                    }
                    a(view3, imageView3, textView3, i3, z);
                    break;
            }
        }
    }

    private void a(View view, ImageView imageView, TextView textView, int i, boolean z) {
        int i2;
        View view2 = view;
        ImageView imageView2 = imageView;
        TextView textView2 = textView;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{view2, imageView2, textView2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60460a, false, 66091, new Class[]{View.class, ImageView.class, TextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {view2, imageView2, textView2, Integer.valueOf(i), Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f60460a, false, 66091, new Class[]{View.class, ImageView.class, TextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        imageView2.setImageResource(i);
        Resources k = k();
        if (z2) {
            i2 = C0906R.color.a1s;
        } else {
            i2 = C0906R.color.a08;
        }
        textView2.setTextColor(k.getColor(i2));
        view2.setSelected(z2);
    }
}
