package com.amap.api.mapcore2d;

import android.content.Context;
import com.ss.android.ugc.aweme.q.c;

public final class ge {
    public static int a(Context context, String str, String str2) {
        try {
            return c.a(context, str, 0).getInt(str2, 200);
        } catch (Throwable th) {
            gc.a(th, "SPUtil", "getPrefsInt");
            return 200;
        }
    }

    public static boolean b(Context context, String str, String str2) {
        try {
            return c.a(context, str, 0).getBoolean(str2, true);
        } catch (Throwable th) {
            gc.a(th, "SPUtil", "getPrefsBoolean");
            return true;
        }
    }
}
