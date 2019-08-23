package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class t extends k<t> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75148a;

    /* renamed from: b  reason: collision with root package name */
    private String f75149b;

    /* renamed from: c  reason: collision with root package name */
    private String f75150c;

    /* renamed from: d  reason: collision with root package name */
    private String f75151d;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;

    public t() {
        super("unlogin_follow");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75148a, false, 58879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75148a, false, 58879, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("previous_page", this.f75149b, d.a.f75112a);
        a("previous_page_position", this.f75150c, d.a.f75112a);
        a("enter_method", this.w, d.a.f75112a);
        a("to_user_id", this.f75151d, d.a.f75113b);
        a("group_id", this.s, d.a.f75113b);
        a("author_id", this.f75151d, d.a.f75113b);
        a("request_id", this.t, d.a.f75113b);
        a("enter_type", this.v, d.a.f75112a);
        if (!TextUtils.isEmpty(this.u)) {
            a("enter_from_request", this.u, d.a.f75113b);
        }
        if (aa.d(this.g) || "homepage_hot".equals(this.f75149b)) {
            d(this.t);
        }
        if (!TextUtils.equals(this.f75111f, "follow_cancel") && !TextUtils.equals(this.f75111f, "unlogin_follow")) {
            f();
        }
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.s)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("impr_type", this.x, d.a.f75112a);
        }
    }

    public final t a(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final t b(String str) {
        this.w = str;
        return this;
    }

    public final t c(String str) {
        this.f75149b = str;
        return this;
    }

    public final t e(String str) {
        this.f75150c = str;
        return this;
    }

    public final t f(String str) {
        this.f75151d = str;
        return this;
    }

    public final t b(@Nullable Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75148a, false, 58878, new Class[]{Aweme.class, Integer.TYPE}, t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75148a, false, 58878, new Class[]{Aweme.class, Integer.TYPE}, t.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.s = aweme.getAid();
            this.t = a(aweme, i);
            this.f75151d = aweme.getAuthorUid();
            this.x = aa.s(aweme);
        }
        return this;
    }
}
