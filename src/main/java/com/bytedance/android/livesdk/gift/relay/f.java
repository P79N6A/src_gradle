package com.bytedance.android.livesdk.gift.relay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Action;

public final /* synthetic */ class f implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15457a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15458b;

    f(GiftRelayDialogFragment giftRelayDialogFragment) {
        this.f15458b = giftRelayDialogFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15457a, false, 10118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15457a, false, 10118, new Class[0], Void.TYPE);
            return;
        }
        this.f15458b.l = false;
    }
}
