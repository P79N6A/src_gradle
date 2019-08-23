package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15346a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelBottomWidget f15347b;

    d(GiftPanelBottomWidget giftPanelBottomWidget) {
        this.f15347b = giftPanelBottomWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15346a, false, 9981, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15346a, false, 9981, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelBottomWidget giftPanelBottomWidget = this.f15347b;
        if (((Boolean) obj).booleanValue()) {
            a aVar = giftPanelBottomWidget.i;
            if (PatchProxy.isSupport(new Object[]{aVar}, giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9975, new Class[]{a.class}, Void.TYPE)) {
                GiftPanelBottomWidget giftPanelBottomWidget2 = giftPanelBottomWidget;
                PatchProxy.accessDispatch(new Object[]{aVar}, giftPanelBottomWidget2, GiftPanelBottomWidget.f15270a, false, 9975, new Class[]{a.class}, Void.TYPE);
            } else if (aVar != null && aVar.c()) {
                giftPanelBottomWidget.f15272c.setVisibility(8);
                giftPanelBottomWidget.f15273d.setVisibility(8);
                giftPanelBottomWidget.f15274e.setVisibility(0);
                if (giftPanelBottomWidget.k != null && giftPanelBottomWidget.k.isRunning()) {
                    giftPanelBottomWidget.k.cancel();
                }
                giftPanelBottomWidget.k = ObjectAnimator.ofFloat(giftPanelBottomWidget.f15274e, "progress", new float[]{360.0f, 0.0f}).setDuration(((long) giftPanelBottomWidget.j) * 1000);
                giftPanelBottomWidget.k.start();
                giftPanelBottomWidget.f15274e.startScaleAnim(((long) giftPanelBottomWidget.j) * 1000, null);
                if (giftPanelBottomWidget.l.hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST)) {
                    giftPanelBottomWidget.l.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
                }
                giftPanelBottomWidget.l.sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, ((long) giftPanelBottomWidget.j) * 1000);
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9976, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], giftPanelBottomWidget, GiftPanelBottomWidget.f15270a, false, 9976, new Class[0], Void.TYPE);
                return;
            }
            if (giftPanelBottomWidget.k != null && giftPanelBottomWidget.k.isRunning()) {
                giftPanelBottomWidget.k.cancel();
            }
            if (giftPanelBottomWidget.l.hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST)) {
                giftPanelBottomWidget.l.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
            }
            giftPanelBottomWidget.f15272c.setVisibility(0);
            giftPanelBottomWidget.f15274e.setVisibility(8);
            giftPanelBottomWidget.a(giftPanelBottomWidget.i, true);
        }
    }
}
