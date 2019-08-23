package com.bytedance.android.livesdk.gift.panel;

import android.content.DialogInterface;
import com.bytedance.android.live.f.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15189a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftDialogFragment f15190b;

    e(GiftDialogFragment giftDialogFragment) {
        this.f15190b = giftDialogFragment;
    }

    public final void a(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f15189a, false, 9868, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f15189a, false, 9868, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f15190b.a(false);
    }
}
