package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.au;
import com.xiaomi.push.g;
import com.xiaomi.push.ik;
import com.xiaomi.push.ix;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.af;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public static long f82604a;

    /* renamed from: a  reason: collision with other field name */
    private static final LinkedList<Pair<Integer, jg>> f1016a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    private static ExecutorService f1017a = Executors.newCachedThreadPool();

    static class a implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private Context f82605a;

        /* renamed from: a  reason: collision with other field name */
        private String f1018a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f1019a;

        public a(String str, Context context, boolean z) {
            this.f82605a = context;
            this.f1018a = str;
            this.f1019a = z;
        }

        /* renamed from: a */
        public Bitmap call() {
            String str;
            if (TextUtils.isEmpty(this.f1018a)) {
                str = "Failed get online picture/icon resource cause picUrl is empty";
            } else if (this.f1018a.startsWith("http")) {
                af.b a2 = af.a(this.f82605a, this.f1018a, this.f1019a);
                if (a2 != null) {
                    return a2.f924a;
                }
                str = "Failed get online picture/icon resource";
            } else {
                Bitmap a3 = af.a(this.f82605a, this.f1018a);
                if (a3 != null) {
                    return a3;
                }
                com.xiaomi.channel.commonutils.logger.b.a("Failed get online picture/icon resource");
                return a3;
            }
            com.xiaomi.channel.commonutils.logger.b.a(str);
            return null;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f82606a;

        /* renamed from: a  reason: collision with other field name */
        Notification f1020a;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public long f82607a;

        /* renamed from: a  reason: collision with other field name */
        public String f1021a;
    }

    static int a(Context context, String str) {
        return com.ss.android.ugc.aweme.q.c.a(context, "pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    private static int a(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    @TargetApi(16)
    private static Notification.Builder a(Notification.Builder builder, Context context, String str, Map<String, String> map) {
        PendingIntent a2 = a(context, str, 1, map);
        if (a2 != null && !TextUtils.isEmpty(map.get("notification_style_button_left_name"))) {
            builder.addAction(0, map.get("notification_style_button_left_name"), a2);
        }
        PendingIntent a3 = a(context, str, 2, map);
        if (a3 != null && !TextUtils.isEmpty(map.get("notification_style_button_mid_name"))) {
            builder.addAction(0, map.get("notification_style_button_mid_name"), a3);
        }
        PendingIntent a4 = a(context, str, 3, map);
        if (a4 != null && !TextUtils.isEmpty(map.get("notification_style_button_right_name"))) {
            builder.addAction(0, map.get("notification_style_button_right_name"), a4);
        }
        return builder;
    }

    private static Notification.Builder a(Context context, Map<String, String> map, Notification.Builder builder, String str) {
        if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(map.get("notification_style_type"))) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(builder);
            Bitmap a2 = map == null ? null : a(context, map.get("notification_bigPic_uri"), false);
            if (a2 != null) {
                bigPictureStyle.bigPicture(a2);
                bigPictureStyle.setSummaryText(str);
                bigPictureStyle.bigLargeIcon(null);
                builder.setStyle(bigPictureStyle);
            }
        } else if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(map.get("notification_style_type"))) {
            builder.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        return builder;
    }

    private static Notification a(Notification notification) {
        Object a2 = au.a((Object) notification, "extraNotification");
        if (a2 != null) {
            au.a(a2, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    private static Notification a(Notification notification, String str) {
        try {
            Field declaredField = Notification.class.getDeclaredField("extraNotification");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(notification);
            Method declaredMethod = obj.getClass().getDeclaredMethod("setTargetPkg", new Class[]{CharSequence.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, new Object[]{str});
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
        }
        return notification;
    }

    private static PendingIntent a(Context context, jg jgVar, ix ixVar, byte[] bArr) {
        Intent intent;
        ComponentName componentName;
        int i = c(jgVar) ? PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE : a(jgVar) ? PushConstants.WORK_RECEIVER_EVENTCORE_ERROR : -1;
        String a2 = ixVar != null ? ixVar.a() : "";
        if (ixVar == null || TextUtils.isEmpty(ixVar.f614e)) {
            if (a(jgVar)) {
                intent = new Intent();
                componentName = new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler");
            } else {
                intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                componentName = new ComponentName(jgVar.f698b, "com.xiaomi.mipush.sdk.PushMessageHandler");
            }
            intent.setComponent(componentName);
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(ixVar.c()));
            intent.putExtra("messageId", a2);
            intent.putExtra("eventMessageType", i);
            if (!f.b(context, jgVar.f698b, "com.xiaomi.mipush.MESSAGE_CLICKED")) {
                return PendingIntent.getService(context, 0, intent, 134217728);
            }
            Intent intent2 = new Intent();
            intent2.setAction("com.xiaomi.mipush.MESSAGE_CLICKED");
            intent2.setClassName(jgVar.f698b, "com.xiaomi.mipush.sdk.BridgeActivity");
            intent2.addFlags(276824064);
            intent2.putExtra("mipush_serviceIntent", intent);
            intent2.addCategory(String.valueOf(ixVar.c()));
            return PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse(ixVar.f614e));
        intent3.addFlags(268435456);
        intent3.putExtra("messageId", a2);
        intent3.putExtra("eventMessageType", i);
        return PendingIntent.getActivity(context, 0, intent3, 134217728);
    }

    private static PendingIntent a(Context context, String str, int i, Map<String, String> map) {
        if (map == null) {
            return null;
        }
        Intent a2 = a(context, str, i, map);
        if (a2 != null) {
            return PendingIntent.getActivity(context, 0, a2, 0);
        }
        return null;
    }

    private static Intent a(Context context, Intent intent) {
        try {
            if (context.getPackageManager().getPackageInfo("com.android.browser", 4) != null) {
                intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
        }
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m651a(android.content.Context r5, java.lang.String r6, int r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r0 = 3
            r1 = 2
            if (r7 >= r1) goto L_0x0007
            java.lang.String r2 = "notification_style_button_left_notify_effect"
            goto L_0x000e
        L_0x0007:
            if (r7 >= r0) goto L_0x000c
            java.lang.String r2 = "notification_style_button_mid_notify_effect"
            goto L_0x000e
        L_0x000c:
            java.lang.String r2 = "notification_style_button_right_notify_effect"
        L_0x000e:
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001d
            goto L_0x0161
        L_0x001d:
            java.lang.String r3 = com.xiaomi.push.service.ap.f82515a
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0049
            android.content.pm.PackageManager r7 = r5.getPackageManager()     // Catch:{ Exception -> 0x0030 }
            android.content.Intent r6 = r7.getLaunchIntentForPackage(r6)     // Catch:{ Exception -> 0x0030 }
        L_0x002d:
            r7 = r6
            goto L_0x0136
        L_0x0030:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cause: "
            r7.<init>(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
        L_0x0046:
            r7 = r4
            goto L_0x0136
        L_0x0049:
            java.lang.String r3 = com.xiaomi.push.service.ap.f82516b
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00ae
            if (r7 >= r1) goto L_0x0056
            java.lang.String r2 = "notification_style_button_left_intent_uri"
            goto L_0x005d
        L_0x0056:
            if (r7 >= r0) goto L_0x005b
            java.lang.String r2 = "notification_style_button_mid_intent_uri"
            goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "notification_style_button_right_intent_uri"
        L_0x005d:
            if (r7 >= r1) goto L_0x0062
            java.lang.String r7 = "notification_style_button_left_intent_class"
            goto L_0x0069
        L_0x0062:
            if (r7 >= r0) goto L_0x0067
            java.lang.String r7 = "notification_style_button_mid_intent_class"
            goto L_0x0069
        L_0x0067:
            java.lang.String r7 = "notification_style_button_right_intent_class"
        L_0x0069:
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r7 = r8.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0046
            r8 = 1
            android.content.Intent r7 = android.content.Intent.parseUri(r7, r8)     // Catch:{ URISyntaxException -> 0x0083 }
            r7.setPackage(r6)     // Catch:{ URISyntaxException -> 0x0081 }
            goto L_0x0136
        L_0x0081:
            r6 = move-exception
            goto L_0x0085
        L_0x0083:
            r6 = move-exception
            r7 = r4
        L_0x0085:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Cause: "
            r8.<init>(r0)
            java.lang.String r6 = r6.getMessage()
            goto L_0x012c
        L_0x0092:
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r6, r7)
            r8.setComponent(r0)
            r7 = r8
            goto L_0x0136
        L_0x00ae:
            java.lang.String r6 = com.xiaomi.push.service.ap.f82517c
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0046
            if (r7 >= r1) goto L_0x00bb
            java.lang.String r6 = "notification_style_button_left_web_uri"
            goto L_0x00c2
        L_0x00bb:
            if (r7 >= r0) goto L_0x00c0
            java.lang.String r6 = "notification_style_button_mid_web_uri"
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r6 = "notification_style_button_right_web_uri"
        L_0x00c2:
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0046
            java.lang.String r6 = r6.trim()
            java.lang.String r7 = "http://"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x00f0
            java.lang.String r7 = "https://"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x00f0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "http://"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00f0:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011f }
            r7.<init>(r6)     // Catch:{ MalformedURLException -> 0x011f }
            java.lang.String r7 = r7.getProtocol()     // Catch:{ MalformedURLException -> 0x011f }
            java.lang.String r8 = "http"
            boolean r8 = r8.equals(r7)     // Catch:{ MalformedURLException -> 0x011f }
            if (r8 != 0) goto L_0x0109
            java.lang.String r8 = "https"
            boolean r7 = r8.equals(r7)     // Catch:{ MalformedURLException -> 0x011f }
            if (r7 == 0) goto L_0x0046
        L_0x0109:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x011f }
            java.lang.String r8 = "android.intent.action.VIEW"
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x011f }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ MalformedURLException -> 0x011d }
            r7.setData(r6)     // Catch:{ MalformedURLException -> 0x011d }
            android.content.Intent r6 = a((android.content.Context) r5, (android.content.Intent) r7)     // Catch:{ MalformedURLException -> 0x011d }
            goto L_0x002d
        L_0x011d:
            r6 = move-exception
            goto L_0x0121
        L_0x011f:
            r6 = move-exception
            r7 = r4
        L_0x0121:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Cause: "
            r8.<init>(r0)
            java.lang.String r6 = r6.getMessage()
        L_0x012c:
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
        L_0x0136:
            if (r7 == 0) goto L_0x0161
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r6)
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x014b }
            r6 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r7, r6)     // Catch:{ Exception -> 0x014b }
            if (r5 == 0) goto L_0x0161
            r4 = r7
            goto L_0x0161
        L_0x014b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Cause: "
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r5)
        L_0x0161:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.m651a(android.content.Context, java.lang.String, int, java.util.Map):android.content.Intent");
    }

    private static Bitmap a(Context context, int i) {
        return a(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), i));
    }

    private static Bitmap a(Context context, String str, boolean z) {
        Future submit = f1017a.submit(new a(str, context, z));
        try {
            Bitmap bitmap = (Bitmap) submit.get(180, TimeUnit.SECONDS);
            if (bitmap == null) {
            }
            return bitmap;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            return null;
        } finally {
            submit.cancel(true);
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = 1;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews a(android.content.Context r8, com.xiaomi.push.jg r9, byte[] r10) {
        /*
            com.xiaomi.push.ix r10 = r9.a()
            java.lang.String r9 = a((com.xiaomi.push.jg) r9)
            java.util.Map r10 = r10.a()
            r0 = 0
            if (r10 != 0) goto L_0x0011
            goto L_0x00fb
        L_0x0011:
            java.lang.String r1 = "layout_name"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout_value"
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00fb
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x002f
            goto L_0x00fb
        L_0x002f:
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.res.Resources r8 = r8.getResourcesForApplication(r9)     // Catch:{ NameNotFoundException -> 0x00f7 }
            java.lang.String r2 = "layout"
            int r1 = r8.getIdentifier(r1, r2, r9)
            if (r1 != 0) goto L_0x0041
            goto L_0x00fb
        L_0x0041:
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            r2.<init>(r9, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r10)     // Catch:{  }
            java.lang.String r10 = "text"
            boolean r10 = r1.has(r10)     // Catch:{  }
            if (r10 == 0) goto L_0x0079
            java.lang.String r10 = "text"
            org.json.JSONObject r10 = r1.getJSONObject(r10)     // Catch:{  }
            java.util.Iterator r3 = r10.keys()     // Catch:{  }
        L_0x005d:
            boolean r4 = r3.hasNext()     // Catch:{  }
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()     // Catch:{  }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{  }
            java.lang.String r5 = r10.getString(r4)     // Catch:{  }
            java.lang.String r6 = "id"
            int r4 = r8.getIdentifier(r4, r6, r9)     // Catch:{  }
            if (r4 <= 0) goto L_0x005d
            r2.setTextViewText(r4, r5)     // Catch:{  }
            goto L_0x005d
        L_0x0079:
            java.lang.String r10 = "image"
            boolean r10 = r1.has(r10)     // Catch:{  }
            if (r10 == 0) goto L_0x00ad
            java.lang.String r10 = "image"
            org.json.JSONObject r10 = r1.getJSONObject(r10)     // Catch:{  }
            java.util.Iterator r3 = r10.keys()     // Catch:{  }
        L_0x008b:
            boolean r4 = r3.hasNext()     // Catch:{  }
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r3.next()     // Catch:{  }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{  }
            java.lang.String r5 = r10.getString(r4)     // Catch:{  }
            java.lang.String r6 = "id"
            int r4 = r8.getIdentifier(r4, r6, r9)     // Catch:{  }
            java.lang.String r6 = "drawable"
            int r5 = r8.getIdentifier(r5, r6, r9)     // Catch:{  }
            if (r4 <= 0) goto L_0x008b
            r2.setImageViewResource(r4, r5)     // Catch:{  }
            goto L_0x008b
        L_0x00ad:
            java.lang.String r10 = "time"
            boolean r10 = r1.has(r10)     // Catch:{  }
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = "time"
            org.json.JSONObject r10 = r1.getJSONObject(r10)     // Catch:{  }
            java.util.Iterator r1 = r10.keys()     // Catch:{  }
        L_0x00bf:
            boolean r3 = r1.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r3 = r1.next()     // Catch:{  }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{  }
            java.lang.String r4 = r10.getString(r3)     // Catch:{  }
            int r5 = r4.length()     // Catch:{  }
            if (r5 != 0) goto L_0x00d7
            java.lang.String r4 = "yy-MM-dd hh:mm"
        L_0x00d7:
            java.lang.String r5 = "id"
            int r3 = r8.getIdentifier(r3, r5, r9)     // Catch:{  }
            if (r3 <= 0) goto L_0x00bf
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{  }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{  }
            r7.<init>(r4)     // Catch:{  }
            java.util.Date r4 = new java.util.Date     // Catch:{  }
            r4.<init>(r5)     // Catch:{  }
            java.lang.String r4 = r7.format(r4)     // Catch:{  }
            r2.setTextViewText(r3, r4)     // Catch:{  }
            goto L_0x00bf
        L_0x00f5:
            r0 = r2
            goto L_0x00fb
        L_0x00f7:
            r8 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(android.content.Context, com.xiaomi.push.jg, byte[]):android.widget.RemoteViews");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e0 A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0381 A[SYNTHETIC, Splitter:B:152:0x0381] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020b  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.service.z.b a(android.content.Context r18, com.xiaomi.push.jg r19, byte[] r20, android.widget.RemoteViews r21, android.app.PendingIntent r22) {
        /*
            r1 = r18
            r0 = r21
            com.xiaomi.push.service.z$b r2 = new com.xiaomi.push.service.z$b
            r2.<init>()
            com.xiaomi.push.ix r3 = r19.a()
            java.lang.String r4 = a((com.xiaomi.push.jg) r19)
            java.util.Map r5 = r3.a()
            android.app.Notification$Builder r6 = new android.app.Notification$Builder
            r6.<init>(r1)
            java.lang.String[] r7 = a((android.content.Context) r1, (com.xiaomi.push.ix) r3)
            r8 = 0
            r9 = r7[r8]
            r6.setContentTitle(r9)
            r9 = 1
            r10 = r7[r9]
            r6.setContentText(r10)
            if (r0 == 0) goto L_0x0030
            r6.setContent(r0)
            goto L_0x0046
        L_0x0030:
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 16
            if (r0 < r10) goto L_0x0046
            if (r5 == 0) goto L_0x0046
            java.lang.String r0 = "notification_style_type"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0046
            r0 = r7[r9]
            android.app.Notification$Builder r6 = a((android.content.Context) r1, (java.util.Map<java.lang.String, java.lang.String>) r5, (android.app.Notification.Builder) r6, (java.lang.String) r0)
        L_0x0046:
            java.lang.String r0 = r19.b()
            android.app.Notification$Builder r6 = a((android.app.Notification.Builder) r6, (android.content.Context) r1, (java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r5)
            long r10 = java.lang.System.currentTimeMillis()
            r6.setWhen(r10)
            if (r5 != 0) goto L_0x0059
            r0 = 0
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "notification_show_when"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0061:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            r11 = 24
            if (r10 == 0) goto L_0x0073
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x0070
            r6.setShowWhen(r9)
        L_0x0070:
            r0 = r22
            goto L_0x007b
        L_0x0073:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r6.setShowWhen(r0)
            goto L_0x0070
        L_0x007b:
            r6.setContentIntent(r0)
            java.lang.String r0 = "mipush_notification"
            int r0 = a((android.content.Context) r1, (java.lang.String) r4, (java.lang.String) r0)
            java.lang.String r10 = "mipush_small_notification"
            int r10 = a((android.content.Context) r1, (java.lang.String) r4, (java.lang.String) r10)
            if (r0 <= 0) goto L_0x0099
            if (r10 <= 0) goto L_0x0099
            android.graphics.Bitmap r0 = a((android.content.Context) r1, (int) r0)
            r6.setLargeIcon(r0)
            r6.setSmallIcon(r10)
            goto L_0x00a0
        L_0x0099:
            int r0 = b((android.content.Context) r1, (java.lang.String) r4)
            r6.setSmallIcon(r0)
        L_0x00a0:
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r0 < r10) goto L_0x012a
            if (r5 != 0) goto L_0x00aa
            r0 = 0
            goto L_0x00b6
        L_0x00aa:
            java.lang.String r0 = "notification_small_icon_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.Bitmap r0 = a((android.content.Context) r1, (java.lang.String) r0, (boolean) r9)
        L_0x00b6:
            if (r0 == 0) goto L_0x00f7
            java.lang.String r10 = "android.graphics.drawable.Icon"
            java.lang.String r12 = "createWithBitmap"
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r8] = r0
            java.lang.Object r0 = com.xiaomi.push.au.a((java.lang.String) r10, (java.lang.String) r12, (java.lang.Object[]) r13)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r10 = "setSmallIcon"
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r8] = r0
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r10, (java.lang.Object[]) r12)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r10 = "miui.isGrayscaleIcon"
            r0.putBoolean(r10, r9)
            r6.addExtras(r0)
            goto L_0x0102
        L_0x00dd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "failed te get small icon with url:"
            r0.<init>(r10)
        L_0x00e4:
            java.lang.String r10 = "notification_small_icon_uri"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
        L_0x00ec:
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            goto L_0x0102
        L_0x00f7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "failed to get small icon url:"
            r0.<init>(r10)
            if (r5 != 0) goto L_0x00e4
            r10 = 0
            goto L_0x00ec
        L_0x0102:
            if (r5 != 0) goto L_0x0106
            r0 = 0
            goto L_0x010e
        L_0x0106:
            java.lang.String r0 = "notification_small_icon_color"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x010e:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x012a
            java.lang.String r10 = "setColor"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0126 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0126 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0126 }
            r12[r8] = r0     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r10, (java.lang.Object[]) r12)     // Catch:{ Exception -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x012a:
            if (r5 != 0) goto L_0x012e
            r0 = 0
            goto L_0x0136
        L_0x012e:
            java.lang.String r0 = "__dynamic_icon_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0136:
            if (r5 == 0) goto L_0x0148
            java.lang.String r10 = "__adiom"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            if (r10 == 0) goto L_0x0148
            r10 = 1
            goto L_0x0149
        L_0x0148:
            r10 = 0
        L_0x0149:
            if (r10 != 0) goto L_0x0154
            boolean r10 = com.xiaomi.push.m.a()
            if (r10 != 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r10 = 0
            goto L_0x0155
        L_0x0154:
            r10 = 1
        L_0x0155:
            if (r0 == 0) goto L_0x017c
            if (r10 == 0) goto L_0x017c
            java.lang.String r10 = "http"
            boolean r10 = r0.startsWith(r10)
            if (r10 == 0) goto L_0x0171
            com.xiaomi.push.service.af$b r0 = com.xiaomi.push.service.af.a((android.content.Context) r1, (java.lang.String) r0, (boolean) r9)
            if (r0 == 0) goto L_0x016f
            android.graphics.Bitmap r10 = r0.f924a
            long r12 = r0.f82490a
            r2.f82606a = r12
            r0 = r10
            goto L_0x0175
        L_0x016f:
            r0 = 0
            goto L_0x0175
        L_0x0171:
            android.graphics.Bitmap r0 = com.xiaomi.push.service.af.a((android.content.Context) r1, (java.lang.String) r0)
        L_0x0175:
            if (r0 == 0) goto L_0x017c
            r6.setLargeIcon(r0)
            r10 = 1
            goto L_0x017d
        L_0x017c:
            r10 = 0
        L_0x017d:
            if (r5 != 0) goto L_0x0181
            r0 = 0
            goto L_0x018d
        L_0x0181:
            java.lang.String r0 = "notification_large_icon_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.Bitmap r0 = a((android.content.Context) r1, (java.lang.String) r0, (boolean) r9)
        L_0x018d:
            if (r0 == 0) goto L_0x0192
            r6.setLargeIcon(r0)
        L_0x0192:
            if (r5 == 0) goto L_0x01e5
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x01e5
            java.lang.String r0 = "notification_group"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r11 = "notification_is_summary"
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x01cf
            java.lang.String r0 = a((com.xiaomi.push.jg) r19)
            boolean r12 = com.xiaomi.push.m.c()
            if (r12 == 0) goto L_0x01cf
            int r12 = r3.c()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
        L_0x01cf:
            java.lang.String r12 = "setGroup"
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r8] = r0
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r12, (java.lang.Object[]) r13)
            java.lang.String r0 = "setGroupSummary"
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12[r8] = r11
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r12)
        L_0x01e5:
            r6.setAutoCancel(r9)
            long r11 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L_0x0201
            java.lang.String r0 = "ticker"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = "ticker"
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setTicker(r0)
        L_0x0201:
            long r13 = f82604a
            long r13 = r11 - r13
            r15 = 10000(0x2710, double:4.9407E-320)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0251
            f82604a = r11
            int r3 = r3.f601a
            boolean r11 = b((android.content.Context) r1, (java.lang.String) r4)
            if (r11 == 0) goto L_0x0219
            int r3 = a((android.content.Context) r1, (java.lang.String) r4)
        L_0x0219:
            r6.setDefaults(r3)
            if (r5 == 0) goto L_0x0253
            r11 = r3 & 1
            if (r11 == 0) goto L_0x0253
            java.lang.String r11 = "sound_uri"
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0253
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "android.resource://"
            r12.<init>(r13)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x0253
            r12 = r3 ^ 1
            r6.setDefaults(r12)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r6.setSound(r11)
            goto L_0x0254
        L_0x0251:
            r3 = -100
        L_0x0253:
            r11 = 0
        L_0x0254:
            r12 = 3
            if (r5 == 0) goto L_0x039b
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 26
            if (r14 < r15) goto L_0x039b
            int r14 = a((java.util.Map<java.lang.String, java.lang.String>) r5)
            if (r14 <= 0) goto L_0x0273
            java.lang.String r7 = "setTimeoutAfter"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r14 = r14 * 1000
            long r13 = (long) r14
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r0[r8] = r13
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r7, (java.lang.Object[]) r0)
        L_0x0273:
            java.lang.String r0 = "channel_id"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto L_0x0289
            android.content.pm.ApplicationInfo r7 = r18.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 < r15) goto L_0x0373
        L_0x0289:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto L_0x02a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "mipush_"
            r0.<init>(r7)
            r0.append(r4)
            java.lang.String r7 = "_default"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L_0x02bf
        L_0x02a3:
            boolean r7 = com.xiaomi.push.m.a()
            if (r7 == 0) goto L_0x02bf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r13 = "mipush_"
            r7.<init>(r13)
            r7.append(r4)
            java.lang.String r13 = "_"
            r7.append(r13)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x02bf:
            java.lang.String r7 = "setChannelId"
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r8] = r0
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r7, (java.lang.Object[]) r13)
            java.lang.String r7 = a((android.content.Context) r1, (java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r5)
            java.lang.String r13 = "notification"
            java.lang.Object r13 = r1.getSystemService(r13)
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13
            java.lang.String r14 = "getNotificationChannel"
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x036f }
            r15[r8] = r0     // Catch:{ Exception -> 0x036f }
            java.lang.Object r14 = com.xiaomi.push.au.a((java.lang.Object) r13, (java.lang.String) r14, (java.lang.Object[]) r15)     // Catch:{ Exception -> 0x036f }
            if (r14 != 0) goto L_0x0373
            a((android.app.NotificationManager) r13, (java.lang.String) r4)     // Catch:{ Exception -> 0x036f }
            java.lang.String r4 = "android.app.NotificationChannel"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x036f }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x036f }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r14[r8] = r15     // Catch:{ Exception -> 0x036f }
            java.lang.Class<java.lang.CharSequence> r15 = java.lang.CharSequence.class
            r14[r9] = r15     // Catch:{ Exception -> 0x036f }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x036f }
            r16 = 2
            r14[r16] = r15     // Catch:{ Exception -> 0x036f }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r14)     // Catch:{ Exception -> 0x036f }
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x036f }
            r14[r8] = r0     // Catch:{ Exception -> 0x036f }
            r14[r9] = r7     // Catch:{ Exception -> 0x036f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x036f }
            r7 = 2
            r14[r7] = r0     // Catch:{ Exception -> 0x036f }
            java.lang.Object r0 = r4.newInstance(r14)     // Catch:{ Exception -> 0x036f }
            r4 = -100
            if (r3 <= r4) goto L_0x0362
            r4 = 0
            r6.setSound(r4, r4)     // Catch:{ Exception -> 0x036f }
            r6.setDefaults(r8)     // Catch:{ Exception -> 0x036f }
            r7 = r3 & 1
            if (r7 == r9) goto L_0x0329
            java.lang.String r7 = "setSound"
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x036f }
            r15[r8] = r4     // Catch:{ Exception -> 0x036f }
            r15[r9] = r4     // Catch:{ Exception -> 0x036f }
            com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r7, (java.lang.Object[]) r15)     // Catch:{ Exception -> 0x036f }
        L_0x0329:
            if (r11 == 0) goto L_0x0339
            java.lang.String r4 = "setSound"
            r7 = 2
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x036f }
            r14[r8] = r11     // Catch:{ Exception -> 0x036f }
            android.media.AudioAttributes r7 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT     // Catch:{ Exception -> 0x036f }
            r14[r9] = r7     // Catch:{ Exception -> 0x036f }
            com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r4, (java.lang.Object[]) r14)     // Catch:{ Exception -> 0x036f }
        L_0x0339:
            r4 = r3 & 2
            r7 = 2
            if (r4 != r7) goto L_0x0340
            r4 = 1
            goto L_0x0341
        L_0x0340:
            r4 = 0
        L_0x0341:
            java.lang.String r7 = "enableVibration"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x036f }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x036f }
            r11[r8] = r4     // Catch:{ Exception -> 0x036f }
            com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r7, (java.lang.Object[]) r11)     // Catch:{ Exception -> 0x036f }
            r4 = 4
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0354
            r3 = 1
            goto L_0x0355
        L_0x0354:
            r3 = 0
        L_0x0355:
            java.lang.String r4 = "enableLights"
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x036f }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x036f }
            r7[r8] = r3     // Catch:{ Exception -> 0x036f }
            com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r4, (java.lang.Object[]) r7)     // Catch:{ Exception -> 0x036f }
        L_0x0362:
            a((java.lang.Object) r0, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ Exception -> 0x036f }
            java.lang.String r3 = "createNotificationChannel"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x036f }
            r4[r8] = r0     // Catch:{ Exception -> 0x036f }
            com.xiaomi.push.au.a((java.lang.Object) r13, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ Exception -> 0x036f }
            goto L_0x0373
        L_0x036f:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0373:
            java.lang.String r0 = "background_color"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x039b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0397 }
            r6.setOngoing(r9)     // Catch:{ Exception -> 0x0397 }
            r6.setColor(r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = "setColorized"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0397 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0397 }
            r3[r8] = r4     // Catch:{ Exception -> 0x0397 }
            com.xiaomi.push.au.a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r3)     // Catch:{ Exception -> 0x0397 }
            goto L_0x039b
        L_0x0397:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x039b:
            boolean r0 = com.xiaomi.push.m.c()
            if (r0 == 0) goto L_0x03c1
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r3 = r18.getPackageName()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x03c1
            java.lang.String r0 = "miui.util.NotificationHelper"
            java.lang.String r3 = "setTargetPkg"
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r8] = r1
            r4[r9] = r6
            java.lang.String r1 = a((com.xiaomi.push.jg) r19)
            r7 = 2
            r4[r7] = r1
            com.xiaomi.push.au.a((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r4)
        L_0x03c1:
            android.app.Notification r0 = r6.getNotification()
            if (r10 == 0) goto L_0x03d0
            boolean r1 = com.xiaomi.push.m.a()
            if (r1 == 0) goto L_0x03d0
            a((android.app.Notification) r0)
        L_0x03d0:
            if (r5 == 0) goto L_0x0428
            java.lang.String r1 = "extraNotification"
            java.lang.Object r1 = com.xiaomi.push.au.a((java.lang.Object) r0, (java.lang.String) r1)
            if (r1 == 0) goto L_0x0428
            java.lang.String r3 = "enable_keyguard"
            java.lang.Object r3 = r5.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0401
            java.lang.String r3 = "setEnableKeyguard"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r6 = "enable_keyguard"
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r8] = r6
            com.xiaomi.push.au.a((java.lang.Object) r1, (java.lang.String) r3, (java.lang.Object[]) r4)
        L_0x0401:
            java.lang.String r3 = "enable_float"
            java.lang.Object r3 = r5.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0428
            java.lang.String r3 = "setEnableFloat"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r6 = "enable_float"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r8] = r5
            com.xiaomi.push.au.a((java.lang.Object) r1, (java.lang.String) r3, (java.lang.Object[]) r4)
        L_0x0428:
            r2.f1020a = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(android.content.Context, com.xiaomi.push.jg, byte[], android.widget.RemoteViews, android.app.PendingIntent):com.xiaomi.push.service.z$b");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0150, code lost:
        if (r5 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0154, code lost:
        if (r5 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0158, code lost:
        if (r5 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015c, code lost:
        if (r5 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015e, code lost:
        com.xiaomi.push.fz.a(r19.getApplicationContext()).a(r20.b(), b(r20), r5.a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0175, code lost:
        com.xiaomi.channel.commonutils.logger.b.a(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.z.c m652a(android.content.Context r19, com.xiaomi.push.jg r20, byte[] r21) {
        /*
            r1 = r19
            r2 = r20
            r0 = r21
            com.xiaomi.push.service.z$c r3 = new com.xiaomi.push.service.z$c
            r3.<init>()
            java.lang.String r4 = a((com.xiaomi.push.jg) r20)
            com.xiaomi.push.g$a r4 = com.xiaomi.push.g.a((android.content.Context) r1, (java.lang.String) r4)
            com.xiaomi.push.g$a r5 = com.xiaomi.push.g.a.NOT_ALLOWED
            if (r4 != r5) goto L_0x0067
            com.xiaomi.push.ix r0 = r20.a()
            if (r0 == 0) goto L_0x004b
            android.content.Context r1 = r19.getApplicationContext()
            com.xiaomi.push.fz r1 = com.xiaomi.push.fz.a((android.content.Context) r1)
            java.lang.String r4 = r20.b()
            java.lang.String r5 = b((com.xiaomi.push.jg) r20)
            java.lang.String r0 = r0.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Do not notify because user block "
            r6.<init>(r7)
            java.lang.String r7 = a((com.xiaomi.push.jg) r20)
            r6.append(r7)
            java.lang.String r7 = "‘s notification"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r0, (java.lang.String) r6)
        L_0x004b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Do not notify because user block "
            r0.<init>(r1)
            java.lang.String r1 = a((com.xiaomi.push.jg) r20)
            r0.append(r1)
            java.lang.String r1 = "‘s notification"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0062:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            goto L_0x0353
        L_0x0067:
            boolean r4 = com.xiaomi.push.service.bh.a((android.content.Context) r19, (com.xiaomi.push.jg) r20)
            if (r4 == 0) goto L_0x00b5
            java.lang.String r0 = com.xiaomi.push.service.bh.a(r20)
            com.xiaomi.push.ix r4 = r20.a()
            if (r4 == 0) goto L_0x00a1
            android.content.Context r1 = r19.getApplicationContext()
            com.xiaomi.push.fz r1 = com.xiaomi.push.fz.a((android.content.Context) r1)
            java.lang.String r5 = r20.b()
            java.lang.String r2 = b((com.xiaomi.push.jg) r20)
            java.lang.String r4 = r4.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Do not notify because user block "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = "‘s notification"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.a((java.lang.String) r5, (java.lang.String) r2, (java.lang.String) r4, (java.lang.String) r6)
        L_0x00a1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Do not notify because user block "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "‘s notification"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0062
        L_0x00b5:
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r1.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            com.xiaomi.push.ix r5 = r20.a()
            android.widget.RemoteViews r6 = a((android.content.Context) r19, (com.xiaomi.push.jg) r20, (byte[]) r21)
            android.app.PendingIntent r7 = a((android.content.Context) r1, (com.xiaomi.push.jg) r2, (com.xiaomi.push.ix) r5, (byte[]) r0)
            if (r7 != 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00e6
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            java.lang.String r1 = r20.b()
            java.lang.String r2 = b((com.xiaomi.push.jg) r20)
            java.lang.String r4 = r5.a()
            java.lang.String r5 = "The click PendingIntent is null. "
            r0.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r4, (java.lang.String) r5)
        L_0x00e6:
            java.lang.String r0 = "The click PendingIntent is null. "
            goto L_0x0062
        L_0x00ea:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            r10 = 0
            if (r8 < r9) goto L_0x0104
            com.xiaomi.push.service.z$b r0 = a(r1, r2, r0, r6, r7)
            long r6 = r0.f82606a
            r3.f82607a = r6
            java.lang.String r6 = a((com.xiaomi.push.jg) r20)
            r3.f1021a = r6
            android.app.Notification r0 = r0.f1020a
            r8 = r0
            goto L_0x01f5
        L_0x0104:
            android.app.Notification r8 = new android.app.Notification
            java.lang.String r0 = a((com.xiaomi.push.jg) r20)
            int r0 = b((android.content.Context) r1, (java.lang.String) r0)
            long r11 = java.lang.System.currentTimeMillis()
            r8.<init>(r0, r10, r11)
            java.lang.String[] r0 = a((android.content.Context) r1, (com.xiaomi.push.ix) r5)
            r9 = 1
            java.lang.Class r11 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.String r12 = "setLatestEventInfo"
            r13 = 4
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r16 = 0
            r14[r16] = r15     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.Class<java.lang.CharSequence> r15 = java.lang.CharSequence.class
            r14[r9] = r15     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.Class<java.lang.CharSequence> r15 = java.lang.CharSequence.class
            r17 = 2
            r14[r17] = r15     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.Class<android.app.PendingIntent> r15 = android.app.PendingIntent.class
            r18 = 3
            r14[r18] = r15     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r14)     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r12[r16] = r1     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r13 = r0[r16]     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r12[r9] = r13     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r0 = r0[r9]     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r12[r17] = r0     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r12[r18] = r7     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            r11.invoke(r8, r12)     // Catch:{ NoSuchMethodException -> 0x015b, IllegalAccessException -> 0x0157, IllegalArgumentException -> 0x0153, InvocationTargetException -> 0x014f }
            goto L_0x0178
        L_0x014f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0175
            goto L_0x015e
        L_0x0153:
            r0 = move-exception
            if (r5 == 0) goto L_0x0175
            goto L_0x015e
        L_0x0157:
            r0 = move-exception
            if (r5 == 0) goto L_0x0175
            goto L_0x015e
        L_0x015b:
            r0 = move-exception
            if (r5 == 0) goto L_0x0175
        L_0x015e:
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.fz r7 = com.xiaomi.push.fz.a((android.content.Context) r7)
            java.lang.String r11 = r20.b()
            java.lang.String r12 = b((com.xiaomi.push.jg) r20)
            java.lang.String r13 = r5.a()
            r7.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.Throwable) r0)
        L_0x0175:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0178:
            java.util.Map r0 = r5.a()
            if (r0 == 0) goto L_0x0190
            java.lang.String r7 = "ticker"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x0190
            java.lang.String r7 = "ticker"
            java.lang.Object r7 = r0.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.tickerText = r7
        L_0x0190:
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = f82604a
            long r13 = r11 - r13
            r15 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x01eb
            f82604a = r11
            int r7 = r5.f601a
            java.lang.String r11 = a((com.xiaomi.push.jg) r20)
            boolean r11 = b((android.content.Context) r1, (java.lang.String) r11)
            if (r11 == 0) goto L_0x01b4
            java.lang.String r7 = a((com.xiaomi.push.jg) r20)
            int r7 = a((android.content.Context) r1, (java.lang.String) r7)
        L_0x01b4:
            r8.defaults = r7
            if (r0 == 0) goto L_0x01eb
            r11 = r7 & 1
            if (r11 == 0) goto L_0x01eb
            java.lang.String r11 = "sound_uri"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x01eb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "android.resource://"
            r11.<init>(r12)
            java.lang.String r12 = a((com.xiaomi.push.jg) r20)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L_0x01eb
            r7 = r7 ^ r9
            r8.defaults = r7
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r8.sound = r0
        L_0x01eb:
            int r0 = r8.flags
            r0 = r0 | 16
            r8.flags = r0
            if (r6 == 0) goto L_0x01f5
            r8.contentView = r6
        L_0x01f5:
            boolean r0 = com.xiaomi.push.m.a()
            if (r0 == 0) goto L_0x0254
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 19
            if (r0 < r6) goto L_0x0254
            java.lang.String r0 = r5.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0216
            android.os.Bundle r0 = r8.extras
            java.lang.String r6 = "message_id"
            java.lang.String r7 = r5.a()
            r0.putString(r6, r7)
        L_0x0216:
            java.util.Map r0 = r5.b()
            if (r0 != 0) goto L_0x021e
            r0 = r10
            goto L_0x022a
        L_0x021e:
            java.util.Map r0 = r5.b()
            java.lang.String r6 = "score_info"
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
        L_0x022a:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x0237
            android.os.Bundle r6 = r8.extras
            java.lang.String r7 = "score_info"
            r6.putString(r7, r0)
        L_0x0237:
            r0 = -1
            boolean r6 = c(r20)
            if (r6 == 0) goto L_0x0241
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0249
        L_0x0241:
            boolean r6 = a((com.xiaomi.push.jg) r20)
            if (r6 == 0) goto L_0x0249
            r0 = 3000(0xbb8, float:4.204E-42)
        L_0x0249:
            android.os.Bundle r6 = r8.extras
            java.lang.String r7 = "eventMessageType"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.putString(r7, r0)
        L_0x0254:
            java.util.Map r0 = r5.a()
            if (r0 != 0) goto L_0x025b
            goto L_0x0268
        L_0x025b:
            java.util.Map r0 = r5.a()
            java.lang.String r6 = "message_count"
            java.lang.Object r0 = r0.get(r6)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0268:
            boolean r0 = com.xiaomi.push.m.a()
            if (r0 == 0) goto L_0x0295
            if (r10 == 0) goto L_0x0295
            int r0 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0278 }
            a((android.app.Notification) r8, (int) r0)     // Catch:{ NumberFormatException -> 0x0278 }
            goto L_0x0295
        L_0x0278:
            r0 = move-exception
            if (r5 == 0) goto L_0x0292
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.fz r6 = com.xiaomi.push.fz.a((android.content.Context) r6)
            java.lang.String r7 = r20.b()
            java.lang.String r9 = b((com.xiaomi.push.jg) r20)
            java.lang.String r10 = r5.a()
            r6.a((java.lang.String) r7, (java.lang.String) r9, (java.lang.String) r10, (java.lang.Throwable) r0)
        L_0x0292:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0295:
            boolean r0 = com.xiaomi.push.m.c()
            if (r0 != 0) goto L_0x02ae
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r6 = r19.getPackageName()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = a((com.xiaomi.push.jg) r20)
            a((android.app.Notification) r8, (java.lang.String) r0)
        L_0x02ae:
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r6 = a((com.xiaomi.push.jg) r20)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x02bd
            com.xiaomi.push.service.bh.a(r1, r2, r8)
        L_0x02bd:
            int r0 = r5.c()
            java.lang.String r6 = a((com.xiaomi.push.jg) r20)
            int r6 = r6.hashCode()
            int r6 = r6 / 10
            int r6 = r6 * 10
            int r6 = r6 + r0
            r4.notify(r6, r8)
            boolean r0 = a((com.xiaomi.push.jg) r20)
            if (r0 == 0) goto L_0x02f2
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fz r7 = com.xiaomi.push.fz.a((android.content.Context) r0)
            java.lang.String r8 = r20.b()
            java.lang.String r9 = b((com.xiaomi.push.jg) r20)
            java.lang.String r10 = r5.a()
            r11 = 3002(0xbba, float:4.207E-42)
            java.lang.String r12 = "try show business message"
            r7.a(r8, r9, r10, r11, r12)
        L_0x02f2:
            boolean r0 = c(r20)
            if (r0 == 0) goto L_0x0313
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fz r7 = com.xiaomi.push.fz.a((android.content.Context) r0)
            java.lang.String r8 = r20.b()
            java.lang.String r9 = b((com.xiaomi.push.jg) r20)
            java.lang.String r10 = r5.a()
            r11 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r12 = "try show notification message"
            r7.a(r8, r9, r10, r11, r12)
        L_0x0313:
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r0 >= r7) goto L_0x0332
            com.xiaomi.push.aj r0 = com.xiaomi.push.aj.a((android.content.Context) r19)
            r0.a((int) r6)
            java.util.Map r1 = r5.a()
            int r1 = a((java.util.Map<java.lang.String, java.lang.String>) r1)
            if (r1 <= 0) goto L_0x0332
            com.xiaomi.push.service.aa r5 = new com.xiaomi.push.service.aa
            r5.<init>(r6, r4)
            r0.b(r5, r1)
        L_0x0332:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.<init>(r1, r2)
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.jg>> r1 = f1016a
            monitor-enter(r1)
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.jg>> r2 = f1016a     // Catch:{ all -> 0x0354 }
            r2.add(r0)     // Catch:{ all -> 0x0354 }
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.jg>> r0 = f1016a     // Catch:{ all -> 0x0354 }
            int r0 = r0.size()     // Catch:{ all -> 0x0354 }
            r2 = 100
            if (r0 <= r2) goto L_0x0352
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.jg>> r0 = f1016a     // Catch:{ all -> 0x0354 }
            r0.remove()     // Catch:{ all -> 0x0354 }
        L_0x0352:
            monitor-exit(r1)     // Catch:{ all -> 0x0354 }
        L_0x0353:
            return r3
        L_0x0354:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0354 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.m652a(android.content.Context, com.xiaomi.push.jg, byte[]):com.xiaomi.push.service.z$c");
    }

    private static String a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? g.c(context, str) : map.get("channel_name");
    }

    static String a(jg jgVar) {
        if ("com.xiaomi.xmsf".equals(jgVar.f698b)) {
            ix a2 = jgVar.a();
            if (!(a2 == null || a2.a() == null)) {
                String str = (String) a2.a().get("miui_package_name");
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return jgVar.f698b;
    }

    private static void a(Notification notification, int i) {
        Object a2 = au.a((Object) notification, "extraNotification");
        if (a2 != null) {
            au.a(a2, "setMessageCount", Integer.valueOf(i));
        }
    }

    private static void a(NotificationManager notificationManager, String str) {
        au.a((Object) notificationManager, "deleteNotificationChannel", "mipush_" + str + "_-100");
        for (int i = 0; i < 8; i++) {
            au.a((Object) notificationManager, "deleteNotificationChannel", "mipush_" + str + "_" + String.valueOf(i));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m653a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int hashCode = ((str.hashCode() / 10) * 10) + i;
        LinkedList linkedList = new LinkedList();
        if (i >= 0) {
            notificationManager.cancel(hashCode);
        }
        synchronized (f1016a) {
            Iterator it2 = f1016a.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                jg jgVar = (jg) pair.second;
                if (jgVar != null) {
                    String a2 = a(jgVar);
                    if (i >= 0) {
                        if (hashCode == ((Integer) pair.first).intValue()) {
                            if (!TextUtils.equals(a2, str)) {
                            }
                        }
                    } else if (i == -1 && TextUtils.equals(a2, str)) {
                        notificationManager.cancel(((Integer) pair.first).intValue());
                    }
                    linkedList.add(pair);
                }
            }
            if (f1016a != null) {
                f1016a.removeAll(linkedList);
                a(context, linkedList);
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            LinkedList linkedList = new LinkedList();
            synchronized (f1016a) {
                Iterator it2 = f1016a.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    jg jgVar = (jg) pair.second;
                    if (jgVar != null) {
                        String a2 = a(jgVar);
                        ix a3 = jgVar.a();
                        if (a3 != null && TextUtils.equals(a2, str)) {
                            String c2 = a3.c();
                            String d2 = a3.d();
                            if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(d2) && a(str2, c2) && a(str3, d2)) {
                                notificationManager.cancel(((Integer) pair.first).intValue());
                                linkedList.add(pair);
                            }
                        }
                    }
                }
                if (f1016a != null) {
                    f1016a.removeAll(linkedList);
                    a(context, linkedList);
                }
            }
        }
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList != null && linkedList.size() > 0) {
            be.a(context, "category_clear_notification", "clear_notification", (long) linkedList.size(), "");
        }
    }

    private static void a(Object obj, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_description"))) {
            au.a(obj, "setDescription", map.get("channel_description"));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m654a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && Arrays.asList(next.pkgList).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        String a2 = ixVar.a();
        return !TextUtils.isEmpty(a2) && a2.length() == 22 && "satuigm".indexOf(a2.charAt(0)) >= 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m655a(jg jgVar) {
        ix a2 = jgVar.a();
        return a(a2) && a2.l();
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m656a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(map.get("notify_foreground"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] a(android.content.Context r3, com.xiaomi.push.ix r4) {
        /*
            java.lang.String r0 = r4.c()
            java.lang.String r1 = r4.d()
            java.util.Map r4 = r4.a()
            if (r4 == 0) goto L_0x0073
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L_0x0051
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0042
            r0 = r3
        L_0x0042:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0073
            goto L_0x0072
        L_0x0051:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L_0x0073
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0064
            r0 = r3
        L_0x0064:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(android.content.Context, com.xiaomi.push.ix):java.lang.String[]");
    }

    private static int b(Context context, String str) {
        int a2 = a(context, str, "mipush_notification");
        int a3 = a(context, str, "mipush_small_notification");
        if (a2 <= 0) {
            a2 = a3 > 0 ? a3 : context.getApplicationInfo().icon;
        }
        return (a2 != 0 || Build.VERSION.SDK_INT < 9) ? a2 : context.getApplicationInfo().logo;
    }

    public static String b(jg jgVar) {
        return a(jgVar) ? "E100002" : c(jgVar) ? "E100000" : b(jgVar) ? "E100001" : d(jgVar) ? "E100003" : "";
    }

    /* renamed from: b  reason: collision with other method in class */
    static void m657b(Context context, String str) {
        com.ss.android.ugc.aweme.q.c.a(context, "pref_notify_type", 0).edit().remove(str).commit();
    }

    static void b(Context context, String str, int i) {
        com.ss.android.ugc.aweme.q.c.a(context, "pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* renamed from: b  reason: collision with other method in class */
    static boolean m658b(Context context, String str) {
        return com.ss.android.ugc.aweme.q.c.a(context, "pref_notify_type", 0).contains(str);
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m659b(jg jgVar) {
        ix a2 = jgVar.a();
        return a(a2) && a2.f607b == 1 && !a(jgVar);
    }

    public static boolean c(jg jgVar) {
        ix a2 = jgVar.a();
        return a(a2) && a2.f607b == 0 && !a(jgVar);
    }

    public static boolean d(jg jgVar) {
        return jgVar.a() == ik.Registration;
    }

    public static boolean e(jg jgVar) {
        return a(jgVar) || c(jgVar) || b(jgVar);
    }
}
