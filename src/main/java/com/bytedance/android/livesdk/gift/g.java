package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

public final /* synthetic */ class g implements FlowableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15006a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftManager f15007b;

    g(GiftManager giftManager) {
        this.f15007b = giftManager;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        FlowableEmitter flowableEmitter2 = flowableEmitter;
        if (PatchProxy.isSupport(new Object[]{flowableEmitter2}, this, f15006a, false, 9260, new Class[]{FlowableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{flowableEmitter2}, this, f15006a, false, 9260, new Class[]{FlowableEmitter.class}, Void.TYPE);
            return;
        }
        this.f15007b.lambda$loadLocal$3$GiftManager(flowableEmitter2);
    }
}
