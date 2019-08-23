package com.ss.android.ugc.aweme.global.config.settings;

import com.bytedance.ies.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;

public final /* synthetic */ class j implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49565a;

    /* renamed from: b  reason: collision with root package name */
    private final IESSettings f49566b;

    j(IESSettings iESSettings) {
        this.f49566b = iESSettings;
    }

    public final Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f49565a, false, 47596, new Class[0], Object.class)) {
            return this.f49566b;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49565a, false, 47596, new Class[0], Object.class);
    }
}
