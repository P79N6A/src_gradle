package com.ss.android.ugc.aweme.utils;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class dd {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75734a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f75734a, true, 88489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75734a, true, 88489, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("must be called on async thread");
        }
    }
}
