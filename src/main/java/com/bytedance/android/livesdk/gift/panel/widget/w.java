package com.bytedance.android.livesdk.gift.panel.widget;

import android.support.v7.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.holder.BaseGiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements AbsGiftAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15383a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15384b;

    w(GiftPanelListWidget giftPanelListWidget) {
        this.f15384b = giftPanelListWidget;
    }

    public final void a(b bVar, boolean z) {
        b bVar2 = bVar;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{bVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15383a, false, 10057, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, Byte.valueOf(z)}, this, f15383a, false, 10057, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        GiftPanelListWidget giftPanelListWidget = this.f15384b;
        if (PatchProxy.isSupport(new Object[]{bVar2, Byte.valueOf(z)}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10033, new Class[]{b.class, Boolean.TYPE}, Void.TYPE)) {
            GiftPanelListWidget giftPanelListWidget2 = giftPanelListWidget;
            PatchProxy.accessDispatch(new Object[]{bVar2, Byte.valueOf(z)}, giftPanelListWidget2, GiftPanelListWidget.f15312a, false, 10033, new Class[]{b.class, Boolean.TYPE}, Void.TYPE);
        } else if (bVar2 != null && bVar2.f15096b != z2) {
            bVar2.f15096b = z2;
            RecyclerView.ViewHolder b2 = giftPanelListWidget.b(bVar2);
            if (b2 instanceof BaseGiftPanelViewHolder) {
                ((BaseGiftPanelViewHolder) b2).a(z2);
            } else {
                giftPanelListWidget.f15314c.notifyDataSetChanged();
            }
        }
    }
}
