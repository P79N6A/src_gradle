package com.bytedance.android.livesdk.gift.relay;

import android.arch.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15448a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15449b;

    public c(GiftRelayDialogFragment giftRelayDialogFragment) {
        this.f15449b = giftRelayDialogFragment;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15448a, false, 10115, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15448a, false, 10115, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftRelayDialogFragment giftRelayDialogFragment = this.f15449b;
        KVData kVData = (KVData) obj;
        if (kVData != null && giftRelayDialogFragment.k != null) {
            if (kVData.getData() == null || !((Boolean) kVData.getData()).booleanValue()) {
                z = false;
            }
            giftRelayDialogFragment.k.setText(giftRelayDialogFragment.f15415c.getResources().getString(z ? C0906R.string.cy8 : C0906R.string.dk5));
        }
    }
}
