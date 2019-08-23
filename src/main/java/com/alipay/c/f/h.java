package com.alipay.c.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.d.a.a.a.a;
import com.alipay.d.a.a.a.a.b;
import com.alipay.d.a.a.d.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.UUID;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f5332a = "";

    public static String a(Context context) {
        try {
            String a2 = c.a(context, "vkeyid_settings", "last_apdid_env", "");
            if (a.a(a2)) {
                return "";
            }
            String b2 = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), a2);
            if (a.a(b2)) {
                b2 = "";
            }
            return b2;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("agent_switch", com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), str));
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str, long j) {
        try {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("vkey_valid".concat(String.valueOf(str)), com.alipay.d.a.a.a.a.c.a(com.alipay.d.a.a.a.a.c.a(), String.valueOf(j)));
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, boolean z) {
        String a2;
        String str;
        try {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "vkeyid_settings", 0).edit();
            if (edit != null) {
                if (z) {
                    a2 = com.alipay.d.a.a.a.a.c.a();
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    a2 = com.alipay.d.a.a.a.a.c.a();
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                }
                edit.putString("log_switch", com.alipay.d.a.a.a.a.c.a(a2, str));
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public static long b(Context context, String str) {
        try {
            String string = com.ss.android.ugc.aweme.q.c.a(context, "vkeyid_settings", 0).getString("vkey_valid".concat(String.valueOf(str)), "");
            if (a.a(string)) {
                return 0;
            }
            String b2 = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), string);
            if (a.a(b2)) {
                return 0;
            }
            return Long.parseLong(b2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean b(Context context) {
        try {
            String a2 = c.a(context, "vkeyid_settings", "log_switch", "");
            if (a.a(a2)) {
                return false;
            }
            String b2 = com.alipay.d.a.a.a.a.c.b(com.alipay.d.a.a.a.a.c.a(), a2);
            if (a.a(b2)) {
                return false;
            }
            return b2.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized String c(Context context) {
        String str;
        synchronized (h.class) {
            if (a.a(f5332a)) {
                String a2 = c.a(context, "alipay_vkey_random", "random", "");
                f5332a = a2;
                if (a.a(a2)) {
                    f5332a = b.a(UUID.randomUUID().toString());
                    String str2 = f5332a;
                    if (str2 != null) {
                        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context, "alipay_vkey_random", 0).edit();
                        if (edit != null) {
                            edit.clear();
                            edit.putString("random", str2);
                            edit.commit();
                        }
                    }
                }
            }
            str = f5332a;
        }
        return str;
    }
}
