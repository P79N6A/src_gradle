package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15185a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15186b;

    c(GiftDialogFragment giftDialogFragment) {
        this.f15186b = giftDialogFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15185a, false, 9866, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15185a, false, 9866, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15186b.dismiss();
    }
}
