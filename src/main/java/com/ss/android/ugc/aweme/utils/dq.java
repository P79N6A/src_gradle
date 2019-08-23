package com.ss.android.ugc.aweme.utils;

import android.app.KeyguardManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;

public final class dq {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75761a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75761a, true, 88531, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75761a, true, 88531, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) d.a().getSystemService("keyguard");
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
