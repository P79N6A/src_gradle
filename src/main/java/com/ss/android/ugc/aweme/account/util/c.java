package com.ss.android.ugc.aweme.account.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33084a;

    public static boolean a(Context context) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context}, null, f33084a, true, 21296, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f33084a, true, 21296, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (context.getPackageManager().getPackageInfo("com.tencent.mm", 0) != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
