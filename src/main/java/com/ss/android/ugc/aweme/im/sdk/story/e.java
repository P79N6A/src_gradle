package com.ss.android.ugc.aweme.im.sdk.story;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52442a;

    public static Activity a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f52442a, true, 53300, new Class[]{Context.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{context}, null, f52442a, true, 53300, new Class[]{Context.class}, Activity.class);
        }
        for (Context context2 = context; context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }
}
