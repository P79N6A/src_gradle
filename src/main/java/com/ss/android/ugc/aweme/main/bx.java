package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class bx implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54664a;

    /* renamed from: b  reason: collision with root package name */
    private final bu f54665b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54666c;

    bx(bu buVar, String str) {
        this.f54665b = buVar;
        this.f54666c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f54664a, false, 57702, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f54664a, false, 57702, new Class[0], Object.class);
        }
        bu buVar = this.f54665b;
        buVar.k.a(this.f54666c);
        return null;
    }
}
