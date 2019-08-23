package com.ss.android.ugc.aweme.shortvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bg implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67110a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67111b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67112c;

    bg(VEVideoPublishEditActivity vEVideoPublishEditActivity, boolean z) {
        this.f67111b = vEVideoPublishEditActivity;
        this.f67112c = z;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f67110a, false, 76483, new Class[]{i.class}, Object.class)) {
            return this.f67111b.e(this.f67112c);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f67110a, false, 76483, new Class[]{i.class}, Object.class);
    }
}
