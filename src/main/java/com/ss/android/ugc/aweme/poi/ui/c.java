package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60542a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsPoiAwemeFeedFragment f60543b;

    c(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f60543b = absPoiAwemeFeedFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60542a, false, 65901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60542a, false, 65901, new Class[0], Void.TYPE);
            return;
        }
        this.f60543b.J();
    }
}
