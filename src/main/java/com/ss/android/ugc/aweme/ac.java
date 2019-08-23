package com.ss.android.ugc.aweme;

import com.bytedance.sdk.account.k.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.a;
import com.ss.android.ugc.aweme.user.util.d;
import java.util.concurrent.Callable;

public final /* synthetic */ class ac implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31578a;

    /* renamed from: b  reason: collision with root package name */
    private final b f31579b;

    ac(b bVar) {
        this.f31579b = bVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f31578a, false, 19507, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f31578a, false, 19507, new Class[0], Object.class);
        }
        b bVar = this.f31579b;
        a.b("begin to update sp");
        d.a(bVar.f22521f.toString());
        a.b("asynchronous_check");
        return null;
    }
}
