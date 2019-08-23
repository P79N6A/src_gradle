package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17758a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17759b;

    w(s sVar) {
        this.f17759b = sVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17758a, false, 2647, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17758a, false, 2647, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17759b.lambda$loadResources$3$LiveCameraResManager((Throwable) obj);
    }
}
