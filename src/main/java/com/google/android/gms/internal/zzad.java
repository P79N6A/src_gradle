package com.google.android.gms.internal;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public final class zzad implements zzk {
    private static boolean DEBUG = zzab.DEBUG;
    private static int zzam = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
    private static int zzan = 4096;
    private zzan zzao;
    private zzae zzap;

    public zzad(zzan zzan2) {
        this(zzan2, new zzae(zzan));
    }

    private zzad(zzan zzan2, zzae zzae) {
        this.zzao = zzan2;
        this.zzap = zzae;
    }

    private static Map<String, String> zza(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private static void zza(String str, zzp<?> zzp, zzaa zzaa) throws zzaa {
        zzx zzj = zzp.zzj();
        int zzi = zzp.zzi();
        try {
            zzj.zza(zzaa);
            zzp.zzb(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
        } catch (zzaa e2) {
            zzp.zzb(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(zzi)}));
            throw e2;
        }
    }

    private final byte[] zza(HttpEntity httpEntity) throws IOException, zzy {
        zzaq zzaq = new zzaq(this.zzap, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content != null) {
                byte[] zzb = this.zzap.zzb(1024);
                while (true) {
                    try {
                        int read = content.read(zzb);
                        if (read == -1) {
                            break;
                        }
                        zzaq.write(zzb, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        bArr = zzb;
                        try {
                            httpEntity.consumeContent();
                        } catch (IOException unused) {
                            zzab.zza("Error occured when calling consumingContent", new Object[0]);
                        }
                        this.zzap.zza(bArr);
                        zzaq.close();
                        throw th;
                    }
                }
                byte[] byteArray = zzaq.toByteArray();
                try {
                    httpEntity.consumeContent();
                } catch (IOException unused2) {
                    zzab.zza("Error occured when calling consumingContent", new Object[0]);
                }
                this.zzap.zza(zzb);
                zzaq.close();
                return byteArray;
            }
            throw new zzy();
        } catch (Throwable th2) {
            th = th2;
            httpEntity.consumeContent();
            this.zzap.zza(bArr);
            zzaq.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0198, code lost:
        r2 = java.lang.String.valueOf(r21.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a8, code lost:
        if (r2.length() != 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01aa, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01af, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b7, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b8, code lost:
        r0 = "connection";
        r5 = new com.google.android.gms.internal.zzz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c0, code lost:
        r0 = "socket";
        r5 = new com.google.android.gms.internal.zzz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c7, code lost:
        zza(r0, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r13 > ((long) zzam)) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0120, code lost:
        r14 = r5;
        r10 = null;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0125, code lost:
        r0 = r10.getStatusLine().getStatusCode();
        com.google.android.gms.internal.zzab.zzc("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r21.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0141, code lost:
        if (r13 != null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0143, code lost:
        r11 = new com.google.android.gms.internal.zzn(r0, r13, r14, false, android.os.SystemClock.elapsedRealtime() - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0153, code lost:
        if (r0 == 401) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015c, code lost:
        if (r0 < 400) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0168, code lost:
        throw new com.google.android.gms.internal.zzf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016b, code lost:
        if (r0 < 500) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0176, code lost:
        throw new com.google.android.gms.internal.zzy(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017c, code lost:
        throw new com.google.android.gms.internal.zzy(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017d, code lost:
        zza("auth", r2, new com.google.android.gms.internal.zza(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0189, code lost:
        r0 = "network";
        r5 = new com.google.android.gms.internal.zzm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0196, code lost:
        throw new com.google.android.gms.internal.zzo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0197, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[ExcHandler: ConnectTimeoutException (unused org.apache.http.conn.ConnectTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0191 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0197 A[ExcHandler: MalformedURLException (r0v3 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.zzn zza(com.google.android.gms.internal.zzp<?> r21) throws com.google.android.gms.internal.zzaa {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.Map r5 = java.util.Collections.emptyMap()
            r6 = 1
            r8 = 0
            r9 = 0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            com.google.android.gms.internal.zzc r10 = r21.zze()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            if (r10 == 0) goto L_0x003d
            java.lang.String r11 = r10.zza     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            if (r11 == 0) goto L_0x0025
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r10.zza     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            r0.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
        L_0x0025:
            long r11 = r10.zzc     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x003d
            java.util.Date r11 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            long r12 = r10.zzc     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            r11.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            java.lang.String r10 = "If-Modified-Since"
            java.lang.String r11 = org.apache.http.impl.cookie.DateUtils.formatDate(r11)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            r0.put(r10, r11)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
        L_0x003d:
            com.google.android.gms.internal.zzan r10 = r1.zzao     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            org.apache.http.HttpResponse r10 = r10.zza(r2, r0)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011f }
            org.apache.http.StatusLine r0 = r10.getStatusLine()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011b }
            int r12 = r0.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011b }
            org.apache.http.Header[] r11 = r10.getAllHeaders()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011b }
            java.util.Map r11 = zza((org.apache.http.Header[]) r11)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x011b }
            r5 = 304(0x130, float:4.26E-43)
            if (r12 != r5) goto L_0x0092
            com.google.android.gms.internal.zzc r0 = r21.zze()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            if (r0 != 0) goto L_0x0072
            com.google.android.gms.internal.zzn r0 = new com.google.android.gms.internal.zzn     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r17 = 1
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r5 = 0
            long r18 = r12 - r3
            r13 = r0
            r16 = r11
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            return r0
        L_0x0072:
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.zzf     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r5.putAll(r11)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            com.google.android.gms.internal.zzn r5 = new com.google.android.gms.internal.zzn     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r13 = 304(0x130, float:4.26E-43)
            byte[] r14 = r0.data     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            java.util.Map<java.lang.String, java.lang.String> r15 = r0.zzf     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r16 = 1
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            r0 = 0
            long r17 = r17 - r3
            r12 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            return r5
        L_0x008d:
            r0 = move-exception
            r13 = r8
        L_0x008f:
            r14 = r11
            goto L_0x0123
        L_0x0092:
            org.apache.http.HttpEntity r5 = r10.getEntity()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0117 }
            if (r5 == 0) goto L_0x00a1
            org.apache.http.HttpEntity r5 = r10.getEntity()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            byte[] r5 = r1.zza((org.apache.http.HttpEntity) r5)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x008d }
            goto L_0x00a3
        L_0x00a1:
            byte[] r5 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0117 }
        L_0x00a3:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r8 = 0
            long r13 = r13 - r3
            boolean r8 = DEBUG     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            if (r8 != 0) goto L_0x00b8
            int r8 = zzam     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x00b5 }
            long r7 = (long) r8
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x00ef
            goto L_0x00b8
        L_0x00b5:
            r0 = move-exception
            r13 = r5
            goto L_0x008f
        L_0x00b8:
            java.lang.String r7 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r8[r9] = r2     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r8[r6] = r13     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            if (r5 == 0) goto L_0x00cd
            int r13 = r5.length     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x00b5 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x00b5 }
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r13 = "null"
        L_0x00cf:
            r14 = 2
            r8[r14] = r13     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r13 = 3
            int r0 = r0.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r8[r13] = r0     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r0 = 4
            com.google.android.gms.internal.zzx r13 = r21.zzj()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            int r13 = r13.zzb()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r8[r0] = r13     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            com.google.android.gms.internal.zzab.zzb(r7, r8)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
        L_0x00ef:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x0109
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x0109
            com.google.android.gms.internal.zzn r0 = new com.google.android.gms.internal.zzn     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r15 = 0
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0112 }
            r13 = 0
            long r16 = r7 - r3
            r7 = r11
            r11 = r0
            r13 = r5
            r14 = r7
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0110 }
            return r0
        L_0x0109:
            r7 = r11
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0110 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0110 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x01c0, ConnectTimeoutException -> 0x01b8, MalformedURLException -> 0x0197, IOException -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            goto L_0x0114
        L_0x0112:
            r0 = move-exception
            r7 = r11
        L_0x0114:
            r13 = r5
            r14 = r7
            goto L_0x0123
        L_0x0117:
            r0 = move-exception
            r7 = r11
            r14 = r7
            goto L_0x011d
        L_0x011b:
            r0 = move-exception
            r14 = r5
        L_0x011d:
            r13 = r8
            goto L_0x0123
        L_0x011f:
            r0 = move-exception
            r14 = r5
            r10 = r8
            r13 = r10
        L_0x0123:
            if (r10 == 0) goto L_0x0191
            org.apache.http.StatusLine r0 = r10.getStatusLine()
            int r0 = r0.getStatusCode()
            java.lang.String r5 = "Unexpected response code %d for %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r9] = r8
            java.lang.String r8 = r21.getUrl()
            r7[r6] = r8
            com.google.android.gms.internal.zzab.zzc(r5, r7)
            if (r13 == 0) goto L_0x0189
            com.google.android.gms.internal.zzn r5 = new com.google.android.gms.internal.zzn
            r15 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r16 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x017d
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x015a
            goto L_0x017d
        L_0x015a:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x0169
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            com.google.android.gms.internal.zzf r0 = new com.google.android.gms.internal.zzf
            r0.<init>(r5)
            throw r0
        L_0x0169:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x0177
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x0177
            com.google.android.gms.internal.zzy r0 = new com.google.android.gms.internal.zzy
            r0.<init>(r5)
            throw r0
        L_0x0177:
            com.google.android.gms.internal.zzy r0 = new com.google.android.gms.internal.zzy
            r0.<init>(r5)
            throw r0
        L_0x017d:
            java.lang.String r0 = "auth"
            com.google.android.gms.internal.zza r6 = new com.google.android.gms.internal.zza
            r6.<init>(r5)
            zza(r0, r2, r6)
            goto L_0x0008
        L_0x0189:
            java.lang.String r0 = "network"
            com.google.android.gms.internal.zzm r5 = new com.google.android.gms.internal.zzm
            r5.<init>()
            goto L_0x01c7
        L_0x0191:
            com.google.android.gms.internal.zzo r2 = new com.google.android.gms.internal.zzo
            r2.<init>(r0)
            throw r2
        L_0x0197:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r21.getUrl()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x01af
            java.lang.String r2 = r4.concat(r2)
            goto L_0x01b4
        L_0x01af:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x01b4:
            r3.<init>(r2, r0)
            throw r3
        L_0x01b8:
            java.lang.String r0 = "connection"
            com.google.android.gms.internal.zzz r5 = new com.google.android.gms.internal.zzz
            r5.<init>()
            goto L_0x01c7
        L_0x01c0:
            java.lang.String r0 = "socket"
            com.google.android.gms.internal.zzz r5 = new com.google.android.gms.internal.zzz
            r5.<init>()
        L_0x01c7:
            zza(r0, r2, r5)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzad.zza(com.google.android.gms.internal.zzp):com.google.android.gms.internal.zzn");
    }
}
