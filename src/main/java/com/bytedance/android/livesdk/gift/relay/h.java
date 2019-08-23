package com.bytedance.android.livesdk.gift.relay;

import android.view.View;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15460a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftRelayViewHolder f15461b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f15462c;

    h(GiftRelayViewHolder giftRelayViewHolder, c.a aVar) {
        this.f15461b = giftRelayViewHolder;
        this.f15462c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15460a, false, 10123, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15460a, false, 10123, new Class[]{View.class}, Void.TYPE);
            return;
        }
        GiftRelayViewHolder giftRelayViewHolder = this.f15461b;
        c.a aVar = this.f15462c;
        if (giftRelayViewHolder.f15426f != null) {
            giftRelayViewHolder.f15426f.a(giftRelayViewHolder, aVar);
        }
    }
}
