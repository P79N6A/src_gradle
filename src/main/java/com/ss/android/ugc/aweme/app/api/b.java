package com.ss.android.ugc.aweme.app.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33792a;

    public static Map<String, String> a(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33792a, true, 23034, new Class[]{String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{str2}, null, f33792a, true, 23034, new Class[]{String.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        while (i <= str.length()) {
            int indexOf = str2.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str2.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                hashMap.put(str2.substring(i, indexOf), null);
            } else {
                hashMap.put(str2.substring(i, indexOf2), str2.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return hashMap;
    }
}
