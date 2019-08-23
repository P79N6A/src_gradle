package com.ss.android.ugc.aweme.commercialize;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38934a;

    /* renamed from: b  reason: collision with root package name */
    private final EasterEggFragment f38935b;

    j(EasterEggFragment easterEggFragment) {
        this.f38935b = easterEggFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f38934a, false, 30327, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f38934a, false, 30327, new Class[]{i.class}, Object.class);
        }
        EasterEggFragment easterEggFragment = this.f38935b;
        easterEggFragment.i();
        HashMap<String, String> g = easterEggFragment.g();
        g.put("disappear_method", "auto_disappear");
        g.put("duration", String.valueOf(System.currentTimeMillis() - easterEggFragment.ak));
        if (easterEggFragment.ai != null) {
            g.put("enter_from", easterEggFragment.ai.getEnterFrom());
            g.put("egg_ad_id", easterEggFragment.ai.getEasterEggInfo().getId());
        }
        r.a("egg_ad_disappear", (Map) g);
        return null;
    }
}
