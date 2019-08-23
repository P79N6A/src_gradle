package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.a;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.ui.ad;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.poi.widget.PoiHalfScreenDialogNew;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.i;
import com.ss.android.ugc.aweme.utils.ed;
import org.json.JSONObject;

public class FollowFeedTagLayout2 extends a implements View.OnClickListener {
    public static ChangeQuickRedirect o;
    private RemoteImageView p;
    private View q;
    private ad r;

    public int getLayoutId() {
        return C0906R.layout.a44;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 61520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 61520, new Class[0], Void.TYPE);
            return;
        }
        if (getVisibility() == 0) {
            this.q.setVisibility(8);
            if (this.f34995c.getVisibility() == 8) {
                setVisibility(8);
            }
        }
    }

    public final void c() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 61521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 61521, new Class[0], Void.TYPE);
        } else if (ao.a(this.f34995c)) {
            onClick(this.f34995c);
        } else if (ao.a(this.q)) {
            onClick(this.q);
        } else {
            ad adVar = this.r;
            if (PatchProxy.isSupport(new Object[0], adVar, ad.f46392a, false, 42727, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], adVar, ad.f46392a, false, 42727, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (ao.a(adVar.f46394c) || ao.a(adVar.f46393b)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ad adVar2 = this.r;
                if (PatchProxy.isSupport(new Object[0], adVar2, ad.f46392a, false, 42724, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], adVar2, ad.f46392a, false, 42724, new Class[0], Void.TYPE);
                } else if (ao.a(adVar2.f46394c)) {
                    adVar2.b(adVar2.f46395d);
                } else {
                    if (ao.a(adVar2.f46393b)) {
                        adVar2.c(adVar2.f46395d);
                    }
                }
            } else if (this.m) {
                com.ss.android.ugc.aweme.opensdk.a.a(this.f34996d, this.f34997e);
            }
        }
    }

    public final void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 61522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 61522, new Class[0], Void.TYPE);
            return;
        }
        f microAppInfo = this.f34997e.getMicroAppInfo();
        if (microAppInfo != null) {
            ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).preloadMiniApp(microAppInfo.getAppId(), microAppInfo.getType());
            String m = aa.m(this.f34997e);
            MobClick value = MobClick.obtain().setEventName("mp_show").setLabelName(this.h).setValue(m);
            c cVar = new c();
            if (this.j == null) {
                str = "";
            } else {
                str = this.j.optString("request_id");
            }
            r.onEvent(value.setJsonObject(cVar.a("request_id", str).a("group_id", m).a("content_type", aa.o(this.f34997e)).b()));
        }
    }

    public FollowFeedTagLayout2(Context context) {
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
        if (PatchProxy.isSupport(new Object[]{view}, this, o, false, 61523, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, o, false, 61523, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.rg) {
            if (!(com.ss.android.ugc.aweme.c.a.a.a(view) || this.f34997e == null || this.f34997e.getChallengeList() == null)) {
                Challenge challenge = this.f34997e.getChallengeList().get(0);
                if (challenge != null) {
                    h a2 = h.a();
                    Activity activity = this.i;
                    j a3 = j.a("aweme://challenge/detail/" + challenge.getCid());
                    if (this.f34997e != null) {
                        str4 = this.f34997e.getAid();
                    } else {
                        str4 = "";
                    }
                    j a4 = a3.a("aweme_id", str4).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                    if (com.ss.android.ugc.aweme.commercialize.utils.r.b(challenge)) {
                        str5 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str5 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    a2.a(activity, a4.a("is_commerce", str5).a());
                    c cVar = new c();
                    if (this.j == null) {
                        str6 = "";
                    } else {
                        str6 = this.j.optString("request_id");
                    }
                    c a5 = cVar.a("request_id", str6);
                    if (this.f34997e == null) {
                        str7 = "";
                    } else if (this.f34997e.isImage()) {
                        str7 = "photo";
                    } else {
                        str7 = "video";
                    }
                    c a6 = a5.a("content_type", str7);
                    if (this.f34997e == null) {
                        str8 = "";
                    } else {
                        str8 = this.f34997e.getAuthorUid();
                    }
                    JSONObject a7 = com.ss.android.ugc.aweme.forward.e.a.a(a6.a("author_id", str8).b(), this.f34997e, this.n);
                    MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.h);
                    if (this.f34997e == null) {
                        str9 = "";
                    } else {
                        str9 = this.f34997e.getAid();
                    }
                    r.onEvent(labelName.setValue(str9).setExtValueString(challenge.getCid()).setJsonObject(a7));
                    if (this.j == null) {
                        str10 = "";
                    } else {
                        str10 = this.j.optString("request_id");
                    }
                    if (StringUtils.isEmpty(str10)) {
                        str10 = com.ss.android.ugc.aweme.feed.a.a().c(this.f34997e, this.k);
                    }
                    ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(this.h).f(this.f34997e).c(this.n).e(challenge.getCid()).a("click_in_video_name")).f(str10).e();
                    if (this.f34997e.isAd()) {
                        g.w(view.getContext(), this.f34997e);
                    }
                }
            }
        } else if (id == C0906R.id.bjs && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (p.a(this.f34997e.getPoiStruct()) && !com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, o, false, 61525, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, o, false, 61525, new Class[0], Void.TYPE);
                } else {
                    PoiHalfScreenDialogNew poiHalfScreenDialogNew = new PoiHalfScreenDialogNew(C0906R.style.rc, this.f34997e.getPoiStruct(), this.h, this.f34997e, this.f34996d, af.a((Context) k.a()).f());
                    poiHalfScreenDialogNew.show();
                }
            } else if (this.f34997e.getMicroAppInfo() != null) {
                if (PatchProxy.isSupport(new Object[0], this, o, false, 61524, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, o, false, 61524, new Class[0], Void.TYPE);
                } else {
                    String m = aa.m(this.f34997e);
                    MobClick value = MobClick.obtain().setEventName("mp_click").setLabelName(this.h).setValue(m);
                    c cVar2 = new c();
                    if (this.j == null) {
                        str3 = "";
                    } else {
                        str3 = this.j.optString("request_id");
                    }
                    r.onEvent(value.setJsonObject(cVar2.a("request_id", str3).a("group_id", m).a("content_type", aa.o(this.f34997e)).b()));
                    ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(this.i, this.f34997e.getMicroAppInfo().getSchema(), new b.a().b(this.h).d(m).c("025002").a());
                }
            } else if (this.m) {
                com.ss.android.ugc.aweme.opensdk.a.a(this.f34996d, this.f34997e);
            } else {
                if (PatchProxy.isSupport(new Object[0], this, o, false, 61526, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, o, false, 61526, new Class[0], Void.TYPE);
                    return;
                }
                String e2 = aa.e(this.f34997e);
                String g = aa.g(this.f34997e);
                String h = aa.h(this.f34997e);
                String m2 = aa.m(this.f34997e);
                PoiDetailActivity.a(this.f34996d, e2, g, h, this.h, this.f34997e, this.n);
                try {
                    MobClick value2 = MobClick.obtain().setEventName("poi_click").setLabelName(this.h).setValue(m2);
                    c a8 = new c().a("poi_id", e2).a("poi_type", h);
                    if (this.j == null) {
                        str = "";
                    } else {
                        str = this.j.optString("request_id");
                    }
                    r.onEvent(value2.setJsonObject(a8.a("request_id", str).a("group_id", m2).a("content_type", aa.o(this.f34997e)).b()));
                    i e3 = new i().a(this.h).e(this.f34997e);
                    if (this.j == null) {
                        str2 = "";
                    } else {
                        str2 = this.j.optString("request_id");
                    }
                    i c2 = e3.b(str2).c(e2);
                    c2.f75128b = this.n;
                    c2.e(h).e();
                } catch (Exception unused) {
                }
            }
        }
    }

    public FollowFeedTagLayout2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowFeedTagLayout2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34996d = context;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 61515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 61515, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(this.f34996d).inflate(getLayoutId(), this);
        setOrientation(0);
        this.f34998f = (int) UIUtils.dip2Px(getContext(), 5.0f);
        this.g = -((int) UIUtils.dip2Px(getContext(), 0.0f));
        this.f34994b = (TextView) findViewById(C0906R.id.bjr);
        this.f34995c = (TextView) findViewById(C0906R.id.rg);
        this.p = (RemoteImageView) findViewById(C0906R.id.bjt);
        this.q = findViewById(C0906R.id.bjs);
        View.OnTouchListener a2 = ed.a(0.5f, 1.0f);
        this.f34995c.setOnTouchListener(a2);
        this.q.setOnTouchListener(a2);
        this.f34995c.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.q.setVisibility(!p.b() ? 8 : i2);
        this.r = new ad((TextView) findViewById(C0906R.id.djv));
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r24, android.app.Activity r25, java.lang.String r26, org.json.JSONObject r27) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
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
            r4 = 61516(0xf04c, float:8.6202E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0066
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 61516(0xf04c, float:8.6202E-41)
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
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0066:
            r7.f34997e = r8
            r7.h = r10
            r7.i = r9
            r7.j = r11
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            boolean r0 = r0.isWithGoods()
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f34997e
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = r0.getPromotion()
            if (r0 == 0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 != 0) goto L_0x009b
            com.ss.android.ugc.aweme.feed.ui.ad r0 = r7.r
            if (r0 == 0) goto L_0x009b
            boolean r0 = com.ss.android.ugc.aweme.feed.ui.ad.a(r24)
            if (r0 == 0) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            android.widget.TextView r1 = r7.f34995c
            r9 = 8
            r1.setVisibility(r9)
            com.ss.android.ugc.aweme.feed.ui.ad r1 = r7.r
            if (r1 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.feed.ui.ad r1 = r7.r
            int r2 = r7.k
            java.lang.String r3 = r7.h
            r1.a(r2, r3, r11)
            com.ss.android.ugc.aweme.feed.ui.ad r1 = r7.r
            java.lang.Object[] r2 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r19 = 0
            r20 = 42725(0xa6e5, float:5.987E-41)
            java.lang.Class[] r3 = new java.lang.Class[r13]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r2
            r17 = r1
            r21 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r2 == 0) goto L_0x00e2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r19 = 0
            r20 = 42725(0xa6e5, float:5.987E-41)
            java.lang.Class[] r3 = new java.lang.Class[r13]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r2
            r17 = r1
            r21 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00eb
        L_0x00e2:
            android.view.View r2 = r1.f46393b
            if (r2 == 0) goto L_0x00eb
            android.view.View r1 = r1.f46393b
            r1.setVisibility(r9)
        L_0x00eb:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f34997e
            com.ss.android.ugc.aweme.miniapp_api.model.f r1 = r1.getMicroAppInfo()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f34997e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r10 = r2.getPoiStruct()
            r2 = 800(0x320, float:1.121E-42)
            if (r1 == 0) goto L_0x0158
            android.view.View r3 = r7.q
            r3.setVisibility(r13)
            int r3 = r1.getType()
            if (r3 != r14) goto L_0x0121
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r7.p
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.lang.String r5 = "res"
            android.net.Uri$Builder r4 = r4.scheme(r5)
            java.lang.String r5 = "2130839682"
            android.net.Uri$Builder r4 = r4.path(r5)
            android.net.Uri r4 = r4.build()
            r3.setImageURI((android.net.Uri) r4)
            goto L_0x013d
        L_0x0121:
            if (r3 != r15) goto L_0x013d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r7.p
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.lang.String r5 = "res"
            android.net.Uri$Builder r4 = r4.scheme(r5)
            java.lang.String r5 = "2130839687"
            android.net.Uri$Builder r4 = r4.path(r5)
            android.net.Uri r4 = r4.build()
            r3.setImageURI((android.net.Uri) r4)
        L_0x013d:
            android.widget.TextView r3 = r7.f34994b
            java.lang.String r4 = r1.getTitle()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x014e
            java.lang.String r1 = r1.getName()
            goto L_0x0152
        L_0x014e:
            java.lang.String r1 = r1.getTitle()
        L_0x0152:
            r3.setText(r1)
            r1 = 1
            goto L_0x027a
        L_0x0158:
            boolean r1 = r23.a()
            if (r1 == 0) goto L_0x018f
            r7.m = r14
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f34997e
            com.ss.android.ugc.aweme.opensdk.a.a r1 = r1.getOpenPlatformStruct()
            android.view.View r3 = r7.q
            r3.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r7.p
            r3.setVisibility(r13)
            android.widget.TextView r3 = r7.f34994b
            r3.setVisibility(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r7.p
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f34997e
            com.ss.android.ugc.aweme.opensdk.a.a r4 = r4.getOpenPlatformStruct()
            java.lang.String r4 = r4.getIcon()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r3, (java.lang.String) r4)
            android.widget.TextView r3 = r7.f34994b
            java.lang.String r1 = r1.getName()
            r3.setText(r1)
            goto L_0x0279
        L_0x018f:
            boolean r1 = com.ss.android.ugc.aweme.poi.e.e.l()
            if (r1 == 0) goto L_0x01ae
            if (r10 == 0) goto L_0x01ae
            java.lang.String r1 = r10.poiId
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01ae
            android.view.View r1 = r7.q
            r1.setVisibility(r13)
            android.widget.TextView r1 = r7.f34994b
            java.lang.String r3 = r10.poiName
            r1.setText(r3)
            r1 = 0
            goto L_0x027b
        L_0x01ae:
            if (r0 == 0) goto L_0x0279
            android.view.View r1 = r7.q
            r1.setVisibility(r9)
            com.ss.android.ugc.aweme.feed.ui.ad r1 = r7.r
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r15[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r18 = 0
            r19 = 42728(0xa6e8, float:5.9875E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x01f7
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r15[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r18 = 0
            r19 = 42728(0xa6e8, float:5.9875E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0204
        L_0x01f7:
            android.view.View r3 = r1.f46393b
            boolean r3 = r3 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x0204
            android.view.View r1 = r1.f46393b
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setMaxWidth(r2)
        L_0x0204:
            com.ss.android.ugc.aweme.feed.ui.ad r1 = r7.r
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r18 = 0
            r19 = 42722(0xa6e2, float:5.9866E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r13] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x023e
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.ad.f46392a
            r18 = 0
            r19 = 42722(0xa6e2, float:5.9866E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r13] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0279
        L_0x023e:
            android.view.View r3 = r1.f46393b
            if (r3 == 0) goto L_0x0279
            r1.f46395d = r8
            android.view.View r3 = r1.f46393b
            com.ss.android.ugc.aweme.feed.ui.ad$1 r4 = new com.ss.android.ugc.aweme.feed.ui.ad$1
            r4.<init>(r8)
            r3.setOnClickListener(r4)
            boolean r3 = com.ss.android.ugc.aweme.feed.ui.ad.a(r24)
            android.view.View r4 = r1.f46393b
            if (r3 == 0) goto L_0x0258
            r3 = 0
            goto L_0x025a
        L_0x0258:
            r3 = 8
        L_0x025a:
            r4.setVisibility(r3)
            android.view.View r3 = r1.f46393b
            boolean r3 = r3 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x0279
            com.ss.android.ugc.aweme.sticker.model.d r3 = r24.getStickerEntranceInfo()
            if (r3 == 0) goto L_0x0270
            com.ss.android.ugc.aweme.sticker.model.d r3 = r24.getStickerEntranceInfo()
            java.lang.String r3 = r3.name
            goto L_0x0272
        L_0x0270:
            java.lang.String r3 = ""
        L_0x0272:
            android.view.View r1 = r1.f46393b
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r3)
        L_0x0279:
            r1 = 0
        L_0x027a:
            r14 = 0
        L_0x027b:
            boolean r3 = r7.m
            if (r3 != 0) goto L_0x0289
            if (r14 != 0) goto L_0x0289
            if (r0 != 0) goto L_0x0289
            if (r1 != 0) goto L_0x0289
            r7.setVisibility(r9)
            return
        L_0x0289:
            r7.setVisibility(r13)
            if (r14 == 0) goto L_0x02c3
            android.widget.TextView r0 = r7.f34994b
            r0.setMaxWidth(r2)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 61519(0xf04f, float:8.6206E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02b9
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 61519(0xf04f, float:8.6206E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02c3
        L_0x02b9:
            android.view.View r0 = r7.q
            r0.setVisibility(r13)
            android.widget.TextView r0 = r7.f34995c
            r0.setVisibility(r9)
        L_0x02c3:
            if (r14 == 0) goto L_0x02ca
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.p
            com.ss.android.ugc.aweme.poi.e.p.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.poi.model.PoiStruct) r10)
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagLayout2.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, java.lang.String, org.json.JSONObject):void");
    }
}
