package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class z {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f79554a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f79555b;

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            a.a(th, new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th2) {
            x.a(th2);
            return "fail";
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    private static byte[] a(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        x.c("rqdp{  enD:} %d %d", Integer.valueOf(bArr.length), Integer.valueOf(i));
        try {
            ag a2 = a.a(i);
            if (a2 == null) {
                return null;
            }
            a2.a(str);
            return a2.b(bArr);
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    private static byte[] b(byte[] bArr, int i, String str) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        try {
            ag a2 = a.a(i);
            if (a2 == null) {
                return null;
            }
            a2.a(str);
            return a2.a(bArr);
        } catch (Throwable th) {
            x.a(th);
            x.d("encrytype %d %s", Integer.valueOf(i), str);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ Throwable -> 0x0090 }, LOOP:0: B:20:0x0055->B:22:0x005b, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[Catch:{ Throwable -> 0x0090 }, LOOP:1: B:23:0x005f->B:25:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[SYNTHETIC, Splitter:B:28:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c A[SYNTHETIC, Splitter:B:46:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a6 A[SYNTHETIC, Splitter:B:51:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9 A[SYNTHETIC, Splitter:B:59:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3 A[SYNTHETIC, Splitter:B:64:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0069 A[EDGE_INSN: B:71:0x0069->B:26:0x0069 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.io.File r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "rqdp{  ZF start}"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.c(r0, r2)
            r0 = 0
            if (r5 == 0) goto L_0x002b
            boolean r2 = r5.exists()     // Catch:{ Throwable -> 0x0026, all -> 0x0021 }
            if (r2 == 0) goto L_0x002b
            boolean r2 = r5.canRead()     // Catch:{ Throwable -> 0x0026, all -> 0x0021 }
            if (r2 == 0) goto L_0x002b
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0026, all -> 0x0021 }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x0026, all -> 0x0021 }
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            goto L_0x002d
        L_0x0021:
            r5 = move-exception
            r7 = r0
            r3 = r7
            goto L_0x00b7
        L_0x0026:
            r5 = move-exception
            r7 = r0
            r3 = r7
            goto L_0x0097
        L_0x002b:
            r5 = r7
            r7 = r0
        L_0x002d:
            java.lang.String r2 = "UTF-8"
            byte[] r6 = r6.getBytes(r2)     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            r2.<init>(r6)     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            r6.<init>()     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            java.util.zip.ZipOutputStream r3 = new java.util.zip.ZipOutputStream     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            r4 = 8
            r3.setMethod(r4)     // Catch:{ Throwable -> 0x0090 }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ Throwable -> 0x0090 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0090 }
            r3.putNextEntry(r4)     // Catch:{ Throwable -> 0x0090 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x0090 }
            if (r7 == 0) goto L_0x005f
        L_0x0055:
            int r4 = r7.read(r5)     // Catch:{ Throwable -> 0x0090 }
            if (r4 <= 0) goto L_0x005f
            r3.write(r5, r1, r4)     // Catch:{ Throwable -> 0x0090 }
            goto L_0x0055
        L_0x005f:
            int r4 = r2.read(r5)     // Catch:{ Throwable -> 0x0090 }
            if (r4 <= 0) goto L_0x0069
            r3.write(r5, r1, r4)     // Catch:{ Throwable -> 0x0090 }
            goto L_0x005f
        L_0x0069:
            r3.closeEntry()     // Catch:{ Throwable -> 0x0090 }
            r3.flush()     // Catch:{ Throwable -> 0x0090 }
            r3.finish()     // Catch:{ Throwable -> 0x0090 }
            byte[] r5 = r6.toByteArray()     // Catch:{ Throwable -> 0x0090 }
            if (r7 == 0) goto L_0x0080
            r7.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x0080:
            r3.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x0088:
            java.lang.String r6 = "rqdp{  ZF end}"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.c(r6, r7)
            return r5
        L_0x0090:
            r5 = move-exception
            goto L_0x0097
        L_0x0092:
            r5 = move-exception
            r3 = r0
            goto L_0x00b7
        L_0x0095:
            r5 = move-exception
            r3 = r0
        L_0x0097:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x00b6 }
            if (r7 == 0) goto L_0x00a4
            r7.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00a4:
            if (r3 == 0) goto L_0x00ae
            r3.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00ae:
            java.lang.String r5 = "rqdp{  ZF end}"
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.c(r5, r6)
            return r0
        L_0x00b6:
            r5 = move-exception
        L_0x00b7:
            if (r7 == 0) goto L_0x00c1
            r7.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00c1:
            if (r3 == 0) goto L_0x00cb
            r3.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00cb:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = "rqdp{  ZF end}"
            com.tencent.bugly.proguard.x.c(r7, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(java.io.File, java.lang.String, java.lang.String):byte[]");
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        x.c("[Util] Zip %d bytes data with type %s", objArr);
        try {
            ab a2 = aa.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.a(bArr);
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        if (bArr == null || i == -1) {
            return bArr;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(bArr.length);
        objArr[1] = i == 2 ? "Gzip" : "zip";
        x.c("[Util] Unzip %d bytes data with type %s", objArr);
        try {
            ab a2 = aa.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.b(bArr);
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return a(a(bArr, 2), 1, str);
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2, String str) {
        try {
            return b(b(bArr, 1, str), 2);
        } catch (Exception e2) {
            x.a(e2);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[SYNTHETIC, Splitter:B:60:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8 A[SYNTHETIC, Splitter:B:65:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dc A[SYNTHETIC, Splitter:B:74:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6 A[SYNTHETIC, Splitter:B:79:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r5, java.io.File r6, int r7) {
        /*
            java.lang.String r7 = "rqdp{  ZF start}"
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.x.c(r7, r1)
            if (r5 == 0) goto L_0x00ff
            if (r6 == 0) goto L_0x00ff
            boolean r7 = r5.equals(r6)
            if (r7 == 0) goto L_0x0014
            goto L_0x00ff
        L_0x0014:
            boolean r7 = r5.exists()
            if (r7 == 0) goto L_0x00f7
            boolean r7 = r5.canRead()
            if (r7 != 0) goto L_0x0022
            goto L_0x00f7
        L_0x0022:
            java.io.File r7 = r6.getParentFile()     // Catch:{ Throwable -> 0x0043 }
            if (r7 == 0) goto L_0x0039
            java.io.File r7 = r6.getParentFile()     // Catch:{ Throwable -> 0x0043 }
            boolean r7 = r7.exists()     // Catch:{ Throwable -> 0x0043 }
            if (r7 != 0) goto L_0x0039
            java.io.File r7 = r6.getParentFile()     // Catch:{ Throwable -> 0x0043 }
            r7.mkdirs()     // Catch:{ Throwable -> 0x0043 }
        L_0x0039:
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0043 }
            if (r7 != 0) goto L_0x0047
            r6.createNewFile()     // Catch:{ Throwable -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r7 = move-exception
            com.tencent.bugly.proguard.x.a(r7)
        L_0x0047:
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x00f6
            boolean r7 = r6.canRead()
            if (r7 != 0) goto L_0x0055
            goto L_0x00f6
        L_0x0055:
            r7 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00b7, all -> 0x00b3 }
            r1.<init>(r5)     // Catch:{ Throwable -> 0x00b7, all -> 0x00b3 }
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            r4.<init>(r6)     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00af, all -> 0x00ac }
            r6 = 8
            r2.setMethod(r6)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            r2.putNextEntry(r6)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            r5 = 5000(0x1388, float:7.006E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
        L_0x007f:
            int r6 = r1.read(r5)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            if (r6 <= 0) goto L_0x0089
            r2.write(r5, r0, r6)     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            goto L_0x007f
        L_0x0089:
            r2.flush()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            r2.closeEntry()     // Catch:{ Throwable -> 0x00aa, all -> 0x00a8 }
            r1.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0097:
            r2.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x009f:
            java.lang.String r5 = "rqdp{  ZF end}"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.x.c(r5, r6)
            r5 = 1
            return r5
        L_0x00a8:
            r5 = move-exception
            goto L_0x00da
        L_0x00aa:
            r5 = move-exception
            goto L_0x00b1
        L_0x00ac:
            r5 = move-exception
            r2 = r7
            goto L_0x00da
        L_0x00af:
            r5 = move-exception
            r2 = r7
        L_0x00b1:
            r7 = r1
            goto L_0x00b9
        L_0x00b3:
            r5 = move-exception
            r1 = r7
            r2 = r1
            goto L_0x00da
        L_0x00b7:
            r5 = move-exception
            r2 = r7
        L_0x00b9:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x00d8 }
            if (r7 == 0) goto L_0x00c6
            r7.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c6
        L_0x00c2:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00c6:
            if (r2 == 0) goto L_0x00d0
            r2.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00d0
        L_0x00cc:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x00d0:
            java.lang.String r5 = "rqdp{  ZF end}"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.x.c(r5, r6)
            return r0
        L_0x00d8:
            r5 = move-exception
            r1 = r7
        L_0x00da:
            if (r1 == 0) goto L_0x00e4
            r1.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00e4:
            if (r2 == 0) goto L_0x00ee
            r2.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x00ee:
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = "rqdp{  ZF end}"
            com.tencent.bugly.proguard.x.c(r7, r6)
            throw r5
        L_0x00f6:
            return r0
        L_0x00f7:
            java.lang.String r5 = "rqdp{  !sFile.exists() || !sFile.canRead(),pls check ,return!}"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.x.d(r5, r6)
            return r0
        L_0x00ff:
            java.lang.String r5 = "rqdp{  err ZF 1R!}"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.x.d(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(java.io.File, java.io.File, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b A[SYNTHETIC, Splitter:B:36:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085 A[SYNTHETIC, Splitter:B:41:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092 A[SYNTHETIC, Splitter:B:49:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009c A[SYNTHETIC, Splitter:B:54:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<java.lang.String> a(android.content.Context r4, java.lang.String[] r5) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.bugly.crashreport.common.info.a r4 = com.tencent.bugly.crashreport.common.info.a.a((android.content.Context) r4)
            boolean r4 = r4.J()
            if (r4 == 0) goto L_0x001f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = new java.lang.String
            java.lang.String r0 = "unknown(low memory)"
            r5.<init>(r0)
            r4.add(r5)
            return r4
        L_0x001f:
            r4 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.lang.Process r5 = r1.exec(r5)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.io.InputStream r3 = r5.getInputStream()     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
        L_0x0036:
            java.lang.String r2 = r1.readLine()     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            if (r2 == 0) goto L_0x0040
            r0.add(r2)     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            goto L_0x0036
        L_0x0040:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            java.io.InputStream r5 = r5.getErrorStream()     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            r3.<init>(r5)     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x006d, all -> 0x006b }
        L_0x004e:
            java.lang.String r5 = r2.readLine()     // Catch:{ Throwable -> 0x0069 }
            if (r5 == 0) goto L_0x0058
            r0.add(r5)     // Catch:{ Throwable -> 0x0069 }
            goto L_0x004e
        L_0x0058:
            r1.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0060:
            r2.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x0068:
            return r0
        L_0x0069:
            r5 = move-exception
            goto L_0x0076
        L_0x006b:
            r5 = move-exception
            goto L_0x0090
        L_0x006d:
            r5 = move-exception
            r2 = r4
            goto L_0x0076
        L_0x0070:
            r5 = move-exception
            r1 = r4
            goto L_0x0090
        L_0x0073:
            r5 = move-exception
            r1 = r4
            r2 = r1
        L_0x0076:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0083:
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x008d:
            return r4
        L_0x008e:
            r5 = move-exception
            r4 = r2
        L_0x0090:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x009a:
            if (r4 == 0) goto L_0x00a4
            r4.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r4 = move-exception
            com.google.a.a.a.a.a.a.b(r4)
        L_0x00a4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(android.content.Context, java.lang.String[]):java.util.ArrayList");
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() <= 0;
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, obj);
        } catch (Exception unused) {
        }
    }

    public static void a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(next.getKey());
            arrayList2.add(next.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pluginNum", arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            bundle.putString("pluginKey".concat(String.valueOf(i)), (String) arrayList.get(i));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bundle.putString("pluginVal" + i2 + "plugInId", ((PlugInBean) arrayList2.get(i2)).f79271a);
            bundle.putString("pluginVal" + i2 + "plugInUUID", ((PlugInBean) arrayList2.get(i2)).f79273c);
            bundle.putString("pluginVal" + i2 + "plugInVersion", ((PlugInBean) arrayList2.get(i2)).f79272b);
        }
        parcel.writeBundle(bundle);
    }

    public static Map<String, PlugInBean> a(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int intValue = ((Integer) readBundle.get("pluginNum")).intValue();
        for (int i = 0; i < intValue; i++) {
            arrayList.add(readBundle.getString("pluginKey".concat(String.valueOf(i))));
        }
        for (int i2 = 0; i2 < intValue; i2++) {
            String string = readBundle.getString("pluginVal" + i2 + "plugInId");
            String string2 = readBundle.getString("pluginVal" + i2 + "plugInUUID");
            arrayList2.add(new PlugInBean(string, readBundle.getString("pluginVal" + i2 + "plugInVersion"), string2));
        }
        if (arrayList.size() == arrayList2.size()) {
            hashMap = new HashMap(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hashMap.put(arrayList.get(i3), PlugInBean.class.cast(arrayList2.get(i3)));
            }
        } else {
            x.e("map plugin parcel error!", new Object[0]);
        }
        return hashMap;
    }

    public static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Map<String, String> a(int i, boolean z) {
        HashMap hashMap = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : allStackTraces.entrySet()) {
            int i2 = 0;
            sb.setLength(0);
            if (!(next.getValue() == null || ((StackTraceElement[]) next.getValue()).length == 0)) {
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                int length = stackTraceElementArr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                    if (i > 0 && sb.length() >= i) {
                        sb.append("\n[Stack over limit size :" + i + " , has been cutted !]");
                        break;
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                    i2++;
                }
                hashMap.put(((Thread) next.getKey()).getName() + "(" + ((Thread) next.getKey()).getId() + ")", sb.toString());
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[SYNTHETIC, Splitter:B:20:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[SYNTHETIC, Splitter:B:27:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] a(int r6) {
        /*
            java.lang.Class<com.tencent.bugly.proguard.z> r6 = com.tencent.bugly.proguard.z.class
            monitor-enter(r6)
            r0 = 16
            r1 = 0
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.lang.String r5 = "/dev/urandom"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            r2.readFully(r0)     // Catch:{ Exception -> 0x0021 }
            r2.close()     // Catch:{ Exception -> 0x005b }
            monitor-exit(r6)
            return r0
        L_0x0021:
            r0 = move-exception
            goto L_0x0028
        L_0x0023:
            r0 = move-exception
            r2 = r1
            goto L_0x0053
        L_0x0026:
            r0 = move-exception
            r2 = r1
        L_0x0028:
            java.lang.String r3 = "Failed to read from /dev/urandom : %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0052 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x0052 }
            com.tencent.bugly.proguard.x.e(r3, r4)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ Exception -> 0x005b }
        L_0x0038:
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ Exception -> 0x005b }
            r2 = 128(0x80, float:1.794E-43)
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ Exception -> 0x005b }
            r3.<init>()     // Catch:{ Exception -> 0x005b }
            r0.init(r2, r3)     // Catch:{ Exception -> 0x005b }
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch:{ Exception -> 0x005b }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x005b }
            monitor-exit(r6)
            return r0
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            goto L_0x0063
        L_0x005b:
            r0 = move-exception
            goto L_0x005e
        L_0x005d:
            throw r0     // Catch:{ Exception -> 0x005b }
        L_0x005e:
            com.tencent.bugly.proguard.x.b(r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r6)
            return r1
        L_0x0063:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(int):byte[]");
    }

    @TargetApi(19)
    public static byte[] a(int i, byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            if (Build.VERSION.SDK_INT >= 21) {
                if (!f79555b) {
                    instance.init(i, secretKeySpec, new GCMParameterSpec(instance.getBlockSize() << 3, bArr2));
                    return instance.doFinal(bArr);
                }
            }
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e2) {
            f79555b = true;
            throw e2;
        } catch (Exception e3) {
            x.b(e3);
            return null;
        }
    }

    public static byte[] b(int i, byte[] bArr, byte[] bArr2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePublic);
            return instance.doFinal(bArr);
        } catch (Exception e2) {
            x.b(e2);
            return null;
        }
    }

    public static boolean a(Context context, String str, long j) {
        x.c("[Util] try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < j) {
                    return false;
                }
                x.c("[Util] lock file(%s) is expired, unlock it", str);
                b(context, str);
            }
            if (file.createNewFile()) {
                x.c("[Util] successfully locked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            x.c("[Util] Failed to locked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        x.c("[Util] try to unlock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            x.c("[Util] successfully unlocked file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[SYNTHETIC, Splitter:B:33:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0063
            boolean r1 = r5.exists()
            if (r1 == 0) goto L_0x0063
            boolean r1 = r5.canRead()
            if (r1 != 0) goto L_0x0010
            goto L_0x0063
        L_0x0010:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r1.<init>()     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            java.lang.String r5 = "utf-8"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0046, all -> 0x0044 }
        L_0x0026:
            java.lang.String r5 = r2.readLine()     // Catch:{ Throwable -> 0x0042 }
            if (r5 == 0) goto L_0x0035
            r1.append(r5)     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch:{ Throwable -> 0x0042 }
            goto L_0x0026
        L_0x0035:
            java.lang.String r5 = r1.toString()     // Catch:{ Throwable -> 0x0042 }
            r2.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0041:
            return r5
        L_0x0042:
            r5 = move-exception
            goto L_0x0048
        L_0x0044:
            r5 = move-exception
            goto L_0x0058
        L_0x0046:
            r5 = move-exception
            r2 = r0
        L_0x0048:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r5 = move-exception
            com.tencent.bugly.proguard.x.a(r5)
        L_0x0055:
            return r0
        L_0x0056:
            r5 = move-exception
            r0 = r2
        L_0x0058:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ Exception -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
        L_0x0062:
            throw r5
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(java.io.File):java.lang.String");
    }

    public static Thread a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th) {
            x.e("[Util] Failed to start a thread to execute task with message: %s", th.getMessage());
            return null;
        }
    }

    public static boolean a(Runnable runnable) {
        if (runnable != null) {
            w a2 = w.a();
            if (a2 != null) {
                return a2.a(runnable);
            }
            String[] split = runnable.getClass().getName().split("\\.");
            if (a(runnable, split[split.length - 1]) != null) {
                return true;
            }
        }
        return false;
    }

    public static long b() {
        try {
            return (((System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) * 86400000) - ((long) TimeZone.getDefault().getRawOffset());
        } catch (Throwable th) {
            x.a(th);
            return -1;
        }
    }

    public static String a() {
        return a(System.currentTimeMillis());
    }

    public static Context a(Context context) {
        if (context == null) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public static void b(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e2) {
            a.b(e2);
        }
    }

    public static long c(byte[] bArr) {
        if (bArr == null) {
            return -1;
        }
        try {
            return Long.parseLong(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e2) {
            a.b(e2);
            return -1;
        }
    }

    public static byte[] c(long j) {
        try {
            return String.valueOf(j).getBytes("utf-8");
        } catch (UnsupportedEncodingException e2) {
            a.b(e2);
            return null;
        }
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                stringBuffer.append(':');
            }
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                hexString = PushConstants.PUSH_TYPE_NOTIFY.concat(String.valueOf(hexString));
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    private static BufferedReader b(File file) {
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            return new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static boolean c(String str) {
        boolean z;
        if (str == null || str.trim().length() <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (str.length() > 255) {
            x.a("URL(%s)'s length is larger than 255.", str);
            return false;
        } else if (!str.toLowerCase().startsWith("http")) {
            x.a("URL(%s) is not start with \"http\".", str);
            return false;
        } else if (str.toLowerCase().contains("qq.com")) {
            return true;
        } else {
            x.a("URL(%s) does not contain \"qq.com\".", str);
            return false;
        }
    }

    public static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        a.a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            return a(instance.digest());
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    public static String a(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(j));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    public static Map<String, String> b(Parcel parcel) {
        Bundle readBundle = parcel.readBundle();
        HashMap hashMap = null;
        if (readBundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = readBundle.getStringArrayList("keys");
        ArrayList<String> stringArrayList2 = readBundle.getStringArrayList("values");
        if (stringArrayList == null || stringArrayList2 == null || stringArrayList.size() != stringArrayList2.size()) {
            x.e("map parcel error!", new Object[0]);
        } else {
            hashMap = new HashMap(stringArrayList.size());
            for (int i = 0; i < stringArrayList.size(); i++) {
                hashMap.put(stringArrayList.get(i), stringArrayList2.get(i));
            }
        }
        return hashMap;
    }

    public static void b(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.isFile() && file.exists() && file.canWrite()) {
                file.delete();
            }
        }
    }

    public static SharedPreferences a(String str, Context context) {
        if (context != null) {
            return c.a(context, str, 0);
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (com.tencent.bugly.crashreport.common.info.a.b() == null || com.tencent.bugly.crashreport.common.info.a.b().E == null) {
            return "";
        }
        return com.tencent.bugly.crashreport.common.info.a.b().E.getString(str, str2);
    }

    public static BufferedReader a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists()) {
                if (file.canRead()) {
                    return b(file);
                }
            }
            return null;
        } catch (NullPointerException e2) {
            x.a(e2);
            return null;
        }
    }

    public static <T> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            T createFromParcel = creator.createFromParcel(obtain);
            if (obtain != null) {
                obtain.recycle();
            }
            return createFromParcel;
        } catch (Throwable th) {
            if (obtain != null) {
                obtain.recycle();
            }
            throw th;
        }
    }

    public static void b(Parcel parcel, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            parcel.writeBundle(null);
            return;
        }
        int size = map.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(next.getKey());
            arrayList2.add(next.getValue());
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("keys", arrayList);
        bundle.putStringArrayList("values", arrayList2);
        parcel.writeBundle(bundle);
    }

    public static String a(Context context, String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        if (f79554a == null) {
            f79554a = new HashMap();
            ArrayList<String> a2 = a(context, new String[]{"/system/bin/sh", "-c", "getprop"});
            if (a2 != null && a2.size() > 0) {
                x.b(z.class, "Successfully get 'getprop' list.", new Object[0]);
                Pattern compile = Pattern.compile("\\[(.+)\\]: \\[(.*)\\]");
                for (String matcher : a2) {
                    Matcher matcher2 = compile.matcher(matcher);
                    if (matcher2.find()) {
                        f79554a.put(matcher2.group(1), matcher2.group(2));
                    }
                }
                x.b(z.class, "System properties number: %d.", Integer.valueOf(f79554a.size()));
            }
        }
        if (f79554a.containsKey(str)) {
            return f79554a.get(str);
        }
        return "fail";
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7 A[SYNTHETIC, Splitter:B:44:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe A[SYNTHETIC, Splitter:B:58:0x00fe] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r7, int r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "android.permission.READ_LOGS"
            boolean r7 = com.tencent.bugly.crashreport.common.info.AppInfo.a(r7, r0)
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L_0x0012
            java.lang.String r7 = "no read_log permission!"
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.x.d(r7, r8)
            return r0
        L_0x0012:
            r7 = 3
            r2 = 2
            r3 = 1
            r4 = 4
            if (r9 != 0) goto L_0x002b
            java.lang.String[] r9 = new java.lang.String[r4]
            java.lang.String r4 = "logcat"
            r9[r1] = r4
            java.lang.String r4 = "-d"
            r9[r3] = r4
            java.lang.String r3 = "-v"
            r9[r2] = r3
            java.lang.String r2 = "threadtime"
            r9[r7] = r2
            goto L_0x0046
        L_0x002b:
            r5 = 6
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "logcat"
            r5[r1] = r6
            java.lang.String r6 = "-d"
            r5[r3] = r6
            java.lang.String r3 = "-v"
            r5[r2] = r3
            java.lang.String r2 = "threadtime"
            r5[r7] = r2
            java.lang.String r7 = "-s"
            r5[r4] = r7
            r7 = 5
            r5[r7] = r9
            r9 = r5
        L_0x0046:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Process r9 = r2.exec(r9)     // Catch:{ Throwable -> 0x00b3 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            java.io.InputStream r3 = r9.getInputStream()     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
        L_0x0061:
            java.lang.String r2 = r0.readLine()     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            if (r2 == 0) goto L_0x0080
            r7.append(r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            java.lang.String r2 = "\n"
            r7.append(r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            if (r8 <= 0) goto L_0x0061
            int r2 = r7.length()     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            if (r2 <= r8) goto L_0x0061
            int r2 = r7.length()     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            int r2 = r2 - r8
            r7.delete(r1, r2)     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            goto L_0x0061
        L_0x0080:
            java.lang.String r8 = r7.toString()     // Catch:{ Throwable -> 0x00ad, all -> 0x00ab }
            if (r9 == 0) goto L_0x00aa
            java.io.OutputStream r7 = r9.getOutputStream()     // Catch:{ IOException -> 0x008e }
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0092
        L_0x008e:
            r7 = move-exception
            com.google.a.a.a.a.a.a.b(r7)
        L_0x0092:
            java.io.InputStream r7 = r9.getInputStream()     // Catch:{ IOException -> 0x009a }
            r7.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r7 = move-exception
            com.google.a.a.a.a.a.a.b(r7)
        L_0x009e:
            java.io.InputStream r7 = r9.getErrorStream()     // Catch:{ IOException -> 0x00a6 }
            r7.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r7 = move-exception
            com.google.a.a.a.a.a.a.b(r7)
        L_0x00aa:
            return r8
        L_0x00ab:
            r7 = move-exception
            goto L_0x00fc
        L_0x00ad:
            r8 = move-exception
            r0 = r9
            goto L_0x00b4
        L_0x00b0:
            r7 = move-exception
            r9 = r0
            goto L_0x00fc
        L_0x00b3:
            r8 = move-exception
        L_0x00b4:
            com.tencent.bugly.proguard.x.a(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "\n[error:"
            r9.<init>(r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b0 }
            r9.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = "]"
            r9.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00b0 }
            r7.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00fb
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ IOException -> 0x00df }
            r8.close()     // Catch:{ IOException -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x00e3:
            java.io.InputStream r8 = r0.getInputStream()     // Catch:{ IOException -> 0x00eb }
            r8.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x00ef:
            java.io.InputStream r8 = r0.getErrorStream()     // Catch:{ IOException -> 0x00f7 }
            r8.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x00fb:
            return r7
        L_0x00fc:
            if (r9 == 0) goto L_0x0122
            java.io.OutputStream r8 = r9.getOutputStream()     // Catch:{ IOException -> 0x0106 }
            r8.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x010a:
            java.io.InputStream r8 = r9.getInputStream()     // Catch:{ IOException -> 0x0112 }
            r8.close()     // Catch:{ IOException -> 0x0112 }
            goto L_0x0116
        L_0x0112:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x0116:
            java.io.InputStream r8 = r9.getErrorStream()     // Catch:{ IOException -> 0x011e }
            r8.close()     // Catch:{ IOException -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r8 = move-exception
            com.google.a.a.a.a.a.a.b(r8)
        L_0x0122:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.z.a(android.content.Context, int, java.lang.String):java.lang.String");
    }

    public static Object a(String str, String str2, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
