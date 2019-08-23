package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15003a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftManager f15004b;

    /* renamed from: c  reason: collision with root package name */
    private final GiftManager.a f15005c;

    f(GiftManager giftManager, GiftManager.a aVar) {
        this.f15004b = giftManager;
        this.f15005c = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15003a, false, 9259, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15003a, false, 9259, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15004b.lambda$syncXgCoin$2$GiftManager(this.f15005c, (d) obj);
    }
}
