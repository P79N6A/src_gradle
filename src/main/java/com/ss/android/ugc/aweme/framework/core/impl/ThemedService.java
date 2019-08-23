package com.ss.android.ugc.aweme.framework.core.impl;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;
import com.ss.android.ugc.aweme.framework.services.IThemedService;

public class ThemedService implements IThemedService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ProgressDialog getThemedProgressDialog(Context context) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 45901, new Class[]{Context.class}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 45901, new Class[]{Context.class}, ProgressDialog.class);
        }
        boolean z = a.f2414a;
        if (Build.VERSION.SDK_INT < 11) {
            return new ProgressDialog(context2);
        }
        if (z) {
            i = 2;
        } else {
            i = 3;
        }
        return new ProgressDialog(context2, i);
    }
}
