package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66588a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66589b;

    i(VideoEditView videoEditView) {
        this.f66589b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66588a, false, 75966, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66588a, false, 75966, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66589b.i();
    }
}
