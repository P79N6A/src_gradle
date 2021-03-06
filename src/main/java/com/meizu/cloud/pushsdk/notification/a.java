package com.meizu.cloud.pushsdk.notification;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c.b;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import org.json.JSONObject;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected Context f27227a;

    /* renamed from: b  reason: collision with root package name */
    protected PushNotificationBuilder f27228b;

    /* renamed from: c  reason: collision with root package name */
    protected Handler f27229c;

    /* renamed from: d  reason: collision with root package name */
    private NotificationManager f27230d;

    protected a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        this.f27228b = pushNotificationBuilder;
        this.f27227a = context;
        this.f27229c = new Handler(context.getMainLooper());
        this.f27230d = (NotificationManager) context.getSystemService("notification");
    }

    private void a(Notification.Builder builder) {
        if (MinSdkChecker.isSupportNotificationChannel()) {
            DebugLogger.e("AbstractPushNotification", "support notification channel on non meizu device");
            NotificationChannel notificationChannel = new NotificationChannel("mz_push_notification_channel", "MEIZUPUSH", 3);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16711936);
            notificationChannel.setShowBadge(true);
            this.f27230d.createNotificationChannel(notificationChannel);
            builder.setChannelId("mz_push_notification_channel");
        }
    }

    @TargetApi(23)
    private Icon b(String str) {
        try {
            int identifier = this.f27227a.getPackageManager().getResourcesForApplication(str).getIdentifier(PushConstants.MZ_PUSH_NOTIFICATION_SMALL_ICON, "drawable", str);
            if (identifier == 0) {
                return null;
            }
            DebugLogger.i("AbstractPushNotification", "get " + str + " smallIcon success resId " + identifier);
            return Icon.createWithResource(str, identifier);
        } catch (Exception e2) {
            DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package " + str + " Error message " + e2.getMessage());
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    private void c(Notification notification, MessageV3 messageV3) {
        b.a(notification, true);
        b.a(notification, c(messageV3));
        notification.extras.putString(PushConstants.EXTRA_ORIGINAL_NOTIFICATION_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        notification.extras.putString(PushConstants.EXTRA_FLYME_GREEN_NOTIFICATION_SETTING, d(messageV3));
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    public Notification a(MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Notification.Builder builder = new Notification.Builder(this.f27227a);
        a(builder, messageV3, pendingIntent, pendingIntent2);
        c(builder, messageV3);
        b(builder, messageV3);
        a(builder, messageV3);
        a(builder);
        Notification build = MinSdkChecker.isSupportNotificationBuild() ? builder.build() : builder.getNotification();
        c(build, messageV3);
        a(build, messageV3);
        b(build, messageV3);
        return build;
    }

    /* access modifiers changed from: protected */
    public PendingIntent a(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
        intent.setClassName(messageV3.getUploadDataPackageName(), MzSystemUtils.findReceiver(this.f27227a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getUploadDataPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setFlags(32);
        return PendingIntent.getBroadcast(this.f27227a, 0, intent, 1073741824);
    }

    public Bitmap a(Context context, String str) {
        try {
            return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(str)).getBitmap();
        } catch (PackageManager.NameNotFoundException e2) {
            DebugLogger.i("AbstractPushNotification", "getappicon error " + e2.getMessage());
            return ((BitmapDrawable) context.getApplicationInfo().loadIcon(context.getPackageManager())).getBitmap();
        }
    }

    public Bitmap a(String str) {
        c b2 = com.meizu.cloud.pushsdk.b.a.a(str).a().b();
        if (!b2.b() || b2.a() == null) {
            DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon " + str + "image fail");
            return null;
        }
        StringBuilder sb = new StringBuilder("ANRequest On other Thread down load largeIcon ");
        sb.append(str);
        sb.append("image ");
        sb.append(b2.a() != null ? "success" : "fail");
        DebugLogger.i("AbstractPushNotification", sb.toString());
        return (Bitmap) b2.a();
    }

    /* access modifiers changed from: protected */
    public void a(Notification.Builder builder, MessageV3 messageV3) {
    }

    /* access modifiers changed from: protected */
    public void a(Notification.Builder builder, MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        int i;
        builder.setContentTitle(messageV3.getTitle());
        builder.setContentText(messageV3.getContent());
        builder.setTicker(messageV3.getTitle());
        builder.setAutoCancel(true);
        if (MinSdkChecker.isSupportSendNotification()) {
            builder.setVisibility(1);
        }
        if (MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            Icon b2 = b(messageV3.getUploadDataPackageName());
            if (b2 != null) {
                builder.setSmallIcon(b2);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
            DebugLogger.e("AbstractPushNotification", "cannot get " + messageV3.getUploadDataPackageName() + " smallIcon");
        } else if (!(this.f27228b == null || this.f27228b.getmStatusbarIcon() == 0)) {
            i = this.f27228b.getmStatusbarIcon();
            builder.setSmallIcon(i);
            builder.setContentIntent(pendingIntent);
            builder.setDeleteIntent(pendingIntent2);
        }
        i = com.meizu.cloud.pushsdk.notification.c.c.l(this.f27227a);
        builder.setSmallIcon(i);
        builder.setContentIntent(pendingIntent);
        builder.setDeleteIntent(pendingIntent2);
    }

    /* access modifiers changed from: protected */
    public void a(Notification notification, MessageV3 messageV3) {
    }

    /* access modifiers changed from: protected */
    public void a(final NotificationManager notificationManager, final int i, MessageV3 messageV3) {
        AdvanceSetting advanceSetting = messageV3.getmAdvanceSetting();
        if (advanceSetting != null) {
            boolean isHeadUpNotification = advanceSetting.isHeadUpNotification();
            boolean isClearNotification = advanceSetting.isClearNotification();
            if (isHeadUpNotification && !isClearNotification) {
                messageV3.getmAdvanceSetting().setHeadUpNotification(false);
                messageV3.getmAdvanceSetting().getNotifyType().setSound(false);
                messageV3.getmAdvanceSetting().getNotifyType().setVibrate(false);
                final Notification a2 = a(messageV3, a(messageV3), b(messageV3));
                this.f27229c.postDelayed(new Runnable() {
                    public void run() {
                        notificationManager.notify(i, a2);
                    }
                }, 5000);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return Thread.currentThread() == this.f27227a.getMainLooper().getThread();
    }

    /* access modifiers changed from: protected */
    public PendingIntent b(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f27227a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.f27227a, 0, intent, 1073741824);
    }

    /* access modifiers changed from: protected */
    public void b(Notification.Builder builder, MessageV3 messageV3) {
    }

    /* access modifiers changed from: protected */
    public void b(Notification notification, MessageV3 messageV3) {
    }

    /* access modifiers changed from: protected */
    public PendingIntent c(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE, messageV3.getNotificationMessage());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_STATE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f27227a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.f27227a, 0, intent, 1073741824);
    }

    /* access modifiers changed from: protected */
    public void c(Notification.Builder builder, MessageV3 messageV3) {
        AdvanceSetting advanceSetting = messageV3.getmAdvanceSetting();
        if (advanceSetting != null) {
            if (advanceSetting.getNotifyType() != null) {
                boolean isVibrate = advanceSetting.getNotifyType().isVibrate();
                boolean isLights = advanceSetting.getNotifyType().isLights();
                boolean isSound = advanceSetting.getNotifyType().isSound();
                if (isVibrate || isLights || isSound) {
                    int i = 0;
                    if (isVibrate) {
                        i = 2;
                    }
                    if (isLights) {
                        i |= 4;
                    }
                    if (isSound) {
                        i |= 1;
                    }
                    DebugLogger.e("AbstractPushNotification", "current notification type is " + i);
                    builder.setDefaults(i);
                }
            }
            builder.setOngoing(!advanceSetting.isClearNotification());
            if (advanceSetting.isHeadUpNotification() && MinSdkChecker.isSupportNotificationBuild()) {
                builder.setPriority(2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String d(MessageV3 messageV3) {
        String str = null;
        try {
            if (!TextUtils.isEmpty(messageV3.getNotificationMessage())) {
                str = new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject(PushConstants.EXTRA).getString("fns");
            }
        } catch (Exception e2) {
            DebugLogger.e("AbstractPushNotification", "parse flyme notifification setting error " + e2.getMessage());
        }
        DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
        return str;
    }

    @SuppressLint({"NewApi"})
    public void e(MessageV3 messageV3) {
        Notification a2 = a(messageV3, a(messageV3), b(messageV3));
        int abs = Math.abs((int) System.currentTimeMillis());
        com.meizu.cloud.pushsdk.notification.model.a a3 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (!(a3 == null || a3.a() == 0)) {
            abs = a3.a();
            DebugLogger.e("AbstractPushNotification", "server notify id " + abs);
            if (!TextUtils.isEmpty(a3.b())) {
                int h = com.meizu.cloud.pushsdk.util.b.h(this.f27227a, messageV3.getUploadDataPackageName(), a3.b());
                DebugLogger.e("AbstractPushNotification", "notifyKey " + a3.b() + " preference notifyId is " + h);
                if (h != 0) {
                    DebugLogger.e("AbstractPushNotification", "use preference notifyId " + h + " and cancel it");
                    this.f27230d.cancel(h);
                }
                DebugLogger.e("AbstractPushNotification", "store new notifyId " + abs + " by notifyKey " + a3.b());
                com.meizu.cloud.pushsdk.util.b.b(this.f27227a, messageV3.getUploadDataPackageName(), a3.b(), abs);
            }
        }
        DebugLogger.e("AbstractPushNotification", "current notify id " + abs);
        if (messageV3.isDiscard()) {
            if (com.meizu.cloud.pushsdk.util.b.c(this.f27227a, messageV3.getPackageName()) == 0) {
                com.meizu.cloud.pushsdk.util.b.a(this.f27227a, messageV3.getPackageName(), abs);
                DebugLogger.i("AbstractPushNotification", "no notification show so put notification id " + abs);
            }
            if (!TextUtils.isEmpty(messageV3.getTaskId())) {
                if (com.meizu.cloud.pushsdk.util.b.d(this.f27227a, messageV3.getPackageName()) == 0) {
                    com.meizu.cloud.pushsdk.util.b.b(this.f27227a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                } else if (Integer.valueOf(messageV3.getTaskId()).intValue() < com.meizu.cloud.pushsdk.util.b.d(this.f27227a, messageV3.getPackageName())) {
                    DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " taskid " + messageV3.getTaskId() + " dont show notification");
                    return;
                } else {
                    com.meizu.cloud.pushsdk.util.b.b(this.f27227a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                    abs = com.meizu.cloud.pushsdk.util.b.c(this.f27227a, messageV3.getPackageName());
                }
            }
            DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " notificationId=" + abs + " taskId=" + messageV3.getTaskId());
        }
        this.f27230d.notify(abs, a2);
        a(this.f27230d, abs, messageV3);
    }
}
