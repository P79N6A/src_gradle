package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40873a;

    /* renamed from: b  reason: collision with root package name */
    private final e.AnonymousClass1 f40874b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40875c;

    /* renamed from: d  reason: collision with root package name */
    private final a f40876d;

    /* renamed from: e  reason: collision with root package name */
    private final e.a f40877e;

    /* renamed from: f  reason: collision with root package name */
    private final e.b f40878f;
    private final boolean g;
    private final long h;

    j(e.AnonymousClass1 r1, String str, a aVar, e.a aVar2, e.b bVar, boolean z, long j) {
        this.f40874b = r1;
        this.f40875c = str;
        this.f40876d = aVar;
        this.f40877e = aVar2;
        this.f40878f = bVar;
        this.g = z;
        this.h = j;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f40873a, false, 34360, new Class[0], Object.class)) {
            return this.f40874b.a(this.f40875c, this.f40876d, this.f40877e, this.f40878f, this.g, this.h);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f40873a, false, 34360, new Class[0], Object.class);
    }
}
