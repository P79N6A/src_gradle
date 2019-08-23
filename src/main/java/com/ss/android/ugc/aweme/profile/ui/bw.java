package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bw implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62553a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverCropActivity f62554b;

    bw(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f62554b = profileCoverCropActivity;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f62553a, false, 68619, new Class[]{i.class}, Object.class)) {
            return this.f62554b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f62553a, false, 68619, new Class[]{i.class}, Object.class);
    }
}
