package com.ss.android.ugc.awemepushlib.manager;

import a.g;
import a.i;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.uikit.base.AppHooks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.push.window.oppo.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.awemepushlib.interaction.j;
import com.ss.android.ugc.awemepushlib.interaction.k;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

public class MessageShowHandler {
    private static final Object LOCK = new Object();
    private static final List<b> NOTIFY_ITEMS = new ArrayList();
    private static final Comparator<b> NOTIFY_ITEM_COMPARATOR = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            if (bVar.f77059b == bVar2.f77059b) {
                return 0;
            }
            if (bVar.f77059b > bVar2.f77059b) {
                return -1;
            }
            return 1;
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean mAllowPushImage = true;
    private static volatile boolean mLocalListLoaded = false;
    private static NotificationManager mNm;
    private static OkHttpClient mhttpClient;
    private static WeakHandler sHandler = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        public final void handleMsg(Message message) {
        }
    });

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static MessageShowHandler f77057a = new MessageShowHandler();
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f77058a;

        /* renamed from: b  reason: collision with root package name */
        public long f77059b;

        b(int i, long j) {
            this.f77058a = i;
            this.f77059b = j;
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77060a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77061b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f77060a, false, 90336, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f77060a, false, 90336, new Class[0], Void.TYPE);
                return;
            }
            Context context = GlobalContext.getContext();
            if (context != null) {
                try {
                    MessageShowHandler.saveNotifyList(context, this.f77061b);
                } catch (Exception unused) {
                }
            }
        }

        private c(String str) {
            this.f77061b = str;
        }

        /* synthetic */ c(String str, byte b2) {
            this(str);
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77062a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f77063b;

        public final void run() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f77062a, false, 90337, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f77062a, false, 90337, new Class[0], Void.TYPE);
            } else if (this.f77063b != null && this.f77063b.length > 0) {
                try {
                    String str = this.f77063b[0];
                    String str2 = this.f77063b[1];
                    String str3 = this.f77063b[2];
                    String str4 = this.f77063b[3];
                    if (!TextUtils.isEmpty(str)) {
                        Logger.debug();
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("did", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("id", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put(PushConstants.WEB_URL, str4);
                        }
                        JSONObject jSONObject2 = new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), NetworkUtils.e.GZIP, "application/json; charset=utf-8"));
                        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, com.ss.android.ugc.awemepushlib.c.a.f76970a, true, 90389, new Class[]{JSONObject.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, com.ss.android.ugc.awemepushlib.c.a.f76970a, true, 90389, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
                        } else if ("success".equals(jSONObject2.optString("message"))) {
                            z = true;
                        }
                        if (z) {
                            Logger.debug();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        d(String[] strArr) {
            this.f77063b = strArr;
        }
    }

    private static boolean canShowPushNotifyActivity() {
        return true;
    }

    public static MessageShowHandler inst() {
        return a.f77057a;
    }

    public static OkHttpClient getOkHttpClient() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90309, new Class[0], OkHttpClient.class)) {
            return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90309, new Class[0], OkHttpClient.class);
        }
        if (mhttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(3, TimeUnit.SECONDS);
            mhttpClient = builder.build();
        }
        return mhttpClient;
    }

    private static boolean isSystemPushChannel(com.ss.android.ugc.awemepushlib.a.c cVar) {
        if (cVar.pass_through == 0) {
            return true;
        }
        return false;
    }

    private static boolean ignoreLimit(com.ss.android.ugc.awemepushlib.a.c cVar) {
        if (cVar == null || cVar.pass_through == 0 || cVar.isPing == 1) {
            return true;
        }
        return false;
    }

    private static Bitmap downloadImage(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90320, new Class[]{String.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90320, new Class[]{String.class}, Bitmap.class);
        }
        try {
            return BitmapFactory.decodeStream(getOkHttpClient().newCall(new Request.Builder().url(str2).build()).execute().body().byteStream());
        } catch (IOException unused) {
            return null;
        }
    }

    private static void handleMessageNullIntent(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 90323, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 90323, new Class[]{Context.class}, Void.TYPE);
        } else if (context2 != null) {
            try {
                Intent launchIntentForPackage = ToolUtils.getLaunchIntentForPackage(context2, context.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    launchIntentForPackage.putExtra("from_notification", true);
                    context2.startActivity(launchIntentForPackage);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static boolean isItem(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 90314, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 90314, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.awemepushapi.d dVar = com.ss.android.ugc.awemepushlib.di.a.a(com.ss.android.ugc.aweme.framework.e.a.a()).f76981b;
        if (dVar == null || !dVar.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean reachMaxCount(com.ss.android.ugc.awemepushlib.a.c r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r3 = com.ss.android.ugc.awemepushlib.a.c.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 90313(0x160c9, float:1.26555E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 90313(0x160c9, float:1.26555E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r0 = com.ss.android.ugc.awemepushlib.a.c.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            android.app.Application r2 = com.ss.android.ugc.aweme.framework.e.a.a()
            com.ss.android.ugc.awemepushlib.di.a r2 = com.ss.android.ugc.awemepushlib.di.a.a(r2)
            com.ss.android.ugc.awemepushapi.d r2 = r2.f76981b
            if (r2 == 0) goto L_0x0071
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x004c
            goto L_0x0071
        L_0x004c:
            com.ss.android.ugc.awemepushlib.manager.a r2 = com.ss.android.ugc.awemepushlib.manager.a.a()
            int r2 = r2.d()
            boolean r0 = isSystemPushChannel(r17)
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.ss.android.ugc.awemepushlib.manager.a.a()
            int r0 = r0.l
            if (r0 <= 0) goto L_0x0070
            if (r2 < r0) goto L_0x0070
            return r1
        L_0x0065:
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.ss.android.ugc.awemepushlib.manager.a.a()
            int r0 = r0.m
            if (r0 <= 0) goto L_0x0070
            if (r2 < r0) goto L_0x0070
            return r1
        L_0x0070:
            return r9
        L_0x0071:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.reachMaxCount(com.ss.android.ugc.awemepushlib.a.c):boolean");
    }

    private static boolean sendEventAndfilterNotify(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90324, new Class[]{String.class}, Boolean.TYPE)) {
            return j.a().filterAppNotify(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90324, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    private static void loadLocal(Context context) {
        String string;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 90331, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 90331, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (LOCK) {
                string = com.ss.android.ugc.aweme.q.c.a(context2, "app_notify_info", 0).getString("notify_list", null);
            }
            if (!StringUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long optLong = jSONObject.optLong("time", 0);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new b(optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                NOTIFY_ITEMS.clear();
                NOTIFY_ITEMS.addAll(arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    public static void saveNotifyList(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 90330, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 90330, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        synchronized (LOCK) {
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(context2, "app_notify_info", 0).edit();
            edit.putString("notify_list", str2);
            edit.commit();
        }
    }

    private static boolean updateStickTopStyle(JSONObject jSONObject, NotificationCompat.Builder builder) {
        JSONObject jSONObject2 = jSONObject;
        NotificationCompat.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, builder2}, null, changeQuickRedirect, true, 90312, new Class[]{JSONObject.class, NotificationCompat.Builder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, builder2}, null, changeQuickRedirect, true, 90312, new Class[]{JSONObject.class, NotificationCompat.Builder.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null || builder2 == null) {
            return false;
        } else {
            try {
                int optInt = jSONObject2.optInt("stick_top", 0);
                if (optInt > 0) {
                    builder2.setPriority(2);
                    if (Build.VERSION.SDK_INT >= 19) {
                        builder2.setWhen(System.currentTimeMillis() + (((long) optInt) * 86400000));
                        builder2.setShowWhen(false);
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public void handleSelfMessage(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, changeQuickRedirect, false, 90310, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, changeQuickRedirect, false, 90310, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        handleMessage(context2, str2, 2, null);
    }

    public static void checkOldList(Context context, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90329, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90329, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator<b> it2 = NOTIFY_ITEMS.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next != null && next.f77058a == i2) {
                it2.remove();
            }
        }
        int i3 = a.a().o;
        int i4 = a.a().n;
        long j = (long) a.a().p;
        if (i4 <= 0) {
            i4 = 5;
        } else if (i4 > 10) {
            i4 = 10;
        }
        if (i3 <= 0) {
            i3 = 2;
        } else if (i3 > 10) {
            i3 = 10;
        }
        if (j <= 0) {
            j = 1800;
        } else if (j < 600) {
            j = 600;
        } else if (j > 259200) {
            j = 259200;
        }
        long j2 = j * 1000;
        int i5 = i3 - 1;
        int i6 = i4 - 1;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int size = NOTIFY_ITEMS.size();
            if (size > i5) {
                Collections.sort(NOTIFY_ITEMS, NOTIFY_ITEM_COMPARATOR);
                for (int i7 = size - 1; i7 >= i5; i7--) {
                    b bVar = NOTIFY_ITEMS.get(i7);
                    if (currentTimeMillis - bVar.f77059b <= j2 && i7 < i6) {
                        break;
                    }
                    NOTIFY_ITEMS.remove(i7);
                    try {
                        mNm.cancel("app_notify_ame", bVar.f77058a);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        NOTIFY_ITEMS.add(new b(i2, currentTimeMillis));
        try {
            JSONArray jSONArray = new JSONArray();
            for (b next2 : NOTIFY_ITEMS) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", next2.f77058a);
                jSONObject.put("time", next2.f77059b);
                jSONArray.put(jSONObject);
            }
            ThreadPlus.submitRunnable(new c(jSONArray.toString(), (byte) 0));
        } catch (Exception unused3) {
        }
    }

    public static void proxyShowWithNotification(Context context, int i, com.ss.android.ugc.awemepushlib.a.c cVar) {
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), cVar2}, null, changeQuickRedirect, true, 90321, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), cVar2}, null, changeQuickRedirect, true, 90321, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE);
        } else if (!mAllowPushImage || StringUtils.isEmpty(cVar2.imageUrl) || !com.ss.android.ugc.awemepushlib.c.a.b()) {
            showWithNotification(context, null, null, i, null, cVar);
        } else {
            Bitmap[] bitmapArr = new Bitmap[1];
            Bitmap[] bitmapArr2 = new Bitmap[1];
            d dVar = new d(bitmapArr2, cVar, context, bitmapArr, i);
            i a2 = i.a((Callable<TResult>) dVar, (Executor) i.f1051a);
            e eVar = new e(context, bitmapArr2, bitmapArr, i, cVar);
            a2.a((g<TResult, TContinuationResult>) eVar, i.f1052b);
        }
    }

    public static boolean showWithWindow(Context context, int i, com.ss.android.ugc.awemepushlib.a.c cVar) {
        Context context2 = context;
        int i2 = i;
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), cVar2}, null, changeQuickRedirect, true, 90328, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), cVar2}, null, changeQuickRedirect, true, 90328, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.awemepushlib.c.a.a() || cVar2.alertType > 0) {
            return false;
        } else {
            if (StringUtils.isEmpty(cVar2.title)) {
                cVar2.title = context2.getString(C0906R.string.fg);
            }
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
            try {
                if (!a.a().f()) {
                    return false;
                }
                Intent a2 = com.ss.android.ugc.awemepushlib.a.a.a(context2, cVar2);
                if (a2 == null) {
                    return false;
                }
                a2.addFlags(268435456);
                a2.putExtra("from_notification", true);
                a2.putExtra("msg_from", 2);
                a2.putExtra("msg_id", cVar2.id);
                a2.putExtra("message_from", i2);
                if (!StringUtils.isEmpty(cVar2.extra.toJsonString())) {
                    a2.putExtra("message_extra", cVar2.extra.toJsonString());
                }
                a2.putExtra("log_data_extra_to_adsapp", (HashMap) com.ss.android.ugc.awemepushlib.a.a.a(cVar2, i2, false));
                if (com.ss.android.ugc.awemepushlib.c.a.a(cVar2.pass_through, context2, a2)) {
                    k.a(cVar2, false, i2);
                    return true;
                }
                return j.a().tryShowNotifyDialog(cVar2.title, cVar2.text, format, a2, cVar2.id);
            } catch (Exception e2) {
                new StringBuilder("can not get launch intent: ").append(e2);
                com.bytedance.ies.e.a.a();
                return false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|5|(2:9|(2:11|12)(4:13|(1:15)|16|17))|18|19|20|21|(1:23)(2:24|(1:26)(1:27))|(17:32|(1:34)|35|(6:39|40|41|42|43|44)|52|54|55|(2:57|(3:59|(1:61)|62))|63|64|65|66|(1:68)|69|72|73|(1:75)(2:76|77))(1:31)) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1 = new org.json.JSONObject();
        r1.put("callback", r10.callback);
        r1.put("did", com.ss.android.common.applog.AppLog.getServerDeviceId());
        r1.put("id", java.lang.String.valueOf(r10.id));
        r1.put(com.meizu.cloud.pushsdk.constants.PushConstants.WEB_URL, r10.openUrl);
        com.ss.android.ugc.awemepushlib.interaction.k.a(r21, "message_callback", (long) r10.id, (long) r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r0 = new org.json.JSONObject();
        r0.put("callback", r10.callback);
        r0.put("did", com.ss.android.common.applog.AppLog.getServerDeviceId());
        r0.put("id", java.lang.String.valueOf(r10.id));
        r0.put(com.meizu.cloud.pushsdk.constants.PushConstants.WEB_URL, r10.openUrl);
        r2 = "message_callback";
        r3 = (long) r10.id;
        r5 = (long) r9;
        r7 = new org.json.JSONObject[]{r0};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0273, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x01d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x01d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0261 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0108 A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011b A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0128 A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0223 A[Catch:{ Exception -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0257 A[Catch:{ Exception -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0267 A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0268 A[Catch:{ Throwable -> 0x01d9, all -> 0x01a1, Throwable -> 0x01d8, Exception -> 0x0273 }] */
    @android.annotation.TargetApi(17)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void processMessage(android.content.Context r21, int r22, com.ss.android.ugc.awemepushlib.a.c r23) {
        /*
            r8 = r21
            r9 = r22
            r10 = r23
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r11 = 0
            r1[r11] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r1[r12] = r2
            r13 = 2
            r1[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r2 = com.ss.android.ugc.awemepushlib.a.c.class
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = 0
            r4 = 1
            r5 = 90318(0x160ce, float:1.26562E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x005a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2[r12] = r1
            r2[r13] = r10
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 1
            r6 = 90318(0x160ce, float:1.26562E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r7[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r7[r12] = r0
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r0 = com.ss.android.ugc.awemepushlib.a.c.class
            r7[r13] = r0
            java.lang.Class r8 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x005a:
            com.ss.android.ugc.awemepushlib.manager.a r1 = com.ss.android.ugc.awemepushlib.manager.a.a()     // Catch:{ Throwable -> 0x00ba }
            boolean r1 = r1.r     // Catch:{ Throwable -> 0x00ba }
            if (r1 == 0) goto L_0x00ba
            com.ss.android.ugc.awemepushapi.e r1 = com.ss.android.ugc.awemepushlib.interaction.j.a()     // Catch:{ Throwable -> 0x00ba }
            boolean r1 = r1.forbidShowPushNotification()     // Catch:{ Throwable -> 0x00ba }
            if (r1 == 0) goto L_0x00ba
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x00ba }
            r14[r11] = r10     // Catch:{ Throwable -> 0x00ba }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.awemepushlib.interaction.k.f77027a     // Catch:{ Throwable -> 0x00ba }
            r17 = 1
            r18 = 90218(0x1606a, float:1.26422E-40)
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x00ba }
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r2 = com.ss.android.ugc.awemepushlib.a.c.class
            r1[r11] = r2     // Catch:{ Throwable -> 0x00ba }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x00ba }
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x00ba }
            if (r1 == 0) goto L_0x00a2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x00ba }
            r14[r11] = r10     // Catch:{ Throwable -> 0x00ba }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.awemepushlib.interaction.k.f77027a     // Catch:{ Throwable -> 0x00ba }
            r17 = 1
            r18 = 90218(0x1606a, float:1.26422E-40)
            java.lang.Class[] r1 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x00ba }
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r2 = com.ss.android.ugc.awemepushlib.a.c.class
            r1[r11] = r2     // Catch:{ Throwable -> 0x00ba }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x00ba }
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x00ba }
            return
        L_0x00a2:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x00ba }
            r1.<init>()     // Catch:{ Throwable -> 0x00ba }
            if (r10 == 0) goto L_0x00b4
            java.lang.String r2 = "id"
            int r3 = r10.id     // Catch:{ Throwable -> 0x00ba }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x00ba }
            r1.putString(r2, r3)     // Catch:{ Throwable -> 0x00ba }
        L_0x00b4:
            java.lang.String r2 = "forbid_show_push"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3Bundle(r2, r1)     // Catch:{ Throwable -> 0x00ba }
            return
        L_0x00ba:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = "push_show"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)     // Catch:{ Exception -> 0x00d7 }
            int r2 = r10.id     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00d7 }
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)     // Catch:{ Exception -> 0x00d7 }
            com.ss.android.ugc.aweme.common.r.onEvent(r1)     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0273 }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.awemepushlib.c.b.f76973a     // Catch:{ Exception -> 0x0273 }
            r17 = 1
            r18 = 90420(0x16134, float:1.26705E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0273 }
            java.lang.Class r20 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0273 }
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0273 }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.awemepushlib.c.b.f76973a     // Catch:{ Exception -> 0x0273 }
            r17 = 1
            r18 = 90420(0x16134, float:1.26705E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0273 }
            java.lang.Class r20 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0273 }
            r19 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0273 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0273 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0273 }
            goto L_0x0119
        L_0x0108:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0273 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x0273 }
            java.lang.String r2 = "oppo"
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ Exception -> 0x0273 }
            if (r1 == 0) goto L_0x0118
            r1 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            if (r1 == 0) goto L_0x0124
            com.ss.android.ugc.awemepushlib.manager.a r1 = com.ss.android.ugc.awemepushlib.manager.a.a()     // Catch:{ Exception -> 0x0273 }
            boolean r1 = r1.f77067d     // Catch:{ Exception -> 0x0273 }
            if (r1 != 0) goto L_0x0124
            return
        L_0x0124:
            boolean r1 = mLocalListLoaded     // Catch:{ Exception -> 0x0273 }
            if (r1 != 0) goto L_0x012d
            loadLocal(r21)     // Catch:{ Exception -> 0x0273 }
            mLocalListLoaded = r12     // Catch:{ Exception -> 0x0273 }
        L_0x012d:
            java.lang.String r1 = "notification"
            java.lang.Object r1 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x0273 }
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{ Exception -> 0x0273 }
            mNm = r1     // Catch:{ Exception -> 0x0273 }
            java.lang.String r1 = r10.callback     // Catch:{ Exception -> 0x0273 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0273 }
            if (r1 != 0) goto L_0x020b
            java.lang.String r1 = r10.callback     // Catch:{ Exception -> 0x0273 }
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)     // Catch:{ Exception -> 0x0273 }
            if (r1 == 0) goto L_0x020b
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            java.lang.String r2 = r10.callback     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            r1[r11] = r2     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            java.lang.String r2 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            r1[r12] = r2     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            int r2 = r10.id     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            r1[r13] = r2     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            java.lang.String r2 = r10.openUrl     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            r1[r0] = r2     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$d r0 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$d     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            com.bytedance.common.utility.concurrent.ThreadPlus.submitRunnable(r0)     // Catch:{ Throwable -> 0x01d9, all -> 0x01a1 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x020b }
            r0.<init>()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "callback"
            java.lang.String r2 = r10.callback     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "did"
            java.lang.String r2 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "id"
            int r2 = r10.id     // Catch:{ Throwable -> 0x020b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "url"
            java.lang.String r2 = r10.openUrl     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r2 = "message_callback"
            int r1 = r10.id     // Catch:{ Throwable -> 0x020b }
            long r3 = (long) r1     // Catch:{ Throwable -> 0x020b }
            long r5 = (long) r9     // Catch:{ Throwable -> 0x020b }
            org.json.JSONObject[] r7 = new org.json.JSONObject[r12]     // Catch:{ Throwable -> 0x020b }
            r7[r11] = r0     // Catch:{ Throwable -> 0x020b }
        L_0x019b:
            r1 = r21
            com.ss.android.ugc.awemepushlib.interaction.k.a(r1, r2, r3, r5, r7)     // Catch:{ Throwable -> 0x020b }
            goto L_0x020b
        L_0x01a1:
            r0 = move-exception
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01d8 }
            r1.<init>()     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = "callback"
            java.lang.String r3 = r10.callback     // Catch:{ Throwable -> 0x01d8 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = "did"
            java.lang.String r3 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Throwable -> 0x01d8 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = "id"
            int r3 = r10.id     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x01d8 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = "url"
            java.lang.String r3 = r10.openUrl     // Catch:{ Throwable -> 0x01d8 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = "message_callback"
            int r3 = r10.id     // Catch:{ Throwable -> 0x01d8 }
            long r3 = (long) r3     // Catch:{ Throwable -> 0x01d8 }
            long r5 = (long) r9     // Catch:{ Throwable -> 0x01d8 }
            org.json.JSONObject[] r7 = new org.json.JSONObject[r12]     // Catch:{ Throwable -> 0x01d8 }
            r7[r11] = r1     // Catch:{ Throwable -> 0x01d8 }
            r1 = r21
            com.ss.android.ugc.awemepushlib.interaction.k.a(r1, r2, r3, r5, r7)     // Catch:{ Throwable -> 0x01d8 }
        L_0x01d8:
            throw r0     // Catch:{ Exception -> 0x0273 }
        L_0x01d9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x020b }
            r0.<init>()     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "callback"
            java.lang.String r2 = r10.callback     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "did"
            java.lang.String r2 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "id"
            int r2 = r10.id     // Catch:{ Throwable -> 0x020b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r1 = "url"
            java.lang.String r2 = r10.openUrl     // Catch:{ Throwable -> 0x020b }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r2 = "message_callback"
            int r1 = r10.id     // Catch:{ Throwable -> 0x020b }
            long r3 = (long) r1     // Catch:{ Throwable -> 0x020b }
            long r5 = (long) r9     // Catch:{ Throwable -> 0x020b }
            org.json.JSONObject[] r7 = new org.json.JSONObject[r12]     // Catch:{ Throwable -> 0x020b }
            r7[r11] = r0     // Catch:{ Throwable -> 0x020b }
            goto L_0x019b
        L_0x020b:
            r0 = 0
            java.lang.String r1 = "power"
            java.lang.Object r1 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x0260 }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x0260 }
            boolean r1 = r1.isScreenOn()     // Catch:{ Exception -> 0x0260 }
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0260 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0260 }
            r4 = 20
            if (r3 < r4) goto L_0x0247
            java.lang.String r3 = "display"
            java.lang.Object r3 = r8.getSystemService(r3)     // Catch:{ Exception -> 0x0260 }
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3     // Catch:{ Exception -> 0x0260 }
            android.view.Display r3 = r3.getDisplay(r11)     // Catch:{ Exception -> 0x0260 }
            if (r3 == 0) goto L_0x0247
            java.lang.Class<android.view.Display> r4 = android.view.Display.class
            java.lang.String r5 = "getState"
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0260 }
            r6[r11] = r3     // Catch:{ Exception -> 0x0260 }
            java.lang.Object r3 = com.bytedance.common.utility.reflect.ReflectUtils.invokeMethod(r4, r5, r6)     // Catch:{ Exception -> 0x0260 }
            boolean r4 = r3 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0260 }
            if (r4 == 0) goto L_0x0244
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0260 }
            r2 = r3
        L_0x0244:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0260 }
        L_0x0247:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0260 }
            r3.<init>()     // Catch:{ Exception -> 0x0260 }
            java.lang.String r0 = "interactive_state"
            r3.put(r0, r1)     // Catch:{ Exception -> 0x0261 }
            int r0 = r2.intValue()     // Catch:{ Exception -> 0x0261 }
            if (r0 < 0) goto L_0x025c
            java.lang.String r0 = "display_state"
            r3.put(r0, r2)     // Catch:{ Exception -> 0x0261 }
        L_0x025c:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0261 }
            goto L_0x0261
        L_0x0260:
            r3 = r0
        L_0x0261:
            boolean r0 = sendEventAndfilterNotify(r8, r10, r9, r3)     // Catch:{ Exception -> 0x0273 }
            if (r0 == 0) goto L_0x0268
            return
        L_0x0268:
            com.bytedance.common.utility.collection.WeakHandler r0 = sHandler     // Catch:{ Exception -> 0x0273 }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3 r1 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3     // Catch:{ Exception -> 0x0273 }
            r1.<init>(r10, r9, r8)     // Catch:{ Exception -> 0x0273 }
            r0.post(r1)     // Catch:{ Exception -> 0x0273 }
            return
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.processMessage(android.content.Context, int, com.ss.android.ugc.awemepushlib.a.c):void");
    }

    public static Intent genIntent(Context context, int i, com.ss.android.ugc.awemepushlib.a.c cVar, int i2) {
        Intent intent;
        Context context2 = context;
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), cVar2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90327, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), cVar2, Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90327, new Class[]{Context.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE}, Intent.class);
        }
        try {
            intent = com.ss.android.ugc.awemepushlib.a.a.a(context2, cVar2);
            if (intent == null) {
                return null;
            }
            try {
                intent.addFlags(268435456);
                intent.putExtra("from_notification", true);
                if (i3 == 0) {
                    intent.putExtra("msg_from", 1);
                } else if (i3 == 1) {
                    intent.putExtra("msg_from", 2);
                }
                intent.putExtra("msg_id", cVar2.id);
                intent.putExtra("message_from", i);
                if (!StringUtils.isEmpty(cVar2.extra.toJsonString())) {
                    intent.putExtra("message_extra", cVar2.extra.toJsonString());
                }
                intent.putExtra("imageType", cVar2.imageType);
            } catch (Throwable unused) {
            }
            return intent;
        } catch (Throwable unused2) {
            intent = null;
        }
    }

    private static boolean reachMaxCount(Context context, String str, int i, com.ss.android.ugc.awemepushlib.a.c cVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i), cVar}, null, changeQuickRedirect, true, 90317, new Class[]{Context.class, String.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i), cVar}, null, changeQuickRedirect, true, 90317, new Class[]{Context.class, String.class, Integer.TYPE, com.ss.android.ugc.awemepushlib.a.c.class}, Boolean.TYPE)).booleanValue();
        } else if (ignoreLimit(cVar) || !reachMaxCount(cVar)) {
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", str2);
                jSONObject.put("from", i);
                jSONObject.put("system_channel", isSystemPushChannel(cVar) ? 1 : 0);
            } catch (Throwable unused) {
            }
            com.ss.android.common.lib.a.a(context, "apn_reach_max", "pre_process", 0, 0, jSONObject);
            return true;
        }
    }

    @TargetApi(17)
    public static void handleMessage(Context context, String str, int i, String str2) {
        Context context2 = context;
        String str3 = str;
        int i2 = i;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, Integer.valueOf(i), str4}, null, changeQuickRedirect, true, 90315, new Class[]{Context.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, Integer.valueOf(i), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90315, new Class[]{Context.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            com.ss.android.ugc.awemepushlib.a.c from = com.ss.android.ugc.awemepushlib.a.c.from(str);
            if (from != null && !AwemeRedBadgerManager.a().a(context2, from)) {
                if (!com.ss.android.ugc.awemepushlib.c.a.a() && j.a().isLowPushWhenActive() && from.extra.allowBannerDelete) {
                    from.extra.isZeroVibrate = false;
                    from.extra.notificaitonPriority = -1;
                    from.extra.is_notification_top = false;
                    from.extra.isBannerDeteled = true;
                }
                if (!reachMaxCount(context2, str3, i2, from)) {
                    if (PatchProxy.isSupport(new Object[]{from, Integer.valueOf(i)}, null, k.f77027a, true, 90217, new Class[]{com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{from, Integer.valueOf(i)}, null, k.f77027a, true, 90217, new Class[]{com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        AppLogNewUtils.onEventV3("push_receive", new JSONObject(com.ss.android.ugc.awemepushlib.a.a.a(from, i2, com.ss.android.ugc.awemepushlib.c.a.a())));
                    }
                    j.a().reportReceiveOpenUrl(from.openUrl);
                    if (!toStoreMessage(context2, str3, i2, str4, from)) {
                        from.extra.turn_screen_on = false;
                        processMessage(context2, i2, from);
                        a a2 = a.a();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis)}, a2, a.f77064a, false, 90286, new Class[]{Long.TYPE}, Void.TYPE)) {
                            a aVar = a2;
                            PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis)}, aVar, a.f77064a, false, 90286, new Class[]{Long.TYPE}, Void.TYPE);
                            return;
                        }
                        a2.u.edit().putLong("last_notify_time", currentTimeMillis).apply();
                    }
                }
            }
        }
    }

    private static boolean sendEventAndfilterNotify(Context context, com.ss.android.ugc.awemepushlib.a.c cVar, int i, JSONObject jSONObject) {
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, cVar2, Integer.valueOf(i), jSONObject}, null, changeQuickRedirect, true, 90319, new Class[]{Context.class, com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE, JSONObject.class}, Boolean.TYPE)) {
            Object[] objArr = {context, cVar2, Integer.valueOf(i), jSONObject};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 90319, new Class[]{Context.class, com.ss.android.ugc.awemepushlib.a.c.class, Integer.TYPE, JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        long j = (long) i2;
        k.a(context, "news_achieve", (long) cVar2.id, j, jSONObject);
        if (i2 == 6) {
            k.a(context, "umeng_news_achieve", (long) cVar2.id, j, jSONObject);
        }
        if (cVar2.isPing == 1) {
            return true;
        }
        if (cVar2.pass_through != 0 && cVar2.filter != 0 && sendEventAndfilterNotify(cVar2.openUrl)) {
            k.a(context, "news_forbid", (long) cVar2.id, 1, new JSONObject[0]);
            new StringBuilder("skip notify ").append(cVar2.openUrl);
            com.bytedance.ies.e.a.a();
            return true;
        } else if (StringUtils.isEmpty(cVar2.text)) {
            if (cVar2.pass_through == 0) {
                handleMessageNullIntent(context);
            }
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar2.pass_through == 0 || cVar2.filter == 0 || !a.a().a(cVar2.id, currentTimeMillis)) {
                return false;
            }
            Logger.debug();
            k.a(context, "news_forbid", (long) cVar2.id, 2, new JSONObject[0]);
            com.bytedance.ies.e.a.a();
            return true;
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str3, Integer.valueOf(i2), str4}, null, changeQuickRedirect, true, 90332, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), str3, Integer.valueOf(i2), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90332, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
        } else if (context2 != null && i == 1 && str3 != null) {
            try {
                AppHooks.InitHook initHook = AppHooks.getInitHook();
                if (initHook != null) {
                    initHook.tryInit(context2);
                }
                if (a.a().e(context2) && !TextUtils.isEmpty(str)) {
                    handleMessage(context2, str3, i2, str4);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static final /* synthetic */ Object lambda$proxyShowWithNotification$0$MessageShowHandler(Bitmap[] bitmapArr, com.ss.android.ugc.awemepushlib.a.c cVar, Context context, Bitmap[] bitmapArr2, int i) throws Exception {
        String str;
        boolean z;
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        try {
            bitmapArr[0] = downloadImage(cVar2.imageUrl);
            boolean z2 = true;
            if (bitmapArr[0] == null) {
                bitmapArr[0] = downloadImage(cVar2.imageUrl);
                com.ss.android.ugc.awemepushlib.c.c a2 = com.ss.android.ugc.awemepushlib.c.c.a();
                if (bitmapArr[0] != null) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (PatchProxy.isSupport(new Object[]{"retrySuccess", valueOf}, a2, com.ss.android.ugc.awemepushlib.c.c.f76977a, false, 90427, new Class[]{String.class, Boolean.class}, com.ss.android.ugc.awemepushlib.c.c.class)) {
                    com.ss.android.ugc.awemepushlib.c.c cVar3 = a2;
                    a2 = (com.ss.android.ugc.awemepushlib.c.c) PatchProxy.accessDispatch(new Object[]{"retrySuccess", valueOf}, cVar3, com.ss.android.ugc.awemepushlib.c.c.f76977a, false, 90427, new Class[]{String.class, Boolean.class}, com.ss.android.ugc.awemepushlib.c.c.class);
                } else {
                    a2.f76978b.put("retrySuccess", valueOf);
                }
                k.a(context, "push_image_retry", 0, 0, a2.b());
            }
            f a3 = f.a();
            if (PatchProxy.isSupport(new Object[0], a3, f.f77088a, false, 90346, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, f.f77088a, false, 90346, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (z2 && !TextUtils.isEmpty(cVar2.extra.largeModeIconUrl)) {
                bitmapArr2[0] = downloadImage(cVar2.extra.largeModeIconUrl);
            }
            String str2 = cVar2.title;
            String str3 = cVar2.text;
            String str4 = cVar2.imageUrl;
            Bitmap bitmap = bitmapArr[0];
            int i2 = cVar2.imageType;
            if (bitmapArr[0] == null) {
                str = "imageUrlbitmap==null";
            } else {
                str = "";
            }
            setBitmap(str2, str3, str4, bitmap, i2, str);
        } catch (Exception e2) {
            setBitmap(cVar2.title, cVar2.text, cVar2.imageUrl, null, cVar2.imageType, Log.getStackTraceString(e2));
            showWithNotification(context, null, null, i, null, cVar);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ee, code lost:
        if (r4.d(r0) < r4.b()) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015e, code lost:
        if (r4.d(r0) < r4.b()) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x024f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean toStoreMessage(android.content.Context r24, java.lang.String r25, int r26, java.lang.String r27, com.ss.android.ugc.awemepushlib.a.c r28) {
        /*
            r0 = r24
            r1 = r25
            r2 = r27
            r3 = r28
            r4 = 5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r14 = 2
            r5[r14] = r6
            r15 = 3
            r5[r15] = r2
            r16 = 4
            r5[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = changeQuickRedirect
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r15] = r6
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r6 = com.ss.android.ugc.awemepushlib.a.c.class
            r10[r16] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = 0
            r8 = 1
            r9 = 90316(0x160cc, float:1.2656E-40)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0084
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r5[r14] = r0
            r5[r15] = r2
            r5[r16] = r3
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = changeQuickRedirect
            r20 = 1
            r21 = 90316(0x160cc, float:1.2656E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r1 = com.ss.android.ugc.awemepushlib.a.c.class
            r0[r16] = r1
            java.lang.Class r23 = java.lang.Boolean.TYPE
            r17 = r5
            r22 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0084:
            boolean r4 = com.ss.android.ugc.aweme.i18n.c.a()
            if (r4 == 0) goto L_0x00f5
            com.ss.android.ugc.awemepushlib.manager.f r4 = com.ss.android.ugc.awemepushlib.manager.f.a()
            java.lang.String r3 = r3.openUrl
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r12] = r0
            r5[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r8 = 0
            r9 = 90340(0x160e4, float:1.26593E-40)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r13] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x00d4
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r12] = r0
            r5[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r8 = 0
            r9 = 90340(0x160e4, float:1.26593E-40)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r10[r12] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r10[r13] = r3
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = r4
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0161
        L_0x00d4:
            int r5 = r4.b(r0)
            if (r5 <= 0) goto L_0x00f3
            boolean r3 = r4.a((java.lang.String) r3)
            if (r3 == 0) goto L_0x00f3
            boolean r3 = r4.c(r0)
            if (r3 != 0) goto L_0x00f3
            int r3 = r4.d(r0)
            int r4 = r4.b()
            if (r3 >= r4) goto L_0x00f3
        L_0x00f0:
            r3 = 1
            goto L_0x0161
        L_0x00f3:
            r3 = 0
            goto L_0x0161
        L_0x00f5:
            com.ss.android.ugc.awemepushlib.manager.f r4 = com.ss.android.ugc.awemepushlib.manager.f.a()
            com.ss.android.ugc.awemepushlib.a.c$a r3 = r3.extra
            boolean r3 = r3.turn_screen_on
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r12] = r0
            java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
            r5[r13] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r8 = 0
            r9 = 90341(0x160e5, float:1.26595E-40)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r10[r13] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0148
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r12] = r0
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r5[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r8 = 0
            r9 = 90341(0x160e5, float:1.26595E-40)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r10[r12] = r3
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r10[r13] = r3
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = r4
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0161
        L_0x0148:
            if (r3 == 0) goto L_0x00f3
            int r3 = r4.b()
            if (r3 <= 0) goto L_0x00f3
            boolean r3 = r4.c(r0)
            if (r3 != 0) goto L_0x00f3
            int r3 = r4.d(r0)
            int r4 = r4.b()
            if (r3 >= r4) goto L_0x00f3
            goto L_0x00f0
        L_0x0161:
            if (r3 == 0) goto L_0x024f
            com.ss.android.ugc.awemepushlib.a.b r3 = new com.ss.android.ugc.awemepushlib.a.b
            r4 = r26
            r3.<init>(r1, r4, r2)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            com.ss.android.ugc.awemepushlib.manager.f r2 = com.ss.android.ugc.awemepushlib.manager.f.a()
            java.lang.String r1 = r1.toJson((java.lang.Object) r3)
            java.lang.Object[] r4 = new java.lang.Object[r14]
            r4[r12] = r0
            r4[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r7 = 0
            r8 = 90352(0x160f0, float:1.2661E-40)
            java.lang.Class[] r9 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r12] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r9[r13] = r3
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r2
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x01ba
            java.lang.Object[] r4 = new java.lang.Object[r14]
            r4[r12] = r0
            r4[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r7 = 0
            r8 = 90352(0x160f0, float:1.2661E-40)
            java.lang.Class[] r9 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r9[r12] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r9[r13] = r0
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x024e
        L_0x01ba:
            android.content.SharedPreferences r3 = r2.a((android.content.Context) r0)
            java.lang.String r4 = "push_have_stored"
            int r3 = r3.getInt(r4, r12)
            int r4 = r2.b()
            if (r3 < r4) goto L_0x01cc
            goto L_0x024e
        L_0x01cc:
            android.content.SharedPreferences r4 = r2.a((android.content.Context) r0)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "screen_push_key_"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.putString(r5, r1)
            java.lang.String r1 = "push_have_stored"
            int r3 = r3 + r13
            r4.putInt(r1, r3)
            r4.apply()
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r7 = 0
            r8 = 90354(0x160f2, float:1.26613E-40)
            java.lang.Class[] r9 = new java.lang.Class[r13]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r9[r12] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x021e
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.awemepushlib.manager.f.f77088a
            r7 = 0
            r8 = 90354(0x160f2, float:1.26613E-40)
            java.lang.Class[] r9 = new java.lang.Class[r13]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r9[r12] = r0
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x024e
        L_0x021e:
            boolean r1 = com.ss.android.ugc.aweme.i18n.c.a()
            r3 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == 0) goto L_0x0231
            int r1 = r2.b(r0)
            switch(r1) {
                case 3: goto L_0x0231;
                case 4: goto L_0x0231;
                default: goto L_0x022e;
            }
        L_0x022e:
            r3 = 600000(0x927c0, double:2.964394E-318)
        L_0x0231:
            r9 = r3
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "ALARM_ACTION"
            r1.<init>(r2)
            android.app.PendingIntent r11 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r12)
            java.lang.String r1 = "alarm"
            java.lang.Object r0 = r0.getSystemService(r1)
            r5 = r0
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5
            r6 = 0
            long r7 = java.lang.System.currentTimeMillis()
            r5.setRepeating(r6, r7, r9, r11)
        L_0x024e:
            return r13
        L_0x024f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.toStoreMessage(android.content.Context, java.lang.String, int, java.lang.String, com.ss.android.ugc.awemepushlib.a.c):boolean");
    }

    private static void setBitmap(String str, String str2, String str3, Bitmap bitmap, int i, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, bitmap, Integer.valueOf(i), str8}, null, changeQuickRedirect, true, 90322, new Class[]{String.class, String.class, String.class, Bitmap.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, bitmap, Integer.valueOf(i), str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90322, new Class[]{String.class, String.class, String.class, Bitmap.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a(PushConstants.CONTENT, str6).a(PushConstants.TITLE, str5).a("imageUrl", str7).a("errorMsg", str8);
        JSONObject b2 = a2.a("imageType", i).b();
        if (bitmap != null) {
            k.a("aweme_push_image_load_error_rate", 0, b2);
        } else if (TextUtils.isEmpty(str4) || !str8.contains("network not available")) {
            k.a("aweme_push_image_load_error_rate", 1, b2);
        }
    }

    public void handle3rdMessage(Context context, int i, String str, int i2, String str2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 90311, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), str, Integer.valueOf(i2), str2, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 90311, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        handleMessage(context, i, str, i2, str2);
    }

    /* access modifiers changed from: private */
    public static void showWithNotification(Context context, Bitmap bitmap, Bitmap bitmap2, int i, Intent intent, com.ss.android.ugc.awemepushlib.a.c cVar) {
        Intent intent2;
        boolean z;
        Context context2 = context;
        int i2 = i;
        com.ss.android.ugc.awemepushlib.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, bitmap, bitmap2, Integer.valueOf(i), intent, cVar2}, null, changeQuickRedirect, true, 90325, new Class[]{Context.class, Bitmap.class, Bitmap.class, Integer.TYPE, Intent.class, com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE)) {
            Object[] objArr = {context2, bitmap, bitmap2, Integer.valueOf(i), intent, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90325, new Class[]{Context.class, Bitmap.class, Bitmap.class, Integer.TYPE, Intent.class, com.ss.android.ugc.awemepushlib.a.c.class}, Void.TYPE);
        } else if (com.ss.android.ugc.awemepushlib.c.a.a(cVar2.originData, cVar2.text, cVar2.title)) {
            if (bitmap == null && bitmap2 == null) {
                k.a(cVar2, false, i2);
            } else {
                k.a(cVar2, true, i2);
            }
            try {
                com.ss.android.ugc.awemepushapi.d dVar = com.ss.android.ugc.awemepushlib.di.a.a(context).f76981b;
                if (dVar != null && dVar.a()) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (intent == null) {
                Intent genIntent = genIntent(context2, i2, cVar2, 0);
                if (genIntent != null) {
                    intent2 = genIntent;
                } else {
                    return;
                }
            } else {
                intent2 = intent;
            }
            intent2.putExtra("log_data_extra_to_adsapp", (HashMap) com.ss.android.ugc.awemepushlib.a.a.a(cVar2, i2, true));
            if (com.ss.android.ugc.awemepushlib.c.a.a() || !j.a().isLowPushWhenActive()) {
                z = false;
            } else {
                z = true;
            }
            Notification a2 = com.ss.android.ugc.awemepushlib.c.a.a(context, cVar, bitmap, bitmap2, intent2, z);
            if (a2 != null) {
                if (com.ss.android.ugc.aweme.i18n.c.a()) {
                    try {
                        mNm.notify("app_notify_ame", cVar2.id, a2);
                        k.a(context, "news_notify_show", (long) cVar2.id, -1, new JSONObject[0]);
                        if (isItem(cVar2.openUrl)) {
                            a a3 = a.a();
                            if (PatchProxy.isSupport(new Object[0], a3, a.f77064a, false, 90280, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], a3, a.f77064a, false, 90280, new Class[0], Void.TYPE);
                            } else {
                                a3.u.edit().putString("notification_show_date", a.s.format(new Date())).putInt("notification_show_count_today", a3.d() + 1).apply();
                            }
                        }
                    } catch (Exception e2) {
                        new StringBuilder("notify exception: ").append(e2);
                        com.bytedance.ies.e.a.a();
                    }
                } else {
                    try {
                        if (mNm == null) {
                            mNm = (NotificationManager) context2.getSystemService("notification");
                        }
                        if ("oppo".equalsIgnoreCase(Build.BRAND) && cVar2.extra.oppoFloatWindow == 2 && e.a(context) == 0) {
                            com.ss.android.ugc.awemepushlib.a.c cVar3 = new com.ss.android.ugc.awemepushlib.a.c();
                            cVar3.text = cVar2.text;
                            cVar3.id = cVar2.id;
                            cVar3.title = cVar2.title;
                            showAnimatablePushViewIfNeed(context, cVar3, i, bitmap, intent2, cVar2.extra.float_window_show_time, cVar2.extra.oppo_push_style);
                        }
                        mNm.notify("app_notify_ame", cVar2.id, a2);
                        if (cVar2 != null) {
                            k.a(context, "news_notify_show", (long) cVar2.id, -1, new JSONObject[0]);
                        }
                    } catch (Exception e3) {
                        new StringBuilder("notify exception: ").append(e3);
                        com.bytedance.ies.e.a.a();
                    }
                }
                com.ss.android.ugc.awemepushlib.b.c.a().a(cVar2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0180 A[SYNTHETIC, Splitter:B:44:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void showAnimatablePushViewIfNeed(android.content.Context r23, com.ss.android.ugc.awemepushlib.a.c r24, int r25, android.graphics.Bitmap r26, android.content.Intent r27, long r28, int r30) {
        /*
            r10 = r23
            r11 = r24
            r12 = r25
            r0 = r26
            r6 = r27
            r7 = r28
            r1 = 7
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r9 = 0
            r13[r9] = r10
            r5 = 1
            r13[r5] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r3 = 2
            r13[r3] = r2
            r2 = 3
            r13[r2] = r0
            r4 = 4
            r13[r4] = r6
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r7)
            r20 = 5
            r13[r20] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r30)
            r21 = 6
            r13[r21] = r14
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
            java.lang.Class[] r14 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r16 = android.content.Context.class
            r14[r9] = r16
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r16 = com.ss.android.ugc.awemepushlib.a.c.class
            r14[r5] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r14[r3] = r16
            java.lang.Class<android.graphics.Bitmap> r16 = android.graphics.Bitmap.class
            r14[r2] = r16
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            r14[r4] = r16
            java.lang.Class r16 = java.lang.Long.TYPE
            r14[r20] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r14[r21] = r16
            java.lang.Class r19 = java.lang.Void.TYPE
            r16 = 0
            r17 = 1
            r18 = 90326(0x160d6, float:1.26574E-40)
            r22 = r14
            r14 = r16
            r16 = r17
            r17 = r18
            r18 = r22
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x00c2
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r9] = r10
            r13[r5] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r25)
            r13[r3] = r10
            r13[r2] = r0
            r13[r4] = r6
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            r13[r20] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r30)
            r13[r21] = r0
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            r7 = 1
            r8 = 90326(0x160d6, float:1.26574E-40)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r1[r9] = r10
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r9 = com.ss.android.ugc.awemepushlib.a.c.class
            r1[r5] = r9
            java.lang.Class r5 = java.lang.Integer.TYPE
            r1[r3] = r5
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r1[r2] = r3
            java.lang.Class<android.content.Intent> r2 = android.content.Intent.class
            r1[r4] = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            r1[r20] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r21] = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            r23 = r13
            r24 = r0
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r1
            r29 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x00c2:
            if (r11 == 0) goto L_0x01ba
            if (r6 != 0) goto L_0x00c8
            goto L_0x01ba
        L_0x00c8:
            java.lang.String r1 = "oppo"
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x017b }
            boolean r14 = r1.equalsIgnoreCase(r2)     // Catch:{ Throwable -> 0x017b }
            boolean r1 = com.ss.android.ugc.awemepushlib.c.b.a(r23)     // Catch:{ Throwable -> 0x017b }
            if (r1 == 0) goto L_0x00df
            r1 = 2010(0x7da, float:2.817E-42)
            r2 = 264(0x108, float:3.7E-43)
            r20 = 2010(0x7da, float:2.817E-42)
            r21 = 264(0x108, float:3.7E-43)
            goto L_0x0139
        L_0x00df:
            if (r14 == 0) goto L_0x00ea
            r1 = 20005(0x4e25, float:2.8033E-41)
            r2 = 136(0x88, float:1.9E-43)
            r20 = 20005(0x4e25, float:2.8033E-41)
            r21 = 136(0x88, float:1.9E-43)
            goto L_0x0139
        L_0x00ea:
            boolean r1 = com.ss.android.ugc.awemepushlib.c.a.a((android.content.Context) r23)     // Catch:{ Throwable -> 0x017b }
            if (r1 != 0) goto L_0x0131
            boolean r1 = canShowPushNotifyActivity()     // Catch:{ Throwable -> 0x012d }
            if (r1 == 0) goto L_0x0131
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Throwable -> 0x012d }
            java.lang.Class<com.ss.android.ugc.awemepushlib.widget.c> r2 = com.ss.android.ugc.awemepushlib.widget.c.class
            r1.<init>(r10, r2)     // Catch:{ Throwable -> 0x012d }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)     // Catch:{ Throwable -> 0x012d }
            java.lang.String r2 = "message_from"
            r1.putExtra(r2, r12)     // Catch:{ Throwable -> 0x012d }
            java.lang.String r2 = "message_obj"
            r1.putExtra(r2, r11)     // Catch:{ Throwable -> 0x012d }
            java.lang.String r2 = "__targetIntent__"
            r1.putExtra(r2, r6)     // Catch:{ Throwable -> 0x012d }
            java.lang.String r2 = "__showTime__"
            com.ss.android.ugc.awemepushlib.manager.a r3 = com.ss.android.ugc.awemepushlib.manager.a.a()     // Catch:{ Throwable -> 0x012d }
            long r3 = r3.f77069f     // Catch:{ Throwable -> 0x012d }
            r1.putExtra(r2, r3)     // Catch:{ Throwable -> 0x012d }
            java.lang.String r2 = "__showTime__"
            r1.putExtra(r2, r7)     // Catch:{ Throwable -> 0x012d }
            if (r0 == 0) goto L_0x0128
            java.lang.String r2 = "__bitmap__"
            r1.putExtra(r2, r0)     // Catch:{ Throwable -> 0x012d }
        L_0x0128:
            r10.startActivity(r1)     // Catch:{ Throwable -> 0x012c }
            return
        L_0x012c:
            return
        L_0x012d:
            r0 = move-exception
            r13 = r0
            r10 = 1
            goto L_0x017e
        L_0x0131:
            r1 = 2005(0x7d5, float:2.81E-42)
            r2 = 8
            r20 = 2005(0x7d5, float:2.81E-42)
            r21 = 8
        L_0x0139:
            java.lang.String r1 = "window"
            java.lang.Object r1 = r10.getSystemService(r1)     // Catch:{ Throwable -> 0x017b }
            r15 = r1
            android.view.WindowManager r15 = (android.view.WindowManager) r15     // Catch:{ Throwable -> 0x017b }
            com.ss.android.ugc.awemepushlib.widget.a r4 = new com.ss.android.ugc.awemepushlib.widget.a     // Catch:{ Throwable -> 0x017b }
            r1 = r4
            r2 = r23
            r3 = r25
            r13 = r4
            r4 = r24
            r10 = 1
            r5 = r26
            r6 = r27
            r7 = r28
            r9 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)     // Catch:{ Throwable -> 0x0179 }
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams     // Catch:{ Throwable -> 0x0179 }
            r16 = -1
            r17 = -2
            r18 = 0
            r19 = 0
            r22 = 1
            r1 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x0179 }
            r2 = 51
            r0.gravity = r2     // Catch:{ Throwable -> 0x0179 }
            if (r14 == 0) goto L_0x0174
            java.lang.String r2 = "Toast"
            r0.setTitle(r2)     // Catch:{ Throwable -> 0x0179 }
        L_0x0174:
            r1.addView(r13, r0)     // Catch:{ Throwable -> 0x0179 }
            r13 = 0
            goto L_0x017e
        L_0x0179:
            r0 = move-exception
            goto L_0x017d
        L_0x017b:
            r0 = move-exception
            r10 = 1
        L_0x017d:
            r13 = r0
        L_0x017e:
            if (r13 == 0) goto L_0x01a5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01a4 }
            r0.<init>()     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r1 = "throwable"
            java.lang.String r2 = android.util.Log.getStackTraceString(r13)     // Catch:{ Throwable -> 0x01a4 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x01a4 }
            java.lang.String r1 = "news_notify_anim_push_try_show"
            int r2 = r11.id     // Catch:{ Throwable -> 0x01a4 }
            long r2 = (long) r2     // Catch:{ Throwable -> 0x01a4 }
            long r4 = (long) r12     // Catch:{ Throwable -> 0x01a4 }
            org.json.JSONObject[] r6 = new org.json.JSONObject[r10]     // Catch:{ Throwable -> 0x01a4 }
            r7 = 0
            r6[r7] = r0     // Catch:{ Throwable -> 0x01a4 }
            r24 = r1
            r25 = r2
            r27 = r4
            r29 = r6
            com.ss.android.ugc.awemepushlib.interaction.k.a(r23, r24, r25, r27, r29)     // Catch:{ Throwable -> 0x01a4 }
        L_0x01a4:
            return
        L_0x01a5:
            r7 = 0
            java.lang.String r0 = "news_notify_anim_push_try_show"
            int r1 = r11.id
            long r1 = (long) r1
            long r3 = (long) r12
            org.json.JSONObject[] r5 = new org.json.JSONObject[r7]
            r24 = r0
            r25 = r1
            r27 = r3
            r29 = r5
            com.ss.android.ugc.awemepushlib.interaction.k.a(r23, r24, r25, r27, r29)
            return
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.showAnimatablePushViewIfNeed(android.content.Context, com.ss.android.ugc.awemepushlib.a.c, int, android.graphics.Bitmap, android.content.Intent, long, int):void");
    }
}
