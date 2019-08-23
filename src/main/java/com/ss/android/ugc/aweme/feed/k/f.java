package com.ss.android.ugc.aweme.feed.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45580a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45581b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45582c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45583d;

    /* renamed from: e  reason: collision with root package name */
    private final String f45584e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f45585f;

    public f(String str, String str2, String str3, String str4, boolean z) {
        this.f45581b = str;
        this.f45582c = str2;
        this.f45583d = str3;
        this.f45584e = str4;
        this.f45585f = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45580a, false, 43612, new Class[0], Object.class)) {
            return c.a(this.f45581b, this.f45582c, this.f45583d, this.f45584e, this.f45585f);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45580a, false, 43612, new Class[0], Object.class);
    }
}
