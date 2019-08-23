package com.bytedance.android.livesdk.gift.panel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15191a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15192b;

    f(GiftDialogFragment giftDialogFragment) {
        this.f15192b = giftDialogFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15191a, false, 9869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15191a, false, 9869, new Class[0], Void.TYPE);
            return;
        }
        GiftDialogFragment giftDialogFragment = this.f15192b;
        if (giftDialogFragment.getDialog() != null && giftDialogFragment.getDialog().isShowing()) {
            giftDialogFragment.dismiss();
        }
    }
}
