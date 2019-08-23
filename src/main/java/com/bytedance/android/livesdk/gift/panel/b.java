package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15183a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15184b;

    b(GiftDialogFragment giftDialogFragment) {
        this.f15184b = giftDialogFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15183a, false, 9865, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15183a, false, 9865, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15184b.a("click");
    }
}
