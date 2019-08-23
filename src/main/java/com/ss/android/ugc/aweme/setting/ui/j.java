package com.ss.android.ugc.aweme.setting.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64432a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64433b;

    j(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64433b = douYinSettingNewVersionActivity;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64432a, false, 72508, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64432a, false, 72508, new Class[0], Object.class);
        }
        d.f64421b.a(this.f64433b);
        return null;
    }
}
