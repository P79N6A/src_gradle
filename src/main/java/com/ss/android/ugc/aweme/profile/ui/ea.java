package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ea implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62720a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateAvatarDialog f62721b;

    ea(UpdateAvatarDialog updateAvatarDialog) {
        this.f62721b = updateAvatarDialog;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f62720a, false, 69068, new Class[]{i.class}, Object.class)) {
            return this.f62721b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f62720a, false, 69068, new Class[]{i.class}, Object.class);
    }
}
