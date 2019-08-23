package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.loc.dh;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class di {

    /* renamed from: a  reason: collision with root package name */
    static String f25809a;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f25809a = sb.toString();
    }

    public static dh a() throws cx {
        return new dh.a("collection", "1.0", "AMap_collection_1.0").a(new String[]{"com.amap.api.collection"}).a();
    }

    public static String a(long j) {
        try {
            return new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static String a(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x002f
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ Throwable -> 0x0027 }
            java.lang.Class<android.content.pm.ApplicationInfo> r1 = android.content.pm.ApplicationInfo.class
            java.lang.String r1 = r1.getName()     // Catch:{ Throwable -> 0x0027 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0027 }
            java.lang.String r2 = "primaryCpuAbi"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Throwable -> 0x0027 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Throwable -> 0x0027 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Throwable -> 0x0027 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0027 }
            goto L_0x0030
        L_0x0027:
            r3 = move-exception
            java.lang.String r1 = "ut"
            java.lang.String r2 = "gct"
            com.loc.f.a((java.lang.Throwable) r3, (java.lang.String) r1, (java.lang.String) r2)
        L_0x002f:
            r3 = r0
        L_0x0030:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0038
            java.lang.String r3 = android.os.Build.CPU_ABI
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.di.a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0041 A[SYNTHETIC, Splitter:B:32:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC, Splitter:B:44:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0061 A[SYNTHETIC, Splitter:B:49:0x0061] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0039, all -> 0x0035 }
            r1.<init>()     // Catch:{ Throwable -> 0x0039, all -> 0x0035 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x002d }
        L_0x000e:
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x002d }
            if (r3 == 0) goto L_0x0018
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.io.PrintWriter) r2)     // Catch:{ Throwable -> 0x002d }
            goto L_0x000e
        L_0x0018:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x002d }
            r1.close()     // Catch:{ Throwable -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0024:
            r2.close()     // Catch:{ Throwable -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x002c:
            return r3
        L_0x002d:
            r3 = move-exception
            goto L_0x003c
        L_0x002f:
            r3 = move-exception
            r2 = r0
            goto L_0x0055
        L_0x0032:
            r3 = move-exception
            r2 = r0
            goto L_0x003c
        L_0x0035:
            r3 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x0055
        L_0x0039:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x003c:
            com.google.a.a.a.a.a.a.b(r3)     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Throwable -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r3 = move-exception
            com.google.a.a.a.a.a.a.b(r3)
        L_0x0049:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ Throwable -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r3 = move-exception
            com.google.a.a.a.a.a.a.b(r3)
        L_0x0053:
            return r0
        L_0x0054:
            r3 = move-exception
        L_0x0055:
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch:{ Throwable -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x005f:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ Throwable -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0069:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.di.a(java.lang.Throwable):java.lang.String");
    }

    public static String a(Map<String, String> map) {
        Object value;
        if (map.size() == 0) {
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
                    value = next.getValue();
                } else {
                    stringBuffer.append("&");
                    stringBuffer.append((String) next.getKey());
                    stringBuffer.append("=");
                    value = next.getValue();
                }
                stringBuffer.append((String) value);
            }
        } catch (Throwable th) {
            f.a(th, "ut", "abP");
        }
        return stringBuffer.toString();
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

    public static Method a(Class cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(c(str), clsArr);
        } catch (Throwable unused) {
            return null;
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
            f.a((Throwable) e2, "ut", "wFie");
        }
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
            } catch (IOException e2) {
                a.b(e2);
            }
        } else {
            int length = str.length();
            if (length > 255) {
                length = 255;
            }
            a(byteArrayOutputStream, (byte) length, a(str));
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23 && context.getApplicationInfo().targetSdkVersion >= 23) {
            try {
                if (((Integer) context.getClass().getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str})).intValue() != 0) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
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

    public static String b(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String c2 = dd.c(a(str));
        try {
            str2 = ((char) ((c2.length() % 26) + 65)) + c2;
        } catch (Throwable th) {
            a.b(th);
            str2 = "";
        }
        return str2;
    }

    public static String b(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
        }
        return e(sb.toString());
    }

    public static boolean b(Context context) {
        return l.a(context);
    }

    public static byte[] b() {
        try {
            String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            String[] split2 = new StringBuffer(new String(dd.b(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            f.a(th, "ut", "gIV");
            return new byte[16];
        }
    }

    public static byte[] b(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            f.a(th, "ut", "gZp");
            return new byte[0];
        }
    }

    public static String c(String str) {
        return str.length() < 2 ? "" : dd.a(str.substring(1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC, Splitter:B:28:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005c A[SYNTHETIC, Splitter:B:35:0x005c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.security.PublicKey c() throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException {
        /*
            java.lang.String r0 = "MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x0049, all -> 0x0046 }
            byte[] r0 = com.loc.dd.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0049, all -> 0x0046 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0049, all -> 0x0046 }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ Throwable -> 0x0044 }
            java.lang.String r3 = "RSA"
            java.security.KeyFactory r3 = java.security.KeyFactory.getInstance(r3)     // Catch:{ Throwable -> 0x0044 }
            java.security.cert.Certificate r0 = r0.generateCertificate(r2)     // Catch:{ Throwable -> 0x0044 }
            if (r0 == 0) goto L_0x003b
            if (r3 != 0) goto L_0x0021
            goto L_0x003b
        L_0x0021:
            java.security.spec.X509EncodedKeySpec r4 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Throwable -> 0x0044 }
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch:{ Throwable -> 0x0044 }
            byte[] r0 = r0.getEncoded()     // Catch:{ Throwable -> 0x0044 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0044 }
            java.security.PublicKey r0 = r3.generatePublic(r4)     // Catch:{ Throwable -> 0x0044 }
            r2.close()     // Catch:{ Throwable -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r1 = move-exception
            com.google.a.a.a.a.a.a.b(r1)
        L_0x003a:
            return r0
        L_0x003b:
            r2.close()     // Catch:{ Throwable -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0043:
            return r1
        L_0x0044:
            r0 = move-exception
            goto L_0x004b
        L_0x0046:
            r0 = move-exception
            r2 = r1
            goto L_0x005a
        L_0x0049:
            r0 = move-exception
            r2 = r1
        L_0x004b:
            com.google.a.a.a.a.a.a.b(r0)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ Throwable -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0058:
            return r1
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r1 = move-exception
            com.google.a.a.a.a.a.a.b(r1)
        L_0x0064:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.di.c():java.security.PublicKey");
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
            java.lang.String r2 = "ut"
            java.lang.String r3 = "zp1"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0035:
            r1.close()     // Catch:{ Throwable -> 0x0039 }
            goto L_0x0075
        L_0x0039:
            r0 = move-exception
            java.lang.String r1 = "ut"
            java.lang.String r2 = "zp2"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
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
            java.lang.String r3 = "ut"
            java.lang.String r4 = "zp"
            com.loc.f.a((java.lang.Throwable) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ Throwable -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r5 = move-exception
            java.lang.String r2 = "ut"
            java.lang.String r3 = "zp1"
            com.loc.f.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0066:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ Throwable -> 0x006c }
            goto L_0x0074
        L_0x006c:
            r5 = move-exception
            java.lang.String r1 = "ut"
            java.lang.String r2 = "zp2"
            com.loc.f.a((java.lang.Throwable) r5, (java.lang.String) r1, (java.lang.String) r2)
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
            java.lang.String r2 = "ut"
            java.lang.String r3 = "zp1"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0085:
            if (r1 == 0) goto L_0x0093
            r1.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x0093
        L_0x008b:
            r0 = move-exception
            java.lang.String r1 = "ut"
            java.lang.String r2 = "zp2"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x0093:
            throw r5
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.di.c(byte[]):byte[]");
    }

    static void d(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String substring = str.substring(0, 78);
            StringBuilder sb = new StringBuilder("|");
            sb.append(substring);
            sb.append("|");
            str = str.substring(78);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("|");
        sb2.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb2.append(" ");
        }
        sb2.append("|");
    }

    public static byte[] d(byte[] bArr) {
        try {
            return h(bArr);
        } catch (Throwable th) {
            a.b(th);
            return new byte[0];
        }
    }

    private static String e(String str) {
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
            f.a(th, "ut", "sPa");
        }
    }

    static String e(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            f.a(th, "ut", "h2s");
            return null;
        }
    }

    static String f(byte[] bArr) {
        try {
            return g(bArr);
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY.concat(String.valueOf(hexString));
            }
            sb.append(hexString);
        }
        return sb.toString();
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
    private static byte[] h(byte[] r3) throws java.io.IOException, java.lang.Throwable {
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
        throw new UnsupportedOperationException("Method not decompiled: com.loc.di.h(byte[]):byte[]");
    }
}
