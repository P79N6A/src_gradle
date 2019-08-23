package com.ss.android.message.a.b.a;

import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29937a;

    /* renamed from: b  reason: collision with root package name */
    public SelectableChannel f29938b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29939c;

    /* access modifiers changed from: package-private */
    public abstract int a(ByteBuffer byteBuffer) throws IOException;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f29939c = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f29937a, false, 18076, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f29937a, false, 18076, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.f29939c && this.f29938b.isOpen()) {
            z = true;
        }
        return z;
    }

    j(SelectableChannel selectableChannel) throws IOException {
        a((Object) selectableChannel);
        this.f29938b = selectableChannel;
        selectableChannel.configureBlocking(false);
    }

    static void a(Object obj) throws IOException {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f29937a, true, 18077, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, null, f29937a, true, 18077, new Class[]{Object.class}, Void.TYPE);
        } else if (obj2 == null) {
            throw new IOException("Channel is null. Check how the channel or socket is created.");
        } else if (!(obj2 instanceof SelectableChannel)) {
            throw new IOException("Channel should be a SelectableChannel");
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(ByteBuffer byteBuffer) throws IOException {
        if (PatchProxy.isSupport(new Object[]{byteBuffer}, this, f29937a, false, 18078, new Class[]{ByteBuffer.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer}, this, f29937a, false, 18078, new Class[]{ByteBuffer.class}, Integer.TYPE)).intValue();
        } else if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Buffer has no data left.");
        } else if (!byteBuffer.hasRemaining()) {
            return 0;
        } else {
            if (this.f29939c) {
                return -1;
            }
            try {
                int a2 = a(byteBuffer);
                Logger.debug();
                return a2;
            } catch (IOException e2) {
                if (!this.f29938b.isOpen()) {
                    this.f29939c = true;
                }
                throw e2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.nio.channels.SelectableChannel r20, long r21) throws java.io.IOException {
        /*
            r0 = r20
            r1 = r21
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            r12 = 1
            r4[r12] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f29937a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.nio.channels.SelectableChannel> r5 = java.nio.channels.SelectableChannel.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r9[r12] = r5
            java.lang.Class r10 = java.lang.Integer.TYPE
            r5 = 0
            r7 = 1
            r8 = 18081(0x46a1, float:2.5337E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f29937a
            r16 = 1
            r17 = 18081(0x46a1, float:2.5337E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.nio.channels.SelectableChannel> r1 = java.nio.channels.SelectableChannel.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Integer.TYPE
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0055:
            r3 = 0
            if (r0 != 0) goto L_0x0059
            return r11
        L_0x0059:
            java.nio.channels.spi.SelectorProvider r4 = r20.provider()
            java.nio.channels.spi.AbstractSelector r4 = r4.openSelector()
            boolean r5 = r20.isOpen()     // Catch:{ Exception -> 0x0095 }
            if (r5 == 0) goto L_0x008d
            boolean r5 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x0095 }
            if (r5 == 0) goto L_0x0072
            boolean r0 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0095 }
            goto L_0x008d
        L_0x0072:
            r5 = 8
            java.nio.channels.SelectionKey r5 = r0.register(r4, r5)     // Catch:{ Exception -> 0x0095 }
            int r0 = r4.select(r1)     // Catch:{ Exception -> 0x008a, all -> 0x0087 }
            if (r5 == 0) goto L_0x0081
            r5.cancel()
        L_0x0081:
            if (r4 == 0) goto L_0x0086
            r4.close()
        L_0x0086:
            return r0
        L_0x0087:
            r0 = move-exception
            r3 = r5
            goto L_0x00a4
        L_0x008a:
            r0 = move-exception
            r3 = r5
            goto L_0x0096
        L_0x008d:
            if (r4 == 0) goto L_0x0092
            r4.close()
        L_0x0092:
            return r11
        L_0x0093:
            r0 = move-exception
            goto L_0x00a4
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            com.ss.android.message.b.h.a((java.lang.Exception) r0)     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x009e
            r3.cancel()
        L_0x009e:
            if (r4 == 0) goto L_0x00a3
            r4.close()
        L_0x00a3:
            return r11
        L_0x00a4:
            if (r3 == 0) goto L_0x00a9
            r3.cancel()
        L_0x00a9:
            if (r4 == 0) goto L_0x00ae
            r4.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.j.a(java.nio.channels.SelectableChannel, long):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.nio.channels.SocketChannel r22, java.net.SocketAddress r23, long r24) throws java.io.IOException {
        /*
            r1 = r22
            r2 = r24
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r1
            r13 = 1
            r5[r13] = r23
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r2)
            r14 = 2
            r5[r14] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = f29937a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.nio.channels.SocketChannel> r6 = java.nio.channels.SocketChannel.class
            r10[r12] = r6
            java.lang.Class<java.net.SocketAddress> r6 = java.net.SocketAddress.class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r10[r14] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 18079(0x469f, float:2.5334E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x005c
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r12] = r1
            r15[r13] = r23
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r15[r14] = r0
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f29937a
            r18 = 1
            r19 = 18079(0x469f, float:2.5334E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.nio.channels.SocketChannel> r1 = java.nio.channels.SocketChannel.class
            r0[r12] = r1
            java.lang.Class<java.net.SocketAddress> r1 = java.net.SocketAddress.class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r14] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x005c:
            boolean r4 = r22.isBlocking()
            if (r4 == 0) goto L_0x0065
            r1.configureBlocking(r12)
        L_0x0065:
            boolean r0 = r22.connect(r23)     // Catch:{ IOException -> 0x00f8 }
            if (r0 == 0) goto L_0x0077
            if (r4 == 0) goto L_0x0076
            boolean r0 = r22.isOpen()
            if (r0 == 0) goto L_0x0076
            r1.configureBlocking(r13)
        L_0x0076:
            return
        L_0x0077:
            int r0 = a(r1, r2)     // Catch:{ IOException -> 0x00f8 }
            if (r0 <= 0) goto L_0x008f
            boolean r5 = r22.finishConnect()     // Catch:{ IOException -> 0x00f8 }
            if (r5 == 0) goto L_0x008f
            if (r4 == 0) goto L_0x008e
            boolean r0 = r22.isOpen()
            if (r0 == 0) goto L_0x008e
            r1.configureBlocking(r13)
        L_0x008e:
            return
        L_0x008f:
            if (r0 != 0) goto L_0x0077
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException     // Catch:{ IOException -> 0x00f8 }
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x00f8 }
            r5[r12] = r1     // Catch:{ IOException -> 0x00f8 }
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x00f8 }
            r5[r13] = r3     // Catch:{ IOException -> 0x00f8 }
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f29937a     // Catch:{ IOException -> 0x00f8 }
            r8 = 1
            r9 = 18080(0x46a0, float:2.5335E-41)
            java.lang.Class[] r10 = new java.lang.Class[r14]     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class<java.nio.channels.SelectableChannel> r3 = java.nio.channels.SelectableChannel.class
            r10[r12] = r3     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00f8 }
            r10[r13] = r3     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00f8 }
            if (r3 == 0) goto L_0x00da
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x00f8 }
            r5[r12] = r1     // Catch:{ IOException -> 0x00f8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x00f8 }
            r5[r13] = r2     // Catch:{ IOException -> 0x00f8 }
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f29937a     // Catch:{ IOException -> 0x00f8 }
            r8 = 1
            r9 = 18080(0x46a0, float:2.5335E-41)
            java.lang.Class[] r10 = new java.lang.Class[r14]     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class<java.nio.channels.SelectableChannel> r2 = java.nio.channels.SelectableChannel.class
            r10[r12] = r2     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ IOException -> 0x00f8 }
            r10[r13] = r2     // Catch:{ IOException -> 0x00f8 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00f2
        L_0x00da:
            java.lang.String r2 = "connect"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r5 = "waiting for channel to be ready for "
            r3.<init>(r5)     // Catch:{ IOException -> 0x00f8 }
            r3.append(r2)     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r2 = ". ch : "
            r3.append(r2)     // Catch:{ IOException -> 0x00f8 }
            r3.append(r1)     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f2:
            r0.<init>(r2)     // Catch:{ IOException -> 0x00f8 }
            throw r0     // Catch:{ IOException -> 0x00f8 }
        L_0x00f6:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f8:
            r0 = move-exception
            r22.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00f6 }
        L_0x00fd:
            if (r4 == 0) goto L_0x0108
            boolean r2 = r22.isOpen()
            if (r2 == 0) goto L_0x0108
            r1.configureBlocking(r13)
        L_0x0108:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.j.a(java.nio.channels.SocketChannel, java.net.SocketAddress, long):void");
    }
}
