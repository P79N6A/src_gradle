package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class at extends k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75075a;
    private int A;
    private String B;
    private String C;
    private String D;
    private double E;
    private String F;
    private String G;

    /* renamed from: b  reason: collision with root package name */
    private String f75076b;

    /* renamed from: c  reason: collision with root package name */
    private String f75077c;

    /* renamed from: d  reason: collision with root package name */
    private long f75078d;
    private String s;
    private String t = "";
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public at() {
        super("play_time");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75075a, false, 58969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75075a, false, 58969, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75076b, d.a.f75113b);
        a("author_id", this.f75077c, d.a.f75113b);
        a("duration", String.valueOf(this.f75078d), d.a.f75112a);
        a("player_type", this.v, d.a.f75112a);
        a("fps", this.w, d.a.f75112a);
        a("previous_page", this.F, d.a.f75112a);
        if (!TextUtils.isEmpty(this.t)) {
            a("is_auto_play", this.t, d.a.f75112a);
        }
        a("enter_fullscreen", this.u, d.a.f75112a);
        if (!TextUtils.isEmpty(this.i)) {
            a("poi_label_type", this.s, d.a.f75112a);
        }
        if (aa.d(this.g)) {
            d(this.x);
        }
        if ("like".equals(this.z)) {
            a("enter_method", this.y, d.a.f75112a);
        }
        a("content_source", this.z, d.a.f75112a);
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75076b)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (this.A != 0) {
            a("is_long_item", this.A, d.a.f75112a);
        }
        f();
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.C)) {
            a(this.C, this.D, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.B)) {
            a("playlist_type", this.B, d.a.f75112a);
        }
        a("volume_value", String.valueOf(this.E), d.a.f75112a);
        if (!TextUtils.isEmpty(this.G)) {
            a("impr_type", this.G, d.a.f75112a);
        }
    }

    public final at a(double d2) {
        this.E = d2;
        return this;
    }

    public final at b(String str) {
        this.F = str;
        return this;
    }

    public final at c(String str) {
        this.t = str;
        return this;
    }

    public final at e(@NonNull String str) {
        this.v = str;
        return this;
    }

    public final at f(String str) {
        this.x = str;
        return this;
    }

    public final at g(String str) {
        this.y = str;
        return this;
    }

    public final at h(String str) {
        this.z = str;
        return this;
    }

    public final at i(String str) {
        this.B = str;
        return this;
    }

    public final at k(String str) {
        this.C = str;
        return this;
    }

    public final at l(String str) {
        this.D = str;
        return this;
    }

    public final at a(int i) {
        this.A = i;
        return this;
    }

    public final at a(long j) {
        this.f75078d = j;
        return this;
    }

    public final at a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final at a(boolean z2) {
        String str;
        if (z2) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        this.u = str;
        return this;
    }

    public final at a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f75075a, false, 58968, new Class[]{Float.TYPE}, at.class)) {
            return (at) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f75075a, false, 58968, new Class[]{Float.TYPE}, at.class);
        }
        try {
            this.w = String.valueOf(f2);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: e */
    public final at f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75075a, false, 58967, new Class[]{Aweme.class}, at.class)) {
            return (at) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75075a, false, 58967, new Class[]{Aweme.class}, at.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.f75076b = aweme.getAid();
            this.f75077c = b(aweme);
            this.G = aa.s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.s = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
        }
        return this;
    }
}
