package com.bytedance.android.livesdk.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17746a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f17747b = new b();

    private b() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17746a, false, 13855, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17746a, false, 13855, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
