package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.aj;

public abstract class ex extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    protected int f81991a;

    /* renamed from: a  reason: collision with other field name */
    protected Context f321a;

    public ex(Context context, int i) {
        this.f81991a = i;
        this.f321a = context;
    }

    public static void a(Context context, is isVar) {
        ej a2 = ek.a().a();
        String a3 = a2 == null ? "" : a2.a();
        if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(isVar.a())) {
            a(context, isVar, a3);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:36|35|50|52|53|55|56|23|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(3:16|17|(2:19|20))|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:33|34|40|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x009c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x0085=Splitter:B:44:0x0085, B:55:0x009c=Splitter:B:55:0x009c, B:21:0x005f=Splitter:B:21:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r6, com.xiaomi.push.is r7, java.lang.String r8) {
        /*
            byte[] r7 = com.xiaomi.push.ju.a(r7)
            byte[] r7 = com.xiaomi.push.eo.b(r8, r7)
            if (r7 == 0) goto L_0x00a4
            int r8 = r7.length
            if (r8 != 0) goto L_0x000f
            goto L_0x00a4
        L_0x000f:
            java.lang.Object r8 = com.xiaomi.push.ep.f81985a
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            java.lang.String r3 = "push_cdata.lock"
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            com.xiaomi.push.z.a((java.io.File) r1)     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x008c, all -> 0x0076 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ IOException -> 0x0074, all -> 0x0070 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ IOException -> 0x0074, all -> 0x0070 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.String r4 = "push_cdata.data"
            r3.<init>(r6, r4)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r5 = 1
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            int r0 = r7.length     // Catch:{ IOException -> 0x006e, all -> 0x0066 }
            byte[] r0 = com.xiaomi.push.ad.a((int) r0)     // Catch:{ IOException -> 0x006e, all -> 0x0066 }
            r6.write(r0)     // Catch:{ IOException -> 0x006e, all -> 0x0066 }
            r6.write(r7)     // Catch:{ IOException -> 0x006e, all -> 0x0066 }
            r6.flush()     // Catch:{ IOException -> 0x006e, all -> 0x0066 }
            if (r1 == 0) goto L_0x005f
            boolean r7 = r1.isValid()     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x005f
            r1.release()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            com.xiaomi.push.z.a((java.io.Closeable) r6)     // Catch:{ all -> 0x009a }
        L_0x0062:
            com.xiaomi.push.z.a((java.io.Closeable) r2)     // Catch:{ all -> 0x009a }
            goto L_0x00a0
        L_0x0066:
            r7 = move-exception
            goto L_0x006b
        L_0x0068:
            r6 = move-exception
            r7 = r6
            r6 = r0
        L_0x006b:
            r0 = r1
            goto L_0x007a
        L_0x006d:
            r6 = r0
        L_0x006e:
            r0 = r1
            goto L_0x008e
        L_0x0070:
            r6 = move-exception
            r7 = r6
            r6 = r0
            goto L_0x007a
        L_0x0074:
            r6 = r0
            goto L_0x008e
        L_0x0076:
            r6 = move-exception
            r7 = r6
            r6 = r0
            r2 = r6
        L_0x007a:
            if (r0 == 0) goto L_0x0085
            boolean r1 = r0.isValid()     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0085
            r0.release()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            com.xiaomi.push.z.a((java.io.Closeable) r6)     // Catch:{ all -> 0x009a }
            com.xiaomi.push.z.a((java.io.Closeable) r2)     // Catch:{ all -> 0x009a }
            throw r7     // Catch:{ all -> 0x009a }
        L_0x008c:
            r6 = r0
            r2 = r6
        L_0x008e:
            if (r0 == 0) goto L_0x009c
            boolean r7 = r0.isValid()     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x009c
            r0.release()     // Catch:{ IOException -> 0x009c }
            goto L_0x009c
        L_0x009a:
            r6 = move-exception
            goto L_0x00a2
        L_0x009c:
            com.xiaomi.push.z.a((java.io.Closeable) r6)     // Catch:{ all -> 0x009a }
            goto L_0x0062
        L_0x00a0:
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            return
        L_0x00a2:
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            throw r6
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ex.a(android.content.Context, com.xiaomi.push.is, java.lang.String):void");
    }

    public abstract im a();

    /* renamed from: a  reason: collision with other method in class */
    public abstract String m213a();

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public boolean m214a() {
        return ah.a(this.f321a, String.valueOf(a()), (long) this.f81991a);
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public void run() {
        if (a()) {
            ej a2 = ek.a().a();
            String a3 = a2 == null ? "" : a2.a();
            if (!TextUtils.isEmpty(a3) && b()) {
                String a4 = a();
                if (!TextUtils.isEmpty(a4)) {
                    is isVar = new is();
                    isVar.a(a4);
                    isVar.a(System.currentTimeMillis());
                    isVar.a(a());
                    a(this.f321a, isVar, a3);
                }
            }
        }
    }
}
