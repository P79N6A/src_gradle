package com.ss.android.ugc.aweme.common;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.util.Map;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40273a;

    @Insert
    @TargetClass
    static void a(String str, @Nullable Map map) {
        String str2 = str;
        Map map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f40273a, true, 33322, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f40273a, true, 33322, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        if (!a.b() && map2 != null && d.f52939a.contains(str2)) {
            map2.put("_staging_flag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        r.b(str, map);
    }
}
