package com.ss.android.ugc.aweme.main;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54861a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54862b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f54863c;

    p(MainActivity mainActivity, Intent intent) {
        this.f54862b = mainActivity;
        this.f54863c = intent;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54861a, false, 57206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54861a, false, 57206, new Class[0], Void.TYPE);
            return;
        }
        this.f54862b.lambda$enterRecordFrom3rdPlatform$8$MainActivity(this.f54863c);
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f54861a, false, 57207, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f54861a, false, 57207, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
