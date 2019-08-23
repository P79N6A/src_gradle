package com.ss.android.ugc.aweme.im.sdk.c;

import android.text.TextUtils;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f22842a;

    public static Integer a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f22842a, true, 51686, new Class[]{Map.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{map2}, null, f22842a, true, 51686, new Class[]{Map.class}, Integer.class);
        } else if (map2 == null || map.isEmpty()) {
            return null;
        } else {
            String str = map2.get("commercialize.personal_info_count");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static Map<String, String> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f22842a, true, 51687, new Class[]{String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str2}, null, f22842a, true, 51687, new Class[]{String.class}, Map.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            b a2 = d.a().a(str2);
            if (a2 == null) {
                return null;
            }
            return a2.getLocalExt();
        }
    }

    public static void a(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f22842a, true, 51688, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f22842a, true, 51688, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            new e(str2).a(map2, (Runnable) null);
        }
    }
}
