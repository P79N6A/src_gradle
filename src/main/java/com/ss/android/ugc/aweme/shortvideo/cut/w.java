package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66606a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66607b;

    w(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66607b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66606a, false, 75462, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66606a, false, 75462, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66607b;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            if (cutMultiVideoActivity.w != null && !cutMultiVideoActivity.w.isPlaying() && !cutMultiVideoActivity.o) {
                cutMultiVideoActivity.w.resume();
            }
        } else if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.pause();
        }
    }
}
