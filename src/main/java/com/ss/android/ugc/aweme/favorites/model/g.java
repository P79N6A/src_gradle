package com.ss.android.ugc.aweme.favorites.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44308a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44309b;

    /* renamed from: c  reason: collision with root package name */
    private final int f44310c;

    g(int i, int i2) {
        this.f44309b = i;
        this.f44310c = i2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f44308a, false, 39515, new Class[0], Object.class)) {
            return UserFavoritesApi.c(this.f44309b, this.f44310c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f44308a, false, 39515, new Class[0], Object.class);
    }
}
