package com.ss.android.message;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30026a;

    @SuppressLint({"UseValueOf"})
    public static byte[] a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f30026a, true, 17942, new Class[]{Integer.TYPE}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f30026a, true, 17942, new Class[]{Integer.TYPE}, byte[].class);
        }
        byte[] bArr = new byte[4];
        int i2 = i;
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3] = Integer.valueOf(i2).byteValue();
            i2 >>= 8;
        }
        return bArr;
    }
}
