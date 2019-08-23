package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.tools.am;

public final /* synthetic */ class q implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66507a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66508b;

    q(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66508b = cutMultiVideoActivity;
    }

    public final void a(am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, f66507a, false, 75456, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, f66507a, false, 75456, new Class[]{am.class}, Void.TYPE);
            return;
        }
        this.f66508b.u.a(amVar.value());
    }
}
