package com.ss.android.j;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    static final class a<A, B> {

        /* renamed from: a  reason: collision with root package name */
        public final A f29280a;

        /* renamed from: b  reason: collision with root package name */
        public final B f29281b;

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f29280a == null) {
                i = 0;
            } else {
                i = this.f29280a.hashCode();
            }
            int i3 = (i + 31) * 31;
            if (this.f29281b != null) {
                i2 = this.f29281b.hashCode();
            }
            return i3 + i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29280a == null) {
                if (aVar.f29280a != null) {
                    return false;
                }
            } else if (!this.f29280a.equals(aVar.f29280a)) {
                return false;
            }
            if (this.f29281b == null) {
                if (aVar.f29281b != null) {
                    return false;
                }
            } else if (!this.f29281b.equals(aVar.f29281b)) {
                return false;
            }
            return true;
        }

        a(A a2, B b2) {
            this.f29280a = a2;
            this.f29281b = b2;
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

    private static a<ByteBuffer, Long> a(FileChannel fileChannel) throws IOException, b {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(ByteOrder.LITTLE_ENDIAN);
                            fileChannel.position((fileChannel.size() - ((long) s)) - 6);
                            fileChannel.read(allocate3);
                            long j4 = (long) allocate3.getInt(0);
                            if (j4 >= 32) {
                                fileChannel.position(j4 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j5 = allocate4.getLong(0);
                                    if (j5 < ((long) allocate4.capacity()) || j5 > 2147483639) {
                                        throw new b("APK Signing Block size out of range: " + j5);
                                    }
                                    int i2 = (int) (8 + j5);
                                    long j6 = j4 - ((long) i2);
                                    if (j6 >= 0) {
                                        fileChannel.position(j6);
                                        ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                        fileChannel.read(allocate5);
                                        allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                        long j7 = allocate5.getLong(0);
                                        if (j7 == j5) {
                                            return new a<>(allocate5, Long.valueOf(j6));
                                        }
                                        throw new b("APK Signing Block sizes in header and footer do not match: " + j7 + " vs " + j5);
                                    }
                                    throw new b("APK Signing Block offset out of range: " + j6);
                                }
                                throw new b("No APK Signing Block before ZIP Central Directory");
                            }
                            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: " + j4);
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

    private static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) throws b {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
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
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r0 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[SYNTHETIC, Splitter:B:19:0x005c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5, int r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0060, all -> 0x0058 }
            java.lang.String r2 = "r"
            r0.<init>(r5, r2)     // Catch:{ Throwable -> 0x0060, all -> 0x0058 }
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            com.ss.android.j.d$a r5 = a((java.nio.channels.FileChannel) r5)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            A r5 = r5.f29280a     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.util.Map r5 = a((java.nio.ByteBuffer) r5)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            boolean r2 = r5.containsKey(r2)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            byte[] r6 = r5.array()     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            int r3 = r5.arrayOffset()     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            int r4 = r5.position()     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            int r4 = r4 + r3
            int r5 = r5.limit()     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            int r3 = r3 + r5
            byte[] r5 = java.util.Arrays.copyOfRange(r6, r4, r3)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x0056 }
            r0.close()     // Catch:{ Throwable -> 0x0051 }
        L_0x0051:
            return r2
        L_0x0052:
            r0.close()     // Catch:{ Throwable -> 0x0064 }
            goto L_0x0064
        L_0x0056:
            r5 = move-exception
            goto L_0x005a
        L_0x0058:
            r5 = move-exception
            r0 = r1
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.close()     // Catch:{ Throwable -> 0x005f }
        L_0x005f:
            throw r5
        L_0x0060:
            r0 = r1
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0052
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.j.d.a(java.lang.String, int):java.lang.String");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: " + i);
        }
    }

    /* JADX INFO: finally extract failed */
    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < 8");
        }
    }
}
