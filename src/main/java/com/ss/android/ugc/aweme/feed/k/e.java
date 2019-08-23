package com.ss.android.ugc.aweme.feed.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45574a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f45575b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45576c;

    /* renamed from: d  reason: collision with root package name */
    private final String f45577d;

    /* renamed from: e  reason: collision with root package name */
    private final String f45578e;

    /* renamed from: f  reason: collision with root package name */
    private final String f45579f;
    private final b g;

    public e(boolean z, String str, String str2, String str3, String str4, b bVar) {
        this.f45575b = z;
        this.f45576c = str;
        this.f45577d = str2;
        this.f45578e = str3;
        this.f45579f = str4;
        this.g = bVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f45574a, false, 43611, new Class[0], Object.class)) {
            return c.a(this.f45575b, this.f45576c, this.f45577d, this.f45578e, this.f45579f, this.g);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f45574a, false, 43611, new Class[0], Object.class);
    }
}
