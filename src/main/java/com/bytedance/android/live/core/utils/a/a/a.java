package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import com.bytedance.android.live.core.utils.a.c;
import com.bytedance.android.live.core.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8218a;

    public final boolean a(Context context) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, f8218a, false, 1407, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8218a, false, 1407, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (ah.a("persist.sys.notchui.enable", 0) != 1) {
            z = false;
        }
        return z;
    }
}
