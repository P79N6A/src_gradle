package com.ss.android.ugc.aweme.commercialize.im;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.im.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38910a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0506a f38911b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f38912c;

    d(a.C0506a aVar, ImageView imageView) {
        this.f38911b = aVar;
        this.f38912c = imageView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38910a, false, 30815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38910a, false, 30815, new Class[0], Void.TYPE);
            return;
        }
        this.f38912c.setActivated(this.f38911b.f38886c.c());
    }
}
