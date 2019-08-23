package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

public class cs {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f5882a;

        /* renamed from: b  reason: collision with root package name */
        String f5883b;

        /* renamed from: c  reason: collision with root package name */
        String f5884c;

        /* renamed from: d  reason: collision with root package name */
        String f5885d;

        /* renamed from: e  reason: collision with root package name */
        String f5886e;

        /* renamed from: f  reason: collision with root package name */
        String f5887f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;
        String o;
        String p;
        String q;
        String r;
        String s;
        String t;
        String u;
        String v;
        String w;
        String x;
        String y;

        private a() {
        }
    }

    public static byte[] a(Context context, byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        if (instance == null) {
            return null;
        }
        instance.init(256);
        byte[] encoded = instance.generateKey().getEncoded();
        PublicKey a2 = cz.a(context);
        if (a2 == null) {
            return null;
        }
        byte[] a3 = cu.a(encoded, (Key) a2);
        byte[] a4 = cu.a(encoded, bArr);
        byte[] bArr2 = new byte[(a3.length + a4.length)];
        System.arraycopy(a3, 0, bArr2, 0, a3.length);
        System.arraycopy(a4, 0, bArr2, a3.length, a4.length);
        return bArr2;
    }

    public static String a() {
        String str;
        Throwable th;
        try {
            str = String.valueOf(System.currentTimeMillis());
            String str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            try {
                if (!cp.a()) {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                int length = str.length();
                return str.substring(0, length - 2) + str2 + str.substring(length - 1);
            } catch (Throwable th2) {
                th = th2;
                dd.a(th, "CInfo", "getTS");
                return str;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str = null;
            th = th4;
            dd.a(th, "CInfo", "getTS");
            return str;
        }
    }

    public static String a(Context context) {
        try {
            a aVar = new a();
            aVar.f5885d = cp.c(context);
            aVar.i = cp.d(context);
            return a(context, aVar);
        } catch (Throwable th) {
            dd.a(th, "CInfo", "InitXInfo");
            return null;
        }
    }

    public static String e(Context context, byte[] bArr) {
        try {
            return d(context, bArr);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(Context context, a aVar) {
        return cu.a(b(context, aVar));
    }

    public static String b(Context context, byte[] bArr) {
        try {
            return d(context, bArr);
        } catch (Throwable th) {
            dd.a(th, "CInfo", "AESData");
            return "";
        }
    }

    static String d(Context context, byte[] bArr) throws InvalidKeyException, IOException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, CertificateException {
        byte[] b2 = cz.b(a(context, bArr));
        if (b2 != null) {
            return cu.a(b2);
        }
        return "";
    }

    public static byte[] c(Context context, byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        PublicKey a2 = cz.a(context);
        if (bArr.length <= 117) {
            return cu.a(bArr, (Key) a2);
        }
        byte[] bArr2 = new byte[117];
        System.arraycopy(bArr, 0, bArr2, 0, 117);
        byte[] a3 = cu.a(bArr2, (Key) a2);
        byte[] bArr3 = new byte[((bArr.length + SearchJediMixFeedAdapter.f42517f) - 117)];
        System.arraycopy(a3, 0, bArr3, 0, SearchJediMixFeedAdapter.f42517f);
        System.arraycopy(bArr, 117, bArr3, SearchJediMixFeedAdapter.f42517f, bArr.length - 117);
        return bArr3;
    }

    private static a b(Context context, boolean z) {
        a aVar = new a();
        aVar.f5882a = ct.q(context);
        aVar.f5883b = ct.i(context);
        String f2 = ct.f(context);
        if (f2 == null) {
            f2 = "";
        }
        aVar.f5884c = f2;
        aVar.f5885d = cp.c(context);
        aVar.f5886e = Build.MODEL;
        aVar.f5887f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = cp.b(context);
        aVar.i = cp.d(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = ct.r(context);
        aVar.l = ct.p(context);
        aVar.m = ct.m(context);
        aVar.n = ct.l(context);
        aVar.o = ct.s(context);
        aVar.p = ct.k(context);
        if (z) {
            aVar.q = "";
        } else {
            aVar.q = ct.h(context);
        }
        if (z) {
            aVar.r = "";
        } else {
            aVar.r = ct.g(context);
        }
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] j = ct.j(context);
            aVar.s = j[0];
            aVar.t = j[1];
        }
        aVar.w = ct.a();
        return aVar;
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte b2;
        if (!TextUtils.isEmpty(str)) {
            if (str.getBytes().length > 255) {
                b2 = -1;
            } else {
                b2 = (byte) str.getBytes().length;
            }
            cz.a(byteArrayOutputStream, b2, cz.a(str));
            return;
        }
        cz.a(byteArrayOutputStream, (byte) 0, new byte[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b A[SYNTHETIC, Splitter:B:18:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2 A[SYNTHETIC, Splitter:B:24:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(android.content.Context r3, com.amap.api.mapcore2d.cs.a r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            r1.<init>()     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.lang.String r2 = r4.f5882a     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f5883b     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f5884c     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f5885d     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f5886e     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f5887f     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.g     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.h     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.i     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.j     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.k     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.l     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.m     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.n     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.o     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.p     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.q     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.r     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.s     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.t     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.u     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.v     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.w     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.x     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r4 = r4.y     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r4)     // Catch:{ Throwable -> 0x008b }
            byte[] r3 = a((android.content.Context) r3, (java.io.ByteArrayOutputStream) r1)     // Catch:{ Throwable -> 0x008b }
            r1.close()     // Catch:{ Throwable -> 0x008a }
        L_0x008a:
            return r3
        L_0x008b:
            r3 = move-exception
            goto L_0x0092
        L_0x008d:
            r3 = move-exception
            r1 = r0
            goto L_0x00a0
        L_0x0090:
            r3 = move-exception
            r1 = r0
        L_0x0092:
            java.lang.String r4 = "CInfo"
            java.lang.String r2 = "InitXInfo"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r3, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ Throwable -> 0x009e }
        L_0x009e:
            return r0
        L_0x009f:
            r3 = move-exception
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.close()     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a5:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cs.b(android.content.Context, com.amap.api.mapcore2d.cs$a):byte[]");
    }

    private static byte[] a(Context context, ByteArrayOutputStream byteArrayOutputStream) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return c(context, cz.b(byteArrayOutputStream.toByteArray()));
    }

    public static byte[] a(Context context, boolean z) {
        try {
            return b(context, b(context, z));
        } catch (Throwable th) {
            dd.a(th, "CInfo", "getGZipXInfo");
            return null;
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            String e2 = cp.e(context);
            return cv.b(e2 + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            dd.a(th, "CInfo", "Scode");
            return null;
        }
    }

    @Deprecated
    public static String a(Context context, cy cyVar, Map<String, String> map, boolean z) {
        try {
            return a(context, b(context, z));
        } catch (Throwable th) {
            dd.a(th, "CInfo", "rsaLocClineInfo");
            return null;
        }
    }
}
