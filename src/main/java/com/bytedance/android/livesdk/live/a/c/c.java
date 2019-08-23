package com.bytedance.android.livesdk.live.a.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15793a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15794b;

    c(b bVar) {
        this.f15794b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15793a, false, 10305, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15793a, false, 10305, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15794b.f15790b.c(0);
    }
}
