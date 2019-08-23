package com.ss.android.ugc.aweme.im.sdk.d;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51238a;

    /* renamed from: b  reason: collision with root package name */
    static final a.g f51239b = new g();

    private g() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f51238a, false, 51750, new Class[]{i.class}, Object.class)) {
            return e.a(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f51238a, false, 51750, new Class[]{i.class}, Object.class);
    }
}
