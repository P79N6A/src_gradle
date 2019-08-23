package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.ies.a.a;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class d<T extends a> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17980a;

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f17980a, true, 13883, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f17980a, true, 13883, new Class[0], Integer.TYPE)).intValue();
        }
        if (com.bytedance.android.live.uikit.a.a.d() && ((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.a()).intValue() != 1) {
            return 0;
        }
        if (!com.bytedance.android.live.uikit.a.a.d() || ((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.a()).intValue() != 1) {
            return 2;
        }
        return 1;
    }
}
