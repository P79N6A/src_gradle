package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32133a;

    /* renamed from: b  reason: collision with root package name */
    private final AuthorizeActivity f32134b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32135c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f32136d;

    e(AuthorizeActivity authorizeActivity, int i, Intent intent) {
        this.f32134b = authorizeActivity;
        this.f32135c = i;
        this.f32136d = intent;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f32133a, false, 20139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32133a, false, 20139, new Class[0], Void.TYPE);
            return;
        }
        AuthorizeActivity authorizeActivity = this.f32134b;
        authorizeActivity.setResult(this.f32135c, this.f32136d);
        authorizeActivity.finish();
    }
}
