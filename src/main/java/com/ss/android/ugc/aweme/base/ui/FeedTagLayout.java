package com.ss.android.ugc.aweme.base.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
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
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.i;
import com.ss.android.ugc.aweme.utils.ed;
import org.json.JSONObject;

public class FeedTagLayout extends a implements View.OnClickListener {
    public static ChangeQuickRedirect o;
    private boolean p;

    public FeedTagLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (PatchProxy.isSupport(new Object[]{view}, this, o, false, 25012, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, o, false, 25012, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.rf) {
            if (!(this.f34997e == null || this.f34997e.getChallengeList() == null)) {
                Challenge challenge = this.f34997e.getChallengeList().get(0);
                if (challenge != null) {
                    h a2 = h.a();
                    Activity activity = this.i;
                    j a3 = j.a("aweme://challenge/detail/" + challenge.getCid());
                    if (r.b(challenge)) {
                        str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str3 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    j a4 = a3.a("is_commerce", str3);
                    if (this.f34997e != null) {
                        str4 = this.f34997e.getAid();
                    } else {
                        str4 = "";
                    }
                    a2.a(activity, a4.a("aweme_id", str4).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).a());
                    MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.h);
                    if (this.f34997e == null) {
                        str5 = "";
                    } else {
                        str5 = this.f34997e.getAid();
                    }
                    MobClick extValueString = labelName.setValue(str5).setExtValueString(challenge.getCid());
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
                    com.ss.android.ugc.aweme.common.r.onEvent(extValueString.setJsonObject(a5.a("content_type", str7).b()));
                    if (this.j == null) {
                        str8 = "";
                    } else {
                        str8 = this.j.optString("request_id");
                    }
                    if (StringUtils.isEmpty(str8)) {
                        str8 = a.a().c(this.f34997e, this.k);
                    }
                    ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(this.h).f(this.f34997e).e(challenge.getCid()).a("click_in_video_name")).f(str8).e();
                    if (this.f34997e.isAd()) {
                        g.w(view.getContext(), this.f34997e);
                    }
                }
            }
        } else if (id == C0906R.id.bjq) {
            String e2 = aa.e(this.f34997e);
            String g = aa.g(this.f34997e);
            String h = aa.h(this.f34997e);
            String m = aa.m(this.f34997e);
            g.d(this.f34996d, this.f34997e, e2);
            PoiDetailActivity.a(this.f34996d, e2, g, h, this.h, this.f34997e, this.n);
            try {
                MobClick value = MobClick.obtain().setEventName("poi_click").setLabelName(this.h).setValue(m);
                c a6 = new c().a("poi_id", e2).a("poi_type", h);
                if (this.j == null) {
                    str = "";
                } else {
                    str = this.j.optString("request_id");
                }
                c a7 = a6.a("request_id", str);
                Aweme aweme = this.f34997e;
                if (PatchProxy.isSupport(new Object[]{aweme}, null, o, true, 25013, new Class[]{Aweme.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, o, true, 25013, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
                } else if (aweme == null) {
                    i = -1;
                } else if (aweme.getAwemeType() == 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                com.ss.android.ugc.aweme.common.r.onEvent(value.setJsonObject(a7.a("is_photo", Integer.valueOf(i)).a("group_id", m).a("content_type", aa.o(this.f34997e)).b()));
                i e3 = new i().a(this.h).e(this.f34997e);
                if (this.j == null) {
                    str2 = "";
                } else {
                    str2 = this.j.optString("request_id");
                }
                e3.b(str2).c(e2).e(h).e();
            } catch (Exception unused) {
            }
        }
    }

    public FeedTagLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedTagLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34996d = context;
        setOrientation(0);
    }

    public final void a(Aweme aweme, Activity activity, String str, JSONObject jSONObject) {
        int i;
        Aweme aweme2 = aweme;
        Activity activity2 = activity;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aweme2, activity2, str2, jSONObject2}, this, o, false, 25014, new Class[]{Aweme.class, Activity.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, activity2, str2, jSONObject2}, this, o, false, 25014, new Class[]{Aweme.class, Activity.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 25011, new Class[0], Void.TYPE);
        } else if (!this.p) {
            if (PatchProxy.isSupport(new Object[0], this, o, false, 25010, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, o, false, 25010, new Class[0], Void.TYPE);
            } else {
                LayoutInflater.from(this.f34996d).inflate(C0906R.layout.a3w, this);
                setPadding(0, 0, (int) UIUtils.dip2Px(this.f34996d, 90.0f), 0);
                if (Build.VERSION.SDK_INT >= 17) {
                    setPaddingRelative(0, 0, (int) UIUtils.dip2Px(this.f34996d, 90.0f), 0);
                }
                this.f34998f = (int) UIUtils.dip2Px(getContext(), 5.0f);
                this.g = -((int) UIUtils.dip2Px(getContext(), 1.0f));
                this.f34995c = (TextView) findViewById(C0906R.id.rf);
                this.f34994b = (TextView) findViewById(C0906R.id.bjq);
                View.OnTouchListener a2 = ed.a(0.5f, 1.0f);
                this.f34995c.setOnTouchListener(a2);
                this.f34994b.setOnTouchListener(a2);
                this.f34995c.setOnClickListener(this);
                this.f34994b.setOnClickListener(this);
                TextView textView = this.f34994b;
                if (p.b()) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                if (com.ss.android.ugc.aweme.i18n.c.a()) {
                    this.f34995c.setTextColor(getResources().getColor(C0906R.color.ui));
                    this.f34994b.setTextColor(getResources().getColor(C0906R.color.ui));
                } else {
                    this.f34995c.setTextColor(getResources().getColor(C0906R.color.a09));
                    this.f34994b.setTextColor(getResources().getColor(C0906R.color.a09));
                }
                this.p = true;
            }
        }
        this.f34997e = aweme2;
        this.h = str2;
        this.i = activity2;
        this.j = jSONObject2;
        AbTestManager.a();
        PoiStruct poiStruct = this.f34997e.getPoiStruct();
        if (poiStruct == null || StringUtils.isEmpty(poiStruct.poiId)) {
            z = false;
        } else {
            this.f34994b.setText(poiStruct.poiName);
            this.f34994b.setPadding(this.f34998f, 0, this.f34998f, 0);
        }
        this.l = z;
        if (!z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (PatchProxy.isSupport(new Object[0], this, o, false, 25017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 25017, new Class[0], Void.TYPE);
            return;
        }
        this.f34994b.setVisibility(0);
        this.f34995c.setVisibility(8);
        this.f34994b.setBackgroundResource(2130837955);
    }
}
