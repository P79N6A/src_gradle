package com.bytedance.android.livesdk.gift.assets;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14741a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, h> f14742b = new HashMap();

    public static h a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f14741a, true, 9349, new Class[]{String.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{str2}, null, f14741a, true, 9349, new Class[]{String.class}, h.class);
        }
        if (!f14742b.containsKey(str2) || f14742b.get(str2) == null) {
            f14742b.put(str2, new c(str2));
        }
        return f14742b.get(str2);
    }
}
