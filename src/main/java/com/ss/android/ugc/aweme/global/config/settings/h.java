package com.ss.android.ugc.aweme.global.config.settings;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49556a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49557b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f49558c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49559d;

    /* renamed from: e  reason: collision with root package name */
    private final IESSettings f49560e;

    h(String str, Throwable th, String str2, IESSettings iESSettings) {
        this.f49557b = str;
        this.f49558c = th;
        this.f49559d = str2;
        this.f49560e = iESSettings;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49556a, false, 47592, new Class[0], Object.class)) {
            return SettingsUtil.a(this.f49557b, this.f49558c, this.f49559d, this.f49560e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49556a, false, 47592, new Class[0], Object.class);
    }
}
