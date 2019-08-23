package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.bd;

public final /* synthetic */ class h implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3713a;

    /* renamed from: b  reason: collision with root package name */
    public static final ServiceProvider f3714b = new h();

    private h() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f3713a, false, 54510, new Class[0], Object.class)) {
            return new bd();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f3713a, false, 54510, new Class[0], Object.class);
    }
}
