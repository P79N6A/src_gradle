package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.fz;
import com.xiaomi.push.io;
import com.xiaomi.push.ju;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PushMessageHandler extends BaseService {

    /* renamed from: a  reason: collision with root package name */
    private static List<MiPushClient.MiPushClientCallback> f81741a = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f89a;

    interface a extends Serializable {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f89a = threadPoolExecutor;
    }

    protected static void a() {
        synchronized (f81741a) {
            f81741a.clear();
        }
    }

    public static void a(long j, String str, String str2) {
        synchronized (f81741a) {
            for (MiPushClient.MiPushClientCallback onInitializeResult : f81741a) {
                onInitializeResult.onInitializeResult(j, str, str2);
            }
        }
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e2) {
            b.a(e2.getMessage());
        }
    }

    public static void a(Context context, Intent intent) {
        b.c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo) {
        try {
            MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.a(intent, (PushMessageReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance()));
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
        } catch (Throwable th) {
            b.a(th);
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (f81741a) {
            for (MiPushClient.MiPushClientCallback next : f81741a) {
                if (a(miPushMessage.getCategory(), next.getCategory())) {
                    next.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    next.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r10, com.xiaomi.mipush.sdk.PushMessageHandler.a r11) {
        /*
            boolean r0 = r11 instanceof com.xiaomi.mipush.sdk.MiPushMessage
            if (r0 == 0) goto L_0x000b
            com.xiaomi.mipush.sdk.MiPushMessage r11 = (com.xiaomi.mipush.sdk.MiPushMessage) r11
            a((android.content.Context) r10, (com.xiaomi.mipush.sdk.MiPushMessage) r11)
            goto L_0x00d1
        L_0x000b:
            boolean r0 = r11 instanceof com.xiaomi.mipush.sdk.MiPushCommandMessage
            if (r0 == 0) goto L_0x00d1
            com.xiaomi.mipush.sdk.MiPushCommandMessage r11 = (com.xiaomi.mipush.sdk.MiPushCommandMessage) r11
            java.lang.String r2 = r11.getCommand()
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_REGISTER
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0040
            java.util.List r10 = r11.getCommandArguments()
            if (r10 == 0) goto L_0x0034
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0034
            java.lang.Object r10 = r10.get(r1)
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
        L_0x0034:
            long r0 = r11.getResultCode()
            java.lang.String r10 = r11.getReason()
            a((long) r0, (java.lang.String) r10, (java.lang.String) r3)
            return
        L_0x0040:
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_SET_ALIAS
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00bd
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_UNSET_ALIAS
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00bd
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_SET_ACCEPT_TIME
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005f
            goto L_0x00bd
        L_0x005f:
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_SUBSCRIBE_TOPIC
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008e
            java.util.List r0 = r11.getCommandArguments()
            if (r0 == 0) goto L_0x007c
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x007c
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x007c:
            r9 = r3
            java.lang.String r5 = r11.getCategory()
            long r6 = r11.getResultCode()
            java.lang.String r8 = r11.getReason()
            r4 = r10
            a(r4, r5, r6, r8, r9)
            return
        L_0x008e:
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_UNSUBSCRIBE_TOPIC
            java.lang.String r0 = r0.f413a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00d1
            java.util.List r0 = r11.getCommandArguments()
            if (r0 == 0) goto L_0x00ab
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00ab
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x00ab:
            r9 = r3
            java.lang.String r5 = r11.getCategory()
            long r6 = r11.getResultCode()
            java.lang.String r8 = r11.getReason()
            r4 = r10
            b(r4, r5, r6, r8, r9)
            return
        L_0x00bd:
            java.lang.String r1 = r11.getCategory()
            long r3 = r11.getResultCode()
            java.lang.String r5 = r11.getReason()
            java.util.List r6 = r11.getCommandArguments()
            r0 = r10
            a(r0, r1, r2, r3, r5, r6)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.PushMessageHandler.a(android.content.Context, com.xiaomi.mipush.sdk.PushMessageHandler$a):void");
    }

    protected static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (f81741a) {
            for (MiPushClient.MiPushClientCallback next : f81741a) {
                if (a(str, next.getCategory())) {
                    next.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    protected static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f81741a) {
            for (MiPushClient.MiPushClientCallback next : f81741a) {
                if (a(str, next.getCategory())) {
                    next.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    protected static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f81741a) {
            if (!f81741a.contains(miPushClientCallback)) {
                f81741a.add(miPushClientCallback);
            }
        }
    }

    protected static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    protected static void b(Context context, Intent intent) {
        try {
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                p.a(context, intent, null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                io ioVar = new io();
                ju.a(ioVar, intent.getByteArrayExtra("mipush_payload"));
                b.c("PushMessageHandler.onHandleIntent " + ioVar.d());
                MiTinyDataClient.upload(context, ioVar);
            } else if ("com.xiaomi.mipush.sdk.HYBRID_NOTIFICATION_CLICK".equals(intent.getAction())) {
                MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra("mipush_payload");
                String stringExtra = intent.getStringExtra("mipush_hybrid_app_pkg");
                MiPushClient.reportMessageClicked(context, miPushMessage);
                MiPushClient4Hybrid.onNotificationMessageClicked(context, stringExtra, miPushMessage);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (b()) {
                    b.d("receive a message before application calling initialize");
                    return;
                }
                a a2 = av.a(context).a(intent);
                if (a2 != null) {
                    a(context, a2);
                }
            } else if ("com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Logger.uploadLogFile(context, false);
            } else {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                if (queryBroadcastReceivers != null) {
                    Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it2.next();
                        if (next.activityInfo != null && next.activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(Class.forName(next.activityInfo.name))) {
                            resolveInfo = next;
                            break;
                        }
                    }
                }
                if (resolveInfo != null) {
                    a(context, intent2, resolveInfo);
                    return;
                }
                b.d("cannot find the receiver to handler this message, check your manifest");
                fz.a(context).a(context.getPackageName(), intent, "cannot find the receiver to handler this message, check your manifest");
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
            fz.a(context).a(context.getPackageName(), intent, (Throwable) e2);
        } catch (Throwable th) {
            b.a(th);
            fz.a(context).a(context.getPackageName(), intent, th);
        }
    }

    protected static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (f81741a) {
            for (MiPushClient.MiPushClientCallback next : f81741a) {
                if (a(str, next.getCategory())) {
                    next.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    public static boolean b() {
        return f81741a.isEmpty();
    }

    private static void c(Context context, Intent intent) {
        if (intent != null && !f89a.isShutdown()) {
            f89a.execute(new au(context, intent));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public boolean m35a() {
        return (f89a == null || f89a.getQueue() == null || f89a.getQueue().size() <= 0) ? false : true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }
}
