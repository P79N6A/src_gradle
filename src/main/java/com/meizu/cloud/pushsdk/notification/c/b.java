package com.meizu.cloud.pushsdk.notification.c;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Field f27238a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f27239b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f27240c;

    /* renamed from: d  reason: collision with root package name */
    private static Object f27241d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, Set<String>> f27242e = new ConcurrentHashMap();

    static {
        try {
            f27238a = Notification.class.getDeclaredField("mFlymeNotification");
            Field declaredField = Class.forName("android.app.NotificationExt").getDeclaredField("internalApp");
            f27239b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Notification.class.getDeclaredField("replyIntent");
            f27240c = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            DebugLogger.e("NotificationUtils", "init NotificationUtils error " + e2.getMessage());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void a(Notification notification, PendingIntent pendingIntent) {
        if (f27240c != null) {
            try {
                f27240c.set(notification, pendingIntent);
            } catch (IllegalAccessException e2) {
                DebugLogger.e("NotificationUtils", "setReplyIntent error " + e2.getMessage());
            }
        }
    }

    public static void a(Notification notification, boolean z) {
        if (!(f27238a == null || f27239b == null)) {
            try {
                f27239b.set(f27238a.get(notification), Integer.valueOf(z ? 1 : 0));
            } catch (IllegalAccessException e2) {
                DebugLogger.e("NotificationUtils", "setInternalApp error " + e2.getMessage());
            }
        }
    }

    public static void a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    public static void a(Context context, String str) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null && !TextUtils.isEmpty(str)) {
            Set<String> set = f27242e.get(str);
            if (set != null) {
                for (String str2 : set) {
                    DebugLogger.i("NotificationUtils", "clear notifyId " + str2 + " notification");
                    notificationManager.cancel(Integer.parseInt(str2));
                }
                set.clear();
            }
        }
    }

    public static void a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            DebugLogger.i("NotificationUtils", "clear clearNotification notifyId " + i);
            notificationManager.cancel(i);
            Set set = f27242e.get(str);
            if (set != null) {
                set.remove(String.valueOf(i));
            }
        }
    }

    public static boolean a(Context context, String str, String str2) {
        synchronized (f27241d) {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            int h = com.meizu.cloud.pushsdk.util.b.h(context, str, str2);
            DebugLogger.e("NotificationUtils", "removeNotifyKey " + str2 + " notifyId " + h);
            c(context, str, h);
            boolean i = com.meizu.cloud.pushsdk.util.b.i(context, str, str2);
            return i;
        }
    }

    public static void b(Context context, String str, int i) {
        Set set = f27242e.get(str);
        DebugLogger.i("NotificationUtils", "store notifyId " + i);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(String.valueOf(i));
            f27242e.put(str, hashSet);
            return;
        }
        set.add(String.valueOf(i));
    }

    public static void c(Context context, String str, int i) {
        Set set = f27242e.get(str);
        if (set != null) {
            set.remove(String.valueOf(i));
            DebugLogger.i("NotificationUtils", "remove notifyId " + i);
        }
    }
}
