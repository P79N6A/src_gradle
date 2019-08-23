package com.bytedance.android.live.core.rxutils.autodispose.a.a;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BooleanSupplier;

public final /* synthetic */ class b implements BooleanSupplier {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8008a;

    /* renamed from: b  reason: collision with root package name */
    static final BooleanSupplier f8009b = new b();

    private b() {
    }

    public final boolean getAsBoolean() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f8008a, false, 824, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8008a, false, 824, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        return z;
    }
}
