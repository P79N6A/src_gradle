package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import android.support.design.widget.Snackbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dx implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75784a;

    /* renamed from: b  reason: collision with root package name */
    private final Snackbar f75785b;

    dx(Snackbar snackbar) {
        this.f75785b = snackbar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f75784a, false, 88554, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f75784a, false, 88554, new Class[]{i.class}, Object.class);
        }
        this.f75785b.show();
        return null;
    }
}
