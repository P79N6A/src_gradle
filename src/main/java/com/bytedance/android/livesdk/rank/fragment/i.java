package com.bytedance.android.livesdk.rank.fragment;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16986a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f16987b = new i();

    private i() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f16986a, false, 13044, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f16986a, false, 13044, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.c(TopRankFragment.class.getSimpleName(), ((Throwable) obj).getMessage());
    }
}
