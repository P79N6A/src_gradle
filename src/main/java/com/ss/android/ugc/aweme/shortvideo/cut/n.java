package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final /* synthetic */ class n implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66501a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66502b;

    n(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66502b = cutMultiVideoActivity;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66501a, false, 75453, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66501a, false, 75453, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66502b;
        cutMultiVideoActivity.e();
        cutMultiVideoActivity.finish();
    }
}
