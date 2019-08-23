package com.bytedance.android.livesdk.network;

import android.content.res.Resources;
import com.bytedance.android.live.core.b.b;
import com.bytedance.android.live.core.network.a;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.setting.m;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16740b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f16741c = {"CN", "MR", "SA", "FR", "AE"};

    public final void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f16740b, false, 12547, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f16740b, false, 12547, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        super.a(map);
        map.put("webcast_language", b.a(TTLiveSDKContext.getHostService().a().l()));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (m.a() && !com.bytedance.android.live.uikit.a.a.j()) {
            int intValue = ((Integer) CoreSettingKeys.TEST_FAKE_REGION.a()).intValue();
            String str = "";
            if (intValue >= 0 && intValue < this.f16741c.length) {
                str = this.f16741c[intValue];
            }
            map.put("fake_region", str);
        }
    }
}
