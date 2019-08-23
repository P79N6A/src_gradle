package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class w extends k<w> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75160a;

    /* renamed from: b  reason: collision with root package name */
    private String f75161b;

    /* renamed from: c  reason: collision with root package name */
    private String f75162c;

    /* renamed from: d  reason: collision with root package name */
    private String f75163d;
    private String s;
    private int t;
    private int u;
    private int v;

    public w() {
        super("unlogin_like");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75160a, false, 58884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75160a, false, 58884, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75161b, d.a.f75113b);
        a("author_id", this.f75162c, d.a.f75113b);
        a("request_id", this.f75163d, d.a.f75113b);
        if (aa.d(this.g)) {
            d(this.f75163d);
        }
        if (!TextUtils.equals(this.f75111f, "like_cancel") && !TextUtils.equals(this.f75111f, "unlogin_like")) {
            f();
        }
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75161b)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("enter_method", this.s, d.a.f75112a);
        }
        a("is_first", String.valueOf(this.t), d.a.f75112a);
        a("is_login_notify", String.valueOf(this.u), d.a.f75112a);
    }

    public final w a(@NonNull int i) {
        this.v = i;
        return this;
    }

    public final w b(int i) {
        this.t = i;
        return this;
    }

    public final w c(int i) {
        this.u = i;
        return this;
    }

    public final w a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final w b(@NonNull String str) {
        this.f75161b = str;
        return this;
    }

    public final w c(@NonNull String str) {
        this.s = str;
        return this;
    }

    /* renamed from: e */
    public final w f(@Nullable Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75160a, false, 58883, new Class[]{Aweme.class}, w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75160a, false, 58883, new Class[]{Aweme.class}, w.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.f75161b = aweme.getAid();
            this.f75162c = b(aweme);
            if (TextUtils.isEmpty(aa.a(aweme, this.v))) {
                str = aweme.getRequestId();
            } else {
                str = aa.a(aweme, this.v);
            }
            this.f75163d = str;
        }
        return this;
    }
}
