package com.toutiao.proxyserver.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80068a;

    /* renamed from: b  reason: collision with root package name */
    private static final MessageDigest f80069b = a();

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f80070c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private a() {
    }

    private static MessageDigest a() {
        if (PatchProxy.isSupport(new Object[0], null, f80068a, true, 91859, new Class[0], MessageDigest.class)) {
            return (MessageDigest) PatchProxy.accessDispatch(new Object[0], null, f80068a, true, 91859, new Class[0], MessageDigest.class);
        }
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] digest;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f80068a, true, 91860, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f80068a, true, 91860, new Class[]{String.class}, String.class);
        }
        MessageDigest messageDigest = f80069b;
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = str2.getBytes(c.f80073b);
        synchronized (a.class) {
            digest = messageDigest.digest(bytes);
        }
        if (PatchProxy.isSupport(new Object[]{digest}, null, f80068a, true, 91861, new Class[]{byte[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{digest}, null, f80068a, true, 91861, new Class[]{byte[].class}, String.class);
        } else if (digest == null || digest.length == 0) {
            return null;
        } else {
            char[] cArr = new char[(digest.length << 1)];
            int i = 0;
            for (byte b2 : digest) {
                int i2 = i + 1;
                cArr[i] = f80070c[(b2 & 240) >> 4];
                i = i2 + 1;
                cArr[i2] = f80070c[b2 & 15];
            }
            return new String(cArr);
        }
    }
}
