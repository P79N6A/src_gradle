package com.bytedance.android.livesdk.feed.network;

import android.content.res.Resources;
import com.bytedance.android.live.core.b.b;
import com.bytedance.android.live.core.network.a;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.setting.m;
import com.bytedance.android.livesdk.feed.l.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f14322b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f14323c = {"CN", "MR", "SA", "FR", "AE"};

    public final void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f14322b, false, 8806, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f14322b, false, 8806, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        super.a(map);
        map.put("webcast_language", b.a(com.bytedance.android.livesdk.feed.b.b.c().a().l()));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (m.a() && !c.e()) {
            int intValue = ((Integer) CoreSettingKeys.TEST_FAKE_REGION.a()).intValue();
            String str = "";
            if (intValue >= 0 && intValue < this.f14323c.length) {
                str = this.f14323c[intValue];
            }
            map.put("fake_region", str);
        }
    }
}
