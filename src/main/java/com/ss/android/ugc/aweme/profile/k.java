package com.ss.android.ugc.aweme.profile;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61551a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f61551a, true, 67236, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f61551a, true, 67236, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            return AbTestManager.a().i();
        }
        if (!a.b() && AbTestManager.a().i()) {
            z = true;
        }
        return z;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f61551a, true, 67237, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f61551a, true, 67237, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!a.a() || !((Boolean) SharePrefCache.inst().getIsEuropeCountry().c()).booleanValue()) {
            return false;
        }
        return true;
    }
}
