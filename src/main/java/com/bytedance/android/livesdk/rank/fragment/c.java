package com.bytedance.android.livesdk.rank.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16974a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f16975b = new c();

    private c() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16974a, false, 13018, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f16974a, false, 13018, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
