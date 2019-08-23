package com.ss.android.downloadlib.c;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f28893a = Collections.synchronizedMap(new HashMap());

    public interface a {
        void a();

        void a(String str);
    }

    public static boolean b(String str) {
        return k.f().a(k.a(), str);
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f28893a.remove(str);
    }

    private static void a(String str, a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            f28893a.put(str, aVar);
        }
    }

    public static void a(String[] strArr, a aVar) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        a(valueOf, aVar);
        TTDelegateActivity.a(valueOf, strArr);
    }
}
