package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64002a;

    /* renamed from: b  reason: collision with root package name */
    private final o f64003b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f64004c;

    p(o oVar, Context context) {
        this.f64003b = oVar;
        this.f64004c = context;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f64002a, false, 72071, new Class[0], Object.class)) {
            return this.f64003b.a(this.f64004c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64002a, false, 72071, new Class[0], Object.class);
    }
}
