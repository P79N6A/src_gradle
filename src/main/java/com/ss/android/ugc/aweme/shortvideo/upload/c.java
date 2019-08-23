package com.ss.android.ugc.aweme.shortvideo.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.ad;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71011a;

    /* renamed from: b  reason: collision with root package name */
    private final ad f71012b;

    c(ad adVar) {
        this.f71012b = adVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f71011a, false, 80770, new Class[0], Object.class)) {
            return this.f71012b.q.k();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f71011a, false, 80770, new Class[0], Object.class);
    }
}
