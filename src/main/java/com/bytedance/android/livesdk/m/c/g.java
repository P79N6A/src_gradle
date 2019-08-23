package com.bytedance.android.livesdk.m.c;

import android.os.Build;
import com.bytedance.android.livesdk.m.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16356b;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f16356b, false, 12666, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16356b, false, 12666, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.MODEL.toLowerCase().contains("nex")) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f16356b, false, 12667, new Class[0], Boolean.TYPE)) {
            return b.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16356b, false, 12667, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
