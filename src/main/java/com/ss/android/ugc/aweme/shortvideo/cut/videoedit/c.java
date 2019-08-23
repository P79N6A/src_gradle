package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66576a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66577b;

    c(VideoEditView videoEditView) {
        this.f66577b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66576a, false, 75960, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66576a, false, 75960, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66577b.a((Long) obj);
    }
}
