package com.bytedance.android.livesdk.widget;

import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18432a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18433b;

    aj(aa aaVar) {
        this.f18433b = aaVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18432a, false, 14697, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18432a, false, 14697, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(this.f18433b.j.getActivity(), (Throwable) obj);
    }
}
