package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.annotations.Nullable;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8071a;

    static <T> T a(@Nullable T t, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{t, str2}, null, f8071a, true, 747, new Class[]{Object.class, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{t, str2}, null, f8071a, true, 747, new Class[]{Object.class, String.class}, Object.class);
        } else if (t != null) {
            return t;
        } else {
            throw new NullPointerException(str2);
        }
    }
}
