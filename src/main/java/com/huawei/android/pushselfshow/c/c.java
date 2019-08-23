package com.huawei.android.pushselfshow.c;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.b.a;
import com.huawei.android.pushselfshow.utils.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.security.SecureRandom;
import java.util.Date;

public class c {

    /* renamed from: com.huawei.android.pushselfshow.c.c$1  reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25216a = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.huawei.android.pushselfshow.c.a[] r0 = com.huawei.android.pushselfshow.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25216a = r0
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_1     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_2     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_3     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_4     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_5     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_6     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_7     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f25216a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.huawei.android.pushselfshow.c.a r1 = com.huawei.android.pushselfshow.c.a.STYLE_8     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.c.c.AnonymousClass1.<clinit>():void");
        }
    }

    public static Notification.Builder a(Context context, Notification.Builder builder, int i, a aVar, Bitmap bitmap) {
        RemoteViews remoteViews;
        e.a("PushSelfShowLog", "Notification addStyle");
        if (!(context == null || builder == null || aVar == null)) {
            a aVar2 = a.STYLE_1;
            if (aVar.L >= 0 && aVar.L < a.values().length) {
                aVar2 = a.values()[aVar.L];
            }
            switch (AnonymousClass1.f25216a[aVar2.ordinal()]) {
                case 2:
                    remoteViews = a(context, i, bitmap, aVar);
                    break;
                case 4:
                    remoteViews = b(context, i, bitmap, aVar);
                    break;
                case 5:
                    a(context, builder, i, bitmap, aVar);
                    break;
                case 6:
                    if (!b(context, builder, i, bitmap, aVar)) {
                        return null;
                    }
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    remoteViews = c(context, i, bitmap, aVar);
                    break;
                case 8:
                    remoteViews = a(context, bitmap, aVar);
                    if (remoteViews == null) {
                        return null;
                    }
                    break;
            }
            builder.setContent(remoteViews);
        }
        return builder;
    }

    public static Notification a(Context context, Notification notification, int i, a aVar, Bitmap bitmap) {
        RemoteViews remoteViews;
        if (!(notification == null || aVar == null)) {
            a aVar2 = a.STYLE_1;
            if (aVar.L >= 0 && aVar.L < a.values().length) {
                aVar2 = a.values()[aVar.L];
            }
            switch (AnonymousClass1.f25216a[aVar2.ordinal()]) {
                case 2:
                    remoteViews = a(context, i, bitmap, aVar);
                    break;
                case 4:
                    remoteViews = b(context, i, bitmap, aVar);
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    remoteViews = c(context, i, bitmap, aVar);
                    break;
                case 8:
                    remoteViews = a(context, bitmap, aVar);
                    if (remoteViews == null) {
                        return null;
                    }
                    break;
            }
            notification.contentView = remoteViews;
        }
        return notification;
    }

    private static PendingIntent a(Context context, int i, String str) {
        Intent flags = new Intent("com.huawei.android.push.intent.CLICK").setPackage(context.getPackageName()).setFlags(32);
        flags.putExtra("notifyId", i);
        flags.putExtra("clickBtn", str);
        int hashCode = (context.getPackageName() + str + new SecureRandom().nextInt() + new Date().toString()).hashCode();
        StringBuilder sb = new StringBuilder("getPendingIntent,requestCode:");
        sb.append(hashCode);
        e.a("PushSelfShowLog", sb.toString());
        return PendingIntent.getBroadcast(context, hashCode, flags, 134217728);
    }

    private static RemoteViews a(Context context, int i, Bitmap bitmap, a aVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d.c(context, "hwpush_layout2"));
        a(context, bitmap, remoteViews);
        a(context, i, remoteViews, aVar);
        remoteViews.setTextViewText(d.e(context, PushConstants.TITLE), a(context, aVar));
        remoteViews.setTextViewText(d.e(context, "text"), aVar.q);
        return remoteViews;
    }

    private static RemoteViews a(Context context, Bitmap bitmap, a aVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d.a(context, "layout", "hwpush_layout8"));
        Bitmap a2 = !TextUtils.isEmpty(aVar.T) ? new com.huawei.android.pushselfshow.utils.c.a().a(context, aVar.T) : null;
        if (a2 == null) {
            return null;
        }
        remoteViews.setViewVisibility(d.a(context, "id", "big_pic"), 0);
        remoteViews.setImageViewBitmap(d.a(context, "id", "big_pic"), a2);
        return remoteViews;
    }

    private static String a(Context context, a aVar) {
        if (context == null || aVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(aVar.s)) {
            return aVar.s;
        }
        return context.getResources().getString(context.getApplicationInfo().labelRes);
    }

    private static void a(Context context, int i, RemoteViews remoteViews, a aVar) {
        if (context == null || remoteViews == null || aVar == null) {
            e.c("PushSelfShowLog", "showRightBtn error");
            return;
        }
        if ((a.STYLE_2.ordinal() == aVar.L || a.STYLE_3.ordinal() == aVar.L || a.STYLE_4.ordinal() == aVar.L) && !TextUtils.isEmpty(aVar.N[0]) && !TextUtils.isEmpty(aVar.P[0])) {
            int a2 = d.a(context, "id", "right_btn");
            remoteViews.setViewVisibility(a2, 0);
            remoteViews.setTextViewText(a2, aVar.N[0]);
            remoteViews.setOnClickPendingIntent(a2, a(context, i, aVar.P[0]));
        }
    }

    private static void a(Context context, Notification.Builder builder, int i, Bitmap bitmap, a aVar) {
        if (aVar == null || aVar.q == null) {
            e.b("PushSelfShowLog", "msg is null");
            return;
        }
        if (!TextUtils.isEmpty(aVar.q) && aVar.q.contains("##")) {
            builder.setTicker(aVar.q.replace("##", "，"));
            if (!com.huawei.android.pushselfshow.utils.a.c()) {
                builder.setContentText(aVar.q.replace("##", "，"));
                return;
            }
            builder.setLargeIcon(bitmap);
            builder.setContentTitle(a(context, aVar));
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
            String[] split = aVar.q.split("##");
            int length = split.length;
            if (length > 4) {
                length = 4;
            }
            if (!TextUtils.isEmpty(aVar.S)) {
                inboxStyle.setBigContentTitle(aVar.S);
                builder.setContentText(aVar.S);
                if (4 == length) {
                    length--;
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                inboxStyle.addLine(split[i2]);
            }
            if (aVar.N != null && aVar.N.length > 0) {
                for (int i3 = 0; i3 < aVar.N.length; i3++) {
                    if (!TextUtils.isEmpty(aVar.N[i3]) && !TextUtils.isEmpty(aVar.P[i3])) {
                        builder.addAction(0, aVar.N[i3], a(context, i, aVar.P[i3]));
                    }
                }
            }
            builder.setStyle(inboxStyle);
        }
    }

    private static void a(Context context, Bitmap bitmap, RemoteViews remoteViews) {
        if (context != null && remoteViews != null && com.huawei.android.pushselfshow.utils.a.b()) {
            if (bitmap == null) {
                int i = context.getApplicationInfo().icon;
                if (i == 0) {
                    i = context.getResources().getIdentifier("btn_star_big_on", "drawable", "android");
                    if (i == 0) {
                        i = 17301651;
                    }
                }
                remoteViews.setImageViewResource(d.a(context, "id", "icon"), i);
                return;
            }
            remoteViews.setImageViewBitmap(d.a(context, "id", "icon"), bitmap);
        }
    }

    private static RemoteViews b(Context context, int i, Bitmap bitmap, a aVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d.c(context, "hwpush_layout4"));
        a(context, bitmap, remoteViews);
        a(context, i, remoteViews, aVar);
        remoteViews.setTextViewText(d.e(context, PushConstants.TITLE), a(context, aVar));
        if (aVar.R != null && aVar.R.length > 0) {
            com.huawei.android.pushselfshow.utils.c.a aVar2 = new com.huawei.android.pushselfshow.utils.c.a();
            remoteViews.removeAllViews(d.e(context, "linear_icons"));
            Bitmap bitmap2 = null;
            for (int i2 = 0; i2 < aVar.R.length; i2++) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), d.a(context, "layout", "hwpush_icons_layout"));
                if (!TextUtils.isEmpty(aVar.R[i2])) {
                    bitmap2 = aVar2.a(context, aVar.R[i2]);
                }
                if (bitmap2 != null) {
                    e.a("PushSelfShowLog", "rescale bitmap success");
                    remoteViews2.setImageViewBitmap(d.a(context, "id", "smallicon"), bitmap2);
                    remoteViews.addView(d.a(context, "id", "linear_icons"), remoteViews2);
                }
            }
        }
        return remoteViews;
    }

    private static boolean b(Context context, Notification.Builder builder, int i, Bitmap bitmap, a aVar) {
        builder.setContentTitle(a(context, aVar));
        builder.setContentText(aVar.q);
        builder.setLargeIcon(bitmap);
        if (!com.huawei.android.pushselfshow.utils.a.c()) {
            return true;
        }
        com.huawei.android.pushselfshow.utils.c.a aVar2 = new com.huawei.android.pushselfshow.utils.c.a();
        Bitmap bitmap2 = null;
        if (!TextUtils.isEmpty(aVar.T)) {
            bitmap2 = aVar2.a(context, aVar.T);
        }
        if (bitmap2 == null) {
            return false;
        }
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
        bigPictureStyle.bigPicture(bitmap2);
        for (int i2 = 0; i2 < aVar.N.length; i2++) {
            if (!TextUtils.isEmpty(aVar.N[i2]) && !TextUtils.isEmpty(aVar.P[i2])) {
                builder.addAction(0, aVar.N[i2], a(context, i, aVar.P[i2]));
            }
        }
        builder.setStyle(bigPictureStyle);
        return true;
    }

    private static RemoteViews c(Context context, int i, Bitmap bitmap, a aVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d.a(context, "layout", "hwpush_layout7"));
        a(context, bitmap, remoteViews);
        remoteViews.setTextViewText(d.a(context, "id", PushConstants.TITLE), a(context, aVar));
        remoteViews.setTextViewText(d.a(context, "id", "text"), aVar.q);
        if (aVar.O != null && aVar.O.length > 0 && aVar.P != null && aVar.P.length > 0 && aVar.O.length == aVar.P.length) {
            com.huawei.android.pushselfshow.utils.c.a aVar2 = new com.huawei.android.pushselfshow.utils.c.a();
            remoteViews.removeAllViews(d.a(context, "id", "linear_buttons"));
            for (int i2 = 0; i2 < aVar.O.length; i2++) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), d.a(context, "layout", "hwpush_buttons_layout"));
                Bitmap bitmap2 = null;
                if (!TextUtils.isEmpty(aVar.O[i2])) {
                    bitmap2 = aVar2.a(context, aVar.O[i2]);
                }
                if (bitmap2 != null && !TextUtils.isEmpty(aVar.P[i2])) {
                    int a2 = d.a(context, "id", "small_btn");
                    remoteViews2.setImageViewBitmap(a2, bitmap2);
                    remoteViews2.setOnClickPendingIntent(a2, a(context, i, aVar.P[i2]));
                    remoteViews.addView(d.a(context, "id", "linear_buttons"), remoteViews2);
                }
            }
        }
        return remoteViews;
    }
}
