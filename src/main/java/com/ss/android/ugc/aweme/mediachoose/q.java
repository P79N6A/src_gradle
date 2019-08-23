package com.ss.android.ugc.aweme.mediachoose;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55315a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragment f55316b;

    q(VideoChooseFragment videoChooseFragment) {
        this.f55316b = videoChooseFragment;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f55315a, false, 58575, new Class[]{i.class}, Object.class)) {
            return this.f55316b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f55315a, false, 58575, new Class[]{i.class}, Object.class);
    }
}
