package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13271a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastInfoWidget f13272b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13273c;

    i(BroadcastInfoWidget broadcastInfoWidget, int i) {
        this.f13272b = broadcastInfoWidget;
        this.f13273c = i;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13271a, false, 6594, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13271a, false, 6594, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BroadcastInfoWidget broadcastInfoWidget = this.f13272b;
        int i = this.f13273c;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, broadcastInfoWidget, BroadcastInfoWidget.f12372a, false, 6593, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = BroadcastInfoWidget.f12372a;
            BroadcastInfoWidget broadcastInfoWidget2 = broadcastInfoWidget;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, broadcastInfoWidget2, changeQuickRedirect2, false, 6593, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 0) {
            broadcastInfoWidget.f12376e.setVisibility(0);
            broadcastInfoWidget.f12373b.setVisibility(4);
        } else {
            broadcastInfoWidget.f12376e.setVisibility(4);
            broadcastInfoWidget.f12373b.setVisibility(0);
            broadcastInfoWidget.f12373b.setImageLevel(i);
        }
    }
}
