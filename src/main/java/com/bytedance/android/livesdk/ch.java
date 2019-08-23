package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ch implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9690a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9691b;

    ch(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9691b = startLiveFragmentDefault;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9690a, false, 2957, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9690a, false, 2957, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(this.f9691b.f8846c, (Throwable) obj);
    }
}
