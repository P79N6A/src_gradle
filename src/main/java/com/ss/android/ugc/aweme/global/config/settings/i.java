package com.ss.android.ugc.aweme.global.config.settings;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49561a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49562b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f49563c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49564d;

    i(String str, Throwable th, String str2) {
        this.f49562b = str;
        this.f49563c = th;
        this.f49564d = str2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49561a, false, 47593, new Class[0], Object.class)) {
            return SettingsUtil.a(this.f49562b, this.f49563c, this.f49564d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49561a, false, 47593, new Class[0], Object.class);
    }
}
