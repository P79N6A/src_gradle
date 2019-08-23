package com.bytedance.android.livesdk.gift;

import com.bytedance.android.livesdk.gift.GiftManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15089a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftManager.AnonymousClass2 f15090b;

    j(GiftManager.AnonymousClass2 r1) {
        this.f15090b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15089a, false, 9266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15089a, false, 9266, new Class[0], Void.TYPE);
            return;
        }
        GiftManager.this.continuousFail++;
    }
}
