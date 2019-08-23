package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;

public final class zzao implements zzan {
    private final zzap zzaB;
    private final SSLSocketFactory zzaC;

    public zzao() {
        this(null);
    }

    private zzao(zzap zzap) {
        this(null, null);
    }

    private zzao(zzap zzap, SSLSocketFactory sSLSocketFactory) {
    }

    private static HttpEntity zza(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzp<?> zzp) throws IOException, zza {
        byte[] zzg = zzp.zzg();
        if (zzg != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", zzp.zzf());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzg);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r8.setRequestMethod(r0);
        zza(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r8.setRequestMethod(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.apache.http.HttpResponse zza(com.google.android.gms.internal.zzp<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException, com.google.android.gms.internal.zza {
        /*
            r6 = this;
            java.lang.String r0 = r7.getUrl()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r2 = r7.getHeaders()
            r1.putAll(r2)
            r1.putAll(r8)
            com.google.android.gms.internal.zzap r8 = r6.zzaB
            if (r8 == 0) goto L_0x003c
            com.google.android.gms.internal.zzap r8 = r6.zzaB
            java.lang.String r8 = r8.zzg(r0)
            if (r8 != 0) goto L_0x003d
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "URL blocked by rewriter: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0032
            java.lang.String r8 = r8.concat(r0)
            goto L_0x0038
        L_0x0032:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            r8 = r0
        L_0x0038:
            r7.<init>(r8)
            throw r7
        L_0x003c:
            r8 = r0
        L_0x003d:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r8 = r0.openConnection()
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r8.setInstanceFollowRedirects(r2)
            int r2 = r7.zzi()
            r8.setConnectTimeout(r2)
            r8.setReadTimeout(r2)
            r2 = 0
            r8.setUseCaches(r2)
            r3 = 1
            r8.setDoInput(r3)
            java.lang.String r4 = "https"
            java.lang.String r0 = r0.getProtocol()
            r4.equals(r0)
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r8.addRequestProperty(r4, r5)
            goto L_0x0072
        L_0x0088:
            int r0 = r7.getMethod()
            switch(r0) {
                case -1: goto L_0x00b7;
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009d;
                case 6: goto L_0x009a;
                case 7: goto L_0x0097;
                default: goto L_0x008f;
            }
        L_0x008f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)
            throw r7
        L_0x0097:
            java.lang.String r0 = "PATCH"
            goto L_0x00ab
        L_0x009a:
            java.lang.String r0 = "TRACE"
            goto L_0x00b4
        L_0x009d:
            java.lang.String r0 = "OPTIONS"
            goto L_0x00b4
        L_0x00a0:
            java.lang.String r0 = "HEAD"
            goto L_0x00b4
        L_0x00a3:
            java.lang.String r0 = "DELETE"
            goto L_0x00b4
        L_0x00a6:
            java.lang.String r0 = "PUT"
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r0 = "POST"
        L_0x00ab:
            r8.setRequestMethod(r0)
            zza((java.net.HttpURLConnection) r8, (com.google.android.gms.internal.zzp<?>) r7)
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "GET"
        L_0x00b4:
            r8.setRequestMethod(r0)
        L_0x00b7:
            org.apache.http.ProtocolVersion r0 = new org.apache.http.ProtocolVersion
            java.lang.String r1 = "HTTP"
            r0.<init>(r1, r3, r3)
            int r1 = r8.getResponseCode()
            r4 = -1
            if (r1 == r4) goto L_0x0137
            org.apache.http.message.BasicStatusLine r1 = new org.apache.http.message.BasicStatusLine
            int r4 = r8.getResponseCode()
            java.lang.String r5 = r8.getResponseMessage()
            r1.<init>(r0, r4, r5)
            org.apache.http.message.BasicHttpResponse r0 = new org.apache.http.message.BasicHttpResponse
            r0.<init>(r1)
            int r7 = r7.getMethod()
            int r1 = r1.getStatusCode()
            r4 = 4
            if (r7 == r4) goto L_0x00f3
            r7 = 100
            if (r7 > r1) goto L_0x00ea
            r7 = 200(0xc8, float:2.8E-43)
            if (r1 < r7) goto L_0x00f3
        L_0x00ea:
            r7 = 204(0xcc, float:2.86E-43)
            if (r1 == r7) goto L_0x00f3
            r7 = 304(0x130, float:4.26E-43)
            if (r1 == r7) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r3 = 0
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            org.apache.http.HttpEntity r7 = zza(r8)
            r0.setEntity(r7)
        L_0x00fd:
            java.util.Map r7 = r8.getHeaderFields()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0109:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0136
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r1 = r8.getKey()
            if (r1 == 0) goto L_0x0109
            org.apache.http.message.BasicHeader r1 = new org.apache.http.message.BasicHeader
            java.lang.Object r3 = r8.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            r1.<init>(r3, r8)
            r0.addHeader(r1)
            goto L_0x0109
        L_0x0136:
            return r0
        L_0x0137:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzao.zza(com.google.android.gms.internal.zzp, java.util.Map):org.apache.http.HttpResponse");
    }
}
