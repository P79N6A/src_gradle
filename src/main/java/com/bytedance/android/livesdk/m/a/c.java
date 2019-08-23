package com.bytedance.android.livesdk.m.a;

import android.content.Context;
import android.support.v4.content.PermissionChecker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16325a;

    public final boolean a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, this, f16325a, false, 12649, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f16325a, false, 12649, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (PermissionChecker.checkSelfPermission(context, str) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
