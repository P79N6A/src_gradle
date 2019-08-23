package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class db implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13673a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13674b = new db();

    private db() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13673a, false, 3033, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13673a, false, 3033, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.lambda$initialize$0$TTLiveSDKContext((Throwable) obj);
    }
}
