package com.bytedance.android.livesdk.widget;

import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ad implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18419a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18420b;

    ad(aa aaVar) {
        this.f18420b = aaVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18419a, false, 14691, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18419a, false, 14691, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(this.f18420b.j.getActivity(), (Throwable) obj);
    }
}
