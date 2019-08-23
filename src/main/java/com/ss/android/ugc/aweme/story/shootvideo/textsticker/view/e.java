package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74365a;

    /* renamed from: b  reason: collision with root package name */
    private final d f74366b;

    /* renamed from: c  reason: collision with root package name */
    private final View f74367c;

    e(d dVar, View view) {
        this.f74366b = dVar;
        this.f74367c = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f74365a, false, 86335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74365a, false, 86335, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f74366b;
        dVar.smoothScrollTo(this.f74367c.getLeft() - (dVar.getWidth() / 2), 0);
    }
}
