package com.taobao.accs;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.base.BaseService;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

public class ChannelService extends BaseService {
    public static int SDK_VERSION_CODE = 221;
    private static ChannelService mInstance;
    private boolean mFristStarted = true;

    public static class KernelService extends Service {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static KernelService f78880a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Context f78881b;

        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            f78880a = this;
            this.f78881b = getApplicationContext();
        }

        public void onDestroy() {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.e("ChannelService", "onDestroy", th, new Object[0]);
            }
            f78880a = null;
            super.onDestroy();
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            try {
                ThreadPoolExecutorFactory.execute(new a(this));
            } catch (Throwable th) {
                ALog.e("ChannelService", " onStartCommand", th, new Object[0]);
            }
            return super.onStartCommand(intent, i, i2);
        }
    }

    public static ChannelService getInstance() {
        return mInstance;
    }

    public void onCreate() {
        super.onCreate();
        mInstance = this;
        if (Build.VERSION.SDK_INT < 18) {
            try {
                startForeground(9371, new Notification());
            } catch (Throwable th) {
                ALog.e("ChannelService", "ChannelService onCreate", th, new Object[0]);
            }
        }
    }

    public void onDestroy() {
        if (Build.VERSION.SDK_INT < 18) {
            try {
                stopForeground(true);
            } catch (Throwable th) {
                ALog.e("ChannelService", "ChannelService onDestroy", th, new Object[0]);
            }
        }
        stopKernel(getApplicationContext());
        super.onDestroy();
    }

    static int getSupportForegroundVer(Context context) {
        try {
            return c.a(context, "ACCS_SDK", 0).getInt("support_foreground_v", 24);
        } catch (Throwable th) {
            ALog.e("ChannelService", "getSupportForegroundVer fail:", th, "key", "support_foreground_v");
            return 24;
        }
    }

    static void startKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, KernelService.class);
                intent.setPackage(context.getPackageName());
                context.startService(intent);
            }
        } catch (Throwable th) {
            ALog.e("ChannelService", "startKernel", th, new Object[0]);
        }
    }

    static void stopKernel(Context context) {
        try {
            if (Build.VERSION.SDK_INT < getSupportForegroundVer(context)) {
                Intent intent = new Intent(context, KernelService.class);
                intent.setPackage(context.getPackageName());
                context.stopService(intent);
            }
        } catch (Throwable th) {
            ALog.e("ChannelService", "stopKernel", th, new Object[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mFristStarted) {
            this.mFristStarted = false;
            startKernel(getApplicationContext());
        }
        return super.onStartCommand(intent, i, i2);
    }
}
