package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.bugly.CrashModule;
import com.tencent.bugly.crashreport.common.info.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final long f79484a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    private static n f79485b;

    /* renamed from: c  reason: collision with root package name */
    private Context f79486c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f79487d = a.b().f79277d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, Map<String, m>> f79488e = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f79489f;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            nVar = f79485b;
        }
        return nVar;
    }

    private n(Context context) {
        this.f79486c = context;
        this.f79489f = c.a(context, "crashrecord", 0);
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f79485b == null) {
                f79485b = new n(context);
            }
            nVar = f79485b;
        }
        return nVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0050 A[SYNTHETIC, Splitter:B:35:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T extends java.util.List<?>> T c(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0056 }
            android.content.Context r3 = r5.f79486c     // Catch:{ Exception -> 0x0056 }
            java.lang.String r4 = "crashrecord"
            java.io.File r3 = r3.getDir(r4, r1)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0056 }
            r2.<init>(r3, r6)     // Catch:{ Exception -> 0x0056 }
            boolean r6 = r2.exists()     // Catch:{ Exception -> 0x0056 }
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0042, ClassNotFoundException -> 0x0034, all -> 0x0031 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0042, ClassNotFoundException -> 0x0034, all -> 0x0031 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0042, ClassNotFoundException -> 0x0034, all -> 0x0031 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0042, ClassNotFoundException -> 0x0034, all -> 0x0031 }
            java.lang.Object r2 = r6.readObject()     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0035 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0035 }
            r6.close()     // Catch:{ Exception -> 0x0056 }
            monitor-exit(r5)
            return r2
        L_0x0031:
            r2 = move-exception
            r6 = r0
            goto L_0x004e
        L_0x0034:
            r6 = r0
        L_0x0035:
            java.lang.String r2 = "get object error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x004d }
            com.tencent.bugly.proguard.x.a(r2, r3)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x005d
        L_0x003e:
            r6.close()     // Catch:{ Exception -> 0x0056 }
            goto L_0x005d
        L_0x0042:
            r6 = r0
        L_0x0043:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x004d }
            com.tencent.bugly.proguard.x.a(r2, r3)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x005d
            goto L_0x003e
        L_0x004d:
            r2 = move-exception
        L_0x004e:
            if (r6 == 0) goto L_0x0053
            r6.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0053:
            throw r2     // Catch:{ Exception -> 0x0056 }
        L_0x0054:
            r6 = move-exception
            goto L_0x005f
        L_0x0056:
            java.lang.String r6 = "readCrashRecord error"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0054 }
            com.tencent.bugly.proguard.x.e(r6, r1)     // Catch:{ all -> 0x0054 }
        L_0x005d:
            monitor-exit(r5)
            return r0
        L_0x005f:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.n.c(int):java.util.List");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean b(int r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            java.util.List r1 = r13.c((int) r14)     // Catch:{ Exception -> 0x0084 }
            if (r1 != 0) goto L_0x000a
            monitor-exit(r13)
            return r0
        L_0x000a:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0084 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0084 }
            r4.<init>()     // Catch:{ Exception -> 0x0084 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0084 }
            r5.<init>()     // Catch:{ Exception -> 0x0084 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x0084 }
        L_0x001c:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0084 }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0084 }
            com.tencent.bugly.proguard.m r7 = (com.tencent.bugly.proguard.m) r7     // Catch:{ Exception -> 0x0084 }
            java.lang.String r10 = r7.f79479b     // Catch:{ Exception -> 0x0084 }
            if (r10 == 0) goto L_0x0040
            java.lang.String r10 = r7.f79479b     // Catch:{ Exception -> 0x0084 }
            java.lang.String r11 = r13.f79487d     // Catch:{ Exception -> 0x0084 }
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x0084 }
            if (r10 == 0) goto L_0x0040
            int r10 = r7.f79481d     // Catch:{ Exception -> 0x0084 }
            if (r10 <= 0) goto L_0x0040
            r4.add(r7)     // Catch:{ Exception -> 0x0084 }
        L_0x0040:
            long r10 = r7.f79480c     // Catch:{ Exception -> 0x0084 }
            r12 = 0
            long r10 = r10 + r8
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x001c
            r5.add(r7)     // Catch:{ Exception -> 0x0084 }
            goto L_0x001c
        L_0x004c:
            java.util.Collections.sort(r4)     // Catch:{ Exception -> 0x0084 }
            int r6 = r4.size()     // Catch:{ Exception -> 0x0084 }
            r7 = 2
            if (r6 < r7) goto L_0x007a
            int r5 = r4.size()     // Catch:{ Exception -> 0x0084 }
            r6 = 1
            if (r5 <= 0) goto L_0x0078
            int r5 = r4.size()     // Catch:{ Exception -> 0x0084 }
            int r5 = r5 - r6
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0084 }
            com.tencent.bugly.proguard.m r4 = (com.tencent.bugly.proguard.m) r4     // Catch:{ Exception -> 0x0084 }
            long r4 = r4.f79480c     // Catch:{ Exception -> 0x0084 }
            r7 = 0
            long r4 = r4 + r8
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0078
            r1.clear()     // Catch:{ Exception -> 0x0084 }
            r13.a((int) r14, (T) r1)     // Catch:{ Exception -> 0x0084 }
            monitor-exit(r13)
            return r0
        L_0x0078:
            monitor-exit(r13)
            return r6
        L_0x007a:
            r1.removeAll(r5)     // Catch:{ Exception -> 0x0084 }
            r13.a((int) r14, (T) r1)     // Catch:{ Exception -> 0x0084 }
            monitor-exit(r13)
            return r0
        L_0x0082:
            r14 = move-exception
            goto L_0x008d
        L_0x0084:
            java.lang.String r14 = "isFrequentCrash failed"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0082 }
            com.tencent.bugly.proguard.x.e(r14, r1)     // Catch:{ all -> 0x0082 }
            monitor-exit(r13)
            return r0
        L_0x008d:
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.n.b(int):boolean");
    }

    public final synchronized boolean a(final int i) {
        boolean z = true;
        try {
            SharedPreferences sharedPreferences = this.f79489f;
            boolean z2 = sharedPreferences.getBoolean(i + "_" + this.f79487d, true);
            try {
                w.a().a(new Runnable() {
                    public final void run() {
                        boolean b2 = n.this.b(i);
                        SharedPreferences.Editor edit = n.this.f79489f.edit();
                        edit.putBoolean(i + "_" + n.this.f79487d, !b2).commit();
                    }
                });
                return z2;
            } catch (Exception unused) {
                z = z2;
                x.e("canInit error", new Object[0]);
                return z;
            }
        } catch (Exception unused2) {
            x.e("canInit error", new Object[0]);
            return z;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC, Splitter:B:32:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T extends java.util.List<?>> void a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0050 }
            android.content.Context r2 = r4.f79486c     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0050 }
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x0050 }
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0034 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0034 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0034 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0034 }
            r2.writeObject(r6)     // Catch:{ IOException -> 0x002e, all -> 0x002a }
            r2.close()     // Catch:{ Exception -> 0x0050 }
            monitor-exit(r4)
            return
        L_0x002a:
            r5 = move-exception
            r6 = r5
            r5 = r2
            goto L_0x0048
        L_0x002e:
            r5 = move-exception
            r6 = r5
            r5 = r2
            goto L_0x0035
        L_0x0032:
            r6 = move-exception
            goto L_0x0048
        L_0x0034:
            r6 = move-exception
        L_0x0035:
            com.google.a.a.a.a.a.a.b(r6)     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = "open record file error"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0032 }
            com.tencent.bugly.proguard.x.a(r6, r1)     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x0046
            r5.close()     // Catch:{ Exception -> 0x0050 }
            monitor-exit(r4)
            return
        L_0x0046:
            monitor-exit(r4)
            return
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r5.close()     // Catch:{ Exception -> 0x0050 }
        L_0x004d:
            throw r6     // Catch:{ Exception -> 0x0050 }
        L_0x004e:
            r5 = move-exception
            goto L_0x0059
        L_0x0050:
            java.lang.String r5 = "writeCrashRecord error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x004e }
            com.tencent.bugly.proguard.x.e(r5, r6)     // Catch:{ all -> 0x004e }
            monitor-exit(r4)
            return
        L_0x0059:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.n.a(int, java.util.List):void");
    }

    public final synchronized void a(int i, final int i2) {
        w.a().a(new Runnable(CrashModule.MODULE_ID) {
            public final void run() {
                m mVar;
                try {
                    if (!TextUtils.isEmpty(n.this.f79487d)) {
                        List<m> a2 = n.this.c(CrashModule.MODULE_ID);
                        if (a2 == null) {
                            a2 = new ArrayList<>();
                        }
                        if (n.this.f79488e.get(Integer.valueOf(CrashModule.MODULE_ID)) == null) {
                            n.this.f79488e.put(Integer.valueOf(CrashModule.MODULE_ID), new HashMap());
                        }
                        if (((Map) n.this.f79488e.get(Integer.valueOf(CrashModule.MODULE_ID))).get(n.this.f79487d) == null) {
                            mVar = new m();
                            mVar.f79478a = (long) CrashModule.MODULE_ID;
                            mVar.g = n.f79484a;
                            mVar.f79479b = n.this.f79487d;
                            mVar.f79483f = a.b().j;
                            a.b().getClass();
                            mVar.f79482e = "2.6.6";
                            mVar.f79480c = System.currentTimeMillis();
                            mVar.f79481d = i2;
                            ((Map) n.this.f79488e.get(Integer.valueOf(CrashModule.MODULE_ID))).put(n.this.f79487d, mVar);
                        } else {
                            mVar = (m) ((Map) n.this.f79488e.get(Integer.valueOf(CrashModule.MODULE_ID))).get(n.this.f79487d);
                            mVar.f79481d = i2;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z = false;
                        for (m mVar2 : a2) {
                            if (mVar2.g == mVar.g && mVar2.f79479b != null && mVar2.f79479b.equalsIgnoreCase(mVar.f79479b)) {
                                z = true;
                                mVar2.f79481d = mVar.f79481d;
                            }
                            if ((mVar2.f79482e != null && !mVar2.f79482e.equalsIgnoreCase(mVar.f79482e)) || ((mVar2.f79483f != null && !mVar2.f79483f.equalsIgnoreCase(mVar.f79483f)) || mVar2.f79481d <= 0)) {
                                arrayList.add(mVar2);
                            }
                        }
                        a2.removeAll(arrayList);
                        if (!z) {
                            a2.add(mVar);
                        }
                        n.this.a(CrashModule.MODULE_ID, (List) a2);
                    }
                } catch (Exception unused) {
                    x.e("saveCrashRecord failed", new Object[0]);
                }
            }
        });
    }
}
