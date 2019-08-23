package com.ss.android.ugc.aweme.base.sharedpref;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.apt.sharedpref.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34881a;

    public static <T> T a(Context context, Class<T> cls) {
        if (!PatchProxy.isSupport(new Object[]{context, cls}, null, f34881a, true, 24868, new Class[]{Context.class, Class.class}, Object.class)) {
            return b.a(context, cls);
        }
        return PatchProxy.accessDispatch(new Object[]{context, cls}, null, f34881a, true, 24868, new Class[]{Context.class, Class.class}, Object.class);
    }
}
