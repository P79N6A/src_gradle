package com.bytedance.android.live.excitingvideoad.c;

import android.content.Context;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8385a;

    public static float a(Context context, float f2) {
        if (PatchProxy.isSupport(new Object[]{context, Float.valueOf(f2)}, null, f8385a, true, 1643, new Class[]{Context.class, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{context, Float.valueOf(f2)}, null, f8385a, true, 1643, new Class[]{Context.class, Float.TYPE}, Float.TYPE)).floatValue();
        }
        return TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }
}
