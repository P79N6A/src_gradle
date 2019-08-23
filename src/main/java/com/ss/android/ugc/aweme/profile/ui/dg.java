package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dg implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62637a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62638b;

    dg(ProfileMoreFragment profileMoreFragment) {
        this.f62638b = profileMoreFragment;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f62637a, false, 68874, new Class[]{i.class}, Object.class)) {
            return this.f62638b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f62637a, false, 68874, new Class[]{i.class}, Object.class);
    }
}
