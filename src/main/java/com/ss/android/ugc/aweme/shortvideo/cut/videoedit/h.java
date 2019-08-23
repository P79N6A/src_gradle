package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66586a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66587b;

    h(VideoEditView videoEditView) {
        this.f66587b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66586a, false, 75965, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66586a, false, 75965, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66587b.j();
    }
}
