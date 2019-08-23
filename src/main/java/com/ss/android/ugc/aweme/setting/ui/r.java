package com.ss.android.ugc.aweme.setting.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.c;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64447a;

    /* renamed from: b  reason: collision with root package name */
    private final SettingNewVersionActivity f64448b;

    r(SettingNewVersionActivity settingNewVersionActivity) {
        this.f64448b = settingNewVersionActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64447a, false, 72681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64447a, false, 72681, new Class[0], Void.TYPE);
            return;
        }
        SettingNewVersionActivity settingNewVersionActivity = this.f64448b;
        if (settingNewVersionActivity.f3868e == null) {
            settingNewVersionActivity.f3868e = new c(settingNewVersionActivity);
        }
        settingNewVersionActivity.f3868e.show();
    }
}
