package com.ss.android.ugc.aweme.favorites.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44360a;

    /* renamed from: b  reason: collision with root package name */
    private final UserFavoritesFragment f44361b;

    b(UserFavoritesFragment userFavoritesFragment) {
        this.f44361b = userFavoritesFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44360a, false, 39668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44360a, false, 39668, new Class[0], Void.TYPE);
            return;
        }
        this.f44361b.a();
    }
}
