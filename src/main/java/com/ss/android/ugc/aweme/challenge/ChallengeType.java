package com.ss.android.ugc.aweme.challenge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class ChallengeType {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35311a;

    public @interface TYPE {
    }

    @TYPE
    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f35311a, true, 25772, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f35311a, true, 25772, new Class[0], Integer.TYPE)).intValue();
        }
        if (!c.a()) {
            AbTestManager.a();
        }
        return 1;
    }
}
