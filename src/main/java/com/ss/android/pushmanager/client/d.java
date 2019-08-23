package com.ss.android.pushmanager.client;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.b.k;
import com.ss.android.pushmanager.app.e;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.setting.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30542a;

    /* renamed from: b  reason: collision with root package name */
    private static List<NotificationChannel> f30543b;

    static void a(Context context) {
        final Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30542a, true, 19068, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f30542a, true, 19068, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ThreadPlus.submitRunnable(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30544a;

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e4, code lost:
                if (r8 != false) goto L_0x00e6;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r16 = this;
                    r7 = r16
                    r8 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f30544a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 19078(0x4a86, float:2.6734E-41)
                    r1 = r16
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0027
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f30544a
                    r3 = 0
                    r4 = 19078(0x4a86, float:2.6734E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r16
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0027:
                    com.ss.android.pushmanager.setting.b r0 = com.ss.android.pushmanager.setting.b.a()
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.setting.b.f2543a
                    r12 = 0
                    r13 = 19231(0x4b1f, float:2.6948E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    r10 = r0
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    r2 = 1
                    if (r1 == 0) goto L_0x0055
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.setting.b.f2543a
                    r12 = 0
                    r13 = 19231(0x4b1f, float:2.6948E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    r10 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    goto L_0x005d
                L_0x0055:
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r0.f2546c
                    java.lang.String r1 = "last_send_notify_enable_is_succ"
                    boolean r0 = r0.a((java.lang.String) r1, (boolean) r2)
                L_0x005d:
                    if (r0 == 0) goto L_0x00e6
                    android.content.Context r0 = r0
                    java.lang.Object[] r9 = new java.lang.Object[r2]
                    r9[r8] = r0
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.client.d.f30542a
                    r12 = 1
                    r13 = 19070(0x4a7e, float:2.6723E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r2]
                    java.lang.Class<android.content.Context> r1 = android.content.Context.class
                    r14[r8] = r1
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r1 == 0) goto L_0x0096
                    java.lang.Object[] r9 = new java.lang.Object[r2]
                    r9[r8] = r0
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.client.d.f30542a
                    r12 = 1
                    r13 = 19070(0x4a7e, float:2.6723E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r2]
                    java.lang.Class<android.content.Context> r0 = android.content.Context.class
                    r14[r8] = r0
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r8 = r0.booleanValue()
                    goto L_0x00e4
                L_0x0096:
                    int r1 = com.ss.android.message.b.k.e(r0)
                    com.ss.android.pushmanager.setting.b r3 = com.ss.android.pushmanager.setting.b.a()
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.setting.b.f2543a
                    r12 = 0
                    r13 = 19235(0x4b23, float:2.6954E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Integer.TYPE
                    r10 = r3
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r4 == 0) goto L_0x00c7
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.pushmanager.setting.b.f2543a
                    r12 = 0
                    r13 = 19235(0x4b23, float:2.6954E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Integer.TYPE
                    r10 = r3
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    goto L_0x00d0
                L_0x00c7:
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r3 = r3.f2546c
                    java.lang.String r4 = "system_push_enable"
                    r5 = -2
                    int r3 = r3.a((java.lang.String) r4, (int) r5)
                L_0x00d0:
                    if (r3 == r1) goto L_0x00d4
                    r1 = 1
                    goto L_0x00d5
                L_0x00d4:
                    r1 = 0
                L_0x00d5:
                    if (r1 == 0) goto L_0x00d9
                    r8 = 1
                    goto L_0x00e4
                L_0x00d9:
                    r1 = 26
                    int r2 = android.os.Build.VERSION.SDK_INT
                    if (r1 >= r2) goto L_0x00e0
                    goto L_0x00e4
                L_0x00e0:
                    boolean r8 = com.ss.android.pushmanager.client.d.b(r0)
                L_0x00e4:
                    if (r8 == 0) goto L_0x00f3
                L_0x00e6:
                    android.content.Context r0 = r0
                    com.ss.android.pushmanager.setting.b r1 = com.ss.android.pushmanager.setting.b.a()
                    boolean r1 = r1.c()
                    com.ss.android.pushmanager.client.d.a((android.content.Context) r0, (boolean) r1)
                L_0x00f3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.client.d.AnonymousClass1.run():void");
            }
        });
    }

    @TargetApi(26)
    public static List<NotificationChannel> c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30542a, true, 19072, new Class[]{Context.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context2}, null, f30542a, true, 19072, new Class[]{Context.class}, List.class);
        }
        if (f30543b == null || f30543b.isEmpty()) {
            try {
                f30543b = ((NotificationManager) context2.getSystemService(NotificationManager.class)).getNotificationChannels();
            } catch (Exception unused) {
                f30543b = Collections.emptyList();
            }
        }
        return f30543b;
    }

    @TargetApi(26)
    private static Map<String, NotificationChannel> a(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, null, f30542a, true, 19074, new Class[]{JSONArray.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{jSONArray2}, null, f30542a, true, 19074, new Class[]{JSONArray.class}, Map.class);
        } else if (jSONArray.length() == 0) {
            return Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                String optString = optJSONObject.optString("id");
                NotificationChannel notificationChannel = new NotificationChannel(optString, optJSONObject.optString("name"), optJSONObject.optInt("importance", -1));
                notificationChannel.setBypassDnd(optJSONObject.optBoolean("bypassDnd"));
                notificationChannel.setLockscreenVisibility(optJSONObject.optInt("lockscreenVisibility", -1));
                notificationChannel.enableLights(optJSONObject.optBoolean("lights"));
                notificationChannel.enableVibration(optJSONObject.optBoolean("vibration"));
                hashMap.put(optString, notificationChannel);
            }
            return hashMap;
        }
    }

    @TargetApi(26)
    static boolean b(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, null, f30542a, true, 19071, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f30542a, true, 19071, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            List<NotificationChannel> c2 = c(context);
            b a2 = b.a();
            if (PatchProxy.isSupport(new Object[0], a2, b.f2543a, false, 19271, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], a2, b.f2543a, false, 19271, new Class[0], String.class);
            } else {
                str = a2.f2546c.a("notification_channel_status", "");
            }
            if (TextUtils.isEmpty(str)) {
                if (c2 != null) {
                    if (!c2.isEmpty()) {
                        return true;
                    }
                }
                return false;
            } else if (!a(c2, a(new JSONArray(str)))) {
                return true;
            } else {
                return false;
            }
        } catch (JSONException unused) {
            return false;
        }
    }

    @TargetApi(26)
    public static JSONArray a(List<NotificationChannel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f30542a, true, 19075, new Class[]{List.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{list}, null, f30542a, true, 19075, new Class[]{List.class}, JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        for (NotificationChannel next : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", next.getId());
                jSONObject.put("name", next.getName());
                jSONObject.put("importance", next.getImportance());
                jSONObject.put("bypassDnd", next.canBypassDnd());
                jSONObject.put("lockscreenVisibility", next.getLockscreenVisibility());
                jSONObject.put("lights", next.shouldShowLights());
                jSONObject.put("vibration", next.shouldVibrate());
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public static void a(Context context, boolean z) {
        final Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f30542a, true, 19069, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f30542a, true, 19069, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(context)) {
            b.a().b(false);
        } else {
            final boolean z2 = z;
            AnonymousClass2 r1 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30546a;

                public final void run() {
                    String str;
                    String str2;
                    if (PatchProxy.isSupport(new Object[0], this, f30546a, false, 19079, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30546a, false, 19079, new Class[0], Void.TYPE);
                        return;
                    }
                    int e2 = k.e(context2);
                    Map<String, String> c2 = e.a().c();
                    if (z2) {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    } else {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    }
                    c2.put("notice", str);
                    c2.put("system_notify_status", e2);
                    if (PatchProxy.isSupport(new Object[0], null, f.f2537a, true, 18941, new Class[0], String.class)) {
                        str2 = (String) PatchProxy.accessDispatch(new Object[0], null, f.f2537a, true, 18941, new Class[0], String.class);
                    } else if (f.k == null || TextUtils.isEmpty(f.k.a())) {
                        str2 = f.h;
                    } else {
                        str2 = f.a(f.k.a(), "/service/1/app_notice_status/");
                    }
                    String a2 = k.a(str2, c2);
                    try {
                        JSONArray a3 = d.a(d.c(context2));
                        String post = NetworkClient.getDefault().post(a2, a3.toString().getBytes("UTF-8"), true, "application/json; charset=utf-8", false);
                        if (TextUtils.isEmpty(post) || !"success".equals(new JSONObject(post).optString("message"))) {
                            b.a().b(false);
                            return;
                        }
                        b.a().b(true);
                        b a4 = b.a();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(e2)}, a4, b.f2543a, false, 19234, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            b bVar = a4;
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(e2)}, bVar, b.f2543a, false, 19234, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else {
                            a4.f2546c.a().a("system_push_enable", e2).a();
                        }
                        b a5 = b.a();
                        String jSONArray = a3.toString();
                        if (PatchProxy.isSupport(new Object[]{jSONArray}, a5, b.f2543a, false, 19272, new Class[]{String.class}, Void.TYPE)) {
                            b bVar2 = a5;
                            PatchProxy.accessDispatch(new Object[]{jSONArray}, bVar2, b.f2543a, false, 19272, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        a5.f2546c.a().a("notification_channel_status", jSONArray).a();
                    } catch (Exception unused) {
                        b.a().b(false);
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPlus.submitRunnable(r1);
            } else {
                r1.run();
            }
        }
    }

    @TargetApi(26)
    private static boolean a(List<NotificationChannel> list, Map<String, NotificationChannel> map) {
        Map<String, NotificationChannel> map2 = map;
        if (PatchProxy.isSupport(new Object[]{list, map2}, null, f30542a, true, 19073, new Class[]{List.class, Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, map2}, null, f30542a, true, 19073, new Class[]{List.class, Map.class}, Boolean.TYPE)).booleanValue();
        } else if (list.size() != map.size()) {
            return false;
        } else {
            for (NotificationChannel next : list) {
                NotificationChannel notificationChannel = map2.get(next.getId());
                if (notificationChannel == null || notificationChannel.getImportance() != next.getImportance() || notificationChannel.getLockscreenVisibility() != next.getLockscreenVisibility() || notificationChannel.canBypassDnd() != next.canBypassDnd() || notificationChannel.shouldShowLights() != next.shouldShowLights()) {
                    return false;
                }
                if (notificationChannel.shouldVibrate() != next.shouldVibrate()) {
                    return false;
                }
            }
            return true;
        }
    }
}
