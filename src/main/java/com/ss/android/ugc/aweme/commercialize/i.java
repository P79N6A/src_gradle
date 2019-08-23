package com.ss.android.ugc.aweme.commercialize;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38877a;

    /* renamed from: b  reason: collision with root package name */
    private final EasterEggFragment f38878b;

    i(EasterEggFragment easterEggFragment) {
        this.f38878b = easterEggFragment;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f38877a, false, 30326, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f38877a, false, 30326, new Class[]{a.i.class}, Object.class);
        }
        EasterEggFragment easterEggFragment = this.f38878b;
        if (!easterEggFragment.aj) {
            easterEggFragment.c("overtime");
            easterEggFragment.i();
        }
        return null;
    }
}
