package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import com.bytedance.android.live.core.utils.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8222a;

    public final boolean a(Context context) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{context}, this, f8222a, false, 1412, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8222a, false, 1412, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }
}
