package com.ss.android.ugc.aweme.share.invitefriends.response;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65166a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f65167b;

    e(Runnable runnable) {
        this.f65167b = runnable;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65166a, false, 73593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65166a, false, 73593, new Class[0], Void.TYPE);
            return;
        }
        this.f65167b.run();
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f65166a, false, 73594, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f65166a, false, 73594, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
