package com.bytedance.android.livesdk.gift.relay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15446a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15447b;

    b(GiftRelayDialogFragment giftRelayDialogFragment) {
        this.f15447b = giftRelayDialogFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15446a, false, 10114, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15446a, false, 10114, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftRelayDialogFragment giftRelayDialogFragment = this.f15447b;
        if (PatchProxy.isSupport(new Object[0], giftRelayDialogFragment, GiftRelayDialogFragment.f15413a, false, 10096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], giftRelayDialogFragment, GiftRelayDialogFragment.f15413a, false, 10096, new Class[0], Void.TYPE);
            return;
        }
        if (giftRelayDialogFragment.isViewValid()) {
            giftRelayDialogFragment.a((long) ((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).walletCenter().b());
        }
    }
}
