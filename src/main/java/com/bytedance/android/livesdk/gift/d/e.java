package com.bytedance.android.livesdk.gift.d;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract /* synthetic */ class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14772a;

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f14772a, true, 10130, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f14772a, true, 10130, new Class[0], d.class);
        }
        if (((Integer) LiveSettingKeys.LIVE_GIFT_PANEL_BG_STYLE.a()).intValue() == 0) {
            return b.a();
        }
        return h.a();
    }
}
