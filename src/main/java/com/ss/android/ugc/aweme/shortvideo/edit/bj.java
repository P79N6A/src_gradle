package com.ss.android.ugc.aweme.shortvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bj implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67117a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67118b;

    bj(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67118b = vEVideoPublishEditActivity;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f67117a, false, 76486, new Class[]{i.class}, Object.class)) {
            return this.f67118b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f67117a, false, 76486, new Class[]{i.class}, Object.class);
    }
}
