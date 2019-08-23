package com.ss.android.ugc.aweme.story.friends.a;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73064a;

    public static boolean a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, f73064a, true, 84653, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f73064a, true, 84653, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.BRAND;
        if (str == null) {
            str = "";
        }
        if (str.toLowerCase().equals("oppo") || str.toLowerCase().equals("vivo")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 23) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }
}
