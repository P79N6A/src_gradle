package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final /* synthetic */ class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66471a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66472b;

    m(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66472b = cutMultiVideoActivity;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66471a, false, 75452, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66471a, false, 75452, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66472b;
        cutMultiVideoActivity.u.a(cutMultiVideoActivity.v.c().get(cutMultiVideoActivity.t));
        ak.a();
    }
}
