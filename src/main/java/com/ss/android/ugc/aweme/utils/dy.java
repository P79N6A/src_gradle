package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import android.support.design.widget.Snackbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dy implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75786a;

    /* renamed from: b  reason: collision with root package name */
    private final Snackbar f75787b;

    dy(Snackbar snackbar) {
        this.f75787b = snackbar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f75786a, false, 88555, new Class[]{i.class}, Object.class)) {
            return dv.a(this.f75787b);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f75786a, false, 88555, new Class[]{i.class}, Object.class);
    }
}
