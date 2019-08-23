package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66449a;

    /* renamed from: b  reason: collision with root package name */
    private final Video2GifCutFragment f66450b;

    c(Video2GifCutFragment video2GifCutFragment) {
        this.f66450b = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66449a, false, 75822, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66449a, false, 75822, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Video2GifCutFragment video2GifCutFragment = this.f66450b;
        Long l = (Long) obj;
        if (l != null) {
            video2GifCutFragment.f66409c.f3566c.a(l.longValue());
        }
    }
}
