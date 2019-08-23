package com.bytedance.android.live.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7690a;

    public static int a(int i, Object obj) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj}, null, f7690a, true, 15, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj}, null, f7690a, true, 15, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)).intValue();
        }
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return (i * 37) + i2;
    }
}
