package com.ss.android.ugc.aweme.setting.api;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63844a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63845b;

    b(boolean z) {
        this.f63845b = z;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f63844a, false, 72138, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63844a, false, 72138, new Class[]{i.class}, Object.class);
        }
        AbTestManager.a().a(((Boolean) iVar.e()).booleanValue(), this.f63845b);
        return null;
    }
}
