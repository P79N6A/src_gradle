package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66582a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66583b;

    f(VideoEditView videoEditView) {
        this.f66583b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66582a, false, 75963, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66582a, false, 75963, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66583b.a((h) obj);
    }
}
