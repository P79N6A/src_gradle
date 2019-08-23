package com.ss.android.ugc.aweme.base.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.b;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.poi.widget.PoiHalfScreenDialogNew;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.u.i;
import java.util.Map;

public class FeedTagLayout2 extends a implements View.OnClickListener {
    private static int J;
    public static ChangeQuickRedirect o;
    private HollowTextView A;
    private DmtTextView B;
    private View C;
    private PoiStruct D;
    private a E;
    private boolean F;
    private aa<ar> G;
    private String H;
    private DataCenter I;
    protected LinearLayout p;
    protected RemoteImageView q;
    public boolean r;
    private LinearLayout s;
    private ImageView t;
    private LinearLayout u;
    private TextView v;
    private TextView w;
    private View x;
    private TextView y;
    private LinearLayout z;

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25036, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 25036, new Class[0], Void.TYPE);
            return;
        }
        this.v.setVisibility(8);
        this.x.setVisibility(8);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 25033, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null && (!"homepage_fresh".equalsIgnoreCase(this.h) || !e.f())) {
            this.u.setVisibility(8);
        }
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25034, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, o, false, 25034, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.D == null || this.D.address == null || TextUtils.isEmpty(this.D.address.getCity())) {
            return true;
        } else {
            return false;
        }
    }

    private String getAreaText() {
        boolean z2;
        boolean z3;
        boolean z4;
        double d2;
        double d3;
        int i;
        int i2;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25022, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, o, false, 25022, new Class[0], String.class);
        }
        Context context = getContext();
        PoiStruct poiStruct = this.D;
        if (PatchProxy.isSupport(new Object[]{context, poiStruct}, null, p.f59828a, true, 66885, new Class[]{Context.class, PoiStruct.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{context, poiStruct}, null, p.f59828a, true, 66885, new Class[]{Context.class, PoiStruct.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (poiStruct != null) {
                a f2 = af.a(context).f();
                if (f2 != null) {
                    b address = poiStruct.getAddress();
                    String poiLatitude = poiStruct.getPoiLatitude();
                    String poiLongitude = poiStruct.getPoiLongitude();
                    if (address == null) {
                        str = "";
                    } else {
                        str = address.getCity();
                    }
                    z2 = p.a(f2, poiLatitude, poiLongitude, str);
                }
            }
            z2 = false;
        }
        if (!z2 || this.D.isAdminArea) {
            return null;
        }
        if (PatchProxy.isSupport(new Object[0], null, e.f59784a, true, 66807, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, e.f59784a, true, 66807, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d4 = AbTestManager.a().d();
            if (d4 != null) {
                i2 = d4.simplifyPoiEntry;
            } else {
                i2 = 1;
            }
            if ((i2 & 2) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            return this.D.getCity();
        }
        if (PatchProxy.isSupport(new Object[0], null, e.f59784a, true, 66808, new Class[0], Boolean.TYPE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, e.f59784a, true, 66808, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d5 = AbTestManager.a().d();
            if (d5 != null) {
                i = d5.simplifyPoiEntry;
            } else {
                i = 1;
            }
            if ((i & 4) > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (!z4) {
            return null;
        }
        double doubleValue = Double.valueOf(this.D.poiLatitude).doubleValue();
        double doubleValue2 = Double.valueOf(this.D.poiLongitude).doubleValue();
        double d6 = this.E.latitude;
        double d7 = this.E.longitude;
        if (!this.E.isGaode) {
            double[] b2 = com.ss.android.ugc.aweme.poi.e.a.b(d7, d6);
            d2 = b2[0];
            d3 = b2[1];
        } else {
            d3 = d6;
            d2 = d7;
        }
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDistanceBetweenLocations(getContext(), doubleValue, doubleValue2, d3, d2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        if (r1 != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = o
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 25032(0x61c8, float:3.5077E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = o
            r5 = 0
            r6 = 25032(0x61c8, float:3.5077E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f34997e
            if (r1 == 0) goto L_0x014f
            android.widget.LinearLayout r1 = r11.u
            if (r1 != 0) goto L_0x002d
            goto L_0x014f
        L_0x002d:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f34997e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r1.getPoiStruct()
            boolean r2 = r11.r
            if (r2 != 0) goto L_0x00c3
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.poi.e.p.f59828a
            r6 = 1
            r7 = 66899(0x10553, float:9.3745E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r9 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r8[r0] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x006f
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.poi.e.p.f59828a
            r7 = 1
            r8 = 66899(0x10553, float:9.3745E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r1 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00c1
        L_0x006f:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.poi.e.p.f59828a
            r6 = 1
            r7 = 66890(0x1054a, float:9.3733E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r9 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r8[r0] = r9
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00a6
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.poi.e.p.f59828a
            r7 = 1
            r8 = 66890(0x1054a, float:9.3733E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiStruct> r3 = com.ss.android.ugc.aweme.poi.model.PoiStruct.class
            r9[r0] = r3
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x00b5
        L_0x00a6:
            if (r1 == 0) goto L_0x00b4
            java.lang.String r3 = r1.getPoiId()
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00b4
            r3 = 1
            goto L_0x00b5
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            if (r3 == 0) goto L_0x00c0
            boolean r1 = r1.isExpandable()
            if (r1 != 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r1 = 1
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            if (r1 == 0) goto L_0x014e
        L_0x00c3:
            boolean r1 = r11.r
            if (r1 != 0) goto L_0x0149
            boolean r1 = com.ss.android.ugc.aweme.poi.e.e.f()
            if (r1 == 0) goto L_0x00d9
            android.widget.TextView r1 = r11.w
            r2 = 8
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r11.u
            r1.setVisibility(r0)
        L_0x00d9:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = o
            r5 = 0
            r6 = 25038(0x61ce, float:3.5086E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x00fb
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = o
            r5 = 0
            r6 = 25038(0x61ce, float:3.5086E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x014e
        L_0x00fb:
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x0148
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f34997e
            java.lang.String r1 = "poi_label_show"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r11.h
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f34997e
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f34997e
            java.lang.String r4 = r4.getAuthorUid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f34997e
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.e((com.ss.android.ugc.aweme.feed.model.Aweme) r4)
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "poi_label_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f34997e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.getPoiStruct()
            int r4 = r4.getPoiSubTitleType()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (int) r4)
            com.ss.android.ugc.aweme.poi.e.h.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (java.lang.String) r1, (com.ss.android.ugc.aweme.app.d.d) r2)
        L_0x0148:
            return
        L_0x0149:
            android.widget.LinearLayout r1 = r11.u
            r1.setVisibility(r0)
        L_0x014e:
            return
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.FeedTagLayout2.b():void");
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.I = dataCenter;
    }

    public void setOnIntervalEventListener(aa<ar> aaVar) {
        this.G = aaVar;
    }

    public FeedTagLayout2(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (PatchProxy.isSupport(new Object[]{view}, this, o, false, 25029, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, o, false, 25029, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.rg) {
            if (!(this.f34997e == null || this.f34997e.getChallengeList() == null)) {
                Challenge challenge = this.f34997e.getChallengeList().get(0);
                if (challenge != null) {
                    h a2 = h.a();
                    Activity activity = this.i;
                    j a3 = j.a("aweme://challenge/detail/" + challenge.getCid());
                    if (this.f34997e != null) {
                        str5 = this.f34997e.getAid();
                    } else {
                        str5 = "";
                    }
                    j a4 = a3.a("aweme_id", str5);
                    if (r.b(challenge)) {
                        str6 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str6 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    a2.a(activity, a4.a("is_commerce", str6).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).a());
                    MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.h);
                    if (this.f34997e == null) {
                        str7 = "";
                    } else {
                        str7 = this.f34997e.getAid();
                    }
                    MobClick extValueString = labelName.setValue(str7).setExtValueString(challenge.getCid());
                    c cVar = new c();
                    if (this.j == null) {
                        str8 = "";
                    } else {
                        str8 = this.j.optString("request_id");
                    }
                    c a5 = cVar.a("request_id", str8);
                    if (this.f34997e == null) {
                        str9 = "";
                    } else if (this.f34997e.isImage()) {
                        str9 = "photo";
                    } else {
                        str9 = "video";
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(extValueString.setJsonObject(a5.a("content_type", str9).b()));
                    if (this.j == null) {
                        str10 = "";
                    } else {
                        str10 = this.j.optString("request_id");
                    }
                    if (StringUtils.isEmpty(str10)) {
                        str10 = com.ss.android.ugc.aweme.feed.a.a().c(this.f34997e, this.k);
                    }
                    ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(this.h).f(this.f34997e).e(challenge.getCid()).a("click_in_video_name")).f(str10).e();
                    if (this.f34997e.isAd()) {
                        g.w(view.getContext(), this.f34997e);
                    }
                }
            }
        } else if (id == C0906R.id.c22 && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (this.r) {
                com.ss.android.ugc.aweme.j.a.a.a(this.f34996d, this.f34997e);
                com.ss.android.ugc.aweme.common.r.a("click_mission_icon", (Map) d.a().a("enter_from", this.h).a("group_id", this.f34997e.getAid()).a("author_id", com.ss.android.ugc.aweme.u.aa.b(this.f34997e.getAuthor())).a("entrance_location", "poi_location").f34114b);
            } else if (this.m) {
                com.ss.android.ugc.aweme.opensdk.a.a(this.f34996d, this.f34997e);
            } else if (!p.a(this.D) || com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, o, false, 25031, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, o, false, 25031, new Class[0], Void.TYPE);
                    return;
                }
                String e2 = com.ss.android.ugc.aweme.u.aa.e(this.f34997e);
                String g = com.ss.android.ugc.aweme.u.aa.g(this.f34997e);
                String h = com.ss.android.ugc.aweme.u.aa.h(this.f34997e);
                String m = com.ss.android.ugc.aweme.u.aa.m(this.f34997e);
                g.d(this.f34996d, this.f34997e, e2);
                if (!p.a(this.E, this.D) && p.b(this.D)) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                this.H = str;
                Context context = this.f34996d;
                l.a r2 = new l.a().c(e2).g(g).f(h).a(this.f34997e.getPoiStruct()).a(this.f34997e).j(this.n).i(this.h).o(this.H).r(String.valueOf(this.D.getPoiSubTitleType()));
                if (AwemeAppData.p().ap) {
                    str2 = "auto";
                } else {
                    str2 = "normal";
                }
                PoiDetailActivity.a(context, r2.t(str2).a());
                if (this.G != null) {
                    this.G.a(new ar(33, this.f34997e));
                }
                try {
                    MobClick value = MobClick.obtain().setEventName("poi_click").setLabelName(this.h).setValue(m);
                    c a6 = new c().a("poi_id", e2).a("poi_type", h);
                    if (this.j == null) {
                        str3 = "";
                    } else {
                        str3 = this.j.optString("request_id");
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(value.setJsonObject(a6.a("request_id", str3).a("group_id", m).a("content_type", com.ss.android.ugc.aweme.u.aa.o(this.f34997e)).b()));
                    i e3 = new i().a(this.h).e(this.f34997e);
                    if (this.j == null) {
                        str4 = "";
                    } else {
                        str4 = this.j.optString("request_id");
                    }
                    e3.b(str4).c(e2).e(h).e();
                } catch (Exception unused) {
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, o, false, 25030, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, o, false, 25030, new Class[0], Void.TYPE);
                } else if (getContext() != null && !((Activity) getContext()).isFinishing() && !((Activity) getContext()).isDestroyed()) {
                    PoiHalfScreenDialogNew poiHalfScreenDialogNew = new PoiHalfScreenDialogNew(C0906R.style.rc, this.D, this.h, this.f34997e, getContext(), this.E);
                    poiHalfScreenDialogNew.show();
                }
            }
        }
    }

    public FeedTagLayout2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedTagLayout2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34996d = context;
        setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x073e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0759  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r26, android.app.Activity r27, java.lang.String r28, org.json.JSONObject r29) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = o
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 25020(0x61bc, float:3.506E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0064
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25020(0x61bc, float:3.506E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r13] = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0064:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25019(0x61bb, float:3.5059E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 8
            if (r0 == 0) goto L_0x008b
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25019(0x61bb, float:3.5059E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a0
        L_0x008b:
            boolean r0 = r7.F
            if (r0 != 0) goto L_0x01a0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25018(0x61ba, float:3.5058E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25018(0x61ba, float:3.5058E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a0
        L_0x00b4:
            r7.F = r14
            android.content.Context r0 = r7.f34996d
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690616(0x7f0f0478, float:1.901028E38)
            r0.inflate(r1, r7)
            r7.setOrientation(r14)
            android.content.Context r0 = r7.f34996d
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.setPadding(r13, r13, r0, r13)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r0 < r2) goto L_0x00e1
            android.content.Context r0 = r7.f34996d
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.setPaddingRelative(r13, r13, r0, r13)
        L_0x00e1:
            r0 = 2131168313(0x7f070c39, float:1.7950924E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f34994b = r0
            r0 = 2131168990(0x7f070ede, float:1.7952297E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.s = r0
            r0 = 2131168989(0x7f070edd, float:1.7952295E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.p = r0
            r0 = 2131167654(0x7f0709a6, float:1.7949588E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
            r7.q = r0
            r0 = 2131167712(0x7f0709e0, float:1.7949705E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.t = r0
            r0 = 2131168987(0x7f070edb, float:1.7952291E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.u = r0
            r0 = 2131165918(0x7f0702de, float:1.7946067E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.v = r0
            r0 = 2131165919(0x7f0702df, float:1.7946069E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.w = r0
            r0 = 2131166395(0x7f0704bb, float:1.7947034E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.x = r0
            r0 = 2131167394(0x7f0708a2, float:1.794906E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.y = r0
            r0 = 2131166211(0x7f070403, float:1.794666E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.z = r0
            r0 = 2131165433(0x7f0700f9, float:1.7945083E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r7.B = r0
            r0 = 2131166401(0x7f0704c1, float:1.7947046E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.C = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.View$OnTouchListener r0 = com.ss.android.ugc.aweme.utils.ed.a(r0, r1)
            android.widget.LinearLayout r1 = r7.s
            r1.setOnTouchListener(r0)
            android.widget.LinearLayout r0 = r7.s
            r0.setOnClickListener(r7)
            android.widget.LinearLayout r0 = r7.s
            boolean r1 = com.ss.android.ugc.aweme.poi.e.p.b()
            if (r1 == 0) goto L_0x0188
            r1 = 0
            goto L_0x018a
        L_0x0188:
            r1 = 8
        L_0x018a:
            r0.setVisibility(r1)
            int r0 = J
            if (r0 != 0) goto L_0x01a0
            android.content.Context r0 = r7.f34996d
            int r0 = com.ss.android.ugc.aweme.base.utils.p.b(r0)
            r1 = 4639833516098453504(0x4064000000000000, double:160.0)
            int r1 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            int r0 = r0 - r1
            J = r0
        L_0x01a0:
            r7.f34997e = r8
            r7.h = r10
            r7.i = r9
            r7.j = r11
            r7.r = r13
            r25.c()
            android.widget.ImageView r0 = r7.t
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.cl()
            if (r1 == 0) goto L_0x01bb
            r1 = 0
            goto L_0x01bd
        L_0x01bb:
            r1 = 8
        L_0x01bd:
            r0.setVisibility(r1)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25024(0x61c0, float:3.5066E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01eb
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25024(0x61c0, float:3.5066E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0245
        L_0x01eb:
            boolean r0 = r25.a()
            if (r0 == 0) goto L_0x0244
            android.widget.LinearLayout r0 = r7.s
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.p
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.q
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.f34994b
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.q
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f34997e
            com.ss.android.ugc.aweme.opensdk.a.a r1 = r1.getOpenPlatformStruct()
            java.lang.String r1 = r1.getIcon()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            android.widget.TextView r0 = r7.f34994b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f34997e
            com.ss.android.ugc.aweme.opensdk.a.a r1 = r1.getOpenPlatformStruct()
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            android.view.View r0 = r7.C
            r0.setVisibility(r12)
            android.widget.LinearLayout r0 = r7.u
            r0.setVisibility(r12)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.opensdk.a.a r0 = r0.getOpenPlatformStruct()
            java.lang.String r0 = r0.getLink()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0242
            android.widget.ImageView r0 = r7.t
            r0.setVisibility(r12)
        L_0x0242:
            r0 = 1
            goto L_0x0245
        L_0x0244:
            r0 = 0
        L_0x0245:
            r7.m = r0
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x024d
            r0 = 0
            goto L_0x024f
        L_0x024d:
            r0 = 8
        L_0x024f:
            r7.setVisibility(r0)
            boolean r0 = r7.m
            r7.l = r0
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x025b
            return
        L_0x025b:
            boolean r0 = com.ss.android.ugc.aweme.poi.e.e.k()
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "poi_page"
            java.lang.String r1 = r7.h
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x066b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.getPoiStruct()
            r7.D = r0
            com.ss.android.ugc.aweme.app.k r0 = com.ss.android.ugc.aweme.app.k.a()
            com.ss.android.ugc.aweme.app.af r0 = com.ss.android.ugc.aweme.app.af.a((android.content.Context) r0)
            com.ss.android.ugc.aweme.poi.a r0 = r0.f()
            r7.E = r0
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            if (r0 == 0) goto L_0x066b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r0 = r0.poiId
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x066b
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25037(0x61cd, float:3.5084E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02b3
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25037(0x61cd, float:3.5084E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02cc
        L_0x02b3:
            android.widget.TextView r0 = r7.v
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.w
            r0.setVisibility(r12)
            android.view.View r0 = r7.x
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.y
            r0.setVisibility(r13)
            android.widget.LinearLayout r0 = r7.z
            r0.setVisibility(r12)
        L_0x02cc:
            android.widget.TextView r0 = r7.f34994b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            java.lang.String r1 = r1.poiName
            r0.setText(r1)
            java.lang.String r8 = r25.getAreaText()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0371
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25021(0x61bd, float:3.5062E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0316
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25021(0x61bd, float:3.5062E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0340
        L_0x0316:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.B
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.measureText(r8)
            android.widget.TextView r1 = r7.f34994b
            android.text.TextPaint r1 = r1.getPaint()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r7.D
            java.lang.String r2 = r2.poiName
            float r1 = r1.measureText(r2)
            float r1 = r1 + r0
            int r2 = J
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0338
        L_0x0336:
            r0 = 1
            goto L_0x0340
        L_0x0338:
            r1 = 1127219200(0x43300000, float:176.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x033f
            goto L_0x0336
        L_0x033f:
            r0 = 0
        L_0x0340:
            if (r0 == 0) goto L_0x0356
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.B
            r0.setVisibility(r13)
            android.view.View r0 = r7.C
            r0.setVisibility(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.B
            r0.setText(r8)
            r25.e()
            goto L_0x04a6
        L_0x0356:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.B
            r0.setVisibility(r12)
            android.view.View r0 = r7.C
            r0.setVisibility(r12)
            android.widget.TextView r0 = r7.w
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.w
            r0.setText(r8)
            android.widget.TextView r0 = r7.v
            r0.setText(r8)
            goto L_0x04a6
        L_0x0371:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.B
            r0.setVisibility(r12)
            android.view.View r0 = r7.C
            r0.setVisibility(r12)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25023(0x61bf, float:3.5065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03a0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25023(0x61bf, float:3.5065E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04a6
        L_0x03a0:
            com.ss.android.ugc.aweme.poi.a r0 = r7.E
            if (r0 != 0) goto L_0x03be
            boolean r0 = r25.d()
            if (r0 != 0) goto L_0x03b9
            android.widget.TextView r0 = r7.v
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            com.ss.android.ugc.aweme.poi.model.b r1 = r1.address
            java.lang.String r1 = r1.getCity()
            r0.setText(r1)
            goto L_0x04a6
        L_0x03b9:
            r25.e()
            goto L_0x04a6
        L_0x03be:
            com.ss.android.ugc.aweme.poi.a r0 = r7.E
            java.lang.String r0 = r0.city
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x048f
            boolean r0 = r25.d()
            if (r0 != 0) goto L_0x048b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            com.ss.android.ugc.aweme.poi.a r1 = r7.E
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r0, (com.ss.android.ugc.aweme.poi.a) r1)
            if (r0 == 0) goto L_0x0473
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25035(0x61cb, float:3.5082E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0403
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25035(0x61cb, float:3.5082E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x041f
        L_0x0403:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            if (r0 == 0) goto L_0x041e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r0 = r0.poiLatitude
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x041e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r0 = r0.poiLongitude
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x041c
            goto L_0x041e
        L_0x041c:
            r0 = 0
            goto L_0x041f
        L_0x041e:
            r0 = 1
        L_0x041f:
            if (r0 != 0) goto L_0x0473
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r0 = r0.poiLatitude
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r17 = r0.doubleValue()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r0 = r0.poiLongitude
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r19 = r0.doubleValue()
            com.ss.android.ugc.aweme.poi.a r0 = r7.E
            double r0 = r0.latitude
            com.ss.android.ugc.aweme.poi.a r2 = r7.E
            double r2 = r2.longitude
            com.ss.android.ugc.aweme.poi.a r4 = r7.E
            boolean r4 = r4.isGaode
            if (r4 != 0) goto L_0x0454
            double[] r0 = com.ss.android.ugc.aweme.poi.e.a.b(r2, r0)
            r1 = r0[r13]
            r3 = r0[r14]
            r23 = r1
            r21 = r3
            goto L_0x0458
        L_0x0454:
            r21 = r0
            r23 = r2
        L_0x0458:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            r15 = r0
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r15 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r15
            android.content.Context r16 = r25.getContext()
            java.lang.String r0 = r15.getDistanceBetweenLocations(r16, r17, r19, r21, r23)
            android.widget.TextView r1 = r7.v
            r1.setText(r0)
            goto L_0x04a6
        L_0x0473:
            boolean r0 = r25.d()
            if (r0 != 0) goto L_0x0487
            android.widget.TextView r0 = r7.v
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            com.ss.android.ugc.aweme.poi.model.b r1 = r1.address
            java.lang.String r1 = r1.getCity()
            r0.setText(r1)
            goto L_0x04a6
        L_0x0487:
            r25.e()
            goto L_0x04a6
        L_0x048b:
            r25.e()
            goto L_0x04a6
        L_0x048f:
            boolean r0 = r25.d()
            if (r0 != 0) goto L_0x04a3
            android.widget.TextView r0 = r7.v
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            com.ss.android.ugc.aweme.poi.model.b r1 = r1.address
            java.lang.String r1 = r1.getCity()
            r0.setText(r1)
            goto L_0x04a6
        L_0x04a3:
            r25.e()
        L_0x04a6:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            int r0 = r0.itemCount
            if (r0 <= 0) goto L_0x04cf
            android.widget.TextView r0 = r7.y
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131558824(0x7f0d01a8, float:1.8742975E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.Object[] r2 = new java.lang.Object[r14]
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r7.D
            int r3 = r3.itemCount
            long r3 = (long) r3
            java.lang.String r3 = com.ss.android.ugc.aweme.i18n.b.a(r3)
            r2[r13] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.setText(r1)
            r8 = 1
            goto L_0x04d5
        L_0x04cf:
            android.widget.TextView r0 = r7.y
            r0.setVisibility(r12)
            r8 = 0
        L_0x04d5:
            com.ss.android.ugc.aweme.poi.a r0 = r7.E
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.poi.a) r0, (com.ss.android.ugc.aweme.poi.model.PoiStruct) r1)
            if (r0 == 0) goto L_0x04eb
            android.widget.LinearLayout r0 = r7.z
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r7.z
            r0.setVisibility(r12)
            goto L_0x0571
        L_0x04eb:
            android.widget.LinearLayout r0 = r7.z
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r7.D
            java.lang.String r9 = r0.getPoiSubTitle()
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25027(0x61c3, float:3.507E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0526
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25027(0x61c3, float:3.507E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0571
        L_0x0526:
            android.widget.LinearLayout r0 = r7.z
            r0.removeAllViews()
            com.ss.android.ugc.aweme.base.ui.HollowTextView$a r0 = new com.ss.android.ugc.aweme.base.ui.HollowTextView$a
            r0.<init>()
            r1 = 4622382067542392832(0x4026000000000000, double:11.0)
            int r1 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            r0.f34948b = r1
            r1 = 2131624917(0x7f0e03d5, float:1.8877027E38)
            int r1 = com.ss.android.ugc.aweme.base.utils.o.a(r1)
            r0.f34949c = r1
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            r0.f34950d = r3
            r0.g = r14
            r0.f34952f = r14
            r0.h = r14
            r0.f34951e = r14
            com.ss.android.ugc.aweme.base.ui.HollowTextView r3 = new com.ss.android.ugc.aweme.base.ui.HollowTextView
            android.content.Context r4 = r25.getContext()
            r3.<init>((android.content.Context) r4, (com.ss.android.ugc.aweme.base.ui.HollowTextView.a) r0)
            r7.A = r3
            int r0 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            com.ss.android.ugc.aweme.base.ui.HollowTextView r1 = r7.A
            r1.setPadding(r0, r0, r0, r0)
            com.ss.android.ugc.aweme.base.ui.HollowTextView r0 = r7.A
            r0.setText(r9)
            android.widget.LinearLayout r0 = r7.z
            com.ss.android.ugc.aweme.base.ui.HollowTextView r1 = r7.A
            r0.addView(r1)
        L_0x0571:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25028(0x61c4, float:3.5072E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x05aa
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25028(0x61c4, float:3.5072E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0669
        L_0x05aa:
            android.widget.TextView r0 = r7.v
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            android.widget.TextView r1 = r7.y
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            android.widget.TextView r2 = r7.v
            android.text.TextPaint r2 = r2.getPaint()
            android.widget.TextView r3 = r7.v
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x05d2
            float r0 = r2.measureText(r0)
            int r0 = (int) r0
            goto L_0x05d3
        L_0x05d2:
            r0 = 0
        L_0x05d3:
            float r1 = r2.measureText(r1)
            int r1 = (int) r1
            com.ss.android.ugc.aweme.base.ui.HollowTextView r3 = r7.A
            if (r3 == 0) goto L_0x05fb
            com.ss.android.ugc.aweme.base.ui.HollowTextView r3 = r7.A
            java.lang.String r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x05fb
            com.ss.android.ugc.aweme.base.ui.HollowTextView r3 = r7.A
            java.lang.String r3 = r3.getText()
            float r2 = r2.measureText(r3)
            int r2 = (int) r2
            r3 = 4628011567076605952(0x403a000000000000, double:26.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r3)
            int r2 = r2 + r3
            goto L_0x05fc
        L_0x05fb:
            r2 = 0
        L_0x05fc:
            android.content.Context r3 = r25.getContext()
            int r3 = com.bytedance.common.utility.UIUtils.getScreenWidth(r3)
            r4 = 4638566878703255552(0x405f800000000000, double:126.0)
            int r4 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r3 = r3 - r4
            int r3 = r3 - r2
            int r0 = r3 - r0
            r4 = 4626322717216342016(0x4034000000000000, double:20.0)
            int r2 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r0 = r0 - r2
            int r2 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r3 = r3 - r2
            android.widget.TextView r2 = r7.v
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0632
            if (r3 > 0) goto L_0x062d
            android.widget.TextView r2 = r7.v
            r2.setVisibility(r12)
            goto L_0x0632
        L_0x062d:
            android.widget.TextView r2 = r7.v
            r2.setMaxWidth(r3)
        L_0x0632:
            if (r0 >= r1) goto L_0x063c
            android.view.View r0 = r7.x
            r0.setVisibility(r12)
            android.widget.TextView r0 = r7.y
            goto L_0x0647
        L_0x063c:
            android.view.View r0 = r7.x
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.y
            if (r8 == 0) goto L_0x0647
            r1 = 0
            goto L_0x0649
        L_0x0647:
            r1 = 8
        L_0x0649:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.v
            int r0 = r0.getVisibility()
            if (r0 == r12) goto L_0x0664
            android.widget.TextView r0 = r7.v
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0669
        L_0x0664:
            android.view.View r0 = r7.x
            r0.setVisibility(r12)
        L_0x0669:
            r0 = 1
            goto L_0x066c
        L_0x066b:
            r0 = 0
        L_0x066c:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.I
            if (r1 == 0) goto L_0x067b
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.I
            java.lang.String r2 = "show_poi_distance"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r1.a((java.lang.String) r2, (java.lang.Object) r3)
        L_0x067b:
            r7.l = r0
            if (r0 != 0) goto L_0x0739
            boolean r1 = r7.m
            if (r1 != 0) goto L_0x0739
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25025(0x61c1, float:3.5067E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x06af
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25025(0x61c1, float:3.5067E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x072a
        L_0x06af:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25026(0x61c2, float:3.5069E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x06da
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 25026(0x61c2, float:3.5069E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x06e9
        L_0x06da:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            if (r0 == 0) goto L_0x06e8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            boolean r0 = com.ss.android.ugc.aweme.j.a.a.a(r0)
            if (r0 == 0) goto L_0x06e8
            r0 = 1
            goto L_0x06e9
        L_0x06e8:
            r0 = 0
        L_0x06e9:
            if (r0 == 0) goto L_0x0729
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct r0 = r0.getXiGuaTask()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.q
            r2 = 2130839455(0x7f02079f, float:1.7283921E38)
            r1.setImageResource(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.q
            r1.setVisibility(r13)
            android.widget.TextView r1 = r7.f34994b
            r2 = 2131564684(0x7f0d188c, float:1.875486E38)
            r1.setText(r2)
            android.widget.LinearLayout r1 = r7.u
            r1.setVisibility(r12)
            android.widget.TextView r1 = r7.v
            java.lang.String r2 = r0.getTitle()
            r1.setText(r2)
            android.widget.TextView r1 = r7.v
            r1.setVisibility(r13)
            android.widget.TextView r1 = r7.y
            r1.setVisibility(r13)
            android.widget.TextView r1 = r7.y
            java.lang.String r0 = r0.getDesc()
            r1.setText(r0)
            r0 = 1
            goto L_0x072a
        L_0x0729:
            r0 = 0
        L_0x072a:
            r7.r = r0
            boolean r0 = r7.r
            if (r0 == 0) goto L_0x0731
            r12 = 0
        L_0x0731:
            r7.setVisibility(r12)
            boolean r0 = r7.r
            r7.l = r0
            return
        L_0x0739:
            r7.setVisibility(r13)
            if (r0 == 0) goto L_0x0759
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.q
            r0.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.q
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r7.D
            com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.poi.model.PoiStruct) r1)
            android.content.Context r0 = r7.f34996d
            r1 = 1105199104(0x41e00000, float:28.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            android.widget.LinearLayout r1 = r7.p
            r1.setVisibility(r13)
            goto L_0x076c
        L_0x0759:
            android.content.Context r0 = r7.f34996d
            r1 = 1101004800(0x41a00000, float:20.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            android.widget.LinearLayout r1 = r7.p
            r1.setVisibility(r12)
            android.widget.LinearLayout r1 = r7.u
            r1.setVisibility(r12)
        L_0x076c:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r0)
            android.widget.LinearLayout r0 = r7.p
            r0.setLayoutParams(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.FeedTagLayout2.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, java.lang.String, org.json.JSONObject):void");
    }
}
