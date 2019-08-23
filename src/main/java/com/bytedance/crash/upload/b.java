package com.bytedance.crash.upload;

import android.text.TextUtils;
import com.bytedance.crash.i.f;
import com.bytedance.crash.j;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19561a;

    /* renamed from: b  reason: collision with root package name */
    private static d f19562b;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.bytedance.crash.upload.b$b  reason: collision with other inner class name */
    public enum C0154b {
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

        private C0154b(int i) {
            this.nativeInt = i;
        }
    }

    private static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        try {
            f fVar = new f(str, "UTF-8", false);
            fVar.a("aid", str2);
            fVar.a("device_id", str3);
            fVar.a("os", "Android");
            fVar.a("process_name", str4);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "崩溃");
                    fVar.a(file2.getName(), file2, hashMap);
                }
            }
            try {
                if (new JSONObject(fVar.a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (IOException unused2) {
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    f.a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    public static String a() {
        return j.e().f19537e;
    }

    public static String b() {
        return j.e().f19536d;
    }

    public static String a(Map map) {
        return a(j.e().f19534b, map);
    }

    public static String b(Map map) {
        return a(j.e().f19535c, map);
    }

    public static h a(g gVar) {
        if (gVar == null) {
            return new h(201);
        }
        try {
            return a(gVar.f19577a, gVar.f19581e, a.GZIP, "application/json; charset=utf-8", gVar.f19580d);
        } catch (Throwable th) {
            return new h(207, th);
        }
    }

    private static h b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new h(203);
        }
        String str = new String(bArr, Charset.forName("utf-8"));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                return new h(0, jSONObject);
            }
            return new h(204, str);
        } catch (JSONException unused) {
            return new h(204, str);
        }
    }

    public static h a(String str, String str2) {
        return a(str, str2, true);
    }

    public static h b(String str, String str2) {
        return a(str, str2, true);
    }

    private static String c(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(c(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(c(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static h a(String str, String str2, String str3) {
        try {
            f fVar = new f(str, "UTF-8", true);
            fVar.a("json", str2);
            fVar.a("file", new File(str3));
            String a2 = fVar.a();
            try {
                JSONObject jSONObject = new JSONObject(a2);
                if ("succ".equals(jSONObject.optString("succ_kind"))) {
                    return new h(0, jSONObject);
                }
                return new h(204, a2);
            } catch (JSONException e2) {
                return new h(205, (Throwable) e2);
            }
        } catch (IOException unused) {
            return new h(207);
        }
    }

    public static h a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return a(str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new h(201);
        } catch (Throwable th) {
            return new h(207, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.upload.h a(java.lang.String r9, byte[] r10, com.bytedance.crash.upload.b.a r11, java.lang.String r12, boolean r13) throws java.io.IOException {
        /*
            if (r9 != 0) goto L_0x000a
            com.bytedance.crash.upload.h r0 = new com.bytedance.crash.upload.h
            r1 = 201(0xc9, float:2.82E-43)
            r0.<init>(r1)
            return r0
        L_0x000a:
            r2 = 0
            if (r10 != 0) goto L_0x0010
            byte[] r3 = new byte[r2]
            goto L_0x0011
        L_0x0010:
            r3 = r10
        L_0x0011:
            int r4 = r3.length
            r5 = 0
            com.bytedance.crash.upload.b$a r6 = com.bytedance.crash.upload.b.a.GZIP
            r7 = 128(0x80, float:1.794E-43)
            if (r6 != r11) goto L_0x0023
            if (r4 <= r7) goto L_0x0023
            byte[] r1 = a((byte[]) r3)
            java.lang.String r2 = "gzip"
        L_0x0021:
            r5 = r2
            goto L_0x0056
        L_0x0023:
            com.bytedance.crash.upload.b$a r6 = com.bytedance.crash.upload.b.a.DEFLATER
            if (r6 != r11) goto L_0x0055
            if (r4 <= r7) goto L_0x0055
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r4 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4)
            java.util.zip.Deflater r5 = new java.util.zip.Deflater
            r5.<init>()
            r5.setInput(r3)
            r5.finish()
            byte[] r3 = new byte[r4]
        L_0x003d:
            boolean r4 = r5.finished()
            if (r4 != 0) goto L_0x004b
            int r4 = r5.deflate(r3)
            r1.write(r3, r2, r4)
            goto L_0x003d
        L_0x004b:
            r5.end()
            byte[] r1 = r1.toByteArray()
            java.lang.String r2 = "deflate"
            goto L_0x0021
        L_0x0055:
            r1 = r3
        L_0x0056:
            if (r1 != 0) goto L_0x0060
            com.bytedance.crash.upload.h r0 = new com.bytedance.crash.upload.h
            r1 = 202(0xca, float:2.83E-43)
            r0.<init>(r1)
            return r0
        L_0x0060:
            if (r13 == 0) goto L_0x00d0
            int r2 = r1.length
            byte[] r2 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.a(r1, r2)
            if (r2 == 0) goto L_0x00c4
            java.net.URL r1 = new java.net.URL
            r1.<init>(r9)
            java.lang.String r1 = r1.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "?"
            boolean r1 = r9.endsWith(r1)
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = "?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x0092:
            java.lang.String r1 = "&"
            boolean r1 = r9.endsWith(r1)
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = "&"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ad
        L_0x00ac:
            r0 = r9
        L_0x00ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "tt_data=a"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "application/octet-stream;tt-data=a"
            r4 = r1
            r3 = r2
            r2 = r0
            goto L_0x00c7
        L_0x00c4:
            r2 = r9
            r4 = r12
            r3 = r1
        L_0x00c7:
            java.lang.String r6 = "POST"
            r7 = 1
            r8 = 1
            com.bytedance.crash.upload.h r0 = a(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x00d0:
            java.lang.String r4 = "POST"
            r6 = 1
            r7 = 0
            r0 = r9
            r2 = r12
            r3 = r5
            r5 = r6
            r6 = r7
            com.bytedance.crash.upload.h r0 = a(r0, r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.b.a(java.lang.String, byte[], com.bytedance.crash.upload.b$a, java.lang.String, boolean):com.bytedance.crash.upload.h");
    }

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107 A[SYNTHETIC, Splitter:B:89:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114 A[SYNTHETIC, Splitter:B:97:0x0114] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.upload.h a(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r8 = 0
            com.bytedance.crash.upload.d r0 = f19562b     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            if (r0 == 0) goto L_0x000b
            com.bytedance.crash.upload.d r3 = f19562b     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            java.lang.String r3 = r3.a()     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
        L_0x000b:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            r0.<init>()     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            if (r9 == 0) goto L_0x001c
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            java.lang.String r3 = com.bytedance.frameworks.core.encrypt.a.a((java.lang.String) r3, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r0)     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            goto L_0x0021
        L_0x001c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
        L_0x0021:
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            if (r9 == 0) goto L_0x0056
            boolean r9 = r0.isEmpty()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r9 != 0) goto L_0x0056
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0033:
            boolean r0 = r9.hasNext()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0056
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
            goto L_0x0112
        L_0x0050:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
            goto L_0x00fe
        L_0x0056:
            r9 = 1
            r3.setDoOutput(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 == 0) goto L_0x0061
            java.lang.String r9 = "Content-Type"
            r3.setRequestProperty(r9, r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            java.lang.String r5 = "Content-Encoding"
            r3.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0068:
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "gzip"
            r3.setRequestProperty(r5, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r3.setRequestMethod(r7)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r4 == 0) goto L_0x0092
            int r5 = r4.length     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r5 <= 0) goto L_0x0092
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ all -> 0x008c }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ all -> 0x008c }
            r5.<init>(r6)     // Catch:{ all -> 0x008c }
            r5.write(r4)     // Catch:{ all -> 0x008a }
            r5.flush()     // Catch:{ all -> 0x008a }
            com.bytedance.crash.i.f.a((java.io.Closeable) r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x0092
        L_0x008a:
            r4 = move-exception
            goto L_0x008e
        L_0x008c:
            r4 = move-exception
            r5 = r8
        L_0x008e:
            com.bytedance.crash.i.f.a((java.io.Closeable) r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            throw r4     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x0092:
            int r4 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x00d9
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r5 = r3.getContentEncoding()     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
            java.lang.String r6 = "gzip"
            boolean r5 = r6.equalsIgnoreCase(r5)     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
            if (r5 == 0) goto L_0x00bf
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00ba }
            r5.<init>(r4)     // Catch:{ all -> 0x00ba }
            byte[] r6 = a((java.io.InputStream) r5)     // Catch:{ all -> 0x00b7 }
            com.bytedance.crash.i.f.a((java.io.Closeable) r5)     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
            goto L_0x00c3
        L_0x00b7:
            r6 = move-exception
            r8 = r5
            goto L_0x00bb
        L_0x00ba:
            r6 = move-exception
        L_0x00bb:
            com.bytedance.crash.i.f.a((java.io.Closeable) r8)     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
            throw r6     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
        L_0x00bf:
            byte[] r6 = a((java.io.InputStream) r4)     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
        L_0x00c3:
            com.bytedance.crash.upload.h r5 = b((byte[]) r6)     // Catch:{ Throwable -> 0x00d4, all -> 0x00d0 }
            if (r3 == 0) goto L_0x00cc
            r3.disconnect()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            com.bytedance.crash.i.f.a((java.io.Closeable) r4)
            return r5
        L_0x00d0:
            r5 = move-exception
            r8 = r4
            r4 = r5
            goto L_0x0112
        L_0x00d4:
            r5 = move-exception
            r8 = r3
            r3 = r4
            r4 = r5
            goto L_0x00fe
        L_0x00d9:
            com.bytedance.crash.upload.h r5 = new com.bytedance.crash.upload.h     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r6 = 206(0xce, float:2.89E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r9 = "http response code "
            r7.<init>(r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r7.append(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.lang.String r4 = r7.toString()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r5.<init>((int) r6, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r3 == 0) goto L_0x00f3
            r3.disconnect()     // Catch:{ Exception -> 0x00f3 }
        L_0x00f3:
            com.bytedance.crash.i.f.a((java.io.Closeable) r8)
            return r5
        L_0x00f7:
            r3 = move-exception
            r4 = r3
            r3 = r8
            goto L_0x0112
        L_0x00fb:
            r3 = move-exception
            r4 = r3
            r3 = r8
        L_0x00fe:
            com.bytedance.crash.upload.h r5 = new com.bytedance.crash.upload.h     // Catch:{ all -> 0x010e }
            r6 = 207(0xcf, float:2.9E-43)
            r5.<init>((int) r6, (java.lang.Throwable) r4)     // Catch:{ all -> 0x010e }
            if (r8 == 0) goto L_0x010a
            r8.disconnect()     // Catch:{ Exception -> 0x010a }
        L_0x010a:
            com.bytedance.crash.i.f.a((java.io.Closeable) r3)
            return r5
        L_0x010e:
            r4 = move-exception
            r2 = r8
            r8 = r3
            r3 = r2
        L_0x0112:
            if (r3 == 0) goto L_0x0117
            r3.disconnect()     // Catch:{ Exception -> 0x0117 }
        L_0x0117:
            com.bytedance.crash.i.f.a((java.io.Closeable) r8)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.b.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.crash.upload.h");
    }
}
