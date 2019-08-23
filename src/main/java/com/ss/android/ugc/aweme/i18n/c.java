package com.ss.android.ugc.aweme.i18n;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.core.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29725a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f29725a, true, 49947, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f29725a, true, 49947, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = a.b().f3305c;
        if (TextUtils.equals(str, "tiktok") || TextUtils.equals(str, "musically")) {
            return true;
        }
        return false;
    }
}
