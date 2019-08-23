package com.bytedance.android.livesdk.rank.viewbinder;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17081a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f17082b = new f();

    private f() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17081a, false, 13104, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17081a, false, 13104, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.c(RankItemViewBinder.class.getSimpleName(), ((Throwable) obj).getMessage());
    }
}
