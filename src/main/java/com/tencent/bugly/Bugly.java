package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.Map;

public class Bugly {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f79221a = false;
    public static Context applicationContext = null;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f79222b = {"BuglyCrashModule", "BuglyRqdModule", "BuglyBetaModule"};

    /* renamed from: c  reason: collision with root package name */
    private static String[] f79223c = {"BuglyRqdModule", "BuglyCrashModule", "BuglyBetaModule"};
    public static boolean enable = true;
    public static Boolean isDev;

    public static boolean isDev() {
        if (isDev == null) {
            isDev = Boolean.valueOf(Boolean.parseBoolean("false".replace("@", "")));
        }
        return isDev.booleanValue();
    }

    public static synchronized String getAppChannel() {
        synchronized (Bugly.class) {
            a b2 = a.b();
            if (b2 == null) {
                return null;
            }
            if (TextUtils.isEmpty(b2.l)) {
                p a2 = p.a();
                if (a2 == null) {
                    String str = b2.l;
                    return str;
                }
                Map a3 = a2.a(556, (o) null, true);
                if (a3 != null) {
                    byte[] bArr = (byte[]) a3.get("app_channel");
                    if (bArr != null) {
                        String str2 = new String(bArr);
                        return str2;
                    }
                }
            }
            String str3 = b2.l;
            return str3;
        }
    }

    public static void init(Context context, String str, boolean z) {
        init(context, str, z, null);
    }

    public static synchronized void init(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        synchronized (Bugly.class) {
            if (!f79221a) {
                f79221a = true;
                Context a2 = z.a(context);
                applicationContext = a2;
                if (a2 != null) {
                    if (isDev()) {
                        f79222b = f79223c;
                    }
                    for (String str2 : f79222b) {
                        try {
                            if (str2.equals("BuglyCrashModule")) {
                                b.a((a) CrashModule.getInstance());
                            } else if (!str2.equals("BuglyBetaModule") && !str2.equals("BuglyRqdModule")) {
                                str2.equals("BuglyFeedbackModule");
                            }
                        } catch (Throwable th) {
                            x.b(th);
                        }
                    }
                    b.f79235a = enable;
                    b.a(applicationContext, str, z, buglyStrategy);
                }
            }
        }
    }
}
