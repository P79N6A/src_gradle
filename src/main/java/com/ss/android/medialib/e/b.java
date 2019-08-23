package com.ss.android.medialib.e;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29649a;

    public static Map<String, Integer> a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29649a, true, 17786, new Class[]{Context.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{context2}, null, f29649a, true, 17786, new Class[]{Context.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : c.a(context2, "ShortVideo", 0).getAll().entrySet()) {
            if (((String) next.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) next.getKey()).substring(11), (Integer) next.getValue());
            }
        }
        return hashMap;
    }
}
