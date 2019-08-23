package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9675a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9676b;

    ca(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9676b = startLiveFragmentDefault;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9675a, false, 2950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9675a, false, 2950, new Class[0], Void.TYPE);
            return;
        }
        this.f9676b.a(a.valueOf((String) b.B.a()));
        j.q().e().a(true);
    }
}
