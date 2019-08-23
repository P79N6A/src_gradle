package com.ss.android.ugc.aweme.shortvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bh implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67113a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67114b;

    bh(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67114b = vEVideoPublishEditActivity;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f67113a, false, 76484, new Class[]{i.class}, Object.class)) {
            return this.f67114b.b(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f67113a, false, 76484, new Class[]{i.class}, Object.class);
    }
}
