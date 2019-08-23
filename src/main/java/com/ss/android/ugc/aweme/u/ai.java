package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.u.d;
import java.util.Map;

public final class ai extends k<ai> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75030a;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;

    /* renamed from: b  reason: collision with root package name */
    private String f75031b;

    /* renamed from: c  reason: collision with root package name */
    private String f75032c;

    /* renamed from: d  reason: collision with root package name */
    private String f75033d;
    private String s = "normal_share";
    private String t;
    private String u;
    private int v;
    private int w;
    private boolean x;
    private String y;
    private Aweme z;

    public ai() {
        super("share_video");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75030a, false, 58943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75030a, false, 58943, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75031b, d.a.f75113b);
        a("author_id", this.f75032c, d.a.f75113b);
        a("platform", this.f75033d, d.a.f75112a);
        a("content_type", this.t, d.a.f75112a);
        a("share_mode", this.u, d.a.f75112a);
        a("reflow_flag", String.valueOf(this.w), d.a.f75112a);
        a("enter_method", this.s, d.a.f75112a);
        if (aa.d(this.g)) {
            d(aa.c(this.z));
        }
        if (this.v != 0) {
            a("is_long_item", this.v, d.a.f75112a);
        }
        if (this.x) {
            a("scene_id", this.y, d.a.f75113b);
            a("country_name", this.q, d.a.f75112a);
            d();
            d(aa.c(this.z));
        }
        a((Map<String, String>) a.b(this.z, a.a()));
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75031b)) {
            a("previous_page", "push", d.a.f75112a);
        } else {
            a("previous_page", this.E, d.a.f75112a);
        }
        f();
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.B)) {
            a(this.B, this.C, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.A)) {
            a("playlist_type", this.A, d.a.f75112a);
        }
        a("sector", this.D, d.a.f75112a);
        if (!TextUtils.isEmpty(this.F)) {
            a("impr_type", this.F, d.a.f75112a);
        }
    }

    public final ai a(int i) {
        this.v = i;
        return this;
    }

    public final ai b(String str) {
        this.E = str;
        return this;
    }

    public final ai c(String str) {
        this.s = str;
        return this;
    }

    public final ai e(@NonNull String str) {
        this.f75033d = str;
        return this;
    }

    public final ai f(String str) {
        this.u = str;
        return this;
    }

    public final ai g(String str) {
        this.y = str;
        return this;
    }

    public final ai a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final ai c(boolean z2) {
        this.x = true;
        return this;
    }

    public final ai a(boolean z2) {
        this.o = false;
        return this;
    }

    /* renamed from: e */
    public final ai f(@Nullable Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75030a, false, 58942, new Class[]{Aweme.class}, ai.class)) {
            return (ai) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75030a, false, 58942, new Class[]{Aweme.class}, ai.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.z = aweme;
            this.f75031b = aweme.getAid();
            this.f75032c = b(aweme);
            if (aweme.isImage()) {
                str = "photo";
            } else {
                str = "video";
            }
            this.t = str;
            this.F = aa.s(aweme);
        }
        return this;
    }
}
