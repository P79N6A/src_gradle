package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75479a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75480b;

    aa(String str) {
        this.f75480b = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f75479a, false, 88035, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f75479a, false, 88035, new Class[]{i.class}, Object.class);
        }
        if (iVar == null) {
            boolean z = y.f75972b;
        } else {
            iVar.d();
        }
        return null;
    }
}
