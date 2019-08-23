package com.ss.android.ugc.aweme.crossplatform.activity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40685a;

    /* renamed from: b  reason: collision with root package name */
    private final CrossPlatformActivity f40686b;

    a(CrossPlatformActivity crossPlatformActivity) {
        this.f40686b = crossPlatformActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40685a, false, 34114, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40685a, false, 34114, new Class[0], Void.TYPE);
            return;
        }
        this.f40686b.finish();
    }
}
