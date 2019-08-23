package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66610a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66611b;

    y(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66611b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66610a, false, 75464, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66610a, false, 75464, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66611b.a();
    }
}
