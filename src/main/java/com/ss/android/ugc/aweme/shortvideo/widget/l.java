package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.ui.a;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71467a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71468b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f71469c;

    l(h hVar, Bitmap bitmap) {
        this.f71468b = hVar;
        this.f71469c = bitmap;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f71467a, false, 81473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71467a, false, 81473, new Class[0], Void.TYPE);
            return;
        }
        h hVar = this.f71468b;
        Bitmap bitmap = this.f71469c;
        if (hVar.f71452b != null) {
            hVar.f71452b.setImageDrawable(new a(bitmap));
        }
    }
}
