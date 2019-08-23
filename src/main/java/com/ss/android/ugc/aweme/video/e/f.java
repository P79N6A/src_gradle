package com.ss.android.ugc.aweme.video.e;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.am.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76060a;

    public static String a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f76060a, true, 89334, new Class[]{Context.class}, String.class)) {
            return b(context);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f76060a, true, 89334, new Class[]{Context.class}, String.class);
    }

    private static String b(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f76060a, true, 89337, new Class[]{Context.class}, String.class)) {
            return a.a(context);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f76060a, true, 89337, new Class[]{Context.class}, String.class);
    }
}
