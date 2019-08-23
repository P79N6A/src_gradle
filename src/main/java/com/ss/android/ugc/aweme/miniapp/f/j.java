package com.ss.android.ugc.aweme.miniapp.f;

import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp_api.a.g;

public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3588a;

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f3588a, false, 59450, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3588a, false, 59450, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (com.ss.android.ugc.aweme.global.config.settings.g.b().bO().intValue() == 1) {
                return true;
            }
            return false;
        } catch (a unused) {
            return false;
        }
    }
}
