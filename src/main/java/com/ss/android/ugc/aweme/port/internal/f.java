package com.ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.az;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61165a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61166b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f61167c;

    public f(Activity activity, Aweme aweme) {
        this.f61166b = activity;
        this.f61167c = aweme;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61165a, false, 67180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61165a, false, 67180, new Class[0], Void.TYPE);
            return;
        }
        Activity activity = this.f61166b;
        Aweme aweme = this.f61167c;
        az azVar = new az();
        azVar.f46540f = activity;
        azVar.a(aweme);
        azVar.b();
    }
}
