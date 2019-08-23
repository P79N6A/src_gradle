package com.ss.android.ugc.aweme.commercialize.im;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.im.a;

public final /* synthetic */ class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38907a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0506a f38908b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f38909c;

    c(a.C0506a aVar, ImageView imageView) {
        this.f38908b = aVar;
        this.f38909c = imageView;
    }

    public final void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f38907a, false, 30814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38907a, false, 30814, new Class[0], Void.TYPE);
            return;
        }
        a.C0506a aVar = this.f38908b;
        ImageView imageView = this.f38909c;
        imageView.post(new d(aVar, imageView));
    }
}
