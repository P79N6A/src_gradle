package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9264a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9265b = new bm();

    private bm() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9264a, false, 2861, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9264a, false, 2861, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
