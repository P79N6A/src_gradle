package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66451a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66452b;

    d(Video2GifCutFragment video2GifCutFragment) {
        this.f66452b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66451a, false, 75823, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66451a, false, 75823, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66452b.a();
    }
}
