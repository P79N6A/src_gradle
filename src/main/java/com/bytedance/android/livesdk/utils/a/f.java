package com.bytedance.android.livesdk.utils.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.net.InetAddress;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17556a;

    /* renamed from: b  reason: collision with root package name */
    public long f17557b;

    /* renamed from: c  reason: collision with root package name */
    public long f17558c;

    /* renamed from: d  reason: collision with root package name */
    public long f17559d;

    static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    f() {
    }

    private static long a(byte[] bArr, int i) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & Byte.MAX_VALUE) + 128;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & Byte.MAX_VALUE) + SearchJediMixFeedAdapter.f42517f;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b(byte[] r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f17556a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r5 = 0
            r6 = 13804(0x35ec, float:1.9344E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0052
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f17556a
            r14 = 0
            r15 = 13804(0x35ec, float:1.9344E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Long.TYPE
            r12 = r18
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0052:
            long r1 = a((byte[]) r19, (int) r20)
            int r3 = r20 + 4
            long r3 = a((byte[]) r0, (int) r3)
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            return r5
        L_0x0067:
            r5 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r1 = r1 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            long r3 = r3 * r5
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 / r5
            long r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.a.f.b(byte[], int):long");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f17556a, false, 13801, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f17556a, false, 13801, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            return a(InetAddress.getByName(str), 123, i);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.c("SntpClient", e2.toString());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x01fd A[Catch:{ Exception -> 0x02ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0244 A[Catch:{ Exception -> 0x02ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.net.InetAddress r33, int r34, int r35) {
        /*
            r32 = this;
            r8 = r32
            r0 = r33
            r9 = 3
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            r11 = 123(0x7b, float:1.72E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r35)
            r13 = 2
            r1[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f17556a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.net.InetAddress> r2 = java.net.InetAddress.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 13802(0x35ea, float:1.9341E-41)
            r2 = r32
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0069
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r35)
            r1[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f17556a
            r4 = 0
            r5 = 13802(0x35ea, float:1.9341E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.net.InetAddress> r0 = java.net.InetAddress.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0069:
            r1 = 0
            java.net.DatagramSocket r14 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x02ba }
            r14.<init>()     // Catch:{ Exception -> 0x02ba }
            r2 = r35
            r14.setSoTimeout(r2)     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r15 = 48
            byte[] r7 = new byte[r15]     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r6.<init>(r7, r15, r0, r11)     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r0 = 27
            r7[r10] = r0     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r1[r10] = r7     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r0 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r1[r12] = r2     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r1[r13] = r2     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            com.meituan.robust.ChangeQuickRedirect r3 = f17556a     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r11 = 0
            r18 = 13805(0x35ed, float:1.9345E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Class<byte[]> r19 = byte[].class
            r2[r10] = r19     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r2[r12] = r19     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Class r19 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r2[r13] = r19     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02b5, all -> 0x02b2 }
            r20 = r2
            r2 = r32
            r22 = r14
            r13 = r4
            r4 = r11
            r5 = r18
            r11 = r6
            r6 = r20
            r15 = r7
            r7 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r18 = 0
            r7 = 24
            if (r1 == 0) goto L_0x00fe
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1[r10] = r15     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1[r12] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r2.<init>(r13)     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r3 = 2
            r1[r3] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            com.meituan.robust.ChangeQuickRedirect r3 = f17556a     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r4 = 0
            r5 = 13805(0x35ed, float:1.9345E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r10] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r6[r12] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r20 = 2
            r6[r20] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r2 = r32
            r12 = 24
            r7 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            goto L_0x0109
        L_0x00fe:
            r12 = 24
            int r1 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x010e
            r1 = 48
            java.util.Arrays.fill(r15, r0, r1, r10)     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
        L_0x0109:
            r29 = r13
        L_0x010b:
            r1 = r22
            goto L_0x0177
        L_0x010e:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r13 / r1
            long r6 = r4 * r1
            r3 = 0
            long r6 = r13 - r6
            r25 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r4 = r4 + r25
            long r1 = r4 >> r12
            int r1 = (int) r1     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r0] = r1     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 41
            r2 = 16
            r29 = r13
            long r12 = r4 >> r2
            int r3 = (int) r12     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r3 = (byte) r3     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r3     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 42
            r3 = 8
            long r12 = r4 >> r3
            int r12 = (int) r12     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r12     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 43
            long r4 = r4 >> r10
            int r4 = (int) r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            long r6 = r6 * r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r4
            r1 = 44
            r4 = 24
            long r12 = r6 >> r4
            int r4 = (int) r12     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 45
            long r4 = r6 >> r2
            int r2 = (int) r4     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 46
            long r2 = r6 >> r3
            int r2 = (int) r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r1 = 47
            double r2 = java.lang.Math.random()     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r2 = r2 * r4
            int r2 = (int) r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            byte r2 = (byte) r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            r15[r1] = r2     // Catch:{ Exception -> 0x02ae, all -> 0x02aa }
            goto L_0x010b
        L_0x0177:
            r1.send(r11)     // Catch:{ Exception -> 0x02ba }
            java.net.DatagramPacket r2 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x02ba }
            r3 = 48
            r2.<init>(r15, r3)     // Catch:{ Exception -> 0x02ba }
            r1.receive(r2)     // Catch:{ Exception -> 0x02ba }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02ba }
            r4 = 0
            long r4 = r2 - r16
            long r6 = r29 + r4
            byte r11 = r15[r10]     // Catch:{ Exception -> 0x02ba }
            int r11 = r11 >> 6
            r11 = r11 & r9
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x02ba }
            byte r12 = r15[r10]     // Catch:{ Exception -> 0x02ba }
            r12 = r12 & 7
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x02ba }
            r13 = 1
            byte r14 = r15[r13]     // Catch:{ Exception -> 0x02ba }
            r13 = r14 & 255(0xff, float:3.57E-43)
            r14 = 24
            long r16 = r8.b(r15, r14)     // Catch:{ Exception -> 0x02ba }
            r14 = 32
            long r22 = r8.b(r15, r14)     // Catch:{ Exception -> 0x02ba }
            long r14 = r8.b(r15, r0)     // Catch:{ Exception -> 0x02ba }
            r0 = 4
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02ba }
            java.lang.Byte r20 = java.lang.Byte.valueOf(r11)     // Catch:{ Exception -> 0x02ba }
            r9[r10] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Byte r20 = java.lang.Byte.valueOf(r12)     // Catch:{ Exception -> 0x02ba }
            r24 = 1
            r9[r24] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02ba }
            r21 = 2
            r9[r21] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Long r10 = new java.lang.Long     // Catch:{ Exception -> 0x02ba }
            r10.<init>(r14)     // Catch:{ Exception -> 0x02ba }
            r20 = 3
            r9[r20] = r10     // Catch:{ Exception -> 0x02ba }
            r26 = 0
            com.meituan.robust.ChangeQuickRedirect r27 = f17556a     // Catch:{ Exception -> 0x02ba }
            r28 = 1
            r29 = 13803(0x35eb, float:1.9342E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r20 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x02ba }
            r25 = 0
            r10[r25] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r20 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x02ba }
            r24 = 1
            r10[r24] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02ba }
            r21 = 2
            r10[r21] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r20 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02ba }
            r25 = 3
            r10[r25] = r20     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r31 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02ba }
            r25 = r9
            r30 = r10
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02ba }
            if (r9 == 0) goto L_0x0244
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02ba }
            java.lang.Byte r10 = java.lang.Byte.valueOf(r11)     // Catch:{ Exception -> 0x02ba }
            r11 = 0
            r9[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Byte r10 = java.lang.Byte.valueOf(r12)     // Catch:{ Exception -> 0x02ba }
            r11 = 1
            r9[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x02ba }
            r11 = 2
            r9[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Long r10 = new java.lang.Long     // Catch:{ Exception -> 0x02ba }
            r10.<init>(r14)     // Catch:{ Exception -> 0x02ba }
            r11 = 3
            r9[r11] = r10     // Catch:{ Exception -> 0x02ba }
            r26 = 0
            com.meituan.robust.ChangeQuickRedirect r27 = f17556a     // Catch:{ Exception -> 0x02ba }
            r28 = 1
            r29 = 13803(0x35eb, float:1.9342E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x02ba }
            r11 = 0
            r0[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x02ba }
            r11 = 1
            r0[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x02ba }
            r11 = 2
            r0[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x02ba }
            r11 = 3
            r0[r11] = r10     // Catch:{ Exception -> 0x02ba }
            java.lang.Class r31 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x02ba }
            r25 = r9
            r30 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02ba }
            goto L_0x026b
        L_0x0244:
            r9 = 3
            if (r11 == r9) goto L_0x02a2
            if (r12 == r0) goto L_0x0261
            r0 = 5
            if (r12 != r0) goto L_0x024d
            goto L_0x0261
        L_0x024d:
            com.bytedance.android.livesdk.utils.a.f$a r0 = new com.bytedance.android.livesdk.utils.a.f$a     // Catch:{ Exception -> 0x02ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ba }
            java.lang.String r3 = "untrusted mode: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x02ba }
            r2.append(r12)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02ba }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02ba }
            throw r0     // Catch:{ Exception -> 0x02ba }
        L_0x0261:
            if (r13 == 0) goto L_0x028e
            r0 = 15
            if (r13 > r0) goto L_0x028e
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0286
        L_0x026b:
            r0 = 0
            long r9 = r14 - r22
            long r4 = r4 - r9
            long r22 = r22 - r16
            long r14 = r14 - r6
            long r22 = r22 + r14
            r9 = 2
            long r22 = r22 / r9
            r0 = 0
            long r6 = r6 + r22
            r8.f17557b = r6     // Catch:{ Exception -> 0x02ba }
            r8.f17558c = r2     // Catch:{ Exception -> 0x02ba }
            r8.f17559d = r4     // Catch:{ Exception -> 0x02ba }
            r1.close()
            r0 = 1
            return r0
        L_0x0286:
            com.bytedance.android.livesdk.utils.a.f$a r0 = new com.bytedance.android.livesdk.utils.a.f$a     // Catch:{ Exception -> 0x02ba }
            java.lang.String r2 = "zero transmitTime"
            r0.<init>(r2)     // Catch:{ Exception -> 0x02ba }
            throw r0     // Catch:{ Exception -> 0x02ba }
        L_0x028e:
            com.bytedance.android.livesdk.utils.a.f$a r0 = new com.bytedance.android.livesdk.utils.a.f$a     // Catch:{ Exception -> 0x02ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ba }
            java.lang.String r3 = "untrusted stratum: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x02ba }
            r2.append(r13)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02ba }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02ba }
            throw r0     // Catch:{ Exception -> 0x02ba }
        L_0x02a2:
            com.bytedance.android.livesdk.utils.a.f$a r0 = new com.bytedance.android.livesdk.utils.a.f$a     // Catch:{ Exception -> 0x02ba }
            java.lang.String r2 = "unsynchronized server"
            r0.<init>(r2)     // Catch:{ Exception -> 0x02ba }
            throw r0     // Catch:{ Exception -> 0x02ba }
        L_0x02aa:
            r0 = move-exception
            r1 = r22
            goto L_0x02cb
        L_0x02ae:
            r0 = move-exception
            r1 = r22
            goto L_0x02bb
        L_0x02b2:
            r0 = move-exception
            r1 = r14
            goto L_0x02cb
        L_0x02b5:
            r0 = move-exception
            r1 = r14
            goto L_0x02bb
        L_0x02b8:
            r0 = move-exception
            goto L_0x02cb
        L_0x02ba:
            r0 = move-exception
        L_0x02bb:
            java.lang.String r2 = "SntpClient"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02b8 }
            com.bytedance.android.live.core.c.a.c(r2, r0)     // Catch:{ all -> 0x02b8 }
            if (r1 == 0) goto L_0x02c9
            r1.close()
        L_0x02c9:
            r1 = 0
            return r1
        L_0x02cb:
            if (r1 == 0) goto L_0x02d0
            r1.close()
        L_0x02d0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.a.f.a(java.net.InetAddress, int, int):boolean");
    }
}
