package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ac implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75484a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75485b;

    ac(String str) {
        this.f75485b = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f75484a, false, 88037, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f75484a, false, 88037, new Class[]{i.class}, Object.class);
        }
        if (iVar == null) {
            boolean z = y.f75972b;
        } else {
            iVar.d();
        }
        return null;
    }
}
