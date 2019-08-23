package com.bytedance.android.livesdk.bgbroadcast.game;

import com.bytedance.android.live.uikit.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9204a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9205b;

    e(a aVar) {
        this.f9205b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9204a, false, 3300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9204a, false, 3300, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f9205b;
        a.a(aVar.f9194c, aVar.f9194c.getString(C0906R.string.d_d));
    }
}
