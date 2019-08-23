package com.xiaomi.push;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

public class gk {

    /* renamed from: a  reason: collision with root package name */
    private gm f82109a;

    /* renamed from: a  reason: collision with other field name */
    private go f437a;

    /* renamed from: a  reason: collision with other field name */
    private InputStream f438a;

    /* renamed from: a  reason: collision with other field name */
    private ByteBuffer f439a = ByteBuffer.allocate(2048);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f440a = new Adler32();

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f441a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f442a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f82110b = ByteBuffer.allocate(4);

    gk(InputStream inputStream, go goVar) {
        this.f438a = new BufferedInputStream(inputStream);
        this.f437a = goVar;
        this.f82109a = new gm();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r0 < 2048) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer a() {
        /*
            r8 = this;
            java.nio.ByteBuffer r0 = r8.f439a
            r0.clear()
            java.nio.ByteBuffer r0 = r8.f439a
            r1 = 8
            r8.a(r0, r1)
            java.nio.ByteBuffer r0 = r8.f439a
            r1 = 0
            short r0 = r0.getShort(r1)
            java.nio.ByteBuffer r2 = r8.f439a
            r3 = 2
            short r2 = r2.getShort(r3)
            r3 = -15618(0xffffffffffffc2fe, float:NaN)
            if (r0 != r3) goto L_0x00e7
            r0 = 5
            if (r2 != r0) goto L_0x00e7
            java.nio.ByteBuffer r0 = r8.f439a
            r2 = 4
            int r0 = r0.getInt(r2)
            java.nio.ByteBuffer r3 = r8.f439a
            int r3 = r3.position()
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r0 > r4) goto L_0x00df
            int r4 = r0 + 4
            java.nio.ByteBuffer r5 = r8.f439a
            int r5 = r5.remaining()
            if (r4 <= r5) goto L_0x005c
            int r4 = r0 + 2048
        L_0x003f:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r8.f439a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f439a
            int r6 = r6.arrayOffset()
            java.nio.ByteBuffer r7 = r8.f439a
            int r7 = r7.position()
            int r6 = r6 + r7
            r4.put(r5, r1, r6)
            r8.f439a = r4
            goto L_0x006b
        L_0x005c:
            java.nio.ByteBuffer r4 = r8.f439a
            int r4 = r4.capacity()
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 <= r5) goto L_0x006b
            r4 = 2048(0x800, float:2.87E-42)
            if (r0 >= r4) goto L_0x006b
            goto L_0x003f
        L_0x006b:
            java.nio.ByteBuffer r4 = r8.f439a
            r8.a(r4, r0)
            java.nio.ByteBuffer r4 = r8.f82110b
            r4.clear()
            java.nio.ByteBuffer r4 = r8.f82110b
            r8.a(r4, r2)
            java.nio.ByteBuffer r2 = r8.f82110b
            r2.position(r1)
            java.nio.ByteBuffer r2 = r8.f82110b
            int r2 = r2.getInt()
            java.util.zip.Adler32 r4 = r8.f440a
            r4.reset()
            java.util.zip.Adler32 r4 = r8.f440a
            java.nio.ByteBuffer r5 = r8.f439a
            byte[] r5 = r5.array()
            java.nio.ByteBuffer r6 = r8.f439a
            int r6 = r6.position()
            r4.update(r5, r1, r6)
            java.util.zip.Adler32 r1 = r8.f440a
            long r4 = r1.getValue()
            int r1 = (int) r4
            if (r2 != r1) goto L_0x00b7
            byte[] r1 = r8.f442a
            if (r1 == 0) goto L_0x00b4
            byte[] r1 = r8.f442a
            java.nio.ByteBuffer r2 = r8.f439a
            byte[] r2 = r2.array()
            r4 = 1
            com.xiaomi.push.service.au.a(r1, r2, r4, r3, r0)
        L_0x00b4:
            java.nio.ByteBuffer r0 = r8.f439a
            return r0
        L_0x00b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CRC = "
            r0.<init>(r1)
            java.util.zip.Adler32 r1 = r8.f440a
            long r3 = r1.getValue()
            int r1 = (int) r3
            r0.append(r1)
            java.lang.String r1 = " and "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted Blob bad CRC"
            r0.<init>(r1)
            throw r0
        L_0x00df:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Blob size too large"
            r0.<init>(r1)
            throw r0
        L_0x00e7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Malformed Input"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gk.a():java.nio.ByteBuffer");
    }

    private void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f438a.read(byteBuffer.array(), position, i);
            if (read != -1) {
                i -= read;
                position += read;
            } else {
                throw new EOFException();
            }
        } while (i > 0);
        byteBuffer.position(position);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012f, code lost:
        r6.f437a.a(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
            r6 = this;
            r0 = 0
            r6.f441a = r0
            com.xiaomi.push.gj r1 = r6.a()
            java.lang.String r2 = "CONN"
            java.lang.String r3 = r1.a()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0063
            byte[] r1 = r1.a()
            com.xiaomi.push.fi$f r1 = com.xiaomi.push.fi.f.a((byte[]) r1)
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x002b
            com.xiaomi.push.go r0 = r6.f437a
            java.lang.String r2 = r1.a()
            r0.a((java.lang.String) r2)
            r0 = 1
        L_0x002b:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x004e
            com.xiaomi.push.fi$b r2 = r1.a()
            com.xiaomi.push.gj r3 = new com.xiaomi.push.gj
            r3.<init>()
            java.lang.String r4 = "SYNC"
            java.lang.String r5 = "CONF"
            r3.a((java.lang.String) r4, (java.lang.String) r5)
            byte[] r2 = r2.a()
            r4 = 0
            r3.a((byte[]) r2, (java.lang.String) r4)
            com.xiaomi.push.go r2 = r6.f437a
            r2.a((com.xiaomi.push.gj) r3)
        L_0x004e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Slim] CONN: host = "
            r2.<init>(r3)
            java.lang.String r1 = r1.b()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r1)
        L_0x0063:
            if (r0 == 0) goto L_0x0137
            com.xiaomi.push.go r0 = r6.f437a
            byte[] r0 = r0.a()
            r6.f442a = r0
        L_0x006d:
            boolean r0 = r6.f441a
            if (r0 != 0) goto L_0x0136
            com.xiaomi.push.gj r0 = r6.a()
            com.xiaomi.push.go r1 = r6.f437a
            r1.c()
            short r1 = r0.a()
            switch(r1) {
                case 1: goto L_0x012f;
                case 2: goto L_0x00d5;
                case 3: goto L_0x0097;
                default: goto L_0x0081;
            }
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Slim] unknow blob type "
            r1.<init>(r2)
            short r0 = r0.a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0093:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            goto L_0x006d
        L_0x0097:
            com.xiaomi.push.gm r1 = r6.f82109a     // Catch:{ Exception -> 0x00a9 }
            byte[] r2 = r0.a()     // Catch:{ Exception -> 0x00a9 }
            com.xiaomi.push.go r3 = r6.f437a     // Catch:{ Exception -> 0x00a9 }
            com.xiaomi.push.hh r1 = r1.a(r2, r3)     // Catch:{ Exception -> 0x00a9 }
            com.xiaomi.push.go r2 = r6.f437a     // Catch:{ Exception -> 0x00a9 }
            r2.b((com.xiaomi.push.hh) r1)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x006d
        L_0x00a9:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Slim] Parse packet from Blob chid="
            r2.<init>(r3)
        L_0x00b1:
            int r3 = r0.a()
            r2.append(r3)
            java.lang.String r3 = "; Id="
            r2.append(r3)
            java.lang.String r0 = r0.e()
            r2.append(r0)
            java.lang.String r0 = " failure:"
            r2.append(r0)
            java.lang.String r0 = r1.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0093
        L_0x00d5:
            java.lang.String r1 = "SECMSG"
            java.lang.String r2 = r0.a()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x012f
            int r1 = r0.a()
            r2 = 2
            if (r1 == r2) goto L_0x00ef
            int r1 = r0.a()
            r2 = 3
            if (r1 != r2) goto L_0x012f
        L_0x00ef:
            java.lang.String r1 = r0.b()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x012f
            int r1 = r0.a()     // Catch:{ Exception -> 0x0126 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0126 }
            java.lang.String r2 = r0.g()     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.service.al r3 = com.xiaomi.push.service.al.a()     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.service.al$b r1 = r3.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.gm r2 = r6.f82109a     // Catch:{ Exception -> 0x0126 }
            java.lang.String r1 = r1.h     // Catch:{ Exception -> 0x0126 }
            byte[] r1 = r0.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.go r3 = r6.f437a     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.hh r1 = r2.a(r1, r3)     // Catch:{ Exception -> 0x0126 }
            com.xiaomi.push.go r2 = r6.f437a     // Catch:{ Exception -> 0x0126 }
            r2.b((com.xiaomi.push.hh) r1)     // Catch:{ Exception -> 0x0126 }
            goto L_0x006d
        L_0x0126:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Slim] Parse packet from Blob chid="
            r2.<init>(r3)
            goto L_0x00b1
        L_0x012f:
            com.xiaomi.push.go r1 = r6.f437a
            r1.a((com.xiaomi.push.gj) r0)
            goto L_0x006d
        L_0x0136:
            return
        L_0x0137:
            java.lang.String r0 = "[Slim] Invalid CONN"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid Connection"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gk.c():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.gj m335a() {
        /*
            r6 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = r6.a()     // Catch:{ IOException -> 0x0055 }
            int r2 = r1.position()     // Catch:{ IOException -> 0x0055 }
            r1.flip()     // Catch:{ IOException -> 0x0053 }
            r3 = 8
            r1.position(r3)     // Catch:{ IOException -> 0x0053 }
            if (r2 != r3) goto L_0x0019
            com.xiaomi.push.gn r1 = new com.xiaomi.push.gn     // Catch:{ IOException -> 0x0053 }
            r1.<init>()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0021
        L_0x0019:
            java.nio.ByteBuffer r1 = r1.slice()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.push.gj r1 = com.xiaomi.push.gj.a((java.nio.ByteBuffer) r1)     // Catch:{ IOException -> 0x0053 }
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r3.<init>()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "[Slim] Read {cmd="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = r1.a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";chid="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            int r4 = r1.a()     // Catch:{ IOException -> 0x0053 }
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = ";len="
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            r3.append(r2)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r4 = "}"
            r3.append(r4)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0053 }
            com.xiaomi.channel.commonutils.logger.b.c(r3)     // Catch:{ IOException -> 0x0053 }
            return r1
        L_0x0053:
            r1 = move-exception
            goto L_0x0057
        L_0x0055:
            r1 = move-exception
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x005f
            java.nio.ByteBuffer r2 = r6.f439a
            int r2 = r2.position()
        L_0x005f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[Slim] read Blob ["
            r3.<init>(r4)
            java.nio.ByteBuffer r4 = r6.f439a
            byte[] r4 = r4.array()
            r5 = 128(0x80, float:1.794E-43)
            if (r2 <= r5) goto L_0x0072
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            java.lang.String r0 = com.xiaomi.push.ag.a(r4, r0, r2)
            r3.append(r0)
            java.lang.String r0 = "] Err:"
            r3.append(r0)
            java.lang.String r0 = r1.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gk.m335a():com.xiaomi.push.gj");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m336a() {
        try {
            c();
        } catch (IOException e2) {
            if (!this.f441a) {
                throw e2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f441a = true;
    }
}
