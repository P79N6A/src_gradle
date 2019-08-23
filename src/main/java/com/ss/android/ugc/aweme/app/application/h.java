package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.b.c;

public final /* synthetic */ class h implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33944a;

    /* renamed from: b  reason: collision with root package name */
    private final IShortVideoConfig f33945b;

    h(IShortVideoConfig iShortVideoConfig) {
        this.f33945b = iShortVideoConfig;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f33944a, false, 23218, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33944a, false, 23218, new Class[0], String.class);
        }
        IShortVideoConfig iShortVideoConfig = this.f33945b;
        return iShortVideoConfig.musicDir() + "download/";
    }
}
