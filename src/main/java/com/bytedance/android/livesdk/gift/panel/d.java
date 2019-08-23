package com.bytedance.android.livesdk.gift.panel;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15187a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15188b;

    d(GiftDialogFragment giftDialogFragment) {
        this.f15188b = giftDialogFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15187a, false, 9867, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15187a, false, 9867, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f15188b.dismiss();
    }
}
