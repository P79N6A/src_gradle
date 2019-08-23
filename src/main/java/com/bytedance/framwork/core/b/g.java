package com.bytedance.framwork.core.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static b f20147a;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    public interface b {
        String a();
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] a(String str, byte[] bArr, a aVar, String str2, boolean z) throws Throwable {
        String str3;
        byte[] bArr2;
        String str4;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (!z) {
            return a(str, bArr4, str2, str6, "POST", true, false);
        }
        byte[] a2 = TTEncryptUtils.a(bArr4, bArr4.length);
        if (a2 != null) {
            str4 = str + "&tt_data=a";
            bArr2 = a2;
            str3 = "application/octet-stream;tt-data=a";
        } else {
            str4 = str;
            str3 = str2;
            bArr2 = bArr4;
        }
        return a(str4, bArr2, str3, str6, "POST", true, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.Closeable} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104 A[SYNTHETIC, Splitter:B:90:0x0104] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r4, byte[] r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) throws java.lang.Throwable {
        /*
            r0 = 0
            com.bytedance.framwork.core.b.g$b r1 = f20147a     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r1 == 0) goto L_0x000b
            com.bytedance.framwork.core.b.g$b r4 = f20147a     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.lang.String r4 = r4.a()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
        L_0x000b:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r10 == 0) goto L_0x001c
            java.lang.String r4 = com.bytedance.frameworks.core.encrypt.a.a((java.lang.String) r4, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r1)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            goto L_0x0021
        L_0x001c:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
        L_0x0021:
            java.net.URLConnection r4 = r2.openConnection()     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x00f7, all -> 0x00f3 }
            if (r10 == 0) goto L_0x0056
            boolean r10 = r1.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r10 != 0) goto L_0x0056
            java.util.Iterator r10 = r1.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r1 = r10.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r1 == 0) goto L_0x0056
            java.lang.Object r1 = r10.next()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r2 = r1.first     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r4.setRequestProperty(r2, r1)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0033
        L_0x004d:
            r5 = move-exception
            goto L_0x00ff
        L_0x0050:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x00fa
        L_0x0056:
            if (r9 == 0) goto L_0x005d
            r9 = 1
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0061
        L_0x005d:
            r9 = 0
            r4.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            java.lang.String r9 = "Content-Type"
            r4.setRequestProperty(r9, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0068:
            if (r7 == 0) goto L_0x006f
            java.lang.String r6 = "Content-Encoding"
            r4.setRequestProperty(r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x006f:
            java.lang.String r6 = "Accept-Encoding"
            java.lang.String r7 = "gzip"
            r4.setRequestProperty(r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r6 = "Version-Code"
            java.lang.String r7 = "1"
            r4.setRequestProperty(r6, r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r4.setRequestMethod(r8)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x00a0
            int r6 = r5.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r6 <= 0) goto L_0x00a0
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x009a }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ all -> 0x009a }
            r6.<init>(r7)     // Catch:{ all -> 0x009a }
            r6.write(r5)     // Catch:{ all -> 0x0098 }
            r6.flush()     // Catch:{ all -> 0x0098 }
            com.bytedance.framwork.core.b.d.a(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x00a0
        L_0x0098:
            r5 = move-exception
            goto L_0x009c
        L_0x009a:
            r5 = move-exception
            r6 = r0
        L_0x009c:
            com.bytedance.framwork.core.b.d.a(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r5     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00a0:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00e9
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r6 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r7 != 0) goto L_0x00d3
            java.lang.String r7 = "gzip"
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            if (r6 == 0) goto L_0x00d3
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00ce }
            r6.<init>(r5)     // Catch:{ all -> 0x00ce }
            byte[] r7 = a((java.io.InputStream) r6)     // Catch:{ all -> 0x00cb }
            com.bytedance.framwork.core.b.d.a(r6)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            goto L_0x00d7
        L_0x00cb:
            r7 = move-exception
            r0 = r6
            goto L_0x00cf
        L_0x00ce:
            r7 = move-exception
        L_0x00cf:
            com.bytedance.framwork.core.b.d.a(r0)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
            throw r7     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x00d3:
            byte[] r7 = a((java.io.InputStream) r5)     // Catch:{ Throwable -> 0x00e4, all -> 0x00e0 }
        L_0x00d7:
            com.bytedance.framwork.core.b.d.a(r5)
            if (r4 == 0) goto L_0x00df
            r4.disconnect()     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            return r7
        L_0x00e0:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L_0x00ff
        L_0x00e4:
            r6 = move-exception
            r0 = r4
            r4 = r5
            r5 = r6
            goto L_0x00fa
        L_0x00e9:
            java.lang.String r6 = r4.getResponseMessage()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.framwork.core.b.c r7 = new com.bytedance.framwork.core.b.c     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r7.<init>(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r7     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00f3:
            r4 = move-exception
            r5 = r4
            r4 = r0
            goto L_0x00ff
        L_0x00f7:
            r4 = move-exception
            r5 = r4
            r4 = r0
        L_0x00fa:
            throw r5     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x00ff:
            com.bytedance.framwork.core.b.d.a(r0)
            if (r4 == 0) goto L_0x0107
            r4.disconnect()     // Catch:{ Exception -> 0x0107 }
        L_0x0107:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.b.g.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):byte[]");
    }
}
