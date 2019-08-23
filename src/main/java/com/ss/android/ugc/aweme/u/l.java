package com.ss.android.ugc.aweme.u;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public class l extends k<l> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75131a;

    /* renamed from: b  reason: collision with root package name */
    private String f75132b;

    /* renamed from: c  reason: collision with root package name */
    private String f75133c;

    /* renamed from: d  reason: collision with root package name */
    private String f75134d;
    private String s;
    private String t;

    public l() {
        super("dislike");
        this.o = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75131a, false, 58863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75131a, false, 58863, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75132b, d.a.f75113b);
        a("author_id", this.f75133c, d.a.f75113b);
        a("enter_method", this.f75134d, d.a.f75112a);
        if (com.ss.android.ugc.aweme.ae.d.a().a(this.f75132b)) {
            a("previous_page", "push", d.a.f75112a);
        }
        if (aa.d(this.g)) {
            d(this.s);
        }
        b(AwemeAppData.p().ap);
        if (!TextUtils.isEmpty(this.t)) {
            a("impr_type", this.t, d.a.f75112a);
        }
    }

    public final l a(String str) {
        this.g = str;
        return this;
    }

    public final l b(String str) {
        this.f75132b = str;
        return this;
    }

    public final l c(String str) {
        this.f75133c = str;
        return this;
    }

    public final l e(String str) {
        this.f75134d = str;
        return this;
    }

    public final l f(String str) {
        this.s = str;
        return this;
    }

    /* renamed from: e */
    public final l f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75131a, false, 58862, new Class[]{Aweme.class}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75131a, false, 58862, new Class[]{Aweme.class}, l.class);
        }
        super.f(aweme);
        this.t = aa.s(aweme);
        return this;
    }
}
