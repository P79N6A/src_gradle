package com.ss.android.ugc.aweme.shortvideo.q.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.q.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68974a;

    /* renamed from: b  reason: collision with root package name */
    private final String f68975b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68976c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68977d;

    /* renamed from: e  reason: collision with root package name */
    private final String f68978e;

    /* renamed from: f  reason: collision with root package name */
    private final a f68979f;

    public h(String str, int i, int i2, String str2, a aVar) {
        this.f68975b = str;
        this.f68976c = i;
        this.f68977d = i2;
        this.f68978e = str2;
        this.f68979f = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f68974a, false, 81138, new Class[0], Object.class)) {
            return g.a(this.f68975b, this.f68976c, this.f68977d, this.f68978e, this.f68979f);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f68974a, false, 81138, new Class[0], Object.class);
    }
}
