package com.xiaomi.mipush.sdk;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.au;
import com.xiaomi.push.m;
import com.xiaomi.push.service.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MIPushNotificationHelper4Hybrid {

    /* renamed from: a  reason: collision with root package name */
    private static final LinkedList<a> f81733a = new LinkedList<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f81734a;

        /* renamed from: a  reason: collision with other field name */
        MiPushMessage f74a;

        /* renamed from: a  reason: collision with other field name */
        String f75a;

        public a(int i, String str, MiPushMessage miPushMessage) {
            this.f81734a = i;
            this.f75a = str;
            this.f74a = miPushMessage;
        }
    }

    private static Notification a(Notification notification) {
        Object a2 = au.a((Object) notification, "extraNotification");
        if (a2 != null) {
            au.a(a2, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    @SuppressLint({"NewApi"})
    private static Notification a(Context context, MiPushMessage miPushMessage, PendingIntent pendingIntent, Bitmap bitmap) {
        boolean z;
        Map<String, String> extra = miPushMessage.getExtra();
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle(miPushMessage.getTitle());
        builder.setContentText(miPushMessage.getDescription());
        if (Build.VERSION.SDK_INT >= 16) {
            builder.setStyle(new Notification.BigTextStyle().bigText(miPushMessage.getDescription()));
        }
        builder.setWhen(System.currentTimeMillis());
        String str = extra == null ? null : extra.get("notification_show_when");
        if (!TextUtils.isEmpty(str)) {
            builder.setShowWhen(Boolean.parseBoolean(str));
        } else if (Build.VERSION.SDK_INT >= 24) {
            builder.setShowWhen(true);
        }
        builder.setContentIntent(pendingIntent);
        int i = context.getApplicationInfo().icon;
        if (i == 0 && Build.VERSION.SDK_INT >= 9) {
            i = context.getApplicationInfo().logo;
        }
        builder.setSmallIcon(i);
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
            z = true;
        } else {
            z = false;
        }
        if (extra != null && Build.VERSION.SDK_INT >= 24) {
            boolean parseBoolean = Boolean.parseBoolean(extra.get("notification_is_summary"));
            au.a((Object) builder, "setGroup", extra.get("notification_group"));
            au.a((Object) builder, "setGroupSummary", Boolean.valueOf(parseBoolean));
        }
        builder.setAutoCancel(true);
        long currentTimeMillis = System.currentTimeMillis();
        if (extra != null && extra.containsKey("ticker")) {
            builder.setTicker(extra.get("ticker"));
        }
        if (currentTimeMillis - z.f82604a > 10000) {
            z.f82604a = currentTimeMillis;
            builder.setDefaults(miPushMessage.getNotifyType());
        }
        Notification notification = builder.getNotification();
        if (z && m.a()) {
            a(notification);
        }
        return notification;
    }

    private static PendingIntent a(Context context, String str, MiPushMessage miPushMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setComponent(new ComponentName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
        intent.setAction("com.xiaomi.mipush.sdk.HYBRID_NOTIFICATION_CLICK");
        intent.putExtra("mipush_payload", miPushMessage);
        intent.putExtra("mipush_hybrid_app_pkg", str);
        intent.putExtra("mipush_notified", true);
        intent.addCategory(String.valueOf(miPushMessage.getNotifyId()));
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    private static void a(Notification notification, String str) {
        try {
            Object a2 = au.a((Object) notification, "extraNotification");
            if (a2 != null) {
                au.b(a2, "setMessageClassName", str);
                return;
            }
            b.d("Get null extraNotification, setShortcutId failed.");
        } catch (Throwable unused) {
        }
    }

    public static void clearNotification(Context context, String str) {
        clearNotification(context, str, -1);
    }

    public static void clearNotification(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int hashCode = ((str.hashCode() / 10) * 10) + i;
        LinkedList linkedList = new LinkedList();
        if (i >= 0) {
            notificationManager.cancel(hashCode);
        }
        synchronized (f81733a) {
            Iterator it2 = f81733a.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (i >= 0) {
                    if (hashCode == aVar.f81734a) {
                        if (!TextUtils.equals(str, aVar.f75a)) {
                        }
                    }
                } else if (i == -1 && TextUtils.equals(str, aVar.f75a)) {
                    notificationManager.cancel(aVar.f81734a);
                }
                linkedList.add(aVar);
            }
            if (f81733a != null) {
                f81733a.removeAll(linkedList);
                z.a(context, linkedList);
            }
        }
    }

    public static void notifyPushMessage(Context context, MiPushMessage miPushMessage, Bitmap bitmap, String str, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 11) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            PendingIntent a2 = a(context, str, miPushMessage);
            if (a2 == null) {
                b.a("The click PendingIntent is null. ");
                return;
            }
            Notification a3 = a(context, miPushMessage, a2, bitmap);
            if (m.a()) {
                if (Build.VERSION.SDK_INT >= 19) {
                    if (!TextUtils.isEmpty(miPushMessage.getMessageId())) {
                        a3.extras.putString("message_id", miPushMessage.getMessageId());
                    }
                    String str4 = miPushMessage.getExtra() == null ? null : miPushMessage.getExtra().get("score_info");
                    if (!TextUtils.isEmpty(str4)) {
                        a3.extras.putString("score_info", str4);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        a3.extras.putString("miui.category", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        a3.extras.putString("miui.substName", str2);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    a(a3, str3);
                }
            }
            int notifyId = miPushMessage.getNotifyId();
            if (str != null) {
                notifyId += (str.hashCode() / 10) * 10;
            }
            notificationManager.notify(notifyId, a3);
            a aVar = new a(notifyId, str, miPushMessage);
            synchronized (f81733a) {
                f81733a.add(aVar);
                if (f81733a.size() > 100) {
                    f81733a.remove();
                }
            }
        }
    }
}
