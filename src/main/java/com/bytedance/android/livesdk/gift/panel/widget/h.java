package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.e.a;
import com.bytedance.android.live.utility.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15353a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelChargeRewardWidget f15354b;

    h(GiftPanelChargeRewardWidget giftPanelChargeRewardWidget) {
        this.f15354b = giftPanelChargeRewardWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15353a, false, 10002, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15353a, false, 10002, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelChargeRewardWidget giftPanelChargeRewardWidget = this.f15354b;
        i iVar = (i) obj;
        if (PatchProxy.isSupport(new Object[]{iVar}, giftPanelChargeRewardWidget, GiftPanelChargeRewardWidget.f15295a, false, 9998, new Class[]{i.class}, Void.TYPE)) {
            GiftPanelChargeRewardWidget giftPanelChargeRewardWidget2 = giftPanelChargeRewardWidget;
            PatchProxy.accessDispatch(new Object[]{iVar}, giftPanelChargeRewardWidget2, GiftPanelChargeRewardWidget.f15295a, false, 9998, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{iVar}, giftPanelChargeRewardWidget, GiftPanelChargeRewardWidget.f15295a, false, 9999, new Class[]{i.class}, Boolean.TYPE)) {
            GiftPanelChargeRewardWidget giftPanelChargeRewardWidget3 = giftPanelChargeRewardWidget;
            ((Boolean) PatchProxy.accessDispatch(new Object[]{iVar}, giftPanelChargeRewardWidget3, GiftPanelChargeRewardWidget.f15295a, false, 9999, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
        } else if (((a) b.a(a.class)).user().c() && iVar != null) {
            int i = (iVar.getPayScores() > 0 ? 1 : (iVar.getPayScores() == 0 ? 0 : -1));
        }
    }
}
