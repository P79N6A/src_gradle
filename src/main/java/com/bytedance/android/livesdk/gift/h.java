package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.Map;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15008a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftManager f15009b;

    h(GiftManager giftManager) {
        this.f15009b = giftManager;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15008a, false, 9261, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15008a, false, 9261, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15009b.lambda$loadLocal$4$GiftManager((Map) obj);
    }
}
