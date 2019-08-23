package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15350a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelBottomWidget f15351b;

    f(GiftPanelBottomWidget giftPanelBottomWidget) {
        this.f15351b = giftPanelBottomWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15350a, false, 9983, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15350a, false, 9983, new Class[]{View.class}, Void.TYPE);
            return;
        }
        GiftPanelBottomWidget giftPanelBottomWidget = this.f15351b;
        HashMap hashMap = new HashMap();
        hashMap.put("discount_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        a.a().a("discount_recharge_click", hashMap, Room.class, new j().a("live_detail").c("enableGift").b("live_function"), new k());
        giftPanelBottomWidget.a();
    }
}
