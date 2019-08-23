package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39447a;

    /* renamed from: b  reason: collision with root package name */
    private final a f39448b;

    /* renamed from: c  reason: collision with root package name */
    private final List f39449c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f39450d;

    b(a aVar, List list, Context context) {
        this.f39448b = aVar;
        this.f39449c = list;
        this.f39450d = context;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f39447a, false, 31985, new Class[0], Object.class)) {
            return this.f39448b.a(this.f39449c, this.f39450d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f39447a, false, 31985, new Class[0], Object.class);
    }
}
