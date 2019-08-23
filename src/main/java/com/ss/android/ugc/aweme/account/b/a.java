package com.ss.android.ugc.aweme.account.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31686a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f31686a, true, 19834, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f31686a, true, 19834, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User k = w.k();
        if (k == null || !TextUtils.isEmpty(k.getBindPhone())) {
            return false;
        }
        return true;
    }
}
