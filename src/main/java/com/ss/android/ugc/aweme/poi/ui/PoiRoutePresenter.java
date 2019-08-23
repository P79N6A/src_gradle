package com.ss.android.ugc.aweme.poi.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.poi.e.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.n;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.map.e;
import com.ss.android.ugc.aweme.poi.map.f;
import com.ss.android.ugc.aweme.poi.map.g;
import com.ss.android.ugc.aweme.poi.map.j;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ag;

public class PoiRoutePresenter implements p.a, j {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60491b;

    /* renamed from: a  reason: collision with root package name */
    private AmeBaseFragment f60492a;

    /* renamed from: c  reason: collision with root package name */
    protected MapLayout f60493c;

    /* renamed from: d  reason: collision with root package name */
    protected e f60494d;

    /* renamed from: e  reason: collision with root package name */
    public Context f60495e;

    /* renamed from: f  reason: collision with root package name */
    protected PoiStruct f60496f;
    protected double[] g;
    protected double h;
    protected double i;
    protected boolean j;
    public Unbinder k;
    private n l;
    private boolean m;
    @BindView(2131496326)
    TextView mRouteBus;
    @BindView(2131496329)
    TextView mRouteDrive;
    @BindView(2131496333)
    View mRouteTab;
    @BindView(2131496340)
    TextView mRouteWalking;
    @Nullable
    @BindView(2131496335)
    TextView mTitle;
    private a n;
    private boolean o = true;

    public boolean g() {
        return true;
    }

    public com.ss.android.ugc.aweme.poi.map.n h() {
        return null;
    }

    public int i() {
        return C0906R.layout.yp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.ss.android.ugc.aweme.poi.model.PoiStruct r26) {
        /*
            r25 = this;
            r8 = r25
            r9 = r26
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f60491b
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r0 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 66160(0x10270, float:9.271E-41)
            r2 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f60491b
            r4 = 0
            r5 = 66160(0x10270, float:9.271E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r0 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            if (r9 != 0) goto L_0x0067
            java.lang.String r0 = "poi_crash_log"
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "poi_service"
            java.lang.String r3 = "poi_map"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "poidetail is null"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "poitype"
            java.lang.String r3 = "map"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (org.json.JSONObject) r1)
            return r11
        L_0x0067:
            r8.f60496f = r9
            android.widget.TextView r0 = r8.mTitle
            if (r0 == 0) goto L_0x0076
            android.widget.TextView r0 = r8.mTitle
            java.lang.String r1 = r26.getPoiName()
            r0.setText(r1)
        L_0x0076:
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x0085 }
            java.lang.Class<com.ss.android.ugc.aweme.poi.e.n> r1 = com.ss.android.ugc.aweme.poi.e.n.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)     // Catch:{ Throwable -> 0x0085 }
            com.ss.android.ugc.aweme.poi.e.n r0 = (com.ss.android.ugc.aweme.poi.e.n) r0     // Catch:{ Throwable -> 0x0085 }
            r8.l = r0     // Catch:{ Throwable -> 0x0085 }
            goto L_0x009b
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SharedPreferencesAnnotatedManager getSP failed "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.ss.android.ugc.aweme.util.c.a(r0)
        L_0x009b:
            java.lang.String r0 = r26.getPoiLatitude()
            java.lang.String r1 = r26.getPoiLongitude()
            double[] r0 = com.ss.android.ugc.aweme.poi.e.c.a((java.lang.String) r0, (java.lang.String) r1)
            r8.g = r0
            boolean r0 = r8.o
            if (r0 == 0) goto L_0x0210
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x00bc }
            java.lang.Class<com.ss.android.ugc.aweme.poi.e.n> r1 = com.ss.android.ugc.aweme.poi.e.n.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)     // Catch:{ Throwable -> 0x00bc }
            com.ss.android.ugc.aweme.poi.e.n r0 = (com.ss.android.ugc.aweme.poi.e.n) r0     // Catch:{ Throwable -> 0x00bc }
            r8.l = r0     // Catch:{ Throwable -> 0x00bc }
            goto L_0x00d2
        L_0x00bc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SharedPreferencesAnnotatedManager getSP failed "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.ss.android.ugc.aweme.util.c.a(r0)
        L_0x00d2:
            android.content.Context r0 = r8.f60495e
            com.ss.android.ugc.aweme.app.af r0 = com.ss.android.ugc.aweme.app.af.a((android.content.Context) r0)
            com.ss.android.ugc.aweme.poi.a r0 = r0.f()
            r8.n = r0
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            if (r0 == 0) goto L_0x0210
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            double r0 = r0.latitude
            r8.h = r0
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            double r0 = r0.longitude
            r8.i = r0
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            boolean r0 = r0.isGaode
            if (r0 != 0) goto L_0x0104
            double r0 = r8.i
            double r2 = r8.h
            double[] r0 = com.ss.android.ugc.aweme.poi.e.a.b(r0, r2)
            r1 = r0[r11]
            r8.i = r1
            r1 = r0[r10]
            r8.h = r1
        L_0x0104:
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r9, (com.ss.android.ugc.aweme.poi.a) r0)
            if (r0 == 0) goto L_0x0117
            r8.j = r10
            boolean r0 = r25.g()
            if (r0 == 0) goto L_0x0117
            r25.m()
        L_0x0117:
            double[] r0 = r8.g
            if (r0 == 0) goto L_0x0210
            double[] r0 = r8.g
            r12 = r0[r11]
            double[] r0 = r8.g
            r14 = r0[r10]
            double r0 = r8.h
            double r2 = r8.i
            r16 = r0
            r18 = r2
            double r0 = com.ss.android.ugc.aweme.poi.e.c.a(r12, r14, r16, r18)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x013b
            com.ss.android.ugc.aweme.poi.map.e r0 = com.ss.android.ugc.aweme.poi.map.e.RouteWalking
            r8.f60494d = r0
        L_0x0139:
            r0 = 1
            goto L_0x0154
        L_0x013b:
            com.ss.android.ugc.aweme.poi.a r0 = r8.n
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r9, (com.ss.android.ugc.aweme.poi.a) r0)
            if (r0 == 0) goto L_0x0153
            r8.m = r10
            com.ss.android.ugc.aweme.poi.e.n r0 = r8.l
            if (r0 == 0) goto L_0x014e
            com.ss.android.ugc.aweme.poi.e.n r0 = r8.l
            r0.a()
        L_0x014e:
            com.ss.android.ugc.aweme.poi.map.e r0 = com.ss.android.ugc.aweme.poi.map.e.RouteDrive
            r8.f60494d = r0
            goto L_0x0139
        L_0x0153:
            r0 = 0
        L_0x0154:
            if (r0 == 0) goto L_0x0210
            com.ss.android.ugc.aweme.poi.map.MapLayout r0 = r8.f60493c
            boolean r1 = r25.g()
            r0.a((boolean) r1)
            com.ss.android.ugc.aweme.poi.map.MapLayout r0 = r8.f60493c
            com.ss.android.ugc.aweme.poi.model.ag r1 = new com.ss.android.ugc.aweme.poi.model.ag
            double r2 = r8.h
            double r4 = r8.i
            r1.<init>(r2, r4)
            com.ss.android.ugc.aweme.poi.model.ag r2 = new com.ss.android.ugc.aweme.poi.model.ag
            double[] r3 = r8.g
            r4 = r3[r11]
            double[] r3 = r8.g
            r6 = r3[r10]
            r2.<init>(r4, r6)
            com.ss.android.ugc.aweme.poi.map.e r3 = r8.f60494d
            com.ss.android.ugc.aweme.poi.a r4 = r8.n
            java.lang.String r4 = r4.city
            r5 = 5
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r11] = r1
            r12[r10] = r2
            r6 = 2
            r12[r6] = r3
            r7 = 3
            r12[r7] = r4
            r19 = 4
            r12[r19] = r8
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.map.MapLayout.f59836b
            r15 = 0
            r16 = 64966(0xfdc6, float:9.1037E-41)
            java.lang.Class[] r13 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ag> r17 = com.ss.android.ugc.aweme.poi.model.ag.class
            r13[r11] = r17
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ag> r17 = com.ss.android.ugc.aweme.poi.model.ag.class
            r13[r10] = r17
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.e> r17 = com.ss.android.ugc.aweme.poi.map.e.class
            r13[r6] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r13[r7] = r17
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.j> r17 = com.ss.android.ugc.aweme.poi.map.j.class
            r13[r19] = r17
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r13
            r13 = r0
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x01e6
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r11] = r1
            r12[r10] = r2
            r12[r6] = r3
            r12[r7] = r4
            r12[r19] = r8
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.map.MapLayout.f59836b
            r15 = 0
            r16 = 64966(0xfdc6, float:9.1037E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ag> r2 = com.ss.android.ugc.aweme.poi.model.ag.class
            r1[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.ag> r2 = com.ss.android.ugc.aweme.poi.model.ag.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.e> r2 = com.ss.android.ugc.aweme.poi.map.e.class
            r1[r6] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r7] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.map.j> r2 = com.ss.android.ugc.aweme.poi.map.j.class
            r1[r19] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x020e
        L_0x01e6:
            com.ss.android.ugc.aweme.map.a r5 = r0.f59837c
            if (r5 == 0) goto L_0x020e
            com.ss.android.ugc.aweme.map.a r12 = r0.f59837c
            com.ss.android.ugc.aweme.map.h r13 = new com.ss.android.ugc.aweme.map.h
            double r5 = r1.latitude
            double r14 = r1.longitude
            r13.<init>(r5, r14)
            com.ss.android.ugc.aweme.map.h r14 = new com.ss.android.ugc.aweme.map.h
            double r5 = r2.latitude
            double r1 = r2.longitude
            r14.<init>(r5, r1)
            com.ss.android.ugc.aweme.map.g r15 = com.ss.android.ugc.aweme.poi.map.MapLayout.a((com.ss.android.ugc.aweme.poi.map.e) r3)
            com.ss.android.ugc.aweme.poi.map.MapLayout$2 r1 = new com.ss.android.ugc.aweme.poi.map.MapLayout$2
            r1.<init>(r8)
            r16 = r4
            r17 = r1
            r12.a((com.ss.android.ugc.aweme.map.h) r13, (com.ss.android.ugc.aweme.map.h) r14, (com.ss.android.ugc.aweme.map.g) r15, (java.lang.String) r16, (com.ss.android.ugc.aweme.map.f) r17)
        L_0x020e:
            r0 = 1
            goto L_0x0211
        L_0x0210:
            r0 = 0
        L_0x0211:
            double[] r1 = r8.g
            if (r1 == 0) goto L_0x026b
            boolean r1 = r25.g()
            if (r1 == 0) goto L_0x0226
            double[] r1 = r8.g
            r2 = r1[r11]
            double[] r1 = r8.g
            r4 = r1[r10]
            r8.a((double) r2, (double) r4)
        L_0x0226:
            boolean r1 = r8.j
            if (r1 == 0) goto L_0x0250
            double r1 = r8.h
            double r3 = r8.i
            boolean r1 = com.ss.android.ugc.aweme.poi.e.p.a((double) r1, (double) r3)
            if (r1 == 0) goto L_0x0250
            boolean r1 = r25.g()
            if (r1 == 0) goto L_0x0250
            com.ss.android.ugc.aweme.poi.map.MapLayout r12 = r8.f60493c
            double[] r1 = r8.g
            r13 = r1[r11]
            double[] r1 = r8.g
            r15 = r1[r10]
            double r1 = r8.h
            double r3 = r8.i
            r17 = r1
            r19 = r3
            r12.a((double) r13, (double) r15, (double) r17, (double) r19)
            goto L_0x026b
        L_0x0250:
            com.ss.android.ugc.aweme.poi.map.MapLayout r1 = r8.f60493c
            android.content.Context r2 = r8.f60495e
            android.graphics.Bitmap r18 = com.ss.android.ugc.aweme.poi.e.h.a((android.content.Context) r2, (com.ss.android.ugc.aweme.poi.model.PoiStruct) r9, (com.ss.android.ugc.aweme.poi.e.p.a) r8)
            double[] r2 = r8.g
            r19 = r2[r11]
            double[] r2 = r8.g
            r21 = r2[r10]
            float r23 = r25.l()
            r24 = 0
            r17 = r1
            r17.a((android.graphics.Bitmap) r18, (double) r19, (double) r21, (float) r23, (com.ss.android.ugc.aweme.poi.map.g) r24)
        L_0x026b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter.a(com.ss.android.ugc.aweme.poi.model.PoiStruct):boolean");
    }

    public final void a(ag agVar) {
        ag agVar2 = agVar;
        if (PatchProxy.isSupport(new Object[]{agVar2}, this, f60491b, false, 66161, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar2}, this, f60491b, false, 66161, new Class[]{ag.class}, Void.TYPE);
            return;
        }
        if (this.mTitle != null) {
            this.mTitle.setText(agVar2.name);
        }
        if (agVar2 != null) {
            this.g = c.a(agVar2.latitude, agVar2.longitude);
        }
        if (this.g != null) {
            this.f60493c.a(BitmapFactory.decodeResource(this.f60495e.getResources(), 2130839743), this.g[0], this.g[1], agVar2.zoom, (g) null);
            double d2 = this.g[0];
            double d3 = this.g[1];
            if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3), agVar2}, this, f60491b, false, 66176, new Class[]{Double.TYPE, Double.TYPE, ag.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3), agVar2}, this, f60491b, false, 66176, new Class[]{Double.TYPE, Double.TYPE, ag.class}, Void.TYPE);
                return;
            }
            View inflate = LayoutInflater.from(this.f60495e).inflate(i(), null);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.c24);
            ((TextView) inflate.findViewById(C0906R.id.c25)).setText(agVar2.name);
            String str = agVar2.address;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            this.f60493c.a(inflate, new ag(d2, d3), BitmapFactory.decodeResource(this.f60495e.getResources(), 2130839743), (f) null);
        }
    }

    public final void a(e eVar) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f60491b, false, 66163, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f60491b, false, 66163, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (this.l != null && this.m) {
            if (eVar != e.RouteDrive) {
                i2 = 0;
            }
            this.l.a(i2);
        }
    }

    public void a(e eVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60491b, false, 66170, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z)}, this, f60491b, false, 66170, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
        } else if (eVar != null) {
            switch (eVar) {
                case RouteDrive:
                    a(this.mRouteDrive, z ? 2130839545 : 2130839544, z);
                    return;
                case RouteTransit:
                    a(this.mRouteBus, z ? 2130839502 : 2130839501, z);
                    return;
                case RouteWalking:
                    a(this.mRouteWalking, z ? 2130839886 : 2130839885, z);
                    break;
            }
        }
    }

    public void a(e eVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i2)}, this, f60491b, false, 66172, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i2)}, this, f60491b, false, 66172, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
        } else if (j()) {
            String str = "";
            switch (eVar) {
                case RouteDrive:
                    if (i2 < 0) {
                        this.mRouteDrive.setText(" ");
                        str = "drive";
                        break;
                    } else {
                        this.mRouteDrive.setTag(Boolean.TRUE);
                        this.mRouteDrive.setText(a(i2));
                        break;
                    }
                case RouteTransit:
                    if (i2 < 0) {
                        this.mRouteBus.setText(" ");
                        str = "transit";
                        break;
                    } else {
                        this.mRouteBus.setTag(Boolean.TRUE);
                        this.mRouteBus.setText(a(i2));
                        break;
                    }
                case RouteWalking:
                    if (i2 < 0) {
                        this.mRouteWalking.setText(" ");
                        str = "walk";
                        break;
                    } else {
                        this.mRouteWalking.setTag(Boolean.TRUE);
                        this.mRouteWalking.setText(a(i2));
                        break;
                    }
            }
            if (i2 >= 0) {
                this.mRouteTab.setVisibility(0);
                if (this.mTitle != null) {
                    this.mTitle.setVisibility(8);
                }
                if (eVar == this.f60494d && g()) {
                    a(eVar, true);
                }
            } else {
                com.ss.android.ugc.aweme.app.n.a("poi_route_plan_log", com.ss.android.ugc.aweme.app.d.c.a().a("plan", str).a("status", (Integer) 0).b());
            }
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66165, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteDrive.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteDrive);
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66166, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteBus.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteTransit);
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66167, new Class[0], Void.TYPE);
            return;
        }
        Object tag = this.mRouteWalking.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            b(e.RouteWalking);
        }
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66158, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66158, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f60492a != null) {
            z = this.f60492a.isViewValid();
        }
        return z;
    }

    public final Resources k() {
        if (!PatchProxy.isSupport(new Object[0], this, f60491b, false, 66159, new Class[0], Resources.class)) {
            return this.f60495e.getResources();
        }
        return (Resources) PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66159, new Class[0], Resources.class);
    }

    public final float l() {
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66162, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66162, new Class[0], Float.TYPE)).floatValue();
        } else if (p.a(this.f60496f, this.n)) {
            return this.f60493c.getZoomBig();
        } else {
            return this.f60493c.getZoomSmall();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f60491b, false, 66174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60491b, false, 66174, new Class[0], Void.TYPE);
            return;
        }
        if (this.h > 0.0d && this.i > 0.0d) {
            this.f60493c.a(BitmapFactory.decodeResource(k(), 2130839668), this.h, this.i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60491b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 66177(0x10281, float:9.2734E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60491b
            r3 = 0
            r4 = 66177(0x10281, float:9.2734E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            android.content.Context r0 = r7.f60495e
            double[] r1 = r7.g
            r2 = 2
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r0
            r3 = 1
            r9[r3] = r1
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.e.h.f59792a
            r12 = 1
            r13 = 66827(0x1050b, float:9.3645E-41)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r14[r8] = r4
            java.lang.Class<double[]> r4 = double[].class
            r14[r3] = r4
            java.lang.Class r15 = java.lang.Void.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto L_0x006b
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r0
            r9[r3] = r1
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.e.h.f59792a
            r12 = 1
            r13 = 66827(0x1050b, float:9.3645E-41)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r14[r8] = r0
            java.lang.Class<double[]> r0 = double[].class
            r14[r3] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x006b:
            if (r1 == 0) goto L_0x014e
            int r4 = r1.length
            if (r4 == r2) goto L_0x0072
            goto L_0x014e
        L_0x0072:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r8] = r0
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.e.r.f59834a
            r12 = 1
            r13 = 66907(0x1055b, float:9.3757E-41)
            java.lang.Class[] r14 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r14[r8] = r2
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x00a6
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r8] = r0
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.poi.e.r.f59834a
            r12 = 1
            r13 = 66907(0x1055b, float:9.3757E-41)
            java.lang.Class[] r14 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r14[r8] = r2
            java.lang.Class<java.util.List> r15 = java.util.List.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r2 = (java.util.List) r2
            goto L_0x0112
        L_0x00a6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            java.util.List r4 = r4.getInstalledPackages(r8)
            if (r4 == 0) goto L_0x0112
            r5 = 0
        L_0x00b6:
            int r6 = r4.size()
            if (r5 >= r6) goto L_0x0112
            java.lang.Object r6 = r4.get(r5)
            android.content.pm.PackageInfo r6 = (android.content.pm.PackageInfo) r6
            java.lang.String r6 = r6.packageName
            boolean r9 = com.ss.android.g.a.a()
            if (r9 == 0) goto L_0x00d8
            java.lang.String r9 = "com.google.android.apps.maps"
            boolean r6 = r9.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.poi.e.r$a r6 = com.ss.android.ugc.aweme.poi.e.r.a.TYPE_GOOGLE
            r2.add(r6)
            goto L_0x010f
        L_0x00d8:
            java.lang.String r9 = "com.baidu.BaiduMap"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.poi.e.r$a r6 = com.ss.android.ugc.aweme.poi.e.r.a.TYPE_BAIDU
            r2.add(r6)
            goto L_0x010f
        L_0x00e6:
            java.lang.String r9 = "com.autonavi.minimap"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x00f4
            com.ss.android.ugc.aweme.poi.e.r$a r6 = com.ss.android.ugc.aweme.poi.e.r.a.TYPE_GAODE
            r2.add(r6)
            goto L_0x010f
        L_0x00f4:
            java.lang.String r9 = "com.tencent.map"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.poi.e.r$a r6 = com.ss.android.ugc.aweme.poi.e.r.a.TYPE_TENCENT
            r2.add(r6)
            goto L_0x010f
        L_0x0102:
            java.lang.String r9 = "com.google.android.apps.maps"
            boolean r6 = r9.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.poi.e.r$a r6 = com.ss.android.ugc.aweme.poi.e.r.a.TYPE_GOOGLE
            r2.add(r6)
        L_0x010f:
            int r5 = r5 + 1
            goto L_0x00b6
        L_0x0112:
            int r4 = r2.size()
            if (r4 != 0) goto L_0x0123
            r1 = 2131561747(0x7f0d0d13, float:1.8748903E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            return
        L_0x0123:
            boolean r4 = com.ss.android.g.a.a()
            if (r4 == 0) goto L_0x0139
            java.lang.Object r2 = r2.get(r8)
            r9 = r2
            com.ss.android.ugc.aweme.poi.e.r$a r9 = (com.ss.android.ugc.aweme.poi.e.r.a) r9
            r10 = r1[r8]
            r12 = r1[r3]
            r8 = r0
            com.ss.android.ugc.aweme.poi.e.r.a(r8, r9, r10, r12)
            return
        L_0x0139:
            java.lang.String[] r3 = com.ss.android.ugc.aweme.poi.e.r.a((java.util.List<com.ss.android.ugc.aweme.poi.e.r.a>) r2, (android.content.Context) r0)
            com.ss.android.ugc.aweme.common.ui.a r4 = new com.ss.android.ugc.aweme.common.ui.a
            r4.<init>(r0)
            com.ss.android.ugc.aweme.poi.e.i r5 = new com.ss.android.ugc.aweme.poi.e.i
            r5.<init>(r0, r2, r1)
            r4.a((java.lang.CharSequence[]) r3, (android.content.DialogInterface.OnClickListener) r5)
            r4.b()
            return
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter.n():void");
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60491b, false, 66179, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60491b, false, 66179, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mTitle != null) {
            this.mTitle.setAlpha(f2);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60491b, false, 66178, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60491b, false, 66178, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mTitle != null) {
            this.mTitle.setVisibility(i2);
        }
    }

    public final void c(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f60491b, false, 66169, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f60491b, false, 66169, new Class[]{e.class}, Void.TYPE);
        } else if (eVar == this.f60494d) {
            a(eVar, true);
        } else if (this.f60494d == null) {
            a(eVar, true);
            this.f60494d = eVar;
        } else {
            a(this.f60494d, false);
            this.f60494d = eVar;
            a(eVar, true);
        }
    }

    @OnClick({2131496329, 2131496326, 2131496340})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60491b, false, 66164, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60491b, false, 66164, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.c2y) {
            b();
        } else if (id == C0906R.id.c2v) {
            c();
        } else {
            if (id == C0906R.id.c39) {
                d();
            }
        }
    }

    public final void b(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f60491b, false, 66168, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f60491b, false, 66168, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f60493c.a(eVar2, false);
        c(eVar);
        if (eVar2 != e.RouteWalking) {
            a(eVar);
        }
    }

    public final String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60491b, false, 66173, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60491b, false, 66173, new Class[]{Integer.TYPE}, String.class);
        }
        int round = Math.round(((float) i2) / 60.0f);
        if (round < 60) {
            return String.format(k().getString(C0906R.string.bok), new Object[]{Integer.valueOf(round)});
        }
        int i3 = round / 60;
        int i4 = round % 60;
        if (i4 > 0) {
            return String.format(k().getString(C0906R.string.boi), new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(k().getString(C0906R.string.boj), new Object[]{Integer.valueOf(i3)});
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f60491b, false, 66175, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f60491b, false, 66175, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.f60495e).inflate(i(), null);
        TextView textView = (TextView) inflate.findViewById(C0906R.id.c25);
        TextView textView2 = (TextView) inflate.findViewById(C0906R.id.c24);
        if (this.f60496f != null) {
            textView.setText(this.f60496f.getPoiName());
            String addressStr = this.f60496f.getAddressStr();
            if (TextUtils.isEmpty(addressStr)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(addressStr);
            }
        }
        this.f60493c.a(inflate, new ag(d2, d3), h.a(this.f60495e, this.f60496f, (p.a) this), (f) new y(this));
        inflate.setOnClickListener(new z(this));
    }

    private void a(TextView textView, int i2, boolean z) {
        int i3;
        TextView textView2 = textView;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{textView2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60491b, false, 66171, new Class[]{TextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f60491b, false, 66171, new Class[]{TextView.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(k(), i2);
        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        textView2.setCompoundDrawables(null, a2, null, null);
        Resources k2 = k();
        if (z2) {
            i3 = C0906R.color.a1s;
        } else {
            i3 = C0906R.color.a08;
        }
        textView2.setTextColor(k2.getColor(i3));
        textView2.setSelected(z2);
    }

    public final void a(AmeBaseFragment ameBaseFragment, View view, MapLayout mapLayout, boolean z) {
        AmeBaseFragment ameBaseFragment2 = ameBaseFragment;
        View view2 = view;
        MapLayout mapLayout2 = mapLayout;
        if (PatchProxy.isSupport(new Object[]{ameBaseFragment2, view2, mapLayout2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60491b, false, 66156, new Class[]{AmeBaseFragment.class, View.class, MapLayout.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ameBaseFragment2, view2, mapLayout2, Byte.valueOf(z)}, this, f60491b, false, 66156, new Class[]{AmeBaseFragment.class, View.class, MapLayout.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = ButterKnife.bind((Object) this, view2);
        this.f60492a = ameBaseFragment2;
        this.f60493c = mapLayout2;
        this.f60495e = mapLayout.getContext();
        this.o = z;
    }
}
