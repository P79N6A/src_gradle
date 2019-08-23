package com.ss.android.ugc.aweme.u;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75081a;

    /* renamed from: b  reason: collision with root package name */
    private String f75082b;

    /* renamed from: c  reason: collision with root package name */
    private String f75083c;

    /* renamed from: d  reason: collision with root package name */
    private String f75084d;

    public b() {
        super("add_poi");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75081a, false, 58822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75081a, false, 58822, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75082b, d.a.f75112a);
        a("position_privilege", this.f75083c, d.a.f75112a);
        a("content_type", this.f75084d, d.a.f75112a);
    }

    public final b a(@NonNull String str) {
        this.f75082b = str;
        return this;
    }

    public final b b(String str) {
        this.f75083c = str;
        return this;
    }

    public final b c(String str) {
        this.f75084d = str;
        return this;
    }
}
