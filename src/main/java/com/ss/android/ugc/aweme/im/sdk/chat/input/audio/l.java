package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.c;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50411a;

    public static boolean a(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, null, f50411a, true, 50738, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f50411a, true, 50738, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        PackageManager packageManager = context.getPackageManager();
        if (PatchProxy.isSupport(new Object[]{context}, null, c.f52580a, true, 53328, new Class[]{Context.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{context}, null, c.f52580a, true, 53328, new Class[]{Context.class}, String.class);
        } else {
            str = context.getApplicationInfo().processName;
        }
        if (packageManager.checkPermission("android.permission.RECORD_AUDIO", str) == 0) {
            return true;
        }
        return false;
    }
}
