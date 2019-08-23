package com.bytedance.android.livesdk.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8934a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f8935b = new f();

    private f() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8934a, false, 3057, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8934a, false, 3057, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
