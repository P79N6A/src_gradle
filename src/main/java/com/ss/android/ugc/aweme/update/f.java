package com.ss.android.ugc.aweme.update;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75215a;

    public static Notification a(Context context, NotificationCompat.Builder builder, String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, builder, str3, str4, Integer.valueOf(i)}, null, f75215a, true, 87366, new Class[]{Context.class, NotificationCompat.Builder.class, String.class, String.class, Integer.TYPE}, Notification.class)) {
            Object[] objArr = {context, builder, str3, str4, Integer.valueOf(i)};
            return (Notification) PatchProxy.accessDispatch(objArr, null, f75215a, true, 87366, new Class[]{Context.class, NotificationCompat.Builder.class, String.class, String.class, Integer.TYPE}, Notification.class);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            builder.setContentTitle(str).setContentInfo(str4).setProgress(100, i2, false);
        }
        Notification build = builder.build();
        if (Build.VERSION.SDK_INT < 14) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0906R.layout.adi);
            remoteViews.setProgressBar(C0906R.id.c7k, 100, i2, false);
            remoteViews.setTextViewText(C0906R.id.c80, str4);
            remoteViews.setTextViewText(C0906R.id.title, str3);
            build.contentView = remoteViews;
        }
        return build;
    }

    public static Notification a(Context context, NotificationCompat.Builder builder, int i, Bitmap bitmap, String str, String str2, String str3, int i2, PendingIntent pendingIntent) {
        Context context2 = context;
        NotificationCompat.Builder builder2 = builder;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        PendingIntent pendingIntent2 = pendingIntent;
        if (PatchProxy.isSupport(new Object[]{context2, builder2, 17301633, null, str4, str5, str6, Integer.valueOf(i2), pendingIntent2}, null, f75215a, true, 87365, new Class[]{Context.class, NotificationCompat.Builder.class, Integer.TYPE, Bitmap.class, String.class, String.class, String.class, Integer.TYPE, PendingIntent.class}, Notification.class)) {
            return (Notification) PatchProxy.accessDispatch(new Object[]{context2, builder2, 17301633, null, str4, str5, str6, Integer.valueOf(i2), pendingIntent2}, null, f75215a, true, 87365, new Class[]{Context.class, NotificationCompat.Builder.class, Integer.TYPE, Bitmap.class, String.class, String.class, String.class, Integer.TYPE, PendingIntent.class}, Notification.class);
        }
        builder2.setSmallIcon(17301633).setTicker(str4).setWhen(System.currentTimeMillis()).setOngoing(true).setContentIntent(pendingIntent2);
        return a(context2, builder2, str5, str6, i2);
    }
}
