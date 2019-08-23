package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.g;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38864a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38865b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38866c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38867d;

    w(CommerceVideoDelegate commerceVideoDelegate, boolean z, boolean z2) {
        this.f38865b = commerceVideoDelegate;
        this.f38866c = z;
        this.f38867d = z2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38864a, false, 30702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38864a, false, 30702, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38865b;
        boolean z = this.f38866c;
        boolean z2 = this.f38867d;
        commerceVideoDelegate.feedAdLayout.setVisibility(8);
        if (z) {
            if (!o.v()) {
                o.b().f();
            } else {
                g a2 = commerceVideoDelegate.a(commerceVideoDelegate.h);
                if (a2 != null) {
                    a2.S();
                }
            }
            if (commerceVideoDelegate.o != null && z2) {
                commerceVideoDelegate.o.a(2, commerceVideoDelegate.f38687d + 1);
            }
            commerceVideoDelegate.r = false;
        }
    }
}
