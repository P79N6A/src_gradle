package com.ss.android.newmedia.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30162a;

    /* renamed from: com.ss.android.newmedia.app.a$a  reason: collision with other inner class name */
    static final class C0366a<A, B> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30163a;

        /* renamed from: b  reason: collision with root package name */
        public final A f30164b;

        /* renamed from: c  reason: collision with root package name */
        public final B f30165c;

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[0], this, f30163a, false, 18493, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30163a, false, 18493, new Class[0], Integer.TYPE)).intValue();
            }
            if (this.f30164b == null) {
                i = 0;
            } else {
                i = this.f30164b.hashCode();
            }
            int i3 = (i + 31) * 31;
            if (this.f30165c != null) {
                i2 = this.f30165c.hashCode();
            }
            return i3 + i2;
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f30163a, false, 18494, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f30163a, false, 18494, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C0366a aVar = (C0366a) obj;
                if (this.f30164b == null) {
                    if (aVar.f30164b != null) {
                        return false;
                    }
                } else if (!this.f30164b.equals(aVar.f30164b)) {
                    return false;
                }
                if (this.f30165c == null) {
                    if (aVar.f30165c != null) {
                        return false;
                    }
                } else if (!this.f30165c.equals(aVar.f30165c)) {
                    return false;
                }
                return true;
            }
        }

        C0366a(A a2, B b2) {
            this.f30164b = a2;
            this.f30165c = b2;
        }
    }

    public static class b extends Exception {
        private static final long serialVersionUID = 1;

        public b(String str) {
            super(str);
        }

        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    private static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) throws b {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2}, null, f30162a, true, 18488, new Class[]{ByteBuffer.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{byteBuffer2}, null, f30162a, true, 18488, new Class[]{ByteBuffer.class}, Map.class);
        }
        if (PatchProxy.isSupport(new Object[]{byteBuffer2}, null, f30162a, true, 18491, new Class[]{ByteBuffer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{byteBuffer2}, null, f30162a, true, 18491, new Class[]{ByteBuffer.class}, Void.TYPE);
        } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer a2 = a(byteBuffer2, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (a2.hasRemaining()) {
            i++;
            if (a2.remaining() >= 8) {
                long j = a2.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new b("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = a2.position() + i2;
                if (i2 <= a2.remaining()) {
                    linkedHashMap.put(Integer.valueOf(a2.getInt()), a(a2, i2 - 4));
                    a2.position(position);
                } else {
                    throw new b("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a2.remaining());
                }
            } else {
                throw new b("Insufficient data to read size of APK Signing Block entry #" + i);
            }
        }
        return linkedHashMap;
    }

    private static C0366a<ByteBuffer, Long> a(FileChannel fileChannel) throws IOException, b {
        long j;
        long j2;
        FileChannel fileChannel2 = fileChannel;
        if (PatchProxy.isSupport(new Object[]{fileChannel2}, null, f30162a, true, 18484, new Class[]{FileChannel.class}, C0366a.class)) {
            return (C0366a) PatchProxy.accessDispatch(new Object[]{fileChannel2}, null, f30162a, true, 18484, new Class[]{FileChannel.class}, C0366a.class);
        }
        if (PatchProxy.isSupport(new Object[]{fileChannel2}, null, f30162a, true, 18482, new Class[]{FileChannel.class}, Long.TYPE)) {
            j = ((Long) PatchProxy.accessDispatch(new Object[]{fileChannel2}, null, f30162a, true, 18482, new Class[]{FileChannel.class}, Long.TYPE)).longValue();
        } else {
            if (PatchProxy.isSupport(new Object[]{fileChannel2}, null, f30162a, true, 18481, new Class[]{FileChannel.class}, Long.TYPE)) {
                j2 = ((Long) PatchProxy.accessDispatch(new Object[]{fileChannel2}, null, f30162a, true, 18481, new Class[]{FileChannel.class}, Long.TYPE)).longValue();
            } else {
                long size = fileChannel.size();
                if (size >= 22) {
                    long j3 = size - 22;
                    long min = Math.min(j3, 65535);
                    int i = 0;
                    while (true) {
                        long j4 = (long) i;
                        if (j4 <= min) {
                            long j5 = j3 - j4;
                            ByteBuffer allocate = ByteBuffer.allocate(4);
                            fileChannel2.position(j5);
                            fileChannel2.read(allocate);
                            allocate.order(ByteOrder.LITTLE_ENDIAN);
                            if (allocate.getInt(0) == 101010256) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                                fileChannel2.position(j5 + 20);
                                fileChannel2.read(allocate2);
                                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                short s = allocate2.getShort(0);
                                if (s == i) {
                                    j2 = (long) s;
                                    break;
                                }
                            }
                            i++;
                        } else {
                            throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                        }
                    }
                } else {
                    throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
                }
            }
            if (PatchProxy.isSupport(new Object[]{fileChannel2, new Long(j2)}, null, f30162a, true, 18483, new Class[]{FileChannel.class, Long.TYPE}, Long.TYPE)) {
                j = ((Long) PatchProxy.accessDispatch(new Object[]{fileChannel2, new Long(j2)}, null, f30162a, true, 18483, new Class[]{FileChannel.class, Long.TYPE}, Long.TYPE)).longValue();
            } else {
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                allocate3.order(ByteOrder.LITTLE_ENDIAN);
                fileChannel2.position((fileChannel.size() - j2) - 6);
                fileChannel2.read(allocate3);
                j = (long) allocate3.getInt(0);
            }
        }
        if (PatchProxy.isSupport(new Object[]{fileChannel2, new Long(j)}, null, f30162a, true, 18485, new Class[]{FileChannel.class, Long.TYPE}, C0366a.class)) {
            return (C0366a) PatchProxy.accessDispatch(new Object[]{fileChannel2, new Long(j)}, null, f30162a, true, 18485, new Class[]{FileChannel.class, Long.TYPE}, C0366a.class);
        } else if (j >= 32) {
            fileChannel2.position(j - 24);
            ByteBuffer allocate4 = ByteBuffer.allocate(24);
            fileChannel2.read(allocate4);
            allocate4.order(ByteOrder.LITTLE_ENDIAN);
            if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                long j6 = allocate4.getLong(0);
                if (j6 < ((long) allocate4.capacity()) || j6 > 2147483639) {
                    throw new b("APK Signing Block size out of range: " + j6);
                }
                int i2 = (int) (8 + j6);
                long j7 = j - ((long) i2);
                if (j7 >= 0) {
                    fileChannel2.position(j7);
                    ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                    fileChannel2.read(allocate5);
                    allocate5.order(ByteOrder.LITTLE_ENDIAN);
                    long j8 = allocate5.getLong(0);
                    if (j8 == j6) {
                        Long valueOf = Long.valueOf(j7);
                        if (!PatchProxy.isSupport(new Object[]{allocate5, valueOf}, null, C0366a.f30163a, true, 18492, new Class[]{Object.class, Object.class}, C0366a.class)) {
                            return new C0366a<>(allocate5, valueOf);
                        }
                        return (C0366a) PatchProxy.accessDispatch(new Object[]{allocate5, valueOf}, null, C0366a.f30163a, true, 18492, new Class[]{Object.class, Object.class}, C0366a.class);
                    }
                    throw new b("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j6);
                }
                throw new b("APK Signing Block offset out of range: " + j7);
            }
            throw new b("No APK Signing Block before ZIP Central Directory");
        } else {
            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        if (r1 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e0 A[SYNTHETIC, Splitter:B:27:0x00e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r19, int r20) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            r10 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f30162a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 18486(0x4836, float:2.5904E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004f
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f30162a
            r15 = 1
            r16 = 18486(0x4836, float:2.5904E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004f:
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            r2 = 0
            if (r1 == 0) goto L_0x0057
            return r2
        L_0x0057:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x00e4, all -> 0x00dc }
            java.lang.String r3 = "r"
            r1.<init>(r0, r3)     // Catch:{ Throwable -> 0x00e4, all -> 0x00dc }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            com.ss.android.newmedia.app.a$a r0 = a((java.nio.channels.FileChannel) r0)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            A r0 = r0.f30164b     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.util.Map r0 = a((java.nio.ByteBuffer) r0)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            boolean r3 = r0.containsKey(r3)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            if (r3 == 0) goto L_0x00d6
            java.lang.String r3 = new java.lang.String     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r12[r9] = r0     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f30162a     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r15 = 1
            r16 = 18487(0x4837, float:2.5906E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            r4[r9] = r5     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Class<byte[]> r18 = byte[].class
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            if (r4 == 0) goto L_0x00b9
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r12[r9] = r0     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f30162a     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r15 = 1
            r16 = 18487(0x4837, float:2.5906E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            r0[r9] = r4     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            java.lang.Class<byte[]> r18 = byte[].class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            byte[] r0 = (byte[]) r0     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            goto L_0x00cf
        L_0x00b9:
            byte[] r4 = r0.array()     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            int r5 = r0.arrayOffset()     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            int r6 = r0.position()     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            int r6 = r6 + r5
            int r0 = r0.limit()     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            int r5 = r5 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r6, r5)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
        L_0x00cf:
            r3.<init>(r0)     // Catch:{ Throwable -> 0x00e5, all -> 0x00da }
            r1.close()     // Catch:{ Throwable -> 0x00d5 }
        L_0x00d5:
            return r3
        L_0x00d6:
            r1.close()     // Catch:{ Throwable -> 0x00e8 }
            goto L_0x00e8
        L_0x00da:
            r0 = move-exception
            goto L_0x00de
        L_0x00dc:
            r0 = move-exception
            r1 = r2
        L_0x00de:
            if (r1 == 0) goto L_0x00e3
            r1.close()     // Catch:{ Throwable -> 0x00e3 }
        L_0x00e3:
            throw r0
        L_0x00e4:
            r1 = r2
        L_0x00e5:
            if (r1 == 0) goto L_0x00e8
            goto L_0x00d6
        L_0x00e8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.app.a.a(java.lang.String, int):java.lang.String");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2, Integer.valueOf(i)}, null, f30162a, true, 18490, new Class[]{ByteBuffer.class, Integer.TYPE}, ByteBuffer.class)) {
            return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{byteBuffer2, Integer.valueOf(i)}, null, f30162a, true, 18490, new Class[]{ByteBuffer.class, Integer.TYPE}, ByteBuffer.class);
        } else if (i2 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i3 = i2 + position;
            if (i3 < position || i3 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer2.limit(i3);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer2.position(i3);
                return slice;
            } finally {
                byteBuffer2.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: " + i2);
        }
    }

    /* JADX INFO: finally extract failed */
    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2, 8, Integer.valueOf(i2)}, null, f30162a, true, 18489, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE}, ByteBuffer.class)) {
            return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{byteBuffer2, 8, Integer.valueOf(i2)}, null, f30162a, true, 18489, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE}, ByteBuffer.class);
        } else if (i3 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i3 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(i3);
                    byteBuffer2.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i3 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i3 + " < 8");
        }
    }
}
