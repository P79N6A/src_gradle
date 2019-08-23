package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.d;

public class x extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75164a;

    /* renamed from: b  reason: collision with root package name */
    protected String f75165b;

    /* renamed from: c  reason: collision with root package name */
    private String f75166c;

    /* renamed from: d  reason: collision with root package name */
    private String f75167d;

    public x() {
        super("click_complete_video_entrance");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75164a, false, 58886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75164a, false, 58886, new Class[0], Void.TYPE);
            return;
        }
        a("group_id", this.f75166c, d.a.f75113b);
        d(this.f75167d);
        a("enter_from", this.f75165b, d.a.f75112a);
    }

    public final x a(@NonNull String str) {
        this.f75165b = str;
        return this;
    }

    public final x b(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f75164a, false, 58885, new Class[]{Aweme.class, Integer.TYPE}, x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f75164a, false, 58885, new Class[]{Aweme.class, Integer.TYPE}, x.class);
        }
        this.f75167d = a.a().c(aweme, i);
        this.f75166c = aa.m(aweme);
        return this;
    }
}
