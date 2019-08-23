package com.bytedance.android.livesdk.bgbroadcast.game;

import com.bytedance.android.live.uikit.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9198a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9199b;

    b(a aVar) {
        this.f9199b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9198a, false, 3297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9198a, false, 3297, new Class[0], Void.TYPE);
            return;
        }
        a.a(this.f9199b.f9194c, (int) C0906R.string.d_e);
    }
}
