package com.ss.android.ugc.aweme.effect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class aj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43699a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f43700b;

    aj(ai aiVar) {
        this.f43700b = aiVar;
    }

    public final Object call() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43699a, false, 38797, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f43699a, false, 38797, new Class[0], Object.class);
        }
        ai aiVar = this.f43700b;
        if (aiVar.f43696b.m() == 0) {
            z = true;
        }
        aiVar.f43697c = z;
        return Boolean.valueOf(aiVar.f43697c);
    }
}
