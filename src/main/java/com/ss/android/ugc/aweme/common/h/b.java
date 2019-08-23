package com.ss.android.ugc.aweme.common.h;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40223a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f40223a, true, 33521, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f40223a, true, 33521, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") || TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") || Build.DEVICE.contains("generic_")) {
            return false;
        }
        return true;
    }
}
