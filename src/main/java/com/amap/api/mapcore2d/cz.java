package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore2d.cy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class cz {

    /* renamed from: a  reason: collision with root package name */
    static String f5915a;

    private static void f(String str) {
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
            } catch (IOException unused) {
            }
        } else {
            int length = str.length();
            if (length > 255) {
                length = 255;
            }
            a(byteArrayOutputStream, (byte) length, a(str));
        }
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b2});
            byte b3 = b2 & 255;
            if (b3 >= 255 || b3 <= 0) {
                if (b3 == 255) {
                    byteArrayOutputStream.write(bArr, 0, 255);
                }
                return;
            }
            byteArrayOutputStream.write(bArr);
        } catch (IOException e2) {
            dd.a((Throwable) e2, "Utils", "writeField");
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f5915a = sb.toString();
    }

    public static cy a() throws co {
        return new cy.a("collection", "1.0", "AMap_collection_1.0").a(new String[]{"com.amap.api.collection"}).a();
    }

    public static byte[] b() {
        try {
            String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            String[] split2 = new StringBuffer(new String(cu.b(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            dd.a(th, "Utils", "getIV");
            return new byte[16];
        }
    }

    static String e(byte[] bArr) {
        try {
            return f(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    static String d(byte[] bArr) {
        try {
            return f(bArr);
        } catch (Throwable th) {
            dd.a(th, "Utils", "HexString");
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            dd.a(th, "Utils", "gZip");
            return new byte[0];
        }
    }

    public static String c(String str) {
        if (str.length() < 2) {
            return "";
        }
        return cu.a(str.substring(1));
    }

    public static String a(long j) {
        try {
            return new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String b2 = cu.b(a(str));
        try {
            str2 = ((char) ((b2.length() % 26) + 65)) + b2;
        } catch (Throwable unused) {
            str2 = "";
        }
        return str2;
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[SYNTHETIC, Splitter:B:24:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003a A[SYNTHETIC, Splitter:B:28:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0042 A[SYNTHETIC, Splitter:B:36:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0049 A[SYNTHETIC, Splitter:B:40:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x003e, all -> 0x002e }
            r1.<init>()     // Catch:{ Throwable -> 0x003e, all -> 0x002e }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x002c, all -> 0x0029 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x002c, all -> 0x0029 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x0040, all -> 0x0027 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0040, all -> 0x0027 }
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x0040, all -> 0x0027 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0040, all -> 0x0027 }
            goto L_0x0012
        L_0x001c:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0040, all -> 0x0027 }
            r1.close()     // Catch:{ Throwable -> 0x0023 }
        L_0x0023:
            r2.close()     // Catch:{ Throwable -> 0x0026 }
        L_0x0026:
            return r3
        L_0x0027:
            r3 = move-exception
            goto L_0x0031
        L_0x0029:
            r3 = move-exception
            r2 = r0
            goto L_0x0031
        L_0x002c:
            r2 = r0
            goto L_0x0040
        L_0x002e:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0031:
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ Throwable -> 0x0037 }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            throw r3
        L_0x003e:
            r1 = r0
            r2 = r1
        L_0x0040:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Throwable -> 0x0046 }
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cz.a(java.lang.Throwable):java.lang.String");
    }

    public static String d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String[] split = str.split("&");
            Arrays.sort(split);
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : split) {
                stringBuffer.append(append);
                stringBuffer.append("&");
            }
            String stringBuffer2 = stringBuffer.toString();
            if (stringBuffer2.length() > 1) {
                return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
            }
            return str;
        } catch (Throwable th) {
            dd.a(th, "Utils", "sortParams");
        }
    }

    static void e(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String substring = str.substring(0, 78);
            f("|" + substring + "|");
            str = str.substring(78);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        f(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0038 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0040 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] g(byte[] r3) throws java.io.IOException, java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0030, all -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x0030, all -> 0x002d }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x0029, all -> 0x0027 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0029, all -> 0x0027 }
            r2.write(r3)     // Catch:{ Throwable -> 0x0025, all -> 0x0023 }
            r2.finish()     // Catch:{ Throwable -> 0x0025, all -> 0x0023 }
            byte[] r3 = r1.toByteArray()     // Catch:{ Throwable -> 0x0025, all -> 0x0023 }
            r2.close()     // Catch:{ Throwable -> 0x0021 }
            r1.close()     // Catch:{ Throwable -> 0x001f }
            return r3
        L_0x001f:
            r3 = move-exception
            throw r3
        L_0x0021:
            r3 = move-exception
            throw r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0035
        L_0x0025:
            r3 = move-exception
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            goto L_0x0036
        L_0x0029:
            r3 = move-exception
            r2 = r0
        L_0x002b:
            r0 = r1
            goto L_0x0032
        L_0x002d:
            r3 = move-exception
            r1 = r0
            goto L_0x0036
        L_0x0030:
            r3 = move-exception
            r2 = r0
        L_0x0032:
            throw r3     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r3 = move-exception
            r1 = r0
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ Throwable -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r3 = move-exception
            throw r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Throwable -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r3 = move-exception
            throw r3
        L_0x0046:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cz.g(byte[]):byte[]");
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        try {
            for (Map.Entry next : map.entrySet()) {
                if (z) {
                    z = false;
                    stringBuffer.append((String) next.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append((String) next.getValue());
                } else {
                    stringBuffer.append("&");
                    stringBuffer.append((String) next.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append((String) next.getValue());
                }
            }
        } catch (Throwable th) {
            dd.a(th, "Utils", "assembleParams");
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a A[SYNTHETIC, Splitter:B:31:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC, Splitter:B:36:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079 A[SYNTHETIC, Splitter:B:44:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087 A[SYNTHETIC, Splitter:B:49:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(byte[] r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0094
            int r1 = r5.length
            if (r1 != 0) goto L_0x0008
            goto L_0x0094
        L_0x0008:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x004e, all -> 0x004a }
            r1.<init>()     // Catch:{ Throwable -> 0x004e, all -> 0x004a }
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ Throwable -> 0x0047, all -> 0x0044 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0047, all -> 0x0044 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r4 = "log"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0042 }
            r2.putNextEntry(r3)     // Catch:{ Throwable -> 0x0042 }
            r2.write(r5)     // Catch:{ Throwable -> 0x0042 }
            r2.closeEntry()     // Catch:{ Throwable -> 0x0042 }
            r2.finish()     // Catch:{ Throwable -> 0x0042 }
            byte[] r5 = r1.toByteArray()     // Catch:{ Throwable -> 0x0042 }
            r2.close()     // Catch:{ Throwable -> 0x002d }
            goto L_0x0035
        L_0x002d:
            r0 = move-exception
            java.lang.String r2 = "Utils"
            java.lang.String r3 = "zip1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0035:
            r1.close()     // Catch:{ Throwable -> 0x0039 }
            goto L_0x0075
        L_0x0039:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "zip2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
            goto L_0x0075
        L_0x0042:
            r5 = move-exception
            goto L_0x0051
        L_0x0044:
            r5 = move-exception
            r2 = r0
            goto L_0x0077
        L_0x0047:
            r5 = move-exception
            r2 = r0
            goto L_0x0051
        L_0x004a:
            r5 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x0077
        L_0x004e:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x0051:
            java.lang.String r3 = "Utils"
            java.lang.String r4 = "zip"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ Throwable -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r5 = move-exception
            java.lang.String r2 = "Utils"
            java.lang.String r3 = "zip1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0066:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ Throwable -> 0x006c }
            goto L_0x0074
        L_0x006c:
            r5 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "zip2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0074:
            r5 = r0
        L_0x0075:
            return r5
        L_0x0076:
            r5 = move-exception
        L_0x0077:
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ Throwable -> 0x007d }
            goto L_0x0085
        L_0x007d:
            r0 = move-exception
            java.lang.String r2 = "Utils"
            java.lang.String r3 = "zip1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0085:
            if (r1 == 0) goto L_0x0093
            r1.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x0093
        L_0x008b:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "zip2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0093:
            throw r5
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cz.c(byte[]):byte[]");
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[SYNTHETIC, Splitter:B:22:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0047 A[SYNTHETIC, Splitter:B:30:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.security.PublicKey a(android.content.Context r4) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException {
        /*
            java.lang.String r4 = "MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x0044, all -> 0x003c }
            byte[] r4 = com.amap.api.mapcore2d.cu.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x0044, all -> 0x003c }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x0044, all -> 0x003c }
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            java.lang.String r2 = "RSA"
            java.security.KeyFactory r2 = java.security.KeyFactory.getInstance(r2)     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            java.security.cert.Certificate r4 = r4.generateCertificate(r1)     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            if (r4 == 0) goto L_0x0036
            if (r2 != 0) goto L_0x0021
            goto L_0x0036
        L_0x0021:
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            java.security.PublicKey r4 = r4.getPublicKey()     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            byte[] r4 = r4.getEncoded()     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            java.security.PublicKey r4 = r2.generatePublic(r3)     // Catch:{ Throwable -> 0x0045, all -> 0x003a }
            r1.close()     // Catch:{ Throwable -> 0x0035 }
        L_0x0035:
            return r4
        L_0x0036:
            r1.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r0
        L_0x003a:
            r4 = move-exception
            goto L_0x003e
        L_0x003c:
            r4 = move-exception
            r1 = r0
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ Throwable -> 0x0043 }
        L_0x0043:
            throw r4
        L_0x0044:
            r1 = r0
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ Throwable -> 0x004a }
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cz.a(android.content.Context):java.security.PublicKey");
    }

    public static boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return false;
        }
        return true;
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        String str3;
        String str4 = "";
        String b2 = cv.b(cp.e(context));
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String a2 = cp.a(context);
        String str8 = "";
        try {
            if (jSONObject.has("info")) {
                str4 = jSONObject.getString("info");
                str7 = "请在高德开放平台官网中搜索\"" + str4 + "\"相关内容进行解决";
            }
            if ("INVALID_USER_SCODE".equals(str4)) {
                if (jSONObject.has("sec_code")) {
                    str5 = jSONObject.getString("sec_code");
                }
                if (jSONObject.has("sec_code_debug")) {
                    str6 = jSONObject.getString("sec_code_debug");
                }
                if (b2.equals(str5) || b2.equals(str6)) {
                    str3 = "请在高德开放平台官网中搜索\"请求内容过长导致业务调用失败\"相关内容进行解决";
                    f(f5915a);
                    f("                                   鉴权错误信息                                  ");
                    f(f5915a);
                    e("SHA1Package:" + r1);
                    e("key:" + a2);
                    e("csid:" + str);
                    e("gsid:" + str2);
                    e("json:" + jSONObject.toString());
                    f("                                                                               ");
                    f(str3);
                    f(f5915a);
                }
                str3 = str7;
                f(f5915a);
                f("                                   鉴权错误信息                                  ");
                f(f5915a);
                e("SHA1Package:" + r1);
                e("key:" + a2);
                e("csid:" + str);
                e("gsid:" + str2);
                e("json:" + jSONObject.toString());
                f("                                                                               ");
                f(str3);
                f(f5915a);
            }
            if ("INVALID_USER_KEY".equals(str4)) {
                if (jSONObject.has("key")) {
                    str8 = jSONObject.getString("key");
                }
                if (str8.length() > 0 && !a2.equals(str8)) {
                    str3 = "请在高德开放平台官网上发起技术咨询工单—>账号与Key问题，咨询INVALID_USER_KEY如何解决";
                    f(f5915a);
                    f("                                   鉴权错误信息                                  ");
                    f(f5915a);
                    e("SHA1Package:" + r1);
                    e("key:" + a2);
                    e("csid:" + str);
                    e("gsid:" + str2);
                    e("json:" + jSONObject.toString());
                    f("                                                                               ");
                    f(str3);
                    f(f5915a);
                }
            }
            str3 = str7;
            f(f5915a);
            f("                                   鉴权错误信息                                  ");
            f(f5915a);
            e("SHA1Package:" + r1);
            e("key:" + a2);
            e("csid:" + str);
            e("gsid:" + str2);
            e("json:" + jSONObject.toString());
            f("                                                                               ");
            f(str3);
            f(f5915a);
        } catch (Throwable unused) {
        }
    }
}