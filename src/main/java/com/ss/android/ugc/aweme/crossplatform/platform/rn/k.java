package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40879a;

    /* renamed from: b  reason: collision with root package name */
    private final e.b f40880b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40881c;

    k(e.b bVar, String str) {
        this.f40880b = bVar;
        this.f40881c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f40879a, false, 34361, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f40879a, false, 34361, new Class[0], Object.class);
        }
        e.b bVar = this.f40880b;
        String str = this.f40881c;
        bVar.a(new Exception("check update to latest fail: " + str));
        return null;
    }
}
