package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public final class v extends k<v> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75156a;

    /* renamed from: b  reason: collision with root package name */
    private String f75157b;

    /* renamed from: c  reason: collision with root package name */
    private String f75158c;

    /* renamed from: d  reason: collision with root package name */
    private String f75159d;
    private int s;
    private int t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;

    public v() {
        super("like");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75156a, false, 58882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75156a, false, 58882, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75157b, d.a.f75113b);
        a("author_id", this.f75158c, d.a.f75113b);
        a("request_id", this.f75159d, d.a.f75113b);
        a("previous_page", this.x, d.a.f75112a);
        if (aa.d(this.g)) {
            d(this.f75159d);
        }
        if (!TextUtils.equals(this.f75111f, "like_cancel")) {
            f();
        }
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75157b)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (this.s != 0) {
            a("is_long_item", this.s, d.a.f75112a);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.v)) {
            a(this.v, this.w, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.u)) {
            a("playlist_type", this.u, d.a.f75112a);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a("impr_type", this.y, d.a.f75112a);
        }
    }

    public final v a(@NonNull int i) {
        this.t = i;
        return this;
    }

    public final v b(int i) {
        this.s = i;
        return this;
    }

    public final v c(String str) {
        this.w = str;
        return this;
    }

    public final v e(@NonNull String str) {
        this.g = str;
        return this;
    }

    public final v f(String str) {
        this.x = str;
        return this;
    }

    public v(String str) {
        super(str);
        this.o = true;
    }

    public final v a(String str) {
        this.u = str;
        return this;
    }

    public final v b(String str) {
        this.v = str;
        return this;
    }

    /* renamed from: e */
    public final v f(@Nullable Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75156a, false, 58881, new Class[]{Aweme.class}, v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75156a, false, 58881, new Class[]{Aweme.class}, v.class);
        }
        super.f(aweme);
        if (aweme != null) {
            this.f75157b = aweme.getAid();
            this.f75158c = b(aweme);
            if (TextUtils.isEmpty(aa.a(aweme, this.t))) {
                str = aweme.getRequestId();
            } else {
                str = aa.a(aweme, this.t);
            }
            this.f75159d = str;
            this.y = aa.s(aweme);
        }
        return this;
    }
}
