package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.x.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9266a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9267b;

    bn(StartLiveFragmentD startLiveFragmentD) {
        this.f9267b = startLiveFragmentD;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9266a, false, 2862, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9266a, false, 2862, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9267b.a((a) obj);
    }
}
