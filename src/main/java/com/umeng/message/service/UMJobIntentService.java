package com.umeng.message.service;

import android.content.Intent;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;

public class UMJobIntentService extends JobIntentService {

    /* renamed from: a  reason: collision with root package name */
    private static int f81351a = 21000;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<Class<? extends UMJobIntentService>, Integer> f81352b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static Object f81353c = new Object();

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        MLog.i("wuchi", "--->>> UMJobIntentService onHandleWork");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void enqueueWork(android.content.Context r7, java.lang.Class<? extends com.umeng.message.service.UMJobIntentService> r8, android.content.Intent r9) {
        /*
            java.lang.Object r0 = f81353c
            monitor-enter(r0)
            java.lang.String r1 = "wuchi"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            java.lang.String r5 = "--->>> UMJobIntentService enqueueWork, cla is "
            r4.<init>(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = r8.getName()     // Catch:{ all -> 0x006c }
            r4.append(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006c }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x006c }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r1, (java.lang.Object[]) r3)     // Catch:{ all -> 0x006c }
            if (r7 == 0) goto L_0x006a
            if (r8 == 0) goto L_0x006a
            if (r9 != 0) goto L_0x0027
            goto L_0x006a
        L_0x0027:
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r1 = f81352b     // Catch:{ all -> 0x006c }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x0042
            int r1 = f81351a     // Catch:{ all -> 0x006c }
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r3 = f81352b     // Catch:{ all -> 0x006c }
            int r3 = r3.size()     // Catch:{ all -> 0x006c }
            int r1 = r1 + r3
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r3 = f81352b     // Catch:{ all -> 0x006c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006c }
            r3.put(r8, r4)     // Catch:{ all -> 0x006c }
            goto L_0x004e
        L_0x0042:
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r1 = f81352b     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x006c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x006c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x006c }
        L_0x004e:
            java.lang.String r3 = "wuchi"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            java.lang.String r6 = "UMJobIntentService cla jobId is "
            r4.<init>(r6)     // Catch:{ all -> 0x006c }
            r4.append(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006c }
            r2[r5] = r4     // Catch:{ all -> 0x006c }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ all -> 0x006c }
            enqueueWork((android.content.Context) r7, (java.lang.Class) r8, (int) r1, (android.content.Intent) r9)     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.service.UMJobIntentService.enqueueWork(android.content.Context, java.lang.Class, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void enqueueWork(android.content.Context r7, java.lang.String r8, android.content.Intent r9) {
        /*
            java.lang.Object r0 = f81353c
            monitor-enter(r0)
            java.lang.String r1 = "wuchi"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "--->>> UMJobIntentService enqueueWork, className is "
            r4.<init>(r5)     // Catch:{ all -> 0x0082 }
            r4.append(r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0082 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0082 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r1, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0080
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0080
            if (r9 != 0) goto L_0x0027
            goto L_0x0080
        L_0x0027:
            r1 = 0
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            if (r8 != 0) goto L_0x003d
            java.lang.String r7 = "wuchi"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0082 }
            java.lang.String r9 = "UMJobIntentService cla == null"
            r8[r5] = r9     // Catch:{ all -> 0x0082 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r7, (java.lang.Object[]) r8)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x003d:
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r1 = f81352b     // Catch:{ all -> 0x0082 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0058
            int r1 = f81351a     // Catch:{ all -> 0x0082 }
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r3 = f81352b     // Catch:{ all -> 0x0082 }
            int r3 = r3.size()     // Catch:{ all -> 0x0082 }
            int r1 = r1 + r3
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r3 = f81352b     // Catch:{ all -> 0x0082 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0082 }
            r3.put(r8, r4)     // Catch:{ all -> 0x0082 }
            goto L_0x0064
        L_0x0058:
            java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> r1 = f81352b     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0082 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0082 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0082 }
        L_0x0064:
            java.lang.String r3 = "wuchi"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = "UMJobIntentService className jobId is "
            r4.<init>(r6)     // Catch:{ all -> 0x0082 }
            r4.append(r1)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0082 }
            r2[r5] = r4     // Catch:{ all -> 0x0082 }
            com.umeng.commonsdk.statistics.common.MLog.i((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0082 }
            enqueueWork((android.content.Context) r7, (java.lang.Class) r8, (int) r1, (android.content.Intent) r9)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.service.UMJobIntentService.enqueueWork(android.content.Context, java.lang.String, android.content.Intent):void");
    }
}
