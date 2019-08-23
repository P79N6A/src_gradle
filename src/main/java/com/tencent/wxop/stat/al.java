package com.tencent.wxop.stat;

import java.util.List;

public final class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f79851a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ai f79852b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ aj f79853c;

    al(aj ajVar, List list, ai aiVar) {
        this.f79853c = ajVar;
        this.f79851a = list;
        this.f79852b = aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0369, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.tencent.wxop.stat.aj r0 = r15.f79853c
            java.util.List r1 = r15.f79851a
            com.tencent.wxop.stat.ai r2 = r15.f79852b
            if (r1 == 0) goto L_0x0398
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0010
            goto L_0x0398
        L_0x0010:
            int r3 = r1.size()
            r4 = 0
            r1.get(r4)
            r5 = 0
            r6 = 1
            java.lang.StringBuilder r7 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r8 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r8 = r8.length()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r7.delete(r4, r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r7 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "["
            r7.append(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = "rc4"
            r8 = 0
        L_0x002f:
            if (r8 >= r3) goto L_0x004c
            java.lang.StringBuilder r9 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.Object r10 = r1.get(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.append(r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r9 = r3 + -1
            if (r8 == r9) goto L_0x0049
            java.lang.StringBuilder r9 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = ","
            r9.append(r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0049:
            int r8 = r8 + 1
            goto L_0x002f
        L_0x004c:
            java.lang.StringBuilder r1 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r3 = "]"
            r1.append(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r1 = r0.f79848d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r3 = r1.length()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.<init>()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = com.tencent.wxop.stat.d.t     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "/?index="
            r8.append(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            long r9 = r0.f79849f     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            long r9 = r0.f79849f     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r11 = 1
            long r9 = r9 + r11
            r0.f79849f = r9     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            boolean r9 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r9 == 0) goto L_0x00a5
            com.tencent.wxop.stat.a.b r9 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "["
            r10.<init>(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.append(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "]Send request("
            r10.append(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.append(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "bytes), content:"
            r10.append(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.append(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.a(r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x00a5:
            org.apache.http.client.methods.HttpPost r9 = new org.apache.http.client.methods.HttpPost     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "Accept-Encoding"
            java.lang.String r10 = "gzip"
            r9.addHeader(r8, r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "Connection"
            java.lang.String r10 = "Keep-Alive"
            r9.setHeader(r8, r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "Cache-Control"
            r9.removeHeaders(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            android.content.Context r8 = com.tencent.wxop.stat.aj.f79845e     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            com.tencent.wxop.stat.i r8 = com.tencent.wxop.stat.i.a((android.content.Context) r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.HttpHost r8 = r8.f79906d     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = "Content-Encoding"
            r9.addHeader(r10, r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 != 0) goto L_0x00d8
            org.apache.http.impl.client.DefaultHttpClient r10 = r0.f79846b     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.params.HttpParams r10 = r10.getParams()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "http.route.default-proxy"
            r10.removeParameter(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x011a
        L_0x00d8:
            boolean r10 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r10 == 0) goto L_0x00f5
            com.tencent.wxop.stat.a.b r10 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r12 = "proxy:"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r12 = r8.toHostString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.g(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x00f5:
            java.lang.String r10 = "X-Content-Encoding"
            r9.addHeader(r10, r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.impl.client.DefaultHttpClient r10 = r0.f79846b     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.params.HttpParams r10 = r10.getParams()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "http.route.default-proxy"
            r10.setParameter(r11, r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = "X-Online-Host"
            java.lang.String r11 = com.tencent.wxop.stat.d.s     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.addHeader(r10, r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = "Accept"
            java.lang.String r11 = "*/*"
            r9.addHeader(r10, r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "json"
            r9.addHeader(r10, r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x011a:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.<init>(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = "UTF-8"
            byte[] r1 = r1.getBytes(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r11 = r1.length     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r12 = com.tencent.wxop.stat.d.A     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r3 <= r12) goto L_0x012c
            r3 = 1
            goto L_0x012d
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r3 == 0) goto L_0x0199
            java.lang.String r3 = "Content-Encoding"
            r9.removeHeaders(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.<init>()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = ",gzip"
            r3.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = "Content-Encoding"
            r9.addHeader(r7, r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 == 0) goto L_0x0156
            java.lang.String r7 = "X-Content-Encoding"
            r9.removeHeaders(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = "X-Content-Encoding"
            r9.addHeader(r7, r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0156:
            r3 = 4
            byte[] r7 = new byte[r3]     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r10.write(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r7.<init>(r10)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r7.write(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r7.close()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            byte[] r1 = r10.toByteArray()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r1, r4, r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.putInt(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            boolean r3 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r3 == 0) goto L_0x0199
            com.tencent.wxop.stat.a.b r3 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = "before Gzip:"
            r4.<init>(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r4.append(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = " bytes, after Gzip:"
            r4.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r7 = r1.length     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r4.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r7 = " bytes"
            r4.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.g(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0199:
            byte[] r1 = com.tencent.wxop.stat.a.h.a(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.entity.ByteArrayEntity r3 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.setEntity(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.impl.client.DefaultHttpClient r1 = r0.f79846b     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.HttpResponse r1 = r1.execute(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.HttpEntity r3 = r1.getEntity()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            org.apache.http.StatusLine r4 = r1.getStatusLine()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r4 = r4.getStatusCode()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            long r7 = r3.getContentLength()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            boolean r9 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r9 == 0) goto L_0x01dc
            com.tencent.wxop.stat.a.b r9 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r12 = "http recv response status code:"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r11.append(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r12 = ", content length:"
            r11.append(r12)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r11.append(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r9.a(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x01dc:
            r11 = 0
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x01f2
            com.tencent.wxop.stat.a.b r1 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r4 = "Server response no data."
            r1.e(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r2 == 0) goto L_0x01ee
            r2.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x01ee:
            org.apache.http.util.EntityUtils.toString(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            return
        L_0x01f2:
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x035f
            java.io.InputStream r7 = r3.getContent()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.<init>(r7)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            long r11 = r3.getContentLength()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            int r3 = (int) r11     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.readFully(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r7.close()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.close()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "Content-Encoding"
            org.apache.http.Header r1 = r1.getFirstHeader(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r1 == 0) goto L_0x0262
            java.lang.String r8 = r1.getValue()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "gzip,rc4"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 == 0) goto L_0x022c
            byte[] r1 = com.tencent.wxop.stat.a.n.a((byte[]) r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            byte[] r3 = com.tencent.wxop.stat.a.h.b(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x0262
        L_0x022c:
            java.lang.String r8 = r1.getValue()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "rc4,gzip"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 == 0) goto L_0x0241
            byte[] r1 = com.tencent.wxop.stat.a.h.b(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            byte[] r3 = com.tencent.wxop.stat.a.n.a((byte[]) r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x0262
        L_0x0241:
            java.lang.String r8 = r1.getValue()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "gzip"
            boolean r8 = r8.equalsIgnoreCase(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 == 0) goto L_0x0252
            byte[] r3 = com.tencent.wxop.stat.a.n.a((byte[]) r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x0262
        L_0x0252:
            java.lang.String r1 = r1.getValue()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "rc4"
            boolean r1 = r1.equalsIgnoreCase(r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r1 == 0) goto L_0x0262
            byte[] r3 = com.tencent.wxop.stat.a.h.b(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0262:
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r8 = "UTF-8"
            r1.<init>(r3, r8)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            boolean r8 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r8 == 0) goto L_0x027e
            com.tencent.wxop.stat.a.b r8 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "http get response data:"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = r9.concat(r11)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.a(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x027e:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 != r1) goto L_0x0336
            java.lang.String r1 = "mid"
            java.lang.String r1 = r8.optString(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            boolean r3 = com.tencent.a.a.a.a.h.b((java.lang.String) r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            if (r3 == 0) goto L_0x02b1
            boolean r3 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            if (r3 == 0) goto L_0x02a8
            com.tencent.wxop.stat.a.b r3 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r4 = "update mid:"
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r4 = r4.concat(r9)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r3.a(r4)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
        L_0x02a8:
            android.content.Context r3 = com.tencent.wxop.stat.aj.f79845e     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            com.tencent.a.a.a.a.g r3 = com.tencent.a.a.a.a.g.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r3.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
        L_0x02b1:
            java.lang.String r1 = "cfg"
            boolean r1 = r8.isNull(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            if (r1 != 0) goto L_0x02c4
            java.lang.String r1 = "cfg"
            org.json.JSONObject r1 = r8.getJSONObject(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            android.content.Context r3 = com.tencent.wxop.stat.aj.f79845e     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            com.tencent.wxop.stat.d.a((android.content.Context) r3, (org.json.JSONObject) r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
        L_0x02c4:
            java.lang.String r1 = "ncts"
            boolean r1 = r8.isNull(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            if (r1 != 0) goto L_0x031d
            java.lang.String r1 = "ncts"
            int r1 = r8.getInt(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            long r3 = (long) r1     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            r9 = 0
            long r3 = r3 - r11
            int r3 = (int) r3     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            boolean r4 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            if (r4 == 0) goto L_0x02fe
            com.tencent.wxop.stat.a.b r4 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r11 = "server time:"
            r9.<init>(r11)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r9.append(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r1 = ", diff time:"
            r9.append(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r9.append(r3)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r1 = r9.toString()     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            r4.a(r1)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
        L_0x02fe:
            android.content.Context r1 = com.tencent.wxop.stat.aj.f79845e     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            com.tencent.wxop.stat.a.n.f79820c = r11     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r4 = "mta.qq.com.checktime"
            long r11 = com.tencent.wxop.stat.a.n.f79820c     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            com.tencent.wxop.stat.a.r.b((android.content.Context) r1, (java.lang.String) r4, (long) r11)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            android.content.Context r1 = com.tencent.wxop.stat.aj.f79845e     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            com.tencent.wxop.stat.a.n.f79821d = r3     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            java.lang.String r4 = "mta.qq.com.difftime"
            com.tencent.wxop.stat.a.r.b((android.content.Context) r1, (java.lang.String) r4, (int) r3)     // Catch:{ Throwable -> 0x0317, all -> 0x0367 }
            goto L_0x031d
        L_0x0317:
            r1 = move-exception
            com.tencent.wxop.stat.a.b r3 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r3.c(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x031d:
            if (r2 == 0) goto L_0x035b
            java.lang.String r1 = "ret"
            int r1 = r8.optInt(r1)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r1 != 0) goto L_0x032b
            r2.a()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x035b
        L_0x032b:
            com.tencent.wxop.stat.a.b r1 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r3 = "response error data."
            r1.d(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0332:
            r2.b()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x035b
        L_0x0336:
            com.tencent.wxop.stat.a.b r1 = com.tencent.wxop.stat.aj.f79844a     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "Server response error code:"
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.append(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r4 = ", error:"
            r8.append(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r9 = "UTF-8"
            r4.<init>(r3, r9)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r8.append(r4)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            java.lang.String r3 = r8.toString()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r1.d(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            if (r2 == 0) goto L_0x035b
            goto L_0x0332
        L_0x035b:
            r7.close()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            goto L_0x0362
        L_0x035f:
            org.apache.http.util.EntityUtils.toString(r3)     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
        L_0x0362:
            r10.close()     // Catch:{ Throwable -> 0x0369, all -> 0x0367 }
            r1 = r5
            goto L_0x036a
        L_0x0367:
            r0 = move-exception
            throw r0
        L_0x0369:
            r1 = move-exception
        L_0x036a:
            if (r1 == 0) goto L_0x0397
            if (r2 == 0) goto L_0x0373
            r2.b()     // Catch:{ Throwable -> 0x0372 }
            goto L_0x0373
        L_0x0372:
        L_0x0373:
            boolean r1 = r1 instanceof java.lang.OutOfMemoryError
            if (r1 == 0) goto L_0x0385
            java.lang.System.gc()
            r0.f79848d = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 2048(0x800, float:2.87E-42)
            r1.<init>(r2)
            r0.f79848d = r1
        L_0x0385:
            android.content.Context r0 = com.tencent.wxop.stat.aj.f79845e
            com.tencent.wxop.stat.i r0 = com.tencent.wxop.stat.i.a((android.content.Context) r0)
            int r1 = r0.f79907e
            int r1 = r1 + r6
            java.util.List<java.lang.String> r2 = r0.f79903a
            int r2 = r2.size()
            int r1 = r1 % r2
            r0.f79907e = r1
        L_0x0397:
            return
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.al.run():void");
    }
}
