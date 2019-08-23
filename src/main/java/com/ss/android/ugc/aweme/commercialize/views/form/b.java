package com.ss.android.ugc.aweme.commercialize.views.form;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40101a;

    /* renamed from: b  reason: collision with root package name */
    private final AdFormBrowserFragment f40102b;

    b(AdFormBrowserFragment adFormBrowserFragment) {
        this.f40102b = adFormBrowserFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f40101a, false, 33125, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f40101a, false, 33125, new Class[]{i.class}, Object.class);
        }
        AdFormBrowserFragment adFormBrowserFragment = this.f40102b;
        adFormBrowserFragment.al.setVisibility(0);
        adFormBrowserFragment.f();
        return null;
    }
}
