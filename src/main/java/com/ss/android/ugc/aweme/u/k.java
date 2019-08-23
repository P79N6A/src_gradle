package com.ss.android.ugc.aweme.u;

import android.support.annotation.CallSuper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;
import com.ss.android.ugc.aweme.u.k;

public abstract class k<E extends k> extends d {
    public static ChangeQuickRedirect p;
    protected String q;
    protected String r;

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, p, false, 58861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, p, false, 58861, new Class[0], Void.TYPE);
            return;
        }
        if ("homepage_country".equals(this.g) && !TextUtils.isEmpty(this.q)) {
            a("country_name", this.q, d.a.f75112a);
        }
        if (("others_homepage".equals(this.g) || "personal_homepage".equals(this.g)) && !TextUtils.isEmpty(this.r)) {
            a("tab_name", this.r, d.a.f75112a);
        }
        a("enter_from", this.g, d.a.f75112a);
    }

    public k(String str) {
        super(str);
    }

    public final E j(String str) {
        this.r = str;
        return this;
    }

    @CallSuper
    public E f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, p, false, 58860, new Class[]{Aweme.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{aweme}, this, p, false, 58860, new Class[]{Aweme.class}, k.class);
        }
        if (!(aweme == null || aweme.getAuthor() == null)) {
            this.q = aweme.getAuthor().getRegion();
        }
        a(aweme);
        return this;
    }
}
