package com.bytedance.android.livesdk.widget;

import android.content.Context;
import com.bytedance.android.live.uikit.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18421a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18422b;

    ae(aa aaVar) {
        this.f18422b = aaVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f18421a, false, 14692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18421a, false, 14692, new Class[0], Void.TYPE);
            return;
        }
        a.a((Context) this.f18422b.j.getActivity(), (int) C0906R.string.dcc);
    }
}
