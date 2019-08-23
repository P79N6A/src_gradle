package com.ss.android.ugc.aweme.profile;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61677a;

    public static boolean a(Context context) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context}, null, f61677a, true, 67352, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f61677a, true, 67352, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (context.getPackageManager().getPackageInfo("com.sina.weibo", 0) != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
