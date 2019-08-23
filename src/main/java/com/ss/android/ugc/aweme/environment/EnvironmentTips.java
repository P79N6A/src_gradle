package com.ss.android.ugc.aweme.environment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class EnvironmentTips {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void alertDialog(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 39037, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 39037, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (1 == i2) {
            DialogWarningTipsActivity.a(1);
        } else {
            if (2 == i2) {
                DialogWarningTipsActivity.a(2);
            }
        }
    }
}
