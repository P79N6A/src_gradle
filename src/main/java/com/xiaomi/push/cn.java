package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class cn extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final int f81907a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference f232a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f81908b;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i) {
            return h.a(m.a(p.FIXED).a(i).a());
        }
    }

    public cn(Handler handler, Context context, int i) {
        this.f232a = new WeakReference(handler);
        this.f81908b = new WeakReference(context);
        this.f81907a = i;
        start();
    }

    private Context a() {
        if (this.f232a == null) {
            return null;
        }
        return (Context) this.f81908b.get();
    }

    /* renamed from: a  reason: collision with other method in class */
    private Handler m168a() {
        if (this.f232a == null) {
            return null;
        }
        return (Handler) this.f232a.get();
    }

    /* renamed from: a  reason: collision with other method in class */
    private HashMap m169a() {
        HashMap hashMap = new HashMap();
        String a2 = ck.a(a());
        if (a2 != null) {
            String substring = a2.substring(0, a2.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR));
            ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(40);
            try {
                Runnable[] runnableArr = new Runnable[255];
                for (int i = 1; i < 255; i++) {
                    runnableArr[i] = new cf(this, substring + ClassUtils.PACKAGE_SEPARATOR + i);
                }
                for (int i2 = 1; i2 < 255; i2++) {
                    com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.execute(runnableArr[i2]);
                }
                com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.shutdown();
            } catch (Exception unused) {
                com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.shutdown();
            } catch (Throwable th) {
                com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.shutdown();
                try {
                    com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.awaitTermination(10000, TimeUnit.MILLISECONDS);
                } catch (Exception unused2) {
                }
                throw th;
            }
            try {
                com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool.awaitTermination(10000, TimeUnit.MILLISECONDS);
            } catch (Exception unused3) {
            }
            a(substring, 1, 255, hashMap);
        }
        return hashMap;
    }

    public static void a(Context context, Handler handler, int i) {
        new cn(handler, context, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078 A[SYNTHETIC, Splitter:B:36:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007e A[SYNTHETIC, Splitter:B:42:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084 A[SYNTHETIC, Splitter:B:48:0x0084] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r6, int r7, int r8, java.util.HashMap r9) {
        /*
            r5 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0075 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0075 }
            java.lang.String r3 = "/proc/net/arp"
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x007c, all -> 0x0075 }
            r1.readLine()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            int r8 = r8 - r7
            int r8 = r8 + 1
            java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r0 = 0
            r2 = 0
        L_0x0017:
            if (r2 >= r8) goto L_0x0032
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3.append(r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            java.lang.String r4 = "."
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3.append(r2)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r7[r2] = r3     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0032:
            java.lang.String r6 = r1.readLine()     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r6 == 0) goto L_0x0069
            java.lang.String r8 = "[ ]+"
            java.lang.String[] r6 = r6.split(r8)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            int r8 = r6.length     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r2 = 6
            if (r8 < r2) goto L_0x0032
            r8 = r6[r0]
            r2 = 3
            r6 = r6[r2]
            int r2 = r7.length     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            r3 = 0
        L_0x0049:
            if (r3 >= r2) goto L_0x0032
            r4 = r7[r3]     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            boolean r4 = r4.equals(r8)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "..:..:..:..:..:.."
            boolean r4 = r6.matches(r4)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r4 == 0) goto L_0x0066
            java.lang.String r4 = "00:00:00:00:00:00"
            boolean r4 = r4.equals(r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
            if (r4 != 0) goto L_0x0066
            r9.put(r8, r6)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0071, all -> 0x006e }
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x0049
        L_0x0069:
            r1.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0087
        L_0x006d:
            return
        L_0x006e:
            r6 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0071:
            r0 = r1
            goto L_0x007c
        L_0x0073:
            r0 = r1
            goto L_0x0082
        L_0x0075:
            r6 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            throw r6
        L_0x007c:
            if (r0 == 0) goto L_0x0087
            r0.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return
        L_0x0082:
            if (r0 == 0) goto L_0x0087
            r0.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cn.a(java.lang.String, int, int, java.util.HashMap):void");
    }

    private void a(HashMap hashMap) {
        Handler a2 = a();
        Message obtainMessage = a2.obtainMessage(this.f81907a);
        obtainMessage.obj = hashMap;
        a2.sendMessage(obtainMessage);
    }

    public void run() {
        a(a());
    }
}
