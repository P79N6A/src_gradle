package com.ss.android.ugc.aweme.u;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class u extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75152a;

    /* renamed from: b  reason: collision with root package name */
    public String f75153b;

    /* renamed from: c  reason: collision with root package name */
    private String f75154c;

    /* renamed from: d  reason: collision with root package name */
    private String f75155d;
    private String p;
    private String q;
    private String r;

    public u() {
        super("launch_log");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75152a, false, 58880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75152a, false, 58880, new Class[0], Void.TYPE);
            return;
        }
        a("launch_method", this.f75154c, d.a.f75112a);
        a("push_id", this.f75155d, d.a.f75112a);
        a("enter_to", this.p, d.a.f75112a);
        a("red_badge_number", this.q, d.a.f75112a);
        a("is_cold_launch", this.r, d.a.f75112a);
        if (!TextUtils.isEmpty(this.f75153b)) {
            a("launch_from", this.f75153b, d.a.f75112a);
        }
    }

    public final u a(String str) {
        this.f75154c = str;
        return this;
    }

    public final u b(String str) {
        this.f75155d = str;
        return this;
    }

    public final u c(String str) {
        this.p = str;
        return this;
    }

    public final u e(String str) {
        this.q = str;
        return this;
    }

    public final u f(String str) {
        this.r = str;
        return this;
    }
}
