package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import android.support.v7.widget.RecyclerView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.PropPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.XgPanelViewHolder;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class r implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15373a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15374b;

    r(GiftPanelListWidget giftPanelListWidget) {
        this.f15374b = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15373a, false, 10052, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15373a, false, 10052, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelListWidget giftPanelListWidget = this.f15374b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10047, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            GiftPanelListWidget giftPanelListWidget2 = giftPanelListWidget;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, giftPanelListWidget2, GiftPanelListWidget.f15312a, false, 10047, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (booleanValue) {
            RecyclerView.ViewHolder b2 = giftPanelListWidget.b(giftPanelListWidget.k);
            if ((a.a() || a.j()) && ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() == 1) {
                if (PatchProxy.isSupport(new Object[]{b2}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10048, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                    GiftPanelListWidget giftPanelListWidget3 = giftPanelListWidget;
                    PatchProxy.accessDispatch(new Object[]{b2}, giftPanelListWidget3, GiftPanelListWidget.f15312a, false, 10048, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                } else {
                    if (b2 != null) {
                        if (giftPanelListWidget.f15315d == null) {
                            giftPanelListWidget.f15315d = new DouyinGiftCombHelper();
                        }
                        giftPanelListWidget.f15315d.handleComboClick((BasePanelViewHolder) b2);
                        if (giftPanelListWidget.f15316e.hasMessages(1100)) {
                            giftPanelListWidget.f15316e.removeMessages(1100);
                        }
                        giftPanelListWidget.f15316e.sendEmptyMessageDelayed(1100, ((long) giftPanelListWidget.j) * 1000);
                    }
                }
            } else if (a.f()) {
                if (PatchProxy.isSupport(new Object[]{b2}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10049, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                    GiftPanelListWidget giftPanelListWidget4 = giftPanelListWidget;
                    PatchProxy.accessDispatch(new Object[]{b2}, giftPanelListWidget4, GiftPanelListWidget.f15312a, false, 10049, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                } else if (b2 != null) {
                    if (b2 instanceof XgPanelViewHolder) {
                        XgPanelViewHolder xgPanelViewHolder = (XgPanelViewHolder) b2;
                        if (PatchProxy.isSupport(new Object[0], xgPanelViewHolder, XgPanelViewHolder.p, false, 9747, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], xgPanelViewHolder, XgPanelViewHolder.p, false, 9747, new Class[0], Void.TYPE);
                        } else {
                            if (xgPanelViewHolder.q != null) {
                                xgPanelViewHolder.q.b();
                            }
                        }
                    } else if (b2 instanceof PropPanelViewHolder) {
                        PropPanelViewHolder propPanelViewHolder = (PropPanelViewHolder) b2;
                        if (PatchProxy.isSupport(new Object[0], propPanelViewHolder, PropPanelViewHolder.p, false, 9739, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], propPanelViewHolder, PropPanelViewHolder.p, false, 9739, new Class[0], Void.TYPE);
                        } else if (!(propPanelViewHolder.r == null || propPanelViewHolder.q == null || !(propPanelViewHolder.q.f15098d instanceof Prop))) {
                            SendGiftAnimationView sendGiftAnimationView = propPanelViewHolder.r;
                            Prop prop = (Prop) propPanelViewHolder.q.f15098d;
                            if (PatchProxy.isSupport(new Object[]{prop}, sendGiftAnimationView, SendGiftAnimationView.f18334a, false, 14647, new Class[]{Prop.class}, Void.TYPE)) {
                                SendGiftAnimationView sendGiftAnimationView2 = sendGiftAnimationView;
                                PatchProxy.accessDispatch(new Object[]{prop}, sendGiftAnimationView2, SendGiftAnimationView.f18334a, false, 14647, new Class[]{Prop.class}, Void.TYPE);
                            } else if (prop != null) {
                                sendGiftAnimationView.b();
                                sendGiftAnimationView.f18336c.setText(ac.a((int) C0906R.string.d3s, Integer.valueOf(prop.count)));
                            }
                        }
                    }
                }
            }
        }
    }
}
