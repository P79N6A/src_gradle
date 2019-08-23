package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66447a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66448b;

    b(Video2GifCutFragment video2GifCutFragment) {
        this.f66448b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66447a, false, 75821, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66447a, false, 75821, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f66448b.a((Boolean) obj);
    }
}
