package com.ss.android.ugc.aweme.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public final /* synthetic */ class k implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4242a;

    /* renamed from: b  reason: collision with root package name */
    public static final Function f4243b = new k();

    private k() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f4242a, false, 86904, new Class[]{Object.class}, Object.class)) {
            return Schedulers.from(h.c());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f4242a, false, 86904, new Class[]{Object.class}, Object.class);
    }
}
