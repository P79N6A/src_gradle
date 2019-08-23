package com.ss.android.ugc.aweme.framework.e;

import android.content.Context;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48484a;

    public static int a(Context context, float f2) {
        if (PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f48484a, true, 45938, new Class[]{Context.class, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f48484a, true, 45938, new Class[]{Context.class, Float.TYPE}, Integer.TYPE)).intValue();
        }
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }
}
