package com.taobao.accs.data;

import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f78936a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f78937b;

    /* renamed from: c  reason: collision with root package name */
    private int f78938c;

    /* renamed from: d  reason: collision with root package name */
    private String f78939d;

    /* renamed from: e  reason: collision with root package name */
    private long f78940e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile int f78941f;
    private ScheduledFuture<?> g;
    /* access modifiers changed from: private */
    public Map<Integer, byte[]> h = new TreeMap(new b(this));

    public void a(long j) {
        if (j <= 0) {
            j = 30000;
        }
        this.g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new c(this), j, TimeUnit.MILLISECONDS);
    }

    private static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = f78936a[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = f78936a[bArr[i2] & 15];
        }
        return cArr;
    }

    public a(String str, int i, String str2) {
        this.f78937b = str;
        this.f78938c = i;
        this.f78939d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0144, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(int r13, int r14, byte[] r15) {
        /*
            r12 = this;
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.D
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "AssembleMessage"
            java.lang.String r6 = "putBurst"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "dataId"
            r7[r5] = r8
            java.lang.String r8 = r12.f78937b
            r7[r3] = r8
            java.lang.String r8 = "index"
            r7[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r7[r2] = r8
            com.taobao.accs.utl.ALog.d(r0, r6, r7)
        L_0x0028:
            int r0 = r12.f78938c
            r6 = 0
            if (r14 == r0) goto L_0x0037
            java.lang.String r13 = "AssembleMessage"
            java.lang.String r14 = "putBurst fail as burstNums not match"
            java.lang.Object[] r15 = new java.lang.Object[r5]
            com.taobao.accs.utl.ALog.e(r13, r14, r15)
            return r6
        L_0x0037:
            if (r13 < 0) goto L_0x015f
            if (r13 < r14) goto L_0x003d
            goto L_0x015f
        L_0x003d:
            monitor-enter(r12)
            int r14 = r12.f78941f     // Catch:{ all -> 0x015c }
            if (r14 != 0) goto L_0x0145
            java.util.Map<java.lang.Integer, byte[]> r14 = r12.h     // Catch:{ all -> 0x015c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x015c }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ all -> 0x015c }
            if (r14 == 0) goto L_0x0059
            java.lang.String r13 = "AssembleMessage"
            java.lang.String r14 = "putBurst fail as exist old"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x015c }
            com.taobao.accs.utl.ALog.e(r13, r14, r15)     // Catch:{ all -> 0x015c }
            monitor-exit(r12)     // Catch:{ all -> 0x015c }
            return r6
        L_0x0059:
            java.util.Map<java.lang.Integer, byte[]> r14 = r12.h     // Catch:{ all -> 0x015c }
            boolean r14 = r14.isEmpty()     // Catch:{ all -> 0x015c }
            if (r14 == 0) goto L_0x0067
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015c }
            r12.f78940e = r7     // Catch:{ all -> 0x015c }
        L_0x0067:
            java.util.Map<java.lang.Integer, byte[]> r14 = r12.h     // Catch:{ all -> 0x015c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x015c }
            r14.put(r13, r15)     // Catch:{ all -> 0x015c }
            java.util.Map<java.lang.Integer, byte[]> r13 = r12.h     // Catch:{ all -> 0x015c }
            int r13 = r13.size()     // Catch:{ all -> 0x015c }
            int r14 = r12.f78938c     // Catch:{ all -> 0x015c }
            if (r13 != r14) goto L_0x015a
            java.util.Map<java.lang.Integer, byte[]> r13 = r12.h     // Catch:{ all -> 0x015c }
            java.util.Collection r13 = r13.values()     // Catch:{ all -> 0x015c }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x015c }
            r14 = r6
        L_0x0085:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x015c }
            if (r15 == 0) goto L_0x00a5
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x015c }
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x015c }
            if (r14 != 0) goto L_0x0095
            r14 = r15
            goto L_0x0085
        L_0x0095:
            int r0 = r14.length     // Catch:{ all -> 0x015c }
            int r7 = r15.length     // Catch:{ all -> 0x015c }
            int r0 = r0 + r7
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x015c }
            int r7 = r14.length     // Catch:{ all -> 0x015c }
            java.lang.System.arraycopy(r14, r5, r0, r5, r7)     // Catch:{ all -> 0x015c }
            int r14 = r14.length     // Catch:{ all -> 0x015c }
            int r7 = r15.length     // Catch:{ all -> 0x015c }
            java.lang.System.arraycopy(r15, r5, r0, r14, r7)     // Catch:{ all -> 0x015c }
            r14 = r0
            goto L_0x0085
        L_0x00a5:
            java.lang.String r13 = r12.f78939d     // Catch:{ all -> 0x015c }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x015c }
            r15 = 5
            r0 = 6
            if (r13 != 0) goto L_0x00e6
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x015c }
            byte[] r7 = org.android.agoo.common.a.a((byte[]) r14)     // Catch:{ all -> 0x015c }
            char[] r7 = a((byte[]) r7)     // Catch:{ all -> 0x015c }
            r13.<init>(r7)     // Catch:{ all -> 0x015c }
            java.lang.String r7 = r12.f78939d     // Catch:{ all -> 0x015c }
            boolean r7 = r7.equals(r13)     // Catch:{ all -> 0x015c }
            if (r7 != 0) goto L_0x00e6
            java.lang.String r14 = "AssembleMessage"
            java.lang.String r7 = "putBurst fail"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x015c }
            java.lang.String r9 = "dataId"
            r8[r5] = r9     // Catch:{ all -> 0x015c }
            java.lang.String r9 = r12.f78937b     // Catch:{ all -> 0x015c }
            r8[r3] = r9     // Catch:{ all -> 0x015c }
            java.lang.String r9 = "dataMd5"
            r8[r4] = r9     // Catch:{ all -> 0x015c }
            java.lang.String r9 = r12.f78939d     // Catch:{ all -> 0x015c }
            r8[r2] = r9     // Catch:{ all -> 0x015c }
            java.lang.String r9 = "finalDataMd5"
            r8[r1] = r9     // Catch:{ all -> 0x015c }
            r8[r15] = r13     // Catch:{ all -> 0x015c }
            com.taobao.accs.utl.ALog.w(r14, r7, r8)     // Catch:{ all -> 0x015c }
            r12.f78941f = r2     // Catch:{ all -> 0x015c }
            r14 = r6
        L_0x00e6:
            r6 = 0
            if (r14 == 0) goto L_0x011c
            int r13 = r14.length     // Catch:{ all -> 0x015c }
            long r6 = (long) r13     // Catch:{ all -> 0x015c }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015c }
            long r10 = r12.f78940e     // Catch:{ all -> 0x015c }
            r13 = 0
            long r8 = r8 - r10
            r12.f78941f = r4     // Catch:{ all -> 0x015c }
            java.lang.String r13 = "AssembleMessage"
            java.lang.String r10 = "putBurst completed"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x015c }
            java.lang.String r11 = "dataId"
            r0[r5] = r11     // Catch:{ all -> 0x015c }
            java.lang.String r11 = r12.f78937b     // Catch:{ all -> 0x015c }
            r0[r3] = r11     // Catch:{ all -> 0x015c }
            java.lang.String r3 = "length"
            r0[r4] = r3     // Catch:{ all -> 0x015c }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x015c }
            r0[r2] = r3     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "cost"
            r0[r1] = r2     // Catch:{ all -> 0x015c }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x015c }
            r0[r15] = r1     // Catch:{ all -> 0x015c }
            com.taobao.accs.utl.ALog.i(r13, r10, r0)     // Catch:{ all -> 0x015c }
            goto L_0x011d
        L_0x011c:
            r8 = r6
        L_0x011d:
            com.taobao.accs.ut.monitor.AssembleMonitor r13 = new com.taobao.accs.ut.monitor.AssembleMonitor     // Catch:{ all -> 0x015c }
            java.lang.String r15 = r12.f78937b     // Catch:{ all -> 0x015c }
            int r0 = r12.f78941f     // Catch:{ all -> 0x015c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x015c }
            r13.<init>(r15, r0)     // Catch:{ all -> 0x015c }
            r13.assembleLength = r6     // Catch:{ all -> 0x015c }
            r13.assembleTimes = r8     // Catch:{ all -> 0x015c }
            anet.channel.appmonitor.IAppMonitor r15 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ all -> 0x015c }
            r15.commitStat(r13)     // Catch:{ all -> 0x015c }
            java.util.Map<java.lang.Integer, byte[]> r13 = r12.h     // Catch:{ all -> 0x015c }
            r13.clear()     // Catch:{ all -> 0x015c }
            java.util.concurrent.ScheduledFuture<?> r13 = r12.g     // Catch:{ all -> 0x015c }
            if (r13 == 0) goto L_0x0143
            java.util.concurrent.ScheduledFuture<?> r13 = r12.g     // Catch:{ all -> 0x015c }
            r13.cancel(r5)     // Catch:{ all -> 0x015c }
        L_0x0143:
            monitor-exit(r12)     // Catch:{ all -> 0x015c }
            return r14
        L_0x0145:
            java.lang.String r13 = "AssembleMessage"
            java.lang.String r14 = "putBurst fail"
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "status"
            r15[r5] = r0     // Catch:{ all -> 0x015c }
            int r0 = r12.f78941f     // Catch:{ all -> 0x015c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015c }
            r15[r3] = r0     // Catch:{ all -> 0x015c }
            com.taobao.accs.utl.ALog.e(r13, r14, r15)     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r12)     // Catch:{ all -> 0x015c }
            return r6
        L_0x015c:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x015c }
            throw r13
        L_0x015f:
            java.lang.String r13 = "AssembleMessage"
            java.lang.String r14 = "putBurst fail as burstIndex invalid"
            java.lang.Object[] r15 = new java.lang.Object[r5]
            com.taobao.accs.utl.ALog.e(r13, r14, r15)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.a.a(int, int, byte[]):byte[]");
    }
}
