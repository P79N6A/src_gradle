package anet.channel.strategy.dispatch;

import android.content.Context;
import anet.channel.util.ALog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile double f1363a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile double f1364b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f1365c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile String f1366d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f1367e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile Context f1368f;
    private static volatile int g;
    private static volatile long h;
    private static IAmdcSign i;
    private static Map<String, String> j;

    public static IAmdcSign b() {
        return i;
    }

    public static int a() {
        if (g > 0 && System.currentTimeMillis() - h > 0) {
            h = 0;
            g = 0;
        }
        return g;
    }

    public static synchronized Map<String, String> c() {
        synchronized (a.class) {
            if (j == null) {
                Map<String, String> map = Collections.EMPTY_MAP;
                return map;
            }
            HashMap hashMap = new HashMap(j);
            return hashMap;
        }
    }

    public static void a(Context context) {
        f1368f = context;
    }

    public static void a(IAmdcSign iAmdcSign) {
        i = iAmdcSign;
    }

    public static void a(int i2, int i3) {
        ALog.i("awcn.AmdcRuntimeInfo", "set amdc limit", null, "level", Integer.valueOf(i2), "time", Integer.valueOf(i3));
        if (i2 >= 0 && i2 <= 3) {
            g = i2;
            h = System.currentTimeMillis() + (((long) i3) * 1000);
        }
    }

    public static void a(String str, String str2, String str3) {
        f1366d = str;
        f1367e = str2;
        f1365c = str3;
    }
}
