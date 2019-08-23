package com.huawei.android.pushselfshow.c;

import android.R;
import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap f25214a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static int f25215b;

    @SuppressLint({"InlinedApi"})
    private static float a(Context context) {
        float a2 = (float) a.a(context, 48.0f);
        try {
            float dimension = context.getResources().getDimension(17104901);
            if (dimension > 0.0f && a2 > dimension) {
                a2 = dimension;
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", e2.toString());
        }
        e.a("PushSelfShowLog", "getRescaleBitmapSize:" + a2);
        return a2;
    }

    public static int a(Context context, String str, String str2, Object obj) {
        String str3;
        String str4;
        String str5;
        Exception exc;
        Class cls;
        int i;
        String str6;
        String str7;
        Object[] objArr;
        String substring;
        String str8 = str;
        Object obj2 = obj;
        int i2 = 0;
        try {
            String str9 = context.getPackageName() + ".R";
            e.a("PushSelfShowLog", "try to refrect " + str9 + " typeName is " + str3);
            Class[] classes = Class.forName(str9).getClasses();
            StringBuilder sb = new StringBuilder("sonClassArr length ");
            sb.append(classes.length);
            e.a("PushSelfShowLog", sb.toString());
            int i3 = 0;
            while (true) {
                if (i3 >= classes.length) {
                    cls = null;
                    break;
                }
                cls = classes[i3];
                e.a("PushSelfShowLog", "sonTypeClass,query sonclass is  %s", substring + " sonClass.getName() is" + cls.getName());
                if (str3.equals(substring)) {
                    break;
                }
                i3++;
            }
            if (cls != null) {
                i = cls.getField(str8).getInt(obj2);
                str6 = "PushSelfShowLog";
                str7 = " refect res id is %s";
                try {
                    objArr = new Object[]{i};
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    i2 = i;
                } catch (NoSuchFieldException e3) {
                    e = e3;
                    i2 = i;
                    exc = e;
                    str5 = "PushSelfShowLog";
                    str4 = "NoSuchFieldException failed,";
                    e.c(str5, str4, exc);
                    return i2;
                } catch (IllegalAccessException e4) {
                    e = e4;
                    i2 = i;
                    exc = e;
                    str5 = "PushSelfShowLog";
                    str4 = "IllegalAccessException failed,";
                    e.c(str5, str4, exc);
                    return i2;
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    i2 = i;
                    exc = e;
                    str5 = "PushSelfShowLog";
                    str4 = "IllegalArgumentException failed,";
                    e.c(str5, str4, exc);
                    return i2;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i2 = i;
                    exc = e;
                    str5 = "PushSelfShowLog";
                    str4 = "IndexOutOfBoundsException failed,";
                    e.c(str5, str4, exc);
                    return i2;
                } catch (Exception e7) {
                    e = e7;
                    i2 = i;
                    exc = e;
                    str5 = "PushSelfShowLog";
                    str4 = "  failed,";
                    e.c(str5, str4, exc);
                    return i2;
                }
            } else {
                e.a("PushSelfShowLog", "sonTypeClass is null");
                e.a("PushSelfShowLog", "try to refrect 2 " + r5 + " typeName is " + str3);
                i = Class.forName(context.getPackageName() + ".R$" + str3).getField(str8).getInt(obj2);
                str6 = "PushSelfShowLog";
                str7 = " refect res id 2 is %s";
                objArr = new Object[]{i};
            }
            e.a(str6, str7, objArr);
            return i;
        } catch (ClassNotFoundException e8) {
            e = e8;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "ClassNotFound failed,";
            e.c(str5, str4, exc);
            return i2;
        } catch (NoSuchFieldException e9) {
            e = e9;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "NoSuchFieldException failed,";
            e.c(str5, str4, exc);
            return i2;
        } catch (IllegalAccessException e10) {
            e = e10;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "IllegalAccessException failed,";
            e.c(str5, str4, exc);
            return i2;
        } catch (IllegalArgumentException e11) {
            e = e11;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "IllegalArgumentException failed,";
            e.c(str5, str4, exc);
            return i2;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "IndexOutOfBoundsException failed,";
            e.c(str5, str4, exc);
            return i2;
        } catch (Exception e13) {
            e = e13;
            exc = e;
            str5 = "PushSelfShowLog";
            str4 = "  failed,";
            e.c(str5, str4, exc);
            return i2;
        }
    }

    public static Notification a(Context context, com.huawei.android.pushselfshow.b.a aVar, int i, int i2, int i3) {
        Notification notification = new Notification();
        notification.icon = b(context, aVar);
        int i4 = context.getApplicationInfo().labelRes;
        notification.tickerText = aVar.q;
        notification.when = System.currentTimeMillis();
        notification.flags |= 16;
        notification.defaults |= 1;
        PendingIntent a2 = a(context, aVar, i, i2);
        notification.contentIntent = a2;
        notification.deleteIntent = b(context, aVar, i, i3);
        notification.setLatestEventInfo(context, (aVar.s == null || "".equals(aVar.s)) ? context.getResources().getString(i4) : aVar.s, aVar.q, a2);
        int identifier = context.getResources().getIdentifier("icon", "id", "android");
        Bitmap d2 = d(context, aVar);
        if (!(identifier == 0 || notification.contentView == null || d2 == null)) {
            notification.contentView.setImageViewBitmap(identifier, d2);
        }
        return c.a(context, notification, i, aVar, d2);
    }

    private static PendingIntent a(Context context, com.huawei.android.pushselfshow.b.a aVar, int i, int i2) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH");
        intent.putExtra("selfshow_info", aVar.c()).putExtra("selfshow_token", aVar.d()).putExtra("selfshow_event_id", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).putExtra("selfshow_notify_id", i).setPackage(context.getPackageName()).setFlags(268435456);
        return PendingIntent.getBroadcast(context, i2, intent, 134217728);
    }

    public static void a(Context context, int i) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(i);
            }
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "removeNotifiCationById err:" + e2.toString());
        }
    }

    public static void a(Context context, Intent intent) {
        try {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i = 0;
            if (intent.hasExtra("selfshow_notify_id")) {
                i = intent.getIntExtra("selfshow_notify_id", 0) + 3;
            }
            e.a("PushSelfShowLog", "setDelayAlarm(cancel) alarmNotityId " + i + " and intent is " + intent.toURI());
            Intent intent2 = new Intent("com.huawei.intent.action.PUSH");
            intent2.setPackage(context.getPackageName()).setFlags(32);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent2, 536870912);
            if (broadcast != null) {
                e.a("PushSelfShowLog", "  alarm cancel");
                alarmManager.cancel(broadcast);
                return;
            }
            e.a("PushSelfShowLog", "alarm not exist");
        } catch (Exception e2) {
            e.d("PushSelfShowLog", "cancelAlarm err:" + e2.toString());
        }
    }

    public static void a(Context context, Intent intent, long j, int i) {
        try {
            e.a("PushSelfShowLog", "enter setDelayAlarm(intent:" + intent.toURI() + " interval:" + j + "ms, context:" + context);
            ((AlarmManager) context.getSystemService("alarm")).set(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, i, intent, 134217728));
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "set DelayAlarm error", (Throwable) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0141, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0161, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r8, com.huawei.android.pushselfshow.b.a r9) {
        /*
            java.lang.Class<com.huawei.android.pushselfshow.c.b> r0 = com.huawei.android.pushselfshow.c.b.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x0160
            if (r9 != 0) goto L_0x0009
            goto L_0x0160
        L_0x0009:
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = " showNotification , the msg id = "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = r9.m     // Catch:{ Exception -> 0x0144 }
            r2.append(r3)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0144 }
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)     // Catch:{ Exception -> 0x0144 }
            r1 = 2
            r2 = 180(0xb4, float:2.52E-43)
            com.huawei.android.pushselfshow.utils.a.a((int) r1, (int) r2)     // Catch:{ Exception -> 0x0144 }
            int r1 = f25215b     // Catch:{ Exception -> 0x0144 }
            if (r1 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            r1.<init>()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r8.getPackageName()     // Catch:{ Exception -> 0x0144 }
            r1.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0144 }
            r2.<init>()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0144 }
            r1.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0144 }
            int r1 = r1.hashCode()     // Catch:{ Exception -> 0x0144 }
            f25215b = r1     // Catch:{ Exception -> 0x0144 }
        L_0x004a:
            java.lang.String r1 = r9.f25201a     // Catch:{ Exception -> 0x0144 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0144 }
            if (r1 == 0) goto L_0x006b
            int r1 = f25215b     // Catch:{ Exception -> 0x0144 }
            int r1 = r1 + 1
            f25215b = r1     // Catch:{ Exception -> 0x0144 }
            int r2 = f25215b     // Catch:{ Exception -> 0x0144 }
            int r2 = r2 + 1
            f25215b = r2     // Catch:{ Exception -> 0x0144 }
            int r3 = f25215b     // Catch:{ Exception -> 0x0144 }
            int r3 = r3 + 1
            f25215b = r3     // Catch:{ Exception -> 0x0144 }
            int r4 = f25215b     // Catch:{ Exception -> 0x0144 }
        L_0x0066:
            int r4 = r4 + 1
            f25215b = r4     // Catch:{ Exception -> 0x0144 }
            goto L_0x0091
        L_0x006b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            r1.<init>()     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r9.n     // Catch:{ Exception -> 0x0144 }
            r1.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r9.f25201a     // Catch:{ Exception -> 0x0144 }
            r1.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0144 }
            int r1 = r1.hashCode()     // Catch:{ Exception -> 0x0144 }
            int r2 = f25215b     // Catch:{ Exception -> 0x0144 }
            int r2 = r2 + 1
            f25215b = r2     // Catch:{ Exception -> 0x0144 }
            int r3 = f25215b     // Catch:{ Exception -> 0x0144 }
            int r3 = r3 + 1
            f25215b = r3     // Catch:{ Exception -> 0x0144 }
            int r4 = f25215b     // Catch:{ Exception -> 0x0144 }
            goto L_0x0066
        L_0x0091:
            java.lang.String r5 = "PushSelfShowLog"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = "notifyId:"
            r6.<init>(r7)     // Catch:{ Exception -> 0x0144 }
            r6.append(r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = ",openNotifyId:"
            r6.append(r7)     // Catch:{ Exception -> 0x0144 }
            r6.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = ",delNotifyId:"
            r6.append(r7)     // Catch:{ Exception -> 0x0144 }
            r6.append(r3)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r7 = ",alarmNotifyId:"
            r6.append(r7)     // Catch:{ Exception -> 0x0144 }
            r6.append(r4)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0144 }
            com.huawei.android.pushagent.utils.a.e.a(r5, r6)     // Catch:{ Exception -> 0x0144 }
            boolean r5 = com.huawei.android.pushselfshow.utils.a.b()     // Catch:{ Exception -> 0x0144 }
            if (r5 == 0) goto L_0x00c7
            android.app.Notification r2 = b(r8, r9, r1, r2, r3)     // Catch:{ Exception -> 0x0144 }
            goto L_0x00cb
        L_0x00c7:
            android.app.Notification r2 = a(r8, r9, r1, r2, r3)     // Catch:{ Exception -> 0x0144 }
        L_0x00cb:
            java.lang.String r3 = "notification"
            java.lang.Object r3 = r8.getSystemService(r3)     // Catch:{ Exception -> 0x0144 }
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch:{ Exception -> 0x0144 }
            if (r3 == 0) goto L_0x0140
            if (r2 == 0) goto L_0x0140
            r3.notify(r1, r2)     // Catch:{ Exception -> 0x0144 }
            int r2 = r9.f25206f     // Catch:{ Exception -> 0x0144 }
            if (r2 <= 0) goto L_0x0139
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = "com.huawei.intent.action.PUSH"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = "selfshow_info"
            byte[] r5 = r9.c()     // Catch:{ Exception -> 0x0144 }
            android.content.Intent r3 = r2.putExtra(r3, r5)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "selfshow_token"
            byte[] r6 = r9.d()     // Catch:{ Exception -> 0x0144 }
            android.content.Intent r3 = r3.putExtra(r5, r6)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "selfshow_event_id"
            java.lang.String r6 = "-1"
            android.content.Intent r3 = r3.putExtra(r5, r6)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "selfshow_notify_id"
            android.content.Intent r1 = r3.putExtra(r5, r1)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r3 = r8.getPackageName()     // Catch:{ Exception -> 0x0144 }
            android.content.Intent r1 = r1.setPackage(r3)     // Catch:{ Exception -> 0x0144 }
            r3 = 32
            r1.setFlags(r3)     // Catch:{ Exception -> 0x0144 }
            int r1 = r9.f25206f     // Catch:{ Exception -> 0x0144 }
            long r5 = (long) r1     // Catch:{ Exception -> 0x0144 }
            a((android.content.Context) r8, (android.content.Intent) r2, (long) r5, (int) r4)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0144 }
            java.lang.String r5 = "setDelayAlarm alarmNotityId"
            r3.<init>(r5)     // Catch:{ Exception -> 0x0144 }
            r3.append(r4)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r4 = " and intent is "
            r3.append(r4)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r2.toURI()     // Catch:{ Exception -> 0x0144 }
            r3.append(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0144 }
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)     // Catch:{ Exception -> 0x0144 }
        L_0x0139:
            java.lang.String r1 = "0"
            com.huawei.android.pushselfshow.utils.a.a((android.content.Context) r8, (java.lang.String) r1, (com.huawei.android.pushselfshow.b.a) r9)     // Catch:{ Exception -> 0x0144 }
            monitor-exit(r0)
            return
        L_0x0140:
            monitor-exit(r0)
            return
        L_0x0142:
            r8 = move-exception
            goto L_0x015e
        L_0x0144:
            r8 = move-exception
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "showNotification error "
            r1.<init>(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0142 }
            r1.append(r8)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0142 }
            com.huawei.android.pushagent.utils.a.e.d(r9, r8)     // Catch:{ all -> 0x0142 }
            monitor-exit(r0)
            return
        L_0x015e:
            monitor-exit(r0)
            throw r8
        L_0x0160:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.c.b.a(android.content.Context, com.huawei.android.pushselfshow.b.a):void");
    }

    private static int b(Context context, com.huawei.android.pushselfshow.b.a aVar) {
        int i = 0;
        if (context == null || aVar == null) {
            e.b("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
            return 0;
        }
        if (aVar.t != null && aVar.t.length() > 0) {
            i = a(context, aVar.t, "drawable", (Object) new R.drawable());
            e.a("PushSelfShowLog", context.getPackageName() + "  msg.statusIcon is " + aVar.t + ",and icon is " + i);
            if (i == 0) {
                i = context.getResources().getIdentifier(aVar.t, "drawable", "android");
            }
            e.a("PushSelfShowLog", "msg.statusIcon is " + aVar.t + ",and icon is " + i);
        }
        if (i == 0) {
            i = context.getApplicationInfo().icon;
            if (i == 0) {
                i = context.getResources().getIdentifier("btn_star_big_on", "drawable", "android");
                e.a("PushSelfShowLog", "icon is btn_star_big_on ");
                if (i == 0) {
                    i = 17301651;
                    e.a("PushSelfShowLog", "icon is sym_def_app_icon ");
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification b(android.content.Context r7, com.huawei.android.pushselfshow.b.a r8, int r9, int r10, int r11) {
        /*
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            r0.<init>(r7)
            boolean r1 = com.huawei.android.pushselfshow.utils.a.e(r7)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "com.huawei.android.pushagent"
            java.lang.String r2 = r8.n
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "get small icon from "
            r2.<init>(r3)
            java.lang.String r3 = r8.n
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.b(r1, r2)
            android.graphics.drawable.Icon r1 = c(r7, r8)
            if (r1 == 0) goto L_0x0034
            r0.setSmallIcon(r1)
            goto L_0x003b
        L_0x0034:
            int r1 = b(r7, r8)
            r0.setSmallIcon(r1)
        L_0x003b:
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()
            int r1 = r1.labelRes
            java.lang.String r2 = r8.q
            r0.setTicker(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.setWhen(r2)
            r2 = 1
            r0.setAutoCancel(r2)
            r0.setDefaults(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.n
            r3.append(r4)
            java.lang.String r4 = r8.f25201a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r8.f25201a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00c3
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "groupMap key is "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)
            java.util.HashMap r4 = f25214a
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L_0x0094
            java.util.HashMap r4 = f25214a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.put(r3, r5)
            goto L_0x00c3
        L_0x0094:
            java.util.HashMap r4 = f25214a
            java.util.HashMap r5 = f25214a
            java.lang.Object r5 = r5.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "groupMap.size:"
            r5.<init>(r6)
            java.util.HashMap r6 = f25214a
            java.lang.Object r6 = r6.get(r3)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)
        L_0x00c3:
            java.lang.String r4 = r8.s
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = ""
            java.lang.String r5 = r8.s
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00d2:
            java.lang.String r1 = r8.s
            goto L_0x00dd
        L_0x00d5:
            android.content.res.Resources r4 = r7.getResources()
            java.lang.String r1 = r4.getString(r1)
        L_0x00dd:
            r0.setContentTitle(r1)
            java.lang.String r1 = r8.f25201a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x011b
            java.util.HashMap r1 = f25214a
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x00f7
            goto L_0x011b
        L_0x00f7:
            java.util.HashMap r1 = f25214a
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r4 = "hwpush_message_hint"
            int r4 = com.huawei.android.pushselfshow.utils.d.b(r7, r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r2[r5] = r6
            java.lang.String r1 = r3.getQuantityString(r4, r1, r2)
            goto L_0x011d
        L_0x011b:
            java.lang.String r1 = r8.q
        L_0x011d:
            r0.setContentText(r1)
            android.app.PendingIntent r10 = a((android.content.Context) r7, (com.huawei.android.pushselfshow.b.a) r8, (int) r9, (int) r10)
            r0.setContentIntent(r10)
            android.app.PendingIntent r10 = b(r7, r8, r9, r11)
            r0.setDeleteIntent(r10)
            android.graphics.Bitmap r10 = d(r7, r8)
            if (r10 == 0) goto L_0x0137
            r0.setLargeIcon(r10)
        L_0x0137:
            java.lang.String r11 = "com.huawei.android.pushagent"
            java.lang.String r1 = r7.getPackageName()
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x016e
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r1 = r8.n
            java.lang.String r2 = "app"
            java.lang.String r3 = r8.p
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = "cosa"
            java.lang.String r3 = r8.p
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0160
        L_0x015e:
            java.lang.String r1 = r8.A
        L_0x0160:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x016e
            java.lang.String r2 = "hw_origin_sender_package_name"
            r11.putString(r2, r1)
            r0.setExtras(r11)
        L_0x016e:
            android.app.Notification$Builder r7 = com.huawei.android.pushselfshow.c.c.a((android.content.Context) r7, (android.app.Notification.Builder) r0, (int) r9, (com.huawei.android.pushselfshow.b.a) r8, (android.graphics.Bitmap) r10)
            if (r7 != 0) goto L_0x0176
            r7 = 0
            return r7
        L_0x0176:
            android.app.Notification r7 = r0.getNotification()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.c.b.b(android.content.Context, com.huawei.android.pushselfshow.b.a, int, int, int):android.app.Notification");
    }

    private static PendingIntent b(Context context, com.huawei.android.pushselfshow.b.a aVar, int i, int i2) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH");
        intent.putExtra("selfshow_info", aVar.c()).putExtra("selfshow_token", aVar.d()).putExtra("selfshow_event_id", PushConstants.PUSH_TYPE_UPLOAD_LOG).putExtra("selfshow_notify_id", i).setPackage(context.getPackageName()).setFlags(268435456);
        return PendingIntent.getBroadcast(context, i2, intent, 134217728);
    }

    private static Icon c(Context context, com.huawei.android.pushselfshow.b.a aVar) {
        try {
            return Icon.createWithBitmap(((BitmapDrawable) context.getPackageManager().getApplicationIcon(aVar.n)).getBitmap());
        } catch (PackageManager.NameNotFoundException e2) {
            e.d("PushSelfShowLog", e2.toString());
            return null;
        }
    }

    private static Bitmap d(Context context, com.huawei.android.pushselfshow.b.a aVar) {
        String str;
        Exception exc;
        String str2;
        StringBuilder sb;
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (context == null || aVar == null) {
            return null;
        }
        try {
            if (aVar.r != null && aVar.r.length() > 0) {
                com.huawei.android.pushselfshow.utils.c.a aVar2 = new com.huawei.android.pushselfshow.utils.c.a();
                int i = 0;
                String str3 = aVar.r;
                if (!str3.equals(aVar.a())) {
                    i = a(context, aVar.r, "drawable", (Object) new R.drawable());
                    if (i == 0) {
                        i = context.getResources().getIdentifier(aVar.r, "drawable", "android");
                    }
                    e.a("PushSelfShowLog", "msg.notifyIcon is " + aVar.r + ",and defaultIcon is " + i);
                }
                if (i != 0) {
                    bitmap2 = BitmapFactory.decodeResource(context.getResources(), i);
                } else {
                    Bitmap a2 = aVar2.a(context, aVar.r);
                    e.a("PushSelfShowLog", "get bitmap from new downloaded ");
                    if (a2 != null) {
                        e.a("PushSelfShowLog", "height:" + a2.getHeight() + ",width:" + a2.getWidth());
                        float a3 = a(context);
                        a2 = aVar2.a(context, a2, a3, a3);
                    }
                    if (a2 != null) {
                        bitmap2 = a2;
                    }
                }
            }
            if (bitmap2 != null || "com.huawei.android.pushagent".equals(aVar.n)) {
                bitmap = bitmap2;
            } else {
                e.b("PushSelfShowLog", "get left bitmap from " + aVar.n);
                bitmap = ((BitmapDrawable) context.getPackageManager().getApplicationIcon(aVar.n)).getBitmap();
            }
            return bitmap;
        } catch (PackageManager.NameNotFoundException e2) {
            str = "PushSelfShowLog";
            sb = new StringBuilder();
            str2 = e2.toString();
            exc = e2;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        } catch (Exception e3) {
            str = "PushSelfShowLog";
            sb = new StringBuilder();
            str2 = e3.toString();
            exc = e3;
            sb.append(str2);
            e.c(str, sb.toString(), exc);
            return null;
        }
    }
}
