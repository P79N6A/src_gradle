package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import org.json.JSONArray;
import org.json.JSONObject;

public class HWPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f81732a;

    public static void convertMessage(Intent intent) {
        j.a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return j.a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String a2 = j.a(f.ASSEMBLE_PUSH_HUAWEI);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String a3 = j.a(context, a2);
        String a4 = ao.a(context).a(bd.UPLOAD_HUAWEI_TOKEN);
        return !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4) && "synced".equals(a4);
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f81732a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("pushMsg")) {
                            str2 = jSONObject.getString("pushMsg");
                            break;
                        }
                        i++;
                    }
                }
            } catch (Exception e2) {
                b.d(e2.toString());
            }
        }
        str2 = "";
        PushMessageReceiver a2 = j.a(context);
        if (a2 != null) {
            MiPushMessage a3 = j.a(str2);
            if (!a3.getExtra().containsKey("notify_effect")) {
                a2.onNotificationMessageClicked(context, a3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void notifyHmsPassThoughMessageArrived(android.content.Context r2, java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x001c }
            if (r1 != 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x001c }
            r1.<init>(r3)     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "content"
            boolean r3 = r1.has(r3)     // Catch:{ Exception -> 0x001c }
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = "content"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x001c }
            goto L_0x0025
        L_0x001c:
            r3 = move-exception
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r3)
        L_0x0024:
            r3 = r0
        L_0x0025:
            com.xiaomi.mipush.sdk.PushMessageReceiver r0 = com.xiaomi.mipush.sdk.j.a((android.content.Context) r2)
            if (r0 == 0) goto L_0x0032
            com.xiaomi.mipush.sdk.MiPushMessage r3 = com.xiaomi.mipush.sdk.j.a((java.lang.String) r3)
            r0.onReceivePassThroughMessage(r2, r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.HWPushHelper.notifyHmsPassThoughMessageArrived(android.content.Context, java.lang.String):void");
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager a2 = g.a(context).a(f.ASSEMBLE_PUSH_HUAWEI);
        if (a2 != null) {
            a2.register();
        }
    }

    public static void reportError(String str, int i) {
        j.a(str, i);
    }

    public static void setConnectTime(Context context) {
        synchronized (HWPushHelper.class) {
            try {
                c.a(context, "mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
            } catch (Throwable th) {
                Class<HWPushHelper> cls = HWPushHelper.class;
                throw th;
            }
        }
    }

    public static void setGetTokenTime(Context context) {
        synchronized (HWPushHelper.class) {
            try {
                c.a(context, "mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
            } catch (Throwable th) {
                Class<HWPushHelper> cls = HWPushHelper.class;
                throw th;
            }
        }
    }

    public static void setNeedConnect(boolean z) {
        f81732a = z;
    }

    public static boolean shouldGetToken(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            try {
                if (Math.abs(System.currentTimeMillis() - c.a(context, "mipush_extra", 0).getLong("last_get_token_time", -1)) > 172800000) {
                    z = true;
                }
            } catch (Throwable th) {
                Class<HWPushHelper> cls = HWPushHelper.class;
                throw th;
            }
        }
        return z;
    }

    public static boolean shouldTryConnect(Context context) {
        boolean z;
        synchronized (HWPushHelper.class) {
            z = false;
            try {
                if (Math.abs(System.currentTimeMillis() - c.a(context, "mipush_extra", 0).getLong("last_connect_time", -1)) > 5000) {
                    z = true;
                }
            } catch (Throwable th) {
                Class<HWPushHelper> cls = HWPushHelper.class;
                throw th;
            }
        }
        return z;
    }

    public static void uploadToken(Context context, String str) {
        j.a(context, f.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
