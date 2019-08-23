package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class s extends k<s> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75144a;
    private String A;
    private String B;
    private String C;
    private String D;

    /* renamed from: b  reason: collision with root package name */
    private String f75145b;

    /* renamed from: c  reason: collision with root package name */
    private String f75146c;

    /* renamed from: d  reason: collision with root package name */
    private String f75147d;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public s() {
        super("follow");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75144a, false, 58877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75144a, false, 58877, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("scene_id", this.f75145b, d.a.f75112a);
        a("previous_page", this.f75146c, d.a.f75112a);
        a("previous_page_position", this.f75147d, d.a.f75112a);
        a("enter_method", this.x, d.a.f75112a);
        a("to_user_id", this.s, d.a.f75113b);
        a("group_id", this.t, d.a.f75113b);
        a("author_id", this.s, d.a.f75113b);
        a("author_id", this.s, d.a.f75113b);
        a("page_status", this.B, d.a.f75112a);
        a("request_id", this.u, d.a.f75113b);
        a("enter_type", this.w, d.a.f75112a);
        if (!TextUtils.isEmpty(this.v)) {
            a("enter_from_request", this.v, d.a.f75113b);
        }
        if (aa.d(this.g) || "homepage_hot".equals(this.f75146c)) {
            d(this.u);
        }
        if (!TextUtils.equals(this.f75111f, "follow_cancel")) {
            f();
        }
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.t)) {
            a("previous_page", "push", d.a.f75112a);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.z)) {
            a(this.z, this.A, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a("playlist_type", this.y, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.C)) {
            a("rule_id", this.C, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.D)) {
            a("impr_type", this.D, d.a.f75112a);
        }
    }

    public final s a(@NonNull String str) {
        this.f75145b = str;
        return this;
    }

    public final s b(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final s c(String str) {
        this.x = str;
        return this;
    }

    public final s e(String str) {
        this.B = str;
        return this;
    }

    public final s f(String str) {
        this.f75146c = str;
        return this;
    }

    public final s g(String str) {
        this.f75147d = str;
        return this;
    }

    public final s h(String str) {
        this.s = str;
        return this;
    }

    public final s i(String str) {
        this.t = str;
        return this;
    }

    public final s k(String str) {
        this.u = str;
        return this;
    }

    public final s l(String str) {
        this.v = str;
        return this;
    }

    public final s m(String str) {
        this.w = str;
        return this;
    }

    public final s n(String str) {
        this.y = str;
        return this;
    }

    public final s o(String str) {
        this.z = str;
        return this;
    }

    public final s p(String str) {
        this.A = str;
        return this;
    }

    public final s q(String str) {
        this.C = str;
        return this;
    }

    public final s r(String str) {
        this.D = str;
        return this;
    }

    public s(String str) {
        super(str);
        this.o = true;
    }

    public final s b(@Nullable Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75144a, false, 58876, new Class[]{Aweme.class, Integer.TYPE}, s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75144a, false, 58876, new Class[]{Aweme.class, Integer.TYPE}, s.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.t = aweme.getAid();
            this.u = a(aweme, i);
            this.s = aweme.getAuthorUid();
            this.D = aa.s(aweme);
        }
        return this;
    }
}
