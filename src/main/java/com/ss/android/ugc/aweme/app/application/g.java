package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.b.c;

public final /* synthetic */ class g implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33942a;

    /* renamed from: b  reason: collision with root package name */
    private final IShortVideoConfig f33943b;

    g(IShortVideoConfig iShortVideoConfig) {
        this.f33943b = iShortVideoConfig;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f33942a, false, 23217, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33942a, false, 23217, new Class[0], String.class);
        }
        IShortVideoConfig iShortVideoConfig = this.f33943b;
        return iShortVideoConfig.musicDir() + "cache/";
    }
}
