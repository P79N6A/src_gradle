package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f82478a;

    /* renamed from: a  reason: collision with other field name */
    private Context f914a;

    /* renamed from: a  reason: collision with other field name */
    private final Object f915a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private final String f916a = "mipush_region";

    /* renamed from: b  reason: collision with root package name */
    private final Object f82479b = new Object();

    /* renamed from: b  reason: collision with other field name */
    private final String f917b = "mipush_country_code";

    /* renamed from: c  reason: collision with root package name */
    private final String f82480c = "mipush_region.lock";

    /* renamed from: d  reason: collision with root package name */
    private final String f82481d = "mipush_country_code.lock";

    /* renamed from: e  reason: collision with root package name */
    private volatile String f82482e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f82483f;

    public a(Context context) {
        this.f914a = context;
    }

    public static a a(Context context) {
        if (f82478a == null) {
            synchronized (a.class) {
                try {
                    if (f82478a == null) {
                        f82478a = new a(context);
                    }
                } catch (Throwable th) {
                    Class<a> cls = a.class;
                    throw th;
                }
            }
        }
        return f82478a;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e A[SYNTHETIC, Splitter:B:33:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getFilesDir()
            r0.<init>(r1, r6)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0023
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "No ready file to get data from "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r5)
            goto L_0x0080
        L_0x0023:
            monitor-enter(r8)
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r6.<init>(r5, r7)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            com.xiaomi.push.z.a((java.io.File) r6)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r7 = "rw"
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.nio.channels.FileLock r6 = r6.lock()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r7 = com.xiaomi.push.z.a((java.io.File) r0)     // Catch:{ Exception -> 0x0059 }
            if (r6 == 0) goto L_0x0053
            boolean r0 = r6.isValid()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0053
            r6.release()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x0099 }
        L_0x0053:
            com.xiaomi.push.z.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r8)     // Catch:{ all -> 0x0099 }
            r2 = r7
            goto L_0x0080
        L_0x0059:
            r7 = move-exception
            goto L_0x0069
        L_0x005b:
            r6 = move-exception
            goto L_0x0088
        L_0x005d:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            r6 = r5
            r5 = r2
            goto L_0x0088
        L_0x0065:
            r5 = move-exception
            r7 = r5
            r5 = r2
            r6 = r5
        L_0x0069:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x007c
            boolean r7 = r6.isValid()     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x007c
            r6.release()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x0099 }
        L_0x007c:
            com.xiaomi.push.z.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r8)     // Catch:{ all -> 0x0099 }
        L_0x0080:
            return r2
        L_0x0081:
            r7 = move-exception
            r2 = r5
            r5 = r6
            r6 = r7
            r3 = r2
            r2 = r5
            r5 = r3
        L_0x0088:
            if (r2 == 0) goto L_0x009b
            boolean r7 = r2.isValid()     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x009b
            r2.release()     // Catch:{ IOException -> 0x0094 }
            goto L_0x009b
        L_0x0094:
            r7 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r5 = move-exception
            goto L_0x009f
        L_0x009b:
            com.xiaomi.push.z.a((java.io.Closeable) r5)     // Catch:{ all -> 0x0099 }
            throw r6     // Catch:{ all -> 0x0099 }
        L_0x009f:
            monitor-exit(r8)     // Catch:{ all -> 0x0099 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.Object):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC, Splitter:B:30:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r3 = this;
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r1.<init>(r2, r7)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            com.xiaomi.push.z.a((java.io.File) r1)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.lang.String r2 = "rw"
            r7.<init>(r1, r2)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            java.nio.channels.FileChannel r1 = r7.getChannel()     // Catch:{ Exception -> 0x0043 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ Exception -> 0x0043 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r0.<init>(r4, r6)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            com.xiaomi.push.z.a((java.io.File) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 == 0) goto L_0x0039
            boolean r4 = r1.isValid()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0039
            r1.release()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0072 }
        L_0x0039:
            com.xiaomi.push.z.a((java.io.Closeable) r7)     // Catch:{ all -> 0x0072 }
            goto L_0x005e
        L_0x003d:
            r4 = move-exception
            r0 = r1
            goto L_0x0061
        L_0x0040:
            r4 = move-exception
            r0 = r1
            goto L_0x004a
        L_0x0043:
            r4 = move-exception
            goto L_0x004a
        L_0x0045:
            r4 = move-exception
            r7 = r0
            goto L_0x0061
        L_0x0048:
            r4 = move-exception
            r7 = r0
        L_0x004a:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0039
            boolean r4 = r0.isValid()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0039
            r0.release()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0039
        L_0x0059:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0072 }
            goto L_0x0039
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            return
        L_0x0060:
            r4 = move-exception
        L_0x0061:
            if (r0 == 0) goto L_0x0074
            boolean r5 = r0.isValid()     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x0074
            r0.release()     // Catch:{ IOException -> 0x006d }
            goto L_0x0074
        L_0x006d:
            r5 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0072 }
            goto L_0x0074
        L_0x0072:
            r4 = move-exception
            goto L_0x0078
        L_0x0074:
            com.xiaomi.push.z.a((java.io.Closeable) r7)     // Catch:{ all -> 0x0072 }
            throw r4     // Catch:{ all -> 0x0072 }
        L_0x0078:
            monitor-exit(r8)     // Catch:{ all -> 0x0072 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    public String a() {
        if (TextUtils.isEmpty(this.f82482e)) {
            this.f82482e = a(this.f914a, "mipush_region", "mipush_region.lock", this.f915a);
        }
        return this.f82482e;
    }

    public void a(String str) {
        if (!TextUtils.equals(str, this.f82482e)) {
            this.f82482e = str;
            a(this.f914a, this.f82482e, "mipush_region", "mipush_region.lock", this.f915a);
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f82483f)) {
            this.f82483f = a(this.f914a, "mipush_country_code", "mipush_country_code.lock", this.f82479b);
        }
        return this.f82483f;
    }

    public void b(String str) {
        if (!TextUtils.equals(str, this.f82483f)) {
            this.f82483f = str;
            a(this.f914a, this.f82483f, "mipush_country_code", "mipush_country_code.lock", this.f82479b);
        }
    }
}
