package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.aj;
import com.xiaomi.push.fz;
import com.xiaomi.push.ge;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MessageHandleService extends BaseService {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<a> f81735a = new ConcurrentLinkedQueue<>();

    /* renamed from: a  reason: collision with other field name */
    private static ExecutorService f76a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Intent f81736a;

        /* renamed from: a  reason: collision with other field name */
        private PushMessageReceiver f77a;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f77a = pushMessageReceiver;
            this.f81736a = intent;
        }

        public Intent a() {
            return this.f81736a;
        }

        /* renamed from: a  reason: collision with other method in class */
        public PushMessageReceiver m30a() {
            return this.f77a;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f76a = threadPoolExecutor;
    }

    protected static void a(Context context, Intent intent) {
        if (intent != null) {
            b(context);
        }
    }

    public static void addJob(Context context, a aVar) {
        if (aVar != null) {
            f81735a.add(aVar);
            b(context);
            startService(context);
        }
    }

    private static void b(Context context) {
        if (!f76a.isShutdown()) {
            f76a.execute(new ad(context));
        }
    }

    /* access modifiers changed from: private */
    public static void c(Context context) {
        fz a2;
        String packageName;
        int i;
        String str;
        try {
            a poll = f81735a.poll();
            if (poll != null) {
                PushMessageReceiver a3 = poll.a();
                Intent a4 = poll.a();
                int intExtra = a4.getIntExtra("message_type", 1);
                if (intExtra != 1) {
                    switch (intExtra) {
                        case 3:
                            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a4.getSerializableExtra("key_command");
                            a3.onCommandResult(context, miPushCommandMessage);
                            if (TextUtils.equals(miPushCommandMessage.getCommand(), ge.COMMAND_REGISTER.f413a)) {
                                a3.onReceiveRegisterResult(context, miPushCommandMessage);
                                if (miPushCommandMessage.getResultCode() == 0) {
                                    j.b(context);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            if ("error_lack_of_permission".equals(a4.getStringExtra("error_type"))) {
                                String[] stringArrayExtra = a4.getStringArrayExtra("error_message");
                                if (stringArrayExtra != null) {
                                    a3.onRequirePermissions(context, stringArrayExtra);
                                    return;
                                }
                            }
                            break;
                        default:
                            return;
                    }
                } else {
                    PushMessageHandler.a a5 = av.a(context).a(a4);
                    int intExtra2 = a4.getIntExtra("eventMessageType", -1);
                    if (a5 != null) {
                        if (a5 instanceof MiPushMessage) {
                            MiPushMessage miPushMessage = (MiPushMessage) a5;
                            if (!miPushMessage.isArrivedMessage()) {
                                a3.onReceiveMessage(context, miPushMessage);
                            }
                            if (miPushMessage.getPassThrough() == 1) {
                                fz.a(context.getApplicationContext()).a(context.getPackageName(), a4, (int) PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR, "call passThrough callBack");
                                a3.onReceivePassThroughMessage(context, miPushMessage);
                            } else if (miPushMessage.isNotified()) {
                                if (intExtra2 == 1000) {
                                    a2 = fz.a(context.getApplicationContext());
                                    packageName = context.getPackageName();
                                    i = 1007;
                                    str = "call notification callBack";
                                } else {
                                    a2 = fz.a(context.getApplicationContext());
                                    packageName = context.getPackageName();
                                    i = 3007;
                                    str = "call business callBack";
                                }
                                a2.a(packageName, a4, i, str);
                                b.a("begin execute onNotificationMessageClicked from　" + miPushMessage.getMessageId());
                                a3.onNotificationMessageClicked(context, miPushMessage);
                            } else {
                                a3.onNotificationMessageArrived(context, miPushMessage);
                            }
                        } else if (a5 instanceof MiPushCommandMessage) {
                            MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) a5;
                            a3.onCommandResult(context, miPushCommandMessage2);
                            if (TextUtils.equals(miPushCommandMessage2.getCommand(), ge.COMMAND_REGISTER.f413a)) {
                                a3.onReceiveRegisterResult(context, miPushCommandMessage2);
                                if (miPushCommandMessage2.getResultCode() == 0) {
                                    j.b(context);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException e2) {
            b.a((Throwable) e2);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, MessageHandleService.class));
        aj.a(context).a((Runnable) new ac(context, intent));
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return f81735a != null && f81735a.size() > 0;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }
}
