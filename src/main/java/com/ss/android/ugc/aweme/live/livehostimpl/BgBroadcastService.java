package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.common.utility.reflect.JavaCalls;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.C0907R$drawable;

@Keep
public class BgBroadcastService extends Service {
    public static ChangeQuickRedirect changeQuickRedirect;
    private NotificationManager mNotificationManager;
    private a mService;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55703, new Class[0], Void.TYPE);
            return;
        }
        stopForeground(true);
        super.onDestroy();
        this.mService.onDestroy();
        this.mService.unBindService(this);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55702, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
        startForeground(C0906R.id.brt, buildNotification(this));
        this.mService = (a) JavaCalls.newInstance("com.bytedance.android.livesdk.bgbroadcast.BgBroadcastServiceImpl", new Object[0]);
        this.mService.bindService(this);
        this.mService.onCreate();
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return this.mService;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = configuration;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, changeQuickRedirect, false, 55704, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration2}, this, changeQuickRedirect, false, 55704, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        this.mService.onConfigurationChanged(configuration2);
    }

    private Notification buildNotification(Context context) {
        NotificationCompat.Builder builder;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55705, new Class[]{Context.class}, Notification.class)) {
            return (Notification) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55705, new Class[]{Context.class}, Notification.class);
        }
        if (Build.VERSION.SDK_INT >= 26 && this.mNotificationManager.getNotificationChannel("BgBroadcastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("BgBroadcastService.notification", getString(C0906R.string.b6j), 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(), 134217728);
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new NotificationCompat.Builder(context, "BgBroadcastService.notification");
        } else {
            builder = new NotificationCompat.Builder(context);
        }
        builder.setContentTitle(getString(C0906R.string.b6m)).setSmallIcon(C0907R$drawable.icon).setOngoing(true).setWhen(System.currentTimeMillis()).setContentIntent(activity).setCategory("service").setOnlyAlertOnce(true).setAutoCancel(true).setOngoing(true);
        if (Build.VERSION.SDK_INT >= 21) {
            builder.setVisibility(1);
        }
        return builder.build();
    }
}
