package com.bytedance.android.livesdk.feed.g;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14169a;

    /* renamed from: b  reason: collision with root package name */
    private static b f14170b = new b();

    public static b a() {
        return f14170b;
    }

    public final void a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f14169a, false, 8769, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f14169a, false, 8769, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && !str2.startsWith("livesdk_") && !"live_enter".equals(str2)) {
            str2 = "livesdk_" + str2;
        }
        map2.put("sdk_version", "1150");
        map2.put("_param_live_platform", "live");
        com.bytedance.android.livesdk.feed.b.b.c().e().a(str2, map2);
    }
}
