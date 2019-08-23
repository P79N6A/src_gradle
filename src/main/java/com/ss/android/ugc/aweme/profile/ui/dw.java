package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dw implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62709a;

    /* renamed from: b  reason: collision with root package name */
    private final UpdateAvatarDialog f62710b;

    dw(UpdateAvatarDialog updateAvatarDialog) {
        this.f62710b = updateAvatarDialog;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f62709a, false, 69064, new Class[]{i.class}, Object.class)) {
            return this.f62710b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f62709a, false, 69064, new Class[]{i.class}, Object.class);
    }
}
