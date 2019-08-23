package com.bytedance.android.live.core.rxutils.autodispose.a;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8004a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private static volatile BooleanSupplier f8005b;

    public static boolean a(BooleanSupplier booleanSupplier) {
        if (PatchProxy.isSupport(new Object[]{booleanSupplier}, null, f8004a, true, 816, new Class[]{BooleanSupplier.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{booleanSupplier}, null, f8004a, true, 816, new Class[]{BooleanSupplier.class}, Boolean.TYPE)).booleanValue();
        } else if (booleanSupplier != null) {
            BooleanSupplier booleanSupplier2 = f8005b;
            if (booleanSupplier2 != null) {
                return booleanSupplier2.getAsBoolean();
            }
            try {
                return booleanSupplier.getAsBoolean();
            } catch (Exception e2) {
                throw Exceptions.propagate(e2);
            }
        } else {
            throw new NullPointerException("defaultChecker == null");
        }
    }
}
