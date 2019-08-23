package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;

public class b implements UMImprintChangeCallback {

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f80736a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f80737b;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f80738c;
    private static a i;
    /* access modifiers changed from: private */
    public static ConnectivityManager j;
    /* access modifiers changed from: private */
    public static NetworkInfo k;
    private static IntentFilter l;
    /* access modifiers changed from: private */
    public static boolean m;
    /* access modifiers changed from: private */
    public static ArrayList<UMSenderStateNotify> n;
    /* access modifiers changed from: private */
    public static Object o = new Object();
    private static boolean r = false;
    private static int t = 15000;
    private static Object u = new Object();
    private static BroadcastReceiver v = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context appContext = UMModuleRegister.getAppContext();
                ConnectivityManager unused = b.j = (ConnectivityManager) appContext.getSystemService("connectivity");
                try {
                    if (b.j != null) {
                        NetworkInfo unused2 = b.k = b.j.getActiveNetworkInfo();
                        if (b.k == null || !b.k.isAvailable()) {
                            ULog.i("--->>> network disconnected.");
                            boolean unused3 = b.m = false;
                        } else {
                            ULog.i("--->>> network isAvailable, check if there are any files to send.");
                            boolean unused4 = b.m = true;
                            synchronized (b.o) {
                                if (b.n != null) {
                                    int size = b.n.size();
                                    if (size > 0) {
                                        for (int i = 0; i < size; i++) {
                                            ((UMSenderStateNotify) b.n.get(i)).onConnectionAvailable();
                                        }
                                    }
                                }
                            }
                            b.c(273);
                            if (b.k.getType() == 1 && context != null) {
                                try {
                                    if (!UMWorkDispatch.eventHasExist(32774)) {
                                        UMWorkDispatch.sendEvent(context, 32774, com.umeng.commonsdk.internal.b.a(context).a(), null);
                                    }
                                } catch (Throwable unused5) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
        }
    };

    static class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        public void onEvent(int i, String str) {
            if ((i & 8) == 8) {
                ULog.d("--->>> envelope file created >>> " + str);
                UMRTLog.i("MobclickRT", "--->>> envelope file created >>> " + str);
                b.c(273);
            }
        }
    }

    public static void c() {
        c(512);
    }

    public static void d() {
        b(273);
    }

    public static void e() {
        a(274, (int) PushConstants.WORK_RECEIVER_EVENTCORE_ERROR);
    }

    public static int b() {
        int i2;
        synchronized (u) {
            i2 = t;
        }
        return i2;
    }

    private static void n() {
        if (f80736a != null) {
            f80736a = null;
        }
        if (f80737b != null) {
            f80737b = null;
        }
        if (f80738c != null) {
            f80738c = null;
        }
    }

    /* access modifiers changed from: private */
    public static void o() {
        synchronized (o) {
            if (n != null) {
                int size = n.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        n.get(i2).onSenderIdle();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static void p() {
        if (i != null) {
            i.stopWatching();
            i = null;
        }
        if (l != null) {
            if (v != null) {
                UMModuleRegister.getAppContext().unregisterReceiver(v);
                v = null;
            }
            l = null;
        }
        ULog.d("--->>> handleQuit: Quit sender thread.");
        if (f80736a != null) {
            f80736a.quit();
            n();
        }
    }

    private void m() {
        synchronized (u) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), "report_policy", ""))) {
                UMRTLog.i("MobclickRT", "--->>> switch to report_policy 11");
                r = true;
                t = 15000;
                int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), "report_interval", "15")).intValue();
                UMRTLog.i("MobclickRT", "--->>> set report_interval value to: " + intValue);
                if (intValue >= 15) {
                    if (intValue <= 90) {
                        t = intValue * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    }
                }
                t = 15000;
            } else {
                r = false;
            }
        }
    }

    public static boolean a() {
        boolean z;
        synchronized (u) {
            z = r;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static void q() {
        ULog.d("--->>> handleProcessNext: Enter...");
        if (m) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.i("MobclickRT", "--->>> send envelope file [ " + path + "].");
                        if (new c(appContext).a(envelopeFile)) {
                            ULog.d("--->>> Send envelope file success, delete it.");
                            if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                                ULog.d("--->>> Failed to delete already processed file. We try again after delete failed.");
                                UMFrUtils.removeEnvelopeFile(envelopeFile);
                            }
                            c(273);
                            return;
                        }
                        ULog.d("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }

    private static void b(int i2) {
        if (m && f80737b != null && !f80737b.hasMessages(i2)) {
            Message obtainMessage = f80737b.obtainMessage();
            obtainMessage.what = i2;
            f80737b.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public static void c(int i2) {
        if (m && f80737b != null) {
            Message obtainMessage = f80737b.obtainMessage();
            obtainMessage.what = i2;
            f80737b.sendMessage(obtainMessage);
        }
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (o) {
            try {
                if (n == null) {
                    n = new ArrayList<>();
                }
                if (uMSenderStateNotify != null) {
                    for (int i2 = 0; i2 < n.size(); i2++) {
                        if (uMSenderStateNotify == n.get(i2)) {
                            UMRTLog.i("MobclickRT", "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    n.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    private static void a(int i2, int i3) {
        if (m && f80737b != null) {
            f80737b.removeMessages(i2);
            Message obtainMessage = f80737b.obtainMessage();
            obtainMessage.what = i2;
            f80737b.sendMessageDelayed(obtainMessage, (long) i3);
        }
    }

    private static void a(int i2, long j2) {
        if (m && f80737b != null) {
            Message obtainMessage = f80737b.obtainMessage();
            obtainMessage.what = i2;
            UMRTLog.i("MobclickRT", "--->>> sendMsgDelayed: " + j2);
            f80737b.sendMessageDelayed(obtainMessage, j2);
        }
    }

    public b(Context context, Handler handler) {
        f80738c = handler;
        try {
            if (f80736a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f80736a = handlerThread;
                handlerThread.start();
                if (i == null) {
                    a aVar = new a(UMFrUtils.getEnvelopeDirPath(context));
                    i = aVar;
                    aVar.startWatching();
                    ULog.d("--->>> FileMonitor has already started!");
                }
                Context appContext = UMModuleRegister.getAppContext();
                if (DeviceConfig.checkPermission(appContext, "android.permission.ACCESS_NETWORK_STATE") && l == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    l = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    if (v != null) {
                        appContext.registerReceiver(v, l);
                    }
                }
                m();
                if (f80737b == null) {
                    f80737b = new Handler(f80736a.getLooper()) {
                        public void handleMessage(Message message) {
                            int i = message.what;
                            if (i != 512) {
                                switch (i) {
                                    case 273:
                                        ULog.d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                        b.q();
                                        return;
                                    case 274:
                                        b.o();
                                        break;
                                }
                                return;
                            }
                            b.p();
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback("report_policy", this);
                ImprintHandler.getImprintService(context).registImprintCallback("report_interval", this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public void onImprintValueChanged(String str, String str2) {
        synchronized (u) {
            if ("report_policy".equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.i("MobclickRT", "--->>> switch to report_policy 11");
                    r = true;
                    t = 15000;
                } else {
                    r = false;
                }
            }
            if ("report_interval".equals(str)) {
                int intValue = Integer.valueOf(str2).intValue();
                UMRTLog.i("MobclickRT", "--->>> set report_interval value to: " + intValue);
                if (intValue >= 15) {
                    if (intValue <= 90) {
                        t = intValue * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    }
                }
                t = 15000;
            }
        }
    }
}
