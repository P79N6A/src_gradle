package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.setting.o;

public final /* synthetic */ class bv implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75642a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75643b;

    bv(String str) {
        this.f75643b = str;
    }

    public final void a(AwemeSettings awemeSettings) {
        if (PatchProxy.isSupport(new Object[]{awemeSettings}, this, f75642a, false, 88339, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings}, this, f75642a, false, 88339, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        bs.c(this.f75643b);
    }
}
