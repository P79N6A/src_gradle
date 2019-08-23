package com.ss.android.ugc.aweme.openauthorize.c;

import android.content.Context;
import com.bytedance.sdk.account.bdplatform.impl.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58370a;

    public static a a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f58370a, true, 63397, new Class[]{Context.class}, a.class)) {
            return new c(context2, c.a(context));
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f58370a, true, 63397, new Class[]{Context.class}, a.class);
    }
}
