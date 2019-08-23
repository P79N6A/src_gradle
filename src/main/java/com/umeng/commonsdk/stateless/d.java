package com.umeng.commonsdk.stateless;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Context f80905b;

    /* renamed from: c  reason: collision with root package name */
    private static HandlerThread f80906c;

    /* renamed from: d  reason: collision with root package name */
    private static Handler f80907d;

    /* renamed from: e  reason: collision with root package name */
    private static Object f80908e = new Object();
    private static IntentFilter g;
    /* access modifiers changed from: private */
    public static boolean h = false;
    private static BroadcastReceiver i = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!(context == null || intent == null)) {
                try {
                    if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        Context unused = d.f80905b = context.getApplicationContext();
                        if (d.f80905b != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) d.f80905b.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                                    ULog.i("walle", "[stateless] net reveiver disconnected --->>>");
                                    boolean unused2 = d.h = false;
                                } else {
                                    boolean unused3 = d.h = true;
                                    ULog.i("walle", "[stateless] net reveiver ok --->>>");
                                    d.b(273);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    };

    public static void a() {
        b(512);
    }

    /* access modifiers changed from: private */
    public static void f() {
        if (g != null) {
            if (i != null) {
                if (f80905b != null) {
                    f80905b.unregisterReceiver(i);
                }
                i = null;
            }
            g = null;
        }
        if (f80906c != null) {
            f80906c.quit();
            if (f80906c != null) {
                f80906c = null;
            }
            if (f80907d != null) {
                f80907d = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:11|12|13|14|15|16|17|(3:19|(1:21)|22)(2:23|24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[Catch:{ Throwable -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095 A[Catch:{ Throwable -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e() {
        /*
            boolean r0 = h
            if (r0 == 0) goto L_0x00a9
            android.content.Context r0 = f80905b
            if (r0 != 0) goto L_0x000a
            goto L_0x00a9
        L_0x000a:
            android.content.Context r0 = f80905b     // Catch:{ Throwable -> 0x00a2 }
            java.io.File r0 = com.umeng.commonsdk.stateless.f.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x00a2 }
            if (r0 == 0) goto L_0x00a1
            java.io.File r1 = r0.getParentFile()     // Catch:{ Throwable -> 0x00a2 }
            if (r1 == 0) goto L_0x00a1
            java.io.File r1 = r0.getParentFile()     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r1 = r1.getName()     // Catch:{ Throwable -> 0x00a2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00a2 }
            if (r1 != 0) goto L_0x00a1
            com.umeng.commonsdk.stateless.e r1 = new com.umeng.commonsdk.stateless.e     // Catch:{ Throwable -> 0x00a2 }
            android.content.Context r2 = f80905b     // Catch:{ Throwable -> 0x00a2 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x00a2 }
            java.io.File r3 = r0.getParentFile()     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r3 = r3.getName()     // Catch:{ Throwable -> 0x00a2 }
            r4 = 0
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch:{ Throwable -> 0x00a2 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r3 = "walle"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r8 = "[stateless] handleProcessNext, pathUrl is "
            r7.<init>(r8)     // Catch:{ Throwable -> 0x00a2 }
            r7.append(r2)     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x00a2 }
            r6[r4] = r7     // Catch:{ Throwable -> 0x00a2 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r3, (java.lang.Object[]) r6)     // Catch:{ Throwable -> 0x00a2 }
            r3 = 0
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0061 }
            byte[] r6 = com.umeng.commonsdk.stateless.f.a((java.lang.String) r6)     // Catch:{ Exception -> 0x0061 }
            r3 = r6
        L_0x0061:
            boolean r1 = r1.a(r3, r2)     // Catch:{ Throwable -> 0x00a2 }
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = "walle"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r3 = "[stateless] Send envelope file success, delete it."
            r2[r4] = r3     // Catch:{ Throwable -> 0x00a2 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Throwable -> 0x00a2 }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Throwable -> 0x00a2 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x00a2 }
            boolean r0 = r1.delete()     // Catch:{ Throwable -> 0x00a2 }
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "walle"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r3 = "[stateless] Failed to delete already processed file. We try again after delete failed."
            r2[r4] = r3     // Catch:{ Throwable -> 0x00a2 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ Throwable -> 0x00a2 }
            r1.delete()     // Catch:{ Throwable -> 0x00a2 }
        L_0x008f:
            r0 = 273(0x111, float:3.83E-43)
            b(r0)     // Catch:{ Throwable -> 0x00a2 }
            goto L_0x00a1
        L_0x0095:
            java.lang.String r0 = "walle"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00a2 }
            java.lang.String r2 = "[stateless] Send envelope file failed, abandon and wait next trigger!"
            r1[r4] = r2     // Catch:{ Throwable -> 0x00a2 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r0, (java.lang.Object[]) r1)     // Catch:{ Throwable -> 0x00a2 }
            return
        L_0x00a1:
            return
        L_0x00a2:
            r0 = move-exception
            android.content.Context r1 = f80905b
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
            return
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.d.e():void");
    }

    public static void a(int i2) {
        if (h && f80907d != null) {
            Message obtainMessage = f80907d.obtainMessage();
            obtainMessage.what = i2;
            f80907d.sendMessage(obtainMessage);
        }
    }

    public static void b(int i2) {
        try {
            if (h && f80907d != null && !f80907d.hasMessages(i2)) {
                ULog.i("walle", "[stateless] sendMsgOnce !!!!");
                Message obtainMessage = f80907d.obtainMessage();
                obtainMessage.what = i2;
                f80907d.sendMessage(obtainMessage);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f80905b, th);
        }
    }

    public d(Context context) {
        synchronized (f80908e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f80905b = applicationContext;
                    if (applicationContext != null && f80906c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f80906c = handlerThread;
                        handlerThread.start();
                        if (f80907d == null) {
                            f80907d = new Handler(f80906c.getLooper()) {
                                public void handleMessage(Message message) {
                                    int i = message.what;
                                    if (i != 273) {
                                        if (i == 512) {
                                            d.f();
                                        }
                                        return;
                                    }
                                    d.e();
                                }
                            };
                        }
                        if (DeviceConfig.checkPermission(f80905b, "android.permission.ACCESS_NETWORK_STATE")) {
                            ULog.i("walle", "[stateless] begin register receiver");
                            if (g == null) {
                                IntentFilter intentFilter = new IntentFilter();
                                g = intentFilter;
                                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                if (i != null) {
                                    ULog.i("walle", "[stateless] register receiver ok");
                                    f80905b.registerReceiver(i, g);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }
}
