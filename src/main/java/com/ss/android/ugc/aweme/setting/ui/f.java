package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.a.a;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.utils.cm;

public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64424a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64425b;

    f(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64425b = douYinSettingNewVersionActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64424a, false, 72504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64424a, false, 72504, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.a.a(g.b().bE(), cm.a(), (Context) this.f64425b);
    }
}
