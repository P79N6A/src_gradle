package com.umeng.message;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.c;
import com.umeng.message.entity.UMessage;
import com.umeng.message.entity.UNotificationItem;
import com.umeng.message.proguard.h;
import com.umeng.message.service.UMJobIntentService;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

public class UmengMessageHandler implements UHandler {

    /* renamed from: a  reason: collision with root package name */
    private static int f81134a = 64;

    /* renamed from: b  reason: collision with root package name */
    private static final String f81135b = "com.umeng.message.UmengMessageHandler";

    /* renamed from: c  reason: collision with root package name */
    private static Date f81136c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f81137d = "9999999999999";
    private static boolean g;

    /* renamed from: e  reason: collision with root package name */
    private UMessage f81138e;

    /* renamed from: f  reason: collision with root package name */
    private int f81139f;

    public void dealWithCustomMessage(Context context, UMessage uMessage) {
    }

    public Notification getNotification(Context context, UMessage uMessage) {
        return null;
    }

    public void setPrevMessage(UMessage uMessage) {
        this.f81138e = uMessage;
    }

    private String a(Context context) {
        String notificationChannelName = PushAgent.getInstance(context).getNotificationChannelName();
        if (TextUtils.isEmpty(notificationChannelName)) {
            return "Default";
        }
        return notificationChannelName;
    }

    @SuppressLint({"NewApi", "Wakelock"})
    private void b(Context context) {
        boolean z;
        try {
            final PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 7) {
                z = new Object() {
                    /* access modifiers changed from: package-private */
                    public boolean a() {
                        return powerManager.isScreenOn();
                    }
                }.a();
            } else {
                UMLog.mutlInfo(f81135b, 2, "android os version < 7, skip checking screen on status");
                z = false;
            }
            String str = f81135b;
            UMLog.mutlInfo(str, 2, "屏幕开启状态：" + z);
            if (!z) {
                powerManager.newWakeLock(805306374, "MyLock").acquire(10000);
            }
        } catch (Exception unused) {
        }
    }

    public boolean isInNoDisturbTime(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = (Calendar.getInstance().get(11) * 60) + Calendar.getInstance().get(12);
        if (i >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            z = true;
        } else {
            z = false;
        }
        if (i <= (PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute() >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (!z || !z2) {
                return false;
            }
        } else if (!z && !z2) {
            return false;
        }
        return true;
    }

    public Bitmap getBarImage(Context context, UMessage uMessage) {
        return BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.bar_image.hashCode());
    }

    public Bitmap getExpandImage(Context context, UMessage uMessage) {
        return BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.expand_image.hashCode());
    }

    public PendingIntent getClickPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("ACTION", 10);
        intent.putExtra("MESSAGE_ID", uMessage.message_id);
        intent.putExtra("NOTIFICATION_ID", this.f81139f);
        intent.putExtra("TASK_ID", uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, 268435456);
    }

    public void handleMessage(Context context, UMessage uMessage) {
        if ("notification".equals(uMessage.display_type)) {
            dealWithNotificationMessage(context, uMessage);
            return;
        }
        if ("custom".equals(uMessage.display_type)) {
            UTrack.getInstance(context).setClearPrevMessage(false);
            if (!TextUtils.isEmpty(uMessage.recall)) {
                a(context, uMessage);
                return;
            }
            dealWithCustomMessage(context, uMessage);
        }
    }

    public boolean startDownloadResourceService(Context context, UMessage uMessage) {
        try {
            Intent intent = new Intent(context, UmengDownloadResourceService.class);
            intent.putExtra("body", uMessage.getRaw().toString());
            intent.putExtra("id", uMessage.message_id);
            intent.putExtra(PushConstants.TASK_ID, uMessage.task_id);
            UMJobIntentService.enqueueWork(context, UmengDownloadResourceService.class, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void a(Context context, UMessage uMessage) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                Iterator it2 = MessageNotificationQueue.getInstance().getQueue().iterator();
                while (it2.hasNext()) {
                    UNotificationItem uNotificationItem = (UNotificationItem) it2.next();
                    if (uMessage.recall.equals(uNotificationItem.message.msg_id)) {
                        notificationManager.cancel(uNotificationItem.id);
                        MessageNotificationQueue.getInstance().remove(uNotificationItem);
                        UTrack.getInstance(context).a(uMessage);
                        return;
                    }
                }
                UTrack.getInstance(context).b(uMessage);
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(f81135b, 0, "通知召回异常");
        }
    }

    public PendingIntent getDismissPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, NotificationProxyBroadcastReceiver.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("ACTION", 11);
        intent.putExtra("MESSAGE_ID", uMessage.message_id);
        intent.putExtra("NOTIFICATION_ID", this.f81139f);
        intent.putExtra("TASK_ID", uMessage.task_id);
        return PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() + 1), intent, 268435456);
    }

    public Bitmap getLargeIcon(Context context, UMessage uMessage) {
        Bitmap bitmap;
        try {
            if (uMessage.isLargeIconFromInternet()) {
                bitmap = BitmapFactory.decodeFile(UmengDownloadResourceService.getMessageResourceFolder(context, uMessage) + uMessage.img.hashCode());
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                int i = -1;
                if (!TextUtils.isEmpty(uMessage.largeIcon)) {
                    i = c.a(context).d(uMessage.largeIcon);
                }
                if (i < 0) {
                    i = c.a(context).d("umeng_push_notification_default_large_icon");
                }
                if (i > 0) {
                    bitmap = BitmapFactory.decodeResource(context.getResources(), i);
                }
            }
            return bitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public int getSmallIconId(Context context, UMessage uMessage) {
        int i = -1;
        try {
            if (!TextUtils.isEmpty(uMessage.icon)) {
                i = c.a(context).d(uMessage.icon);
            }
            if (i < 0) {
                i = c.a(context).d("umeng_push_notification_default_small_icon");
            }
            if (i < 0) {
                UMLog.mutlInfo(f81135b, 2, "没有自定义通知图标，改用应用图标");
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.icon;
            }
            if (i < 0) {
                UMLog.mutlInfo(f81135b, 0, "找不到适当的通知图标，请确保您为此通知指定了一个图标，或者应用已经定义了一个图标");
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (new java.io.File(r1).exists() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri getSound(android.content.Context r5, com.umeng.message.entity.UMessage r6) {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r6.isSoundFromInternet()     // Catch:{ Throwable -> 0x0070 }
            if (r1 == 0) goto L_0x002b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0070 }
            r1.<init>()     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r2 = com.umeng.message.UmengDownloadResourceService.getMessageResourceFolder(r5, r6)     // Catch:{ Throwable -> 0x0070 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r2 = r6.sound     // Catch:{ Throwable -> 0x0070 }
            int r2 = r2.hashCode()     // Catch:{ Throwable -> 0x0070 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0070 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0070 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0070 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x0070 }
            if (r2 != 0) goto L_0x002c
        L_0x002b:
            r1 = r0
        L_0x002c:
            if (r1 != 0) goto L_0x0069
            r2 = -1
            java.lang.String r3 = r6.sound     // Catch:{ Throwable -> 0x0070 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0070 }
            if (r3 != 0) goto L_0x0041
            com.umeng.message.common.c r2 = com.umeng.message.common.c.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r6 = r6.sound     // Catch:{ Throwable -> 0x0070 }
            int r2 = r2.j(r6)     // Catch:{ Throwable -> 0x0070 }
        L_0x0041:
            if (r2 >= 0) goto L_0x004d
            com.umeng.message.common.c r6 = com.umeng.message.common.c.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r2 = "umeng_push_notification_default_sound"
            int r2 = r6.j(r2)     // Catch:{ Throwable -> 0x0070 }
        L_0x004d:
            if (r2 <= 0) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r1 = "android.resource://"
            r6.<init>(r1)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Throwable -> 0x0070 }
            r6.append(r5)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r5 = "/"
            r6.append(r5)     // Catch:{ Throwable -> 0x0070 }
            r6.append(r2)     // Catch:{ Throwable -> 0x0070 }
            java.lang.String r1 = r6.toString()     // Catch:{ Throwable -> 0x0070 }
        L_0x0069:
            if (r1 == 0) goto L_0x0070
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch:{ Throwable -> 0x0070 }
            return r5
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengMessageHandler.getSound(android.content.Context, com.umeng.message.entity.UMessage):android.net.Uri");
    }

    public int getNotificationDefaults(Context context, UMessage uMessage) {
        int i;
        boolean isInNoDisturbTime = isInNoDisturbTime(context);
        long muteDuration = ((long) MessageSharedPrefs.getInstance(context).getMuteDuration()) * 1 * 1000;
        int i2 = 0;
        if (!isInNoDisturbTime && (f81136c == null || Calendar.getInstance().getTimeInMillis() - f81136c.getTime() >= muteDuration)) {
            int notificationPlayVibrate = MessageSharedPrefs.getInstance(context).getNotificationPlayVibrate();
            String str = f81135b;
            UMLog.mutlInfo(str, 2, "playVibrate:" + notificationPlayVibrate);
            if (notificationPlayVibrate != 1 && (notificationPlayVibrate == 2 || !uMessage.play_vibrate)) {
                i = 0;
            } else {
                i = 2;
            }
            int notificationPlayLights = MessageSharedPrefs.getInstance(context).getNotificationPlayLights();
            String str2 = f81135b;
            UMLog.mutlInfo(str2, 2, "playLights:" + notificationPlayLights);
            if (notificationPlayLights == 1) {
                i |= 4;
            } else if (notificationPlayLights != 2 && uMessage.play_lights) {
                i |= 4;
            }
            int notificationPlaySound = MessageSharedPrefs.getInstance(context).getNotificationPlaySound();
            String str3 = f81135b;
            UMLog.mutlInfo(str3, 2, "playSound:" + notificationPlaySound);
            if (notificationPlaySound == 1) {
                i |= 1;
            } else if (notificationPlaySound != 2 && uMessage.play_sound) {
                i |= 1;
            }
            i2 = i;
            f81136c = Calendar.getInstance().getTime();
            if (uMessage.screen_on) {
                b(context);
            }
        }
        return i2;
    }

    public void dealWithNotificationMessage(Context context, UMessage uMessage) {
        String str;
        String str2;
        Notification.Builder builder;
        String str3 = f81135b;
        boolean z = false;
        UMLog.mutlInfo(str3, 2, "notify: " + uMessage.getRaw().toString());
        if (!uMessage.hasResourceFromInternet() || MessageSharedPrefs.getInstance(context).hasMessageResourceDownloaded(uMessage.msg_id) || !startDownloadResourceService(context, uMessage)) {
            String lastMessageMsgID = MessageSharedPrefs.getInstance(context).getLastMessageMsgID();
            if ("".equals(lastMessageMsgID)) {
                str = "";
            } else {
                str = lastMessageMsgID.substring(7, 20);
            }
            if (uMessage.msg_id == null || 22 != uMessage.msg_id.length() || !uMessage.msg_id.startsWith("u")) {
                str2 = f81137d;
            } else {
                MessageSharedPrefs.getInstance(context).setLastMessageMsgID(uMessage.msg_id);
                str2 = uMessage.msg_id.substring(7, 20);
            }
            if ("".equals(str) || str2.compareToIgnoreCase(str) >= 0) {
                z = true;
            }
            MessageSharedPrefs.getInstance(context).removeMessageResouceRecord(uMessage.msg_id);
            Notification notification = getNotification(context, uMessage);
            if (notification != null) {
                int i = notification.icon;
            }
            if (notification == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!g) {
                        g = true;
                        NotificationChannel notificationChannel = new NotificationChannel("upush_default", a(context), 3);
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                    builder = new Notification.Builder(context, "upush_default");
                } else {
                    builder = new Notification.Builder(context);
                }
                if (!TextUtils.isEmpty(uMessage.expand_image) && Build.VERSION.SDK_INT >= 16) {
                    builder.setStyle(new Notification.BigPictureStyle().bigPicture(getExpandImage(context, uMessage)));
                }
                if (!TextUtils.isEmpty(uMessage.bar_image)) {
                    int smallIconId = getSmallIconId(context, uMessage);
                    if (smallIconId >= 0) {
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), c.a(context).e("upush_bar_image_notification"));
                        remoteViews.setImageViewBitmap(c.a(context).b("notification_bar_image"), getBarImage(context, uMessage));
                        builder.setContent(remoteViews).setSmallIcon(smallIconId).setTicker(uMessage.ticker).setAutoCancel(true);
                    } else {
                        return;
                    }
                } else if (a(context, builder, uMessage)) {
                    builder.setContentTitle(uMessage.title).setContentText(uMessage.text).setTicker(uMessage.ticker).setAutoCancel(true);
                } else {
                    return;
                }
                notification = builder.getNotification();
            }
            this.f81139f = new Random(System.nanoTime()).nextInt();
            PendingIntent clickPendingIntent = getClickPendingIntent(context, uMessage);
            notification.deleteIntent = getDismissPendingIntent(context, uMessage);
            notification.contentIntent = clickPendingIntent;
            int notificationDefaults = getNotificationDefaults(context, uMessage);
            if ((notificationDefaults & 1) != 0) {
                Uri sound = getSound(context, uMessage);
                if (sound != null) {
                    notification.sound = getSound(context, uMessage);
                }
                if (sound != null) {
                    notificationDefaults ^= 1;
                }
            }
            notification.defaults = notificationDefaults;
            a(context, notification, z, uMessage);
        }
    }

    private boolean a(Context context, Notification.Builder builder, UMessage uMessage) {
        int smallIconId = getSmallIconId(context, uMessage);
        Bitmap largeIcon = getLargeIcon(context, uMessage);
        if (smallIconId < 0) {
            return false;
        }
        builder.setSmallIcon(smallIconId);
        builder.setLargeIcon(largeIcon);
        return true;
    }

    private void a(Context context, Notification notification, boolean z, UMessage uMessage) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int i = this.f81139f;
            if (!h.c(context) || !h.b(context) || PushAgent.getInstance(context).getNotificationOnForeground()) {
                if (MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber() == 1) {
                    if (z) {
                    }
                }
                if (MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber() > 0) {
                    while (MessageNotificationQueue.getInstance().size() >= MessageSharedPrefs.getInstance(context).getDisplayNotificationNumber()) {
                        UNotificationItem pollFirst = MessageNotificationQueue.getInstance().pollFirst();
                        notificationManager.cancel(pollFirst.id);
                        UTrack.getInstance(context).setClearPrevMessage(false);
                        UTrack.getInstance(context).trackMsgDismissed(pollFirst.message);
                    }
                    MessageNotificationQueue.getInstance().addLast(new UNotificationItem(i, uMessage));
                } else {
                    MessageNotificationQueue.getInstance().addLast(new UNotificationItem(i, uMessage));
                }
                notificationManager.notify(i, notification);
                return;
            }
            UTrack.getInstance(context).setClearPrevMessage(false);
            UTrack.getInstance(context).trackMsgDismissed(uMessage);
        } catch (Exception unused) {
        }
    }
}
