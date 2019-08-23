package com.ss.android.ugc.aweme.shortvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bk implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67119a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67120b;

    bk(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67120b = vEVideoPublishEditActivity;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f67119a, false, 76487, new Class[]{i.class}, Object.class)) {
            return this.f67120b.W();
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f67119a, false, 76487, new Class[]{i.class}, Object.class);
    }
}
