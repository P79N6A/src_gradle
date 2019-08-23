package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.panel.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15164a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15165b;

    a(GiftDialogFragment giftDialogFragment) {
        this.f15165b = giftDialogFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15164a, false, 9864, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15164a, false, 9864, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15165b.a((c) obj);
    }
}
