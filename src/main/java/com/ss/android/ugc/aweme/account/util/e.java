package com.ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.w;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33087a;

    @NonNull
    public static Context a(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f33087a, true, 21305, new Class[]{Context.class}, Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[]{context}, null, f33087a, true, 21305, new Class[]{Context.class}, Context.class);
        } else if (context == null) {
            return w.b();
        } else {
            return context;
        }
    }
}
