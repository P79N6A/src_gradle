package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66584a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoEditView f66585b;

    g(VideoEditView videoEditView) {
        this.f66585b = videoEditView;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66584a, false, 75964, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66584a, false, 75964, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66585b.a((Pair) obj);
    }
}
