package com.amap.api.services.a;

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
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class bi {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f6628a;

        /* renamed from: b  reason: collision with root package name */
        String f6629b;

        /* renamed from: c  reason: collision with root package name */
        String f6630c;

        /* renamed from: d  reason: collision with root package name */
        String f6631d;

        /* renamed from: e  reason: collision with root package name */
        String f6632e;

        /* renamed from: f  reason: collision with root package name */
        String f6633f;
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

    public static String a() {
        String str;
        Throwable th;
        try {
            str = String.valueOf(System.currentTimeMillis());
            String str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            try {
                if (!bf.a()) {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                int length = str.length();
                return str.substring(0, length - 2) + str2 + str.substring(length - 1);
            } catch (Throwable th2) {
                th = th2;
                bx.a(th, "CI", "TS");
                return str;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str = null;
            th = th4;
            bx.a(th, "CI", "TS");
            return str;
        }
    }

    public static String a(Context context) {
        try {
            return a(context, b(context, false));
        } catch (Throwable th) {
            bx.a(th, "CI", "gCX");
            return null;
        }
    }

    public static byte[] a(Context context, byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        return bk.a(bArr);
    }

    private static String a(Context context, a aVar) {
        return bk.b(b(context, aVar));
    }

    public static byte[] b(Context context, byte[] bArr) throws CertificateException, InvalidKeySpecException, NoSuchAlgorithmException, NullPointerException, IOException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        PublicKey c2 = bo.c();
        if (bArr.length <= 117) {
            return bk.a(bArr, (Key) c2);
        }
        byte[] bArr2 = new byte[117];
        System.arraycopy(bArr, 0, bArr2, 0, 117);
        byte[] a2 = bk.a(bArr2, (Key) c2);
        byte[] bArr3 = new byte[((bArr.length + SearchJediMixFeedAdapter.f42517f) - 117)];
        System.arraycopy(a2, 0, bArr3, 0, SearchJediMixFeedAdapter.f42517f);
        System.arraycopy(bArr, 117, bArr3, SearchJediMixFeedAdapter.f42517f, bArr.length - 117);
        return bArr3;
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte b2;
        if (!TextUtils.isEmpty(str)) {
            if (str.getBytes().length > 255) {
                b2 = -1;
            } else {
                b2 = (byte) str.getBytes().length;
            }
            bo.a(byteArrayOutputStream, b2, bo.a(str));
            return;
        }
        bo.a(byteArrayOutputStream, (byte) 0, new byte[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b A[SYNTHETIC, Splitter:B:18:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2 A[SYNTHETIC, Splitter:B:24:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(android.content.Context r3, com.amap.api.services.a.bi.a r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            r1.<init>()     // Catch:{ Throwable -> 0x0090, all -> 0x008d }
            java.lang.String r2 = r4.f6628a     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f6629b     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f6630c     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f6631d     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f6632e     // Catch:{ Throwable -> 0x008b }
            a((java.io.ByteArrayOutputStream) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008b }
            java.lang.String r2 = r4.f6633f     // Catch:{ Throwable -> 0x008b }
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
            java.lang.String r4 = "CI"
            java.lang.String r2 = "gzx"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r3, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ all -> 0x009f }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bi.b(android.content.Context, com.amap.api.services.a.bi$a):byte[]");
    }

    private static byte[] a(Context context, ByteArrayOutputStream byteArrayOutputStream) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return b(context, bo.b(byteArrayOutputStream.toByteArray()));
    }

    @Deprecated
    private static a b(Context context, boolean z) {
        a aVar = new a();
        aVar.f6628a = bj.t(context);
        aVar.f6629b = bj.l(context);
        String h = bj.h(context);
        if (h == null) {
            h = "";
        }
        aVar.f6630c = h;
        aVar.f6631d = bf.c(context);
        aVar.f6632e = Build.MODEL;
        aVar.f6633f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = bf.b(context);
        aVar.i = bf.d(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = bj.u(context);
        aVar.l = bj.s(context);
        aVar.m = bj.p(context);
        aVar.n = bj.o(context);
        aVar.o = bj.v(context);
        aVar.p = bj.n(context);
        if (z) {
            aVar.q = "";
        } else {
            aVar.q = bj.k(context);
        }
        if (z) {
            aVar.r = "";
        } else {
            aVar.r = bj.j(context);
        }
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] m = bj.m(context);
            aVar.s = m[0];
            aVar.t = m[1];
        }
        aVar.w = bj.a();
        String b2 = bj.b(context);
        if (!TextUtils.isEmpty(b2)) {
            aVar.x = b2;
        } else {
            aVar.x = "";
        }
        aVar.y = new String(bv.a(11)) + bj.i(context) + "|" + new String(bv.a(12)) + bj.c();
        String a2 = bj.a(context);
        if (TextUtils.isEmpty(a2)) {
            aVar.y += "|adiuExtras=" + a2;
        }
        return aVar;
    }

    @Deprecated
    public static byte[] a(Context context, boolean z) {
        try {
            return b(context, b(context, z));
        } catch (Throwable th) {
            bx.a(th, "CI", "gz");
            return null;
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            String e2 = bf.e(context);
            return bl.b(e2 + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            bx.a(th, "CI", "Sco");
            return null;
        }
    }
}
