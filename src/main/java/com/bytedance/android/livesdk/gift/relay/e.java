package com.bytedance.android.livesdk.gift.relay;

import com.bytedance.android.livesdk.gift.c.a;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15454a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayDialogFragment f15455b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15456c;

    e(GiftRelayDialogFragment giftRelayDialogFragment, long j) {
        this.f15455b = giftRelayDialogFragment;
        this.f15456c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15454a, false, 10117, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15454a, false, 10117, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftRelayDialogFragment giftRelayDialogFragment = this.f15455b;
        long j = this.f15456c;
        Throwable th = (Throwable) obj;
        giftRelayDialogFragment.l = false;
        if (PatchProxy.isSupport(new Object[]{th}, giftRelayDialogFragment, GiftRelayDialogFragment.f15413a, false, 10107, new Class[]{Throwable.class}, Void.TYPE)) {
            GiftRelayDialogFragment giftRelayDialogFragment2 = giftRelayDialogFragment;
            ChangeQuickRedirect changeQuickRedirect = GiftRelayDialogFragment.f15413a;
            PatchProxy.accessDispatch(new Object[]{th}, giftRelayDialogFragment2, changeQuickRedirect, false, 10107, new Class[]{Throwable.class}, Void.TYPE);
        } else {
            if (!(th instanceof a)) {
                boolean z = th instanceof com.bytedance.android.live.a.a.b.a;
                if (!z || ((com.bytedance.android.live.a.a.b.a) th).getErrorCode() != 40001) {
                    if (z) {
                        ai.a(((com.bytedance.android.live.a.a.b.a) th).getPrompt());
                    } else {
                        ai.a((int) C0906R.string.djj);
                    }
                }
            }
            giftRelayDialogFragment.a();
        }
        o.a(j, giftRelayDialogFragment.f15417e.getId(), th);
    }
}
