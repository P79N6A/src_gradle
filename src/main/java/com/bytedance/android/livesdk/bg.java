package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.g.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9138a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9139b;

    bg(StartLiveFragmentD startLiveFragmentD) {
        this.f9139b = startLiveFragmentD;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9138a, false, 2855, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9138a, false, 2855, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9139b.a((d) obj);
    }
}
