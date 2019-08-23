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

public final class q extends a<q> {
    public static ChangeQuickRedirect s;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    public String t;
    private Aweme u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public q() {
        super("enter_personal_detail");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 58872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 58872, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.t, d.a.f75113b);
        a("author_id", this.v, d.a.f75113b);
        a("to_user_id", this.w, d.a.f75113b);
        a("request_id", this.x, d.a.f75113b);
        a((Map<String, String>) a.b(this.u, this.y));
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.t)) {
            a("previous_page", "push", d.a.f75112a);
        } else if (!TextUtils.isEmpty(this.D)) {
            a("previous_page", this.D, d.a.f75112a);
        }
        if (!"poi_page".equalsIgnoreCase(this.g)) {
            f();
        }
        if (aa.d(this.g)) {
            d(this.x);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.A)) {
            a(this.A, this.B, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.z)) {
            a("playlist_type", this.z, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.C)) {
            a("scene_id", this.C, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.E)) {
            a("impr_type", this.E, d.a.f75112a);
        }
    }

    public final q b(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final q c(String str) {
        this.t = str;
        return this;
    }

    public final q e(String str) {
        this.z = str;
        return this;
    }

    public final q f(String str) {
        this.A = str;
        return this;
    }

    public final q g(String str) {
        this.B = str;
        return this;
    }

    public final q h(@NonNull String str) {
        this.C = str;
        return this;
    }

    public final q i(String str) {
        this.D = str;
        return this;
    }

    public final q k(String str) {
        this.w = str;
        return this;
    }

    public final q l(String str) {
        this.x = str;
        return this;
    }

    /* renamed from: e */
    public final q f(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, s, false, 58870, new Class[]{Aweme.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{aweme}, this, s, false, 58870, new Class[]{Aweme.class}, q.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.u = aweme;
            this.t = aweme.getAid();
            this.v = b(aweme);
            this.x = aa.c(aweme);
            this.w = aweme.getAuthorUid();
            this.E = aa.s(aweme);
        }
        return this;
    }

    public final q a(String str, String str2) {
        this.t = str;
        this.v = str2;
        return this;
    }

    public final q b(String str, String str2) {
        this.i = str;
        this.j = str2;
        return this;
    }

    public final q b(@Nullable Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, s, false, 58871, new Class[]{Aweme.class, Integer.TYPE}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, s, false, 58871, new Class[]{Aweme.class, Integer.TYPE}, q.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.t = aweme.getAid();
            this.v = b(aweme);
            this.x = a(aweme, i);
            this.w = aweme.getAuthorUid();
            this.E = aa.s(aweme);
        }
        return this;
    }
}
