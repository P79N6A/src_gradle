package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ei implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62736a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f62737b = new ei();

    private ei() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62736a, false, 69250, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62736a, false, 69250, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a((Throwable) obj);
    }
}
