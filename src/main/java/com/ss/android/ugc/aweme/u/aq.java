package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public class aq extends k<aq> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75063a;

    /* renamed from: b  reason: collision with root package name */
    protected String f75064b;

    /* renamed from: c  reason: collision with root package name */
    private String f75065c;

    /* renamed from: d  reason: collision with root package name */
    private String f75066d;
    private Aweme s;
    private int t;

    public aq() {
        super("video_pause");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75063a, false, 58959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75063a, false, 58959, new Class[0], Void.TYPE);
            return;
        }
        a("author_id", aa.a(this.s), d.a.f75112a);
        a("group_id", this.f75065c, d.a.f75113b);
        d(this.f75066d);
        a("enter_from", this.f75064b, d.a.f75112a);
        if (this.t != 0) {
            a("is_long_item", this.t, d.a.f75112a);
        }
    }

    public final aq a(int i) {
        this.t = 1;
        return this;
    }

    public final aq a(@NonNull String str) {
        this.f75064b = str;
        return this;
    }

    public final aq b(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75063a, false, 58958, new Class[]{Aweme.class, Integer.TYPE}, aq.class)) {
            return (aq) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75063a, false, 58958, new Class[]{Aweme.class, Integer.TYPE}, aq.class);
        }
        this.s = aweme;
        this.f75066d = a.a().c(aweme, i);
        this.f75065c = aa.m(aweme);
        return this;
    }
}
