package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66580a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66581b;

    e(VideoEditView videoEditView) {
        this.f66581b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66580a, false, 75962, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66580a, false, 75962, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66581b.k();
    }
}
