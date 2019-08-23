package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15030a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f15031b = new i();

    private i() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15030a, false, 9262, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15030a, false, 9262, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftManager.lambda$loadLocal$5$GiftManager((Throwable) obj);
    }
}
