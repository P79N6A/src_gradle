package com.ss.android.ugc.aweme.account.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity;
import com.ss.android.ugc.aweme.app.k;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33090a;

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33090a, true, 21313, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f33090a, true, 21313, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!d.a().getCurUser().isUserCancelled()) {
            return false;
        } else {
            RecoverAccountActivity.a(k.a(), str2);
            return true;
        }
    }
}
