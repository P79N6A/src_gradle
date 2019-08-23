package com.bytedance.framwork.core.monitor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.apm.d;
import com.bytedance.apm.k.j;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static C0176b f20174a;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.bytedance.framwork.core.monitor.b$b  reason: collision with other inner class name */
    public interface C0176b {
        String a();
    }

    public enum c {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private c(int i) {
            this.nativeInt = i;
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        return j.b(context);
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

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception e2) {
            d.a().a(e2, "MonitorNetUtil: isWifi");
            return false;
        }
    }

    public static c b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return c.WIFI;
                    }
                    if (type != 0) {
                        return c.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return c.MOBILE_3G;
                        case 13:
                            return c.MOBILE_4G;
                        default:
                            return c.MOBILE;
                    }
                }
            }
            return c.NONE;
        } catch (Throwable th) {
            d.a().a(th, "MonitorNetUtil: getNetworkType");
            return c.MOBILE;
        }
    }

    public static String a(String str, byte[] bArr) {
        if (f20174a != null) {
            return f20174a.a();
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r5, java.io.File r6) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            r1.<init>(r5)     // Catch:{ all -> 0x0038 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0035 }
            r5.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0030 }
            r6.<init>(r5)     // Catch:{ all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x002a }
        L_0x0014:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x002a }
            r3 = -1
            if (r2 == r3) goto L_0x0020
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ all -> 0x002a }
            goto L_0x0014
        L_0x0020:
            r6.close()
            r5.close()
            r1.close()
            return
        L_0x002a:
            r0 = move-exception
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L_0x003b
        L_0x0030:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x003b
        L_0x0035:
            r5 = move-exception
            r6 = r0
            goto L_0x003b
        L_0x0038:
            r5 = move-exception
            r6 = r0
            r1 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            if (r6 == 0) goto L_0x0045
            r6.close()
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.monitor.b.a(java.io.File, java.io.File):void");
    }

    public static byte[] a(String str, byte[] bArr, a aVar, String str2, boolean z) throws Throwable {
        byte[] bArr2;
        String str3;
        String str4 = null;
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
                str4 = "gzip";
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
            str4 = "deflate";
        }
        String str5 = str4;
        byte[] a2 = TTEncryptUtils.a(bArr, bArr.length);
        if (a2 != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            str2 = "application/octet-stream;tt-data=a";
            str3 = str + "tt_data=a";
            bArr2 = a2;
        } else {
            str3 = str;
            bArr2 = bArr;
        }
        return a(str3, bArr2, str2, str5, "POST", true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01eb, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ec, code lost:
        com.bytedance.apm.d.a().a(r11, "MonitorNetUtil: uploadFile");
        r12 = null;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f8, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f9, code lost:
        r12 = null;
        r3 = r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0236 A[SYNTHETIC, Splitter:B:103:0x0236] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0246 A[SYNTHETIC, Splitter:B:108:0x0246] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f8 A[ExcHandler: all (th java.lang.Throwable), PHI: r13 
      PHI: (r13v9 java.io.File) = (r13v10 java.io.File), (r13v10 java.io.File), (r13v17 java.io.File) binds: [B:36:0x013b, B:71:0x01e1, B:27:0x0120] A[DONT_GENERATE, DONT_INLINE], Splitter:B:27:0x0120] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r10, java.io.File r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13, boolean r14) throws java.lang.Throwable {
        /*
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L_0x0255
            if (r11 == 0) goto L_0x0255
            boolean r12 = r11.exists()
            if (r12 == 0) goto L_0x0255
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "tt_file_upload"
            r12.<init>(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "--"
            java.lang.String r1 = "\r\n"
            java.lang.String r2 = "multipart/form-data"
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Throwable -> 0x021b, all -> 0x0217 }
            r4.<init>(r10)     // Catch:{ Throwable -> 0x021b, all -> 0x0217 }
            java.net.URLConnection r10 = r4.openConnection()     // Catch:{ Throwable -> 0x021b, all -> 0x0217 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Throwable -> 0x021b, all -> 0x0217 }
            r4 = 30000(0x7530, float:4.2039E-41)
            r10.setReadTimeout(r4)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r10.setConnectTimeout(r4)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r4 = 1
            r10.setDoInput(r4)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r10.setDoOutput(r4)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r4 = 0
            r10.setUseCaches(r4)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = "POST"
            r10.setRequestMethod(r5)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = "Charset"
            r10.setRequestProperty(r5, r13)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = "connection"
            java.lang.String r6 = "keep-alive"
            r10.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.<init>()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.append(r2)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r2 = ";boundary="
            r6.append(r2)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.append(r12)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r2 = r6.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r10.setRequestProperty(r5, r2)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r14 == 0) goto L_0x007c
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r10.setRequestProperty(r2, r5)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
        L_0x007c:
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.io.OutputStream r5 = r10.getOutputStream()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r11 == 0) goto L_0x0200
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.<init>()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r12)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r1)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r14 == 0) goto L_0x00d6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r7 = "Content-Disposition: form-data; name=\"file\"; filename=\""
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r7 = r11.getName()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r8 = ".zip"
            boolean r7 = r7.endsWith(r8)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = r11.getName()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            goto L_0x00c4
        L_0x00af:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r7.<init>()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r8 = r11.getName()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r7.append(r8)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
        L_0x00c4:
            r6.append(r7)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r7 = "\""
            r6.append(r7)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.append(r1)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
        L_0x00d6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r7 = "Content-Type: application/octet-stream; charset="
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.append(r13)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r6.append(r1)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r13 = r6.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r13)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r5.append(r1)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r13 = r5.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            byte[] r13 = r13.getBytes()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r2.write(r13)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r14 == 0) goto L_0x0132
            java.lang.String r13 = r11.getName()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r14 = ".zip"
            boolean r13 = r13.endsWith(r14)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            if (r13 != 0) goto L_0x0132
            java.io.File r13 = new java.io.File     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r14.<init>()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = r11.getAbsolutePath()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r14.append(r5)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r5 = "_tmp.zip"
            r14.append(r5)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            java.lang.String r14 = r14.toString()     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r13.<init>(r14)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            boolean r14 = r13.exists()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            if (r14 == 0) goto L_0x0129
            r13.delete()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
        L_0x0129:
            a((java.io.File) r11, (java.io.File) r13)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.<init>(r13)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            goto L_0x0139
        L_0x0132:
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r13.<init>(r11)     // Catch:{ Throwable -> 0x0214, all -> 0x0211 }
            r11 = r13
            r13 = r3
        L_0x0139:
            r14 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r14]     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
        L_0x013d:
            int r5 = r11.read(r14)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r6 = -1
            if (r5 == r6) goto L_0x0148
            r2.write(r14, r4, r5)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            goto L_0x013d
        L_0x0148:
            r11.close()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            byte[] r11 = r1.getBytes()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r2.write(r11)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.<init>()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.append(r0)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.append(r12)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.append(r0)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r11.append(r1)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            byte[] r11 = r11.getBytes()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r2.write(r11)     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r2.flush()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r2.close()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            int r11 = r10.getResponseCode()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 != r12) goto L_0x01e1
            java.io.InputStream r11 = r10.getInputStream()     // Catch:{ Throwable -> 0x01fc, all -> 0x01f8 }
            java.lang.String r12 = r10.getContentEncoding()     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            if (r14 != 0) goto L_0x019f
            java.lang.String r14 = "gzip"
            boolean r12 = r12.equalsIgnoreCase(r14)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            if (r12 == 0) goto L_0x019f
            java.util.zip.GZIPInputStream r12 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            r12.<init>(r11)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            byte[] r14 = a((java.io.InputStream) r12)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            r12.close()     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            goto L_0x01a3
        L_0x019f:
            byte[] r14 = a((java.io.InputStream) r11)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
        L_0x01a3:
            java.lang.String r12 = new java.lang.String     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            r12.<init>(r14)     // Catch:{ Throwable -> 0x01db, all -> 0x01d4 }
            if (r13 == 0) goto L_0x01b3
            boolean r14 = r13.exists()
            if (r14 == 0) goto L_0x01b3
            r13.delete()
        L_0x01b3:
            if (r11 == 0) goto L_0x01c3
            r11.close()     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01c3
        L_0x01b9:
            r11 = move-exception
            com.bytedance.apm.d r13 = com.bytedance.apm.d.a()
            java.lang.String r14 = "MonitorNetUtil: uploadFile"
            r13.a(r11, r14)
        L_0x01c3:
            if (r10 == 0) goto L_0x01d3
            r10.disconnect()     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01d3
        L_0x01c9:
            r10 = move-exception
            com.bytedance.apm.d r11 = com.bytedance.apm.d.a()
            java.lang.String r13 = "MonitorNetUtil: uploadFile"
            r11.a(r10, r13)
        L_0x01d3:
            return r12
        L_0x01d4:
            r12 = move-exception
            r3 = r13
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x0229
        L_0x01db:
            r12 = move-exception
            r3 = r13
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x021e
        L_0x01e1:
            java.lang.String r12 = r10.getResponseMessage()     // Catch:{ Throwable -> 0x01eb, all -> 0x01f8 }
            com.bytedance.apm.net.a r14 = new com.bytedance.apm.net.a     // Catch:{ Throwable -> 0x01eb, all -> 0x01f8 }
            r14.<init>(r11, r12)     // Catch:{ Throwable -> 0x01eb, all -> 0x01f8 }
            throw r14     // Catch:{ Throwable -> 0x01eb, all -> 0x01f8 }
        L_0x01eb:
            r11 = move-exception
            com.bytedance.apm.d r12 = com.bytedance.apm.d.a()
            java.lang.String r14 = "MonitorNetUtil: uploadFile"
            r12.a(r11, r14)
            r12 = r3
            r3 = r13
            goto L_0x0227
        L_0x01f8:
            r11 = move-exception
            r12 = r3
            r3 = r13
            goto L_0x0229
        L_0x01fc:
            r11 = move-exception
            r12 = r3
            r3 = r13
            goto L_0x021e
        L_0x0200:
            if (r10 == 0) goto L_0x0210
            r10.disconnect()     // Catch:{ Exception -> 0x0206 }
            goto L_0x0210
        L_0x0206:
            r10 = move-exception
            com.bytedance.apm.d r11 = com.bytedance.apm.d.a()
            java.lang.String r12 = "MonitorNetUtil: uploadFile"
            r11.a(r10, r12)
        L_0x0210:
            return r3
        L_0x0211:
            r11 = move-exception
            r12 = r3
            goto L_0x0229
        L_0x0214:
            r11 = move-exception
            r12 = r3
            goto L_0x021e
        L_0x0217:
            r11 = move-exception
            r10 = r3
            r12 = r10
            goto L_0x0229
        L_0x021b:
            r11 = move-exception
            r10 = r3
            r12 = r10
        L_0x021e:
            com.bytedance.apm.d r13 = com.bytedance.apm.d.a()
            java.lang.String r14 = "MonitorNetUtil: uploadFile"
            r13.a(r11, r14)
        L_0x0227:
            throw r11     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r11 = move-exception
        L_0x0229:
            if (r3 == 0) goto L_0x0234
            boolean r13 = r3.exists()
            if (r13 == 0) goto L_0x0234
            r3.delete()
        L_0x0234:
            if (r12 == 0) goto L_0x0244
            r12.close()     // Catch:{ Exception -> 0x023a }
            goto L_0x0244
        L_0x023a:
            r12 = move-exception
            com.bytedance.apm.d r13 = com.bytedance.apm.d.a()
            java.lang.String r14 = "MonitorNetUtil: uploadFile"
            r13.a(r12, r14)
        L_0x0244:
            if (r10 == 0) goto L_0x0254
            r10.disconnect()     // Catch:{ Exception -> 0x024a }
            goto L_0x0254
        L_0x024a:
            r10 = move-exception
            com.bytedance.apm.d r12 = com.bytedance.apm.d.a()
            java.lang.String r13 = "MonitorNetUtil: uploadFile"
            r12.a(r10, r13)
        L_0x0254:
            throw r11
        L_0x0255:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "url and file not be null "
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.monitor.b.a(java.lang.String, java.io.File, java.util.Map, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0109 A[SYNTHETIC, Splitter:B:72:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0119 A[SYNTHETIC, Splitter:B:77:0x0119] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) throws java.lang.Throwable {
        /*
            r8 = 0
            com.bytedance.framwork.core.monitor.b$b r0 = f20174a     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            if (r0 == 0) goto L_0x000b
            com.bytedance.framwork.core.monitor.b$b r3 = f20174a     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            java.lang.String r3 = r3.a()     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
        L_0x000b:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            r0.<init>()     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            if (r9 == 0) goto L_0x001c
            java.lang.String r3 = com.bytedance.frameworks.core.encrypt.a.a((java.lang.String) r3, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r0)     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            goto L_0x0021
        L_0x001c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
        L_0x0021:
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00f3, all -> 0x00ef }
            if (r9 == 0) goto L_0x0053
            boolean r9 = r0.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r9 != 0) goto L_0x0053
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r9.next()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r0.first     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.Object r0 = r0.second     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r3.setRequestProperty(r1, r0)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0033
        L_0x004d:
            r4 = move-exception
            goto L_0x0107
        L_0x0050:
            r4 = move-exception
            goto L_0x00f6
        L_0x0053:
            r9 = 1
            r3.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x005e
            java.lang.String r9 = "Content-Type"
            r3.setRequestProperty(r9, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x005e:
            if (r6 == 0) goto L_0x0065
            java.lang.String r5 = "Content-Encoding"
            r3.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0065:
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "gzip"
            r3.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = "Version-Code"
            java.lang.String r6 = "1"
            r3.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r3.setRequestMethod(r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r4 == 0) goto L_0x008d
            int r5 = r4.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 <= 0) goto L_0x008d
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.write(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.flush()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x008d:
            int r4 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x00e5
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            if (r6 != 0) goto L_0x00b8
            java.lang.String r6 = "gzip"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            if (r5 == 0) goto L_0x00b8
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            byte[] r6 = a((java.io.InputStream) r5)     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            r5.close()     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
            goto L_0x00bc
        L_0x00b8:
            byte[] r6 = a((java.io.InputStream) r4)     // Catch:{ Throwable -> 0x00e1, all -> 0x00dd }
        L_0x00bc:
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00cc
        L_0x00c2:
            r4 = move-exception
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r7 = "MonitorNetUtil: excuteRequest"
            r5.a(r4, r7)
        L_0x00cc:
            if (r3 == 0) goto L_0x00dc
            r3.disconnect()     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00dc
        L_0x00d2:
            r3 = move-exception
            com.bytedance.apm.d r4 = com.bytedance.apm.d.a()
            java.lang.String r5 = "MonitorNetUtil: excuteRequest"
            r4.a(r3, r5)
        L_0x00dc:
            return r6
        L_0x00dd:
            r5 = move-exception
            r8 = r4
            r4 = r5
            goto L_0x0107
        L_0x00e1:
            r5 = move-exception
            r8 = r4
            r4 = r5
            goto L_0x00f6
        L_0x00e5:
            java.lang.String r5 = r3.getResponseMessage()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            com.bytedance.apm.net.a r6 = new com.bytedance.apm.net.a     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6.<init>(r4, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r6     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x00ef:
            r3 = move-exception
            r4 = r3
            r3 = r8
            goto L_0x0107
        L_0x00f3:
            r3 = move-exception
            r4 = r3
            r3 = r8
        L_0x00f6:
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r6 = "MonitorNetUtil: excuteRequest"
            r5.a(r4, r6)
            r2 = r8
            r8 = r3
            r3 = r2
            throw r4     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
        L_0x0107:
            if (r8 == 0) goto L_0x0117
            r8.close()     // Catch:{ Exception -> 0x010d }
            goto L_0x0117
        L_0x010d:
            r5 = move-exception
            com.bytedance.apm.d r6 = com.bytedance.apm.d.a()
            java.lang.String r7 = "MonitorNetUtil: excuteRequest"
            r6.a(r5, r7)
        L_0x0117:
            if (r3 == 0) goto L_0x0127
            r3.disconnect()     // Catch:{ Exception -> 0x011d }
            goto L_0x0127
        L_0x011d:
            r3 = move-exception
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r6 = "MonitorNetUtil: excuteRequest"
            r5.a(r3, r6)
        L_0x0127:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.monitor.b.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):byte[]");
    }
}
