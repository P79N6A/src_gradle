package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import com.xiaomi.push.at;
import com.xiaomi.push.s;
import com.xiaomi.push.service.ag;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f81797a = new HashMap<>();

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has(PushConstants.TITLE)) {
                    miPushMessage.setTitle(jSONObject.getString(PushConstants.TITLE));
                }
                if (jSONObject.has(PushConstants.CONTENT)) {
                    miPushMessage.setContent(jSONObject.getString(PushConstants.CONTENT));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has(PushConstants.EXTRA)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(PushConstants.EXTRA);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e2) {
                b.d(e2.toString());
            }
        }
        return miPushMessage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.xiaomi.mipush.sdk.PushMessageReceiver a(android.content.Context r5) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r1)
            java.lang.String r1 = r5.getPackageName()
            r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r2 = 32
            r3 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x003e
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x001f:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0051 }
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch:{ Exception -> 0x0051 }
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x0051 }
            java.lang.String r4 = r5.getPackageName()     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x001f
            goto L_0x003f
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 == 0) goto L_0x0059
            android.content.pm.ActivityInfo r5 = r1.activityInfo     // Catch:{ Exception -> 0x0051 }
            java.lang.String r5 = r5.name     // Catch:{ Exception -> 0x0051 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0051 }
            com.xiaomi.mipush.sdk.PushMessageReceiver r5 = (com.xiaomi.mipush.sdk.PushMessageReceiver) r5     // Catch:{ Exception -> 0x0051 }
            r3 = r5
            goto L_0x0059
        L_0x0051:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r5)
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.j.a(android.content.Context):com.xiaomi.mipush.sdk.PushMessageReceiver");
    }

    protected static String a(Context context, String str) {
        String str2;
        synchronized (j.class) {
            try {
                str2 = f81797a.get(str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
            } catch (Throwable th) {
                Class<j> cls = j.class;
                throw th;
            }
        }
        return str2;
    }

    public static String a(f fVar) {
        switch (l.f81799a[fVar.ordinal()]) {
            case 1:
                return "hms_push_token";
            case 2:
                return "fcm_push_token";
            case 3:
                return "cos_push_token";
            case 4:
                return "ftos_push_token";
            default:
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        r6.append(r2.name());
        r6.append("~token");
        r6.append(":");
        r6.append(a(r5, r1));
        r6.append("~package_name");
        r6.append(":");
        r6.append(r5.getPackageName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        r2 = r6.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap<java.lang.String, java.lang.String> a(android.content.Context r5, com.xiaomi.mipush.sdk.f r6) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = a((com.xiaomi.mipush.sdk.f) r6)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0011
            goto L_0x00d4
        L_0x0011:
            int[] r2 = com.xiaomi.mipush.sdk.l.f81799a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            r2 = 0
            switch(r6) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0033;
                case 3: goto L_0x0029;
                case 4: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00cf
        L_0x001f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "brand:"
            r6.<init>(r2)
            com.xiaomi.mipush.sdk.ap r2 = com.xiaomi.mipush.sdk.ap.VIVO
            goto L_0x003c
        L_0x0029:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "brand:"
            r6.<init>(r2)
            com.xiaomi.mipush.sdk.ap r2 = com.xiaomi.mipush.sdk.ap.OPPO
            goto L_0x003c
        L_0x0033:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "brand:"
            r6.<init>(r2)
            com.xiaomi.mipush.sdk.ap r2 = com.xiaomi.mipush.sdk.ap.FCM
        L_0x003c:
            java.lang.String r2 = r2.name()
            r6.append(r2)
            java.lang.String r2 = "~token"
            r6.append(r2)
            java.lang.String r2 = ":"
            r6.append(r2)
            java.lang.String r1 = a((android.content.Context) r5, (java.lang.String) r1)
            r6.append(r1)
            java.lang.String r1 = "~package_name"
            r6.append(r1)
            java.lang.String r1 = ":"
            r6.append(r1)
            java.lang.String r5 = r5.getPackageName()
            r6.append(r5)
        L_0x0065:
            java.lang.String r2 = r6.toString()
            goto L_0x00cf
        L_0x006a:
            android.content.pm.PackageManager r6 = r5.getPackageManager()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = r5.getPackageName()     // Catch:{ Exception -> 0x0079 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r3, r4)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0082
        L_0x0079:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            r6 = r2
        L_0x0082:
            r2 = -1
            if (r6 == 0) goto L_0x008d
            android.os.Bundle r6 = r6.metaData
            java.lang.String r2 = "com.huawei.hms.client.appid"
            int r2 = r6.getInt(r2)
        L_0x008d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "brand:"
            r6.<init>(r3)
            com.xiaomi.mipush.sdk.ap r3 = com.xiaomi.mipush.sdk.o.a((android.content.Context) r5)
            java.lang.String r3 = r3.name()
            r6.append(r3)
            java.lang.String r3 = "~token"
            r6.append(r3)
            java.lang.String r3 = ":"
            r6.append(r3)
            java.lang.String r1 = a((android.content.Context) r5, (java.lang.String) r1)
            r6.append(r1)
            java.lang.String r1 = "~package_name"
            r6.append(r1)
            java.lang.String r1 = ":"
            r6.append(r1)
            java.lang.String r5 = r5.getPackageName()
            r6.append(r5)
            java.lang.String r5 = "~app_id"
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r2)
            goto L_0x0065
        L_0x00cf:
            java.lang.String r5 = "RegInfo"
            r0.put(r5, r2)
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.j.a(android.content.Context, com.xiaomi.mipush.sdk.f):java.util.HashMap");
    }

    /* renamed from: a  reason: collision with other method in class */
    static void m71a(Context context) {
        boolean z = false;
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        String a3 = a(f.ASSEMBLE_PUSH_HUAWEI);
        String a4 = a(f.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(a2.getString(a3, "")) && TextUtils.isEmpty(a2.getString(a4, ""))) {
            z = true;
        }
        if (z) {
            ay.a(context).a(2, a3);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m72a(Context context, f fVar) {
        String a2 = a(fVar);
        if (!TextUtils.isEmpty(a2)) {
            s.a(c.a(context, "mipush_extra", 0).edit().putString(a2, ""));
        }
    }

    public static void a(Context context, f fVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            SharedPreferences a2 = c.a(context, "mipush_extra", 0);
            String a3 = a(fVar);
            if (TextUtils.isEmpty(a3)) {
                b.a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            } else {
                String string = a2.getString(a3, "");
                if (TextUtils.isEmpty(string) || !str.equals(string)) {
                    b.a("ASSEMBLE_PUSH : send token upload");
                    a(fVar, str);
                    bd a4 = m.a(fVar);
                    if (a4 != null) {
                        ay.a(context).a((String) null, a4, fVar);
                    }
                } else {
                    b.a("ASSEMBLE_PUSH : do not need to send token");
                }
            }
        }
    }

    public static void a(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("pushMsg")) {
                intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
            }
        }
    }

    private static void a(f fVar, String str) {
        String str2;
        synchronized (j.class) {
            try {
                String a2 = a(fVar);
                if (TextUtils.isEmpty(a2)) {
                    str2 = "ASSEMBLE_PUSH : can not find the key of token used in sp file";
                } else if (TextUtils.isEmpty(str)) {
                    str2 = "ASSEMBLE_PUSH : token is null";
                } else {
                    f81797a.put(a2, str);
                }
                b.a(str2);
            } catch (Throwable th) {
                Class<j> cls = j.class;
                throw th;
            }
        }
    }

    public static void a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1, "error code = " + i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m73a(Context context) {
        if (context == null) {
            return false;
        }
        return at.b(context);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m74a(Context context, f fVar) {
        if (m.a(fVar) != null) {
            return ag.a(context).a(m.a(fVar).a(), true);
        }
        return false;
    }

    public static String b(f fVar) {
        switch (l.f81799a[fVar.ordinal()]) {
            case 1:
                return "hms_push_error";
            case 2:
                return "fcm_push_error";
            case 3:
                return "cos_push_error";
            case 4:
                return "ftos_push_error";
            default:
                return null;
        }
    }

    public static void b(Context context) {
        g.a(context).register();
    }

    public static void b(Context context, f fVar, String str) {
        aj.a(context).a((Runnable) new k(str, context, fVar));
    }

    public static void c(Context context) {
        g.a(context).unregister();
    }

    /* access modifiers changed from: private */
    public static void d(Context context, f fVar, String str) {
        String str2;
        synchronized (j.class) {
            try {
                String a2 = a(fVar);
                if (TextUtils.isEmpty(a2)) {
                    str2 = "ASSEMBLE_PUSH : can not find the key of token used in sp file";
                } else {
                    s.a(c.a(context, "mipush_extra", 0).edit().putString(a2, str));
                    str2 = "ASSEMBLE_PUSH : update sp file success!  " + str;
                }
                b.a(str2);
            } catch (Throwable th) {
                Class<j> cls = j.class;
                throw th;
            }
        }
    }
}
