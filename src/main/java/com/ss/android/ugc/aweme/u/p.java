package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public class p extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75140a;

    /* renamed from: b  reason: collision with root package name */
    private String f75141b;

    /* renamed from: c  reason: collision with root package name */
    private String f75142c;

    /* renamed from: d  reason: collision with root package name */
    private String f75143d;
    private String p;

    public p() {
        super("enter_personal_detail_backup");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75140a, false, 58869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75140a, false, 58869, new Class[0], Void.TYPE);
            return;
        }
        c();
        a("group_id", this.f75142c, d.a.f75113b);
        a("to_user_id", this.f75141b, d.a.f75113b);
        a("enter_from", this.g, d.a.f75112a);
        a("enter_method", this.f75143d, d.a.f75112a);
        a("request_id", this.p, d.a.f75113b);
        if (aa.d(this.g)) {
            d(this.f75142c);
        }
    }

    public final p a(String str) {
        this.f75142c = str;
        return this;
    }

    public final p b(String str) {
        this.f75141b = str;
        return this;
    }

    public final p c(String str) {
        this.g = str;
        return this;
    }

    public final p e(String str) {
        this.f75143d = str;
        return this;
    }

    public final p e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f75140a, false, 58868, new Class[]{Aweme.class}, p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[]{aweme}, this, f75140a, false, 58868, new Class[]{Aweme.class}, p.class);
        }
        if (aweme != null) {
            this.f75142c = aweme.getAid();
            this.p = aweme.getRequestId();
            this.f75141b = aweme.getAuthorUid();
        }
        a(aweme);
        return this;
    }
}
