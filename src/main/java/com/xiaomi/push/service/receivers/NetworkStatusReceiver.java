package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.ao;
import com.xiaomi.mipush.sdk.ay;
import com.xiaomi.mipush.sdk.bd;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.push.at;
import com.xiaomi.push.service.ax;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static int f82593a = 1;

    /* renamed from: a  reason: collision with other field name */
    private static BlockingQueue<Runnable> f1004a = new LinkedBlockingQueue();

    /* renamed from: a  reason: collision with other field name */
    private static ThreadPoolExecutor f1005a = null;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f1006a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f82594b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static int f82595c = 2;

    /* renamed from: b  reason: collision with other field name */
    private boolean f1007b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f82593a, f82594b, (long) f82595c, TimeUnit.SECONDS, f1004a);
        f1005a = threadPoolExecutor;
    }

    public NetworkStatusReceiver() {
        this.f1007b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        f1006a = true;
    }

    /* access modifiers changed from: private */
    public void a(Context context) {
        if (!ay.a(context).a() && d.a(context).c() && !d.a(context).e()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ax.a(context).a(intent);
            } catch (Exception e2) {
                b.a((Throwable) e2);
            }
        }
        if (at.b(context) && ay.a(context).b()) {
            ay.a(context).c();
        }
        if (at.b(context)) {
            if ("syncing".equals(ao.a(context).a(bd.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(ao.a(context).a(bd.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            if ("syncing".equals(ao.a(context).a(bd.UPLOAD_HUAWEI_TOKEN))) {
                MiPushClient.syncAssemblePushToken(context);
            }
            if ("syncing".equals(ao.a(context).a(bd.UPLOAD_FCM_TOKEN))) {
                MiPushClient.syncAssembleFCMPushToken(context);
            }
            if ("syncing".equals(ao.a(context).a(bd.UPLOAD_COS_TOKEN))) {
                MiPushClient.syncAssembleCOSPushToken(context);
            }
            if ("syncing".equals(ao.a(context).a(bd.UPLOAD_FTOS_TOKEN))) {
                MiPushClient.syncAssembleFTOSPushToken(context);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    public static boolean a() {
        return f1006a;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.f1007b) {
            f1005a.execute(new a(this, context));
        }
    }
}
