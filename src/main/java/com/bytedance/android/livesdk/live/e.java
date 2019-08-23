package com.bytedance.android.livesdk.live;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.live.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Action;

public final /* synthetic */ class e implements Action {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15849a;

    /* renamed from: b  reason: collision with root package name */
    private final d f15850b;

    e(d dVar) {
        this.f15850b = dVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15849a, false, 10269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15849a, false, 10269, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f15850b;
        if (dVar.b() != null) {
            ((d.a) dVar.b()).a(true, ac.a((int) C0906R.string.d0m));
        }
    }
}
