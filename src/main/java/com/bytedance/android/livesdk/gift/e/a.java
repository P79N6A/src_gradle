package com.bytedance.android.livesdk.gift.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14778a;

    public static String a(HashMap<Long, Integer> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, null, f14778a, true, 10132, new Class[]{HashMap.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hashMap}, null, f14778a, true, 10132, new Class[]{HashMap.class}, String.class);
        }
        Iterator<Map.Entry<Long, Integer>> it2 = hashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        while (true) {
            Map.Entry next = it2.next();
            sb.append('\"');
            sb.append((Long) next.getKey());
            sb.append('\"');
            sb.append(':');
            sb.append((Integer) next.getValue());
            if (!it2.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
        }
    }
}
