package com.ss.android.ugc.aweme.miniapp.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class a implements com.ss.android.ugc.aweme.miniapp_api.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3582a;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f3582a, false, 59412, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3582a, false, 59412, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().cd() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
