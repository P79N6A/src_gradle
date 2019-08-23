package com.bytedance.android.live.core.rxutils.autodispose.a.a;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BooleanSupplier;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8006a;

    /* renamed from: b  reason: collision with root package name */
    private static final BooleanSupplier f8007b = b.f8009b;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f8006a, true, 823, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8006a, true, 823, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.bytedance.android.live.core.rxutils.autodispose.a.a.a(f8007b);
    }
}
