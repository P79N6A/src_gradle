package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;
import org.json.JSONObject;

public class ar extends k<ar> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75067a;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E = PushConstants.PUSH_TYPE_NOTIFY;
    private String F = "";
    private String G;
    private String H;
    private String I;
    private int J;
    private String K;
    private String L;
    private int M;
    private String N;
    private String O;

    /* renamed from: b  reason: collision with root package name */
    public Integer f75068b;

    /* renamed from: c  reason: collision with root package name */
    public String f75069c;

    /* renamed from: d  reason: collision with root package name */
    public String f75070d;
    public String s;
    public String t;
    public int u;
    public String v;
    public String w;
    public String x;
    private String y;
    private String z;

    public ar() {
        super("video_play");
        this.o = true;
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f75067a, false, 58963, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75067a, false, 58963, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.y, d.a.f75113b);
        a("author_id", this.z, d.a.f75113b);
        a("player_type", this.A, d.a.f75112a);
        a("request_id", this.B, d.a.f75113b);
        a("order", this.G, d.a.f75112a);
        a("feed_count", this.H, d.a.f75112a);
        a("previous_page", this.I, d.a.f75112a);
        a("is_photo", this.E, d.a.f75112a);
        if (this.f75068b != null) {
            a("detail", String.valueOf(this.f75068b), d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.F)) {
            a("is_auto_play", this.F, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75069c)) {
            a("share_mode", "token", d.a.f75112a);
            a("uid", this.f75069c, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a("poi_label_type", this.C, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.D)) {
            a("distance_km", this.D, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.f75070d)) {
            a("enter_from_request", this.f75070d, d.a.f75113b);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("search_keyword", this.s, d.a.f75112a);
        }
        if (aa.d(this.g)) {
            d(this.B);
        }
        a("enter_fullscreen", String.valueOf(this.J), d.a.f75112a);
        if (!TextUtils.isEmpty(this.t)) {
            a("account_type", this.t, d.a.f75112a);
        }
        a("is_h265", String.valueOf(this.u), d.a.f75112a);
        if ("like".equals(this.L) || "homepage_fresh".equalsIgnoreCase(this.g) || "poi_page".equalsIgnoreCase(this.g)) {
            if ("poi_page".equalsIgnoreCase(this.g) && TextUtils.isEmpty(this.K)) {
                this.K = "auto";
            }
            a("enter_method", this.K, d.a.f75112a);
        }
        a("content_source", this.L, d.a.f75112a);
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.y)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (this.M != 0) {
            a("is_long_item", this.M, d.a.f75112a);
        }
        f();
        b(AwemeAppData.p().ap);
        if (!AwemeAppData.p().ap) {
            str = "manul_play";
        } else if (AwemeAppData.p().aq) {
            str = "auto_manul_play";
        } else {
            str = "auto_play";
        }
        a("enter_play_method", str, d.a.f75112a);
        if (!TextUtils.isEmpty(this.w)) {
            a(this.w, this.x, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("playlist_type", this.v, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.O)) {
            a("rule_id", this.O, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.N)) {
            a("impr_type", this.N, d.a.f75112a);
        }
    }

    public final ar a(int i) {
        this.M = i;
        return this;
    }

    public final ar b(String str) {
        this.F = str;
        return this;
    }

    public final ar c(String str) {
        this.I = str;
        return this;
    }

    public final ar e(@NonNull String str) {
        this.A = str;
        return this;
    }

    public final ar f(String str) {
        this.K = str;
        return this;
    }

    public final ar g(String str) {
        this.L = str;
        return this;
    }

    public final ar h(String str) {
        this.O = str;
        return this;
    }

    public final ar a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public ar(String str) {
        super(str);
        this.o = true;
    }

    public final ar a(boolean z2) {
        this.J = z2 ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public final ar f(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75067a, false, 58960, new Class[]{Aweme.class}, ar.class)) {
            return (ar) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75067a, false, 58960, new Class[]{Aweme.class}, ar.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.y = aweme.getAid();
            this.z = b(aweme);
            this.B = aa.c(aweme);
            if (aweme.isImage()) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.E = str;
            this.D = aa.a(aweme.getDistance());
            this.N = aa.s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.C = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
        }
        return this;
    }

    public final ar b(Aweme aweme, int i) {
        String str;
        String str2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i)}, this, f75067a, false, 58961, new Class[]{Aweme.class, Integer.TYPE}, ar.class)) {
            return (ar) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i)}, this, f75067a, false, 58961, new Class[]{Aweme.class, Integer.TYPE}, ar.class);
        }
        super.f(aweme);
        if (aweme2 != null) {
            this.y = aweme.getAid();
            this.z = b(aweme);
            this.B = a(aweme, i);
            if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i)}, null, d.f75108e, true, 58828, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i)}, null, d.f75108e, true, 58828, new Class[]{Aweme.class, Integer.TYPE}, String.class);
            } else {
                JSONObject b2 = a.a().b(aweme2, i);
                if (b2 != null) {
                    str = b2.optString("order");
                } else {
                    str = "";
                }
            }
            this.G = str;
            this.H = String.valueOf(aweme.getFeedCount());
            if (aweme.isImage()) {
                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str2 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            this.E = str2;
            this.D = aa.a(aweme.getDistance());
            this.N = aa.s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.C = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
        }
        return this;
    }
}
