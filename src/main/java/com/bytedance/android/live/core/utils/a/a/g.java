package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import com.bytedance.android.live.core.utils.a.c;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.utility.reflect.ReflectException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8225a;

    public final boolean a(Context context) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{context}, this, f8225a, false, 1414, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8225a, false, 1414, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            z = ((Boolean) Reflect.on("android.util.FtFeature").call("isFeatureSupport", new Class[]{Integer.class}, 32).get()).booleanValue();
        } catch (ReflectException unused) {
            z = false;
        }
        return z;
    }
}
