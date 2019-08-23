package com.ss.android.ugc.aweme.shortvideo.cut;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66505a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66506b;

    p(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66506b = cutMultiVideoActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f66505a, false, 75455, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f66505a, false, 75455, new Class[]{i.class}, Object.class);
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66506b;
        if (!cutMultiVideoActivity.H && cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.pause();
            cutMultiVideoActivity.w.stop();
            cutMultiVideoActivity.w.release();
            cutMultiVideoActivity.w = null;
            cutMultiVideoActivity.H = true;
        }
        return null;
    }
}
