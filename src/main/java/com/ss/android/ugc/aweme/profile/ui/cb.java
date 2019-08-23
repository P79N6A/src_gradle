package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cb implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62567a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverPreviewActivity f62568b;

    cb(ProfileCoverPreviewActivity profileCoverPreviewActivity) {
        this.f62568b = profileCoverPreviewActivity;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f62567a, false, 68653, new Class[]{i.class}, Object.class)) {
            return this.f62568b.a();
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f62567a, false, 68653, new Class[]{i.class}, Object.class);
    }
}
