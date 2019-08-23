package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class as extends k<as> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75071a;
    private String A;
    private String B;

    /* renamed from: b  reason: collision with root package name */
    public String f75072b;

    /* renamed from: c  reason: collision with root package name */
    public String f75073c;

    /* renamed from: d  reason: collision with root package name */
    public String f75074d;
    public String s;
    public String t;
    public String u;
    private String v;
    private String w = "";
    private String x;
    private String y;
    private int z;

    public as() {
        super("video_play_finish");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75071a, false, 58966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75071a, false, 58966, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75072b, d.a.f75113b);
        a("author_id", this.f75073c, d.a.f75113b);
        a("request_id", this.f75074d, d.a.f75113b);
        if (!TextUtils.isEmpty(this.w)) {
            a("is_auto_play", this.w, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a("poi_label_type", this.v, d.a.f75112a);
        }
        if (aa.d(this.g)) {
            d(this.f75074d);
        }
        if ("like".equals(this.y)) {
            a("enter_method", this.x, d.a.f75112a);
        }
        a("content_source", this.y, d.a.f75112a);
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75072b)) {
            a("previous_page", "push", d.a.f75112a);
        } else {
            a("previous_page", this.A, d.a.f75112a);
        }
        if (this.z != 0) {
            a("is_long_item", this.z, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.t)) {
            a(this.t, this.u, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("playlist_type", this.s, d.a.f75112a);
        }
        f();
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.B)) {
            a("impr_type", this.B, d.a.f75112a);
        }
    }

    public final as a(int i) {
        this.z = i;
        return this;
    }

    public final as b(String str) {
        this.A = str;
        return this;
    }

    public final as c(String str) {
        this.w = str;
        return this;
    }

    public final as e(String str) {
        this.x = str;
        return this;
    }

    public final as f(String str) {
        this.y = str;
        return this;
    }

    public final as a(@NonNull String str) {
        this.g = str;
        return this;
    }

    /* renamed from: e */
    public final as f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75071a, false, 58964, new Class[]{Aweme.class}, as.class)) {
            return (as) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75071a, false, 58964, new Class[]{Aweme.class}, as.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.f75072b = aweme.getAid();
            this.f75073c = b(aweme);
            this.f75074d = aa.c(aweme);
            this.B = aa.s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.v = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
        }
        return this;
    }

    public final as b(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75071a, false, 58965, new Class[]{Aweme.class, Integer.TYPE}, as.class)) {
            return (as) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75071a, false, 58965, new Class[]{Aweme.class, Integer.TYPE}, as.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.f75072b = aweme.getAid();
            this.f75073c = b(aweme);
            this.f75074d = a(aweme, i);
            this.B = aa.s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.v = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
        }
        return this;
    }
}
