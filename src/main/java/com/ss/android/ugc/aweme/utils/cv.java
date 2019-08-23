package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class cv {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75700a;

    public static byte[] a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75700a, true, 88433, new Class[]{String.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f75700a, true, 88433, new Class[]{String.class}, byte[].class);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }
}
