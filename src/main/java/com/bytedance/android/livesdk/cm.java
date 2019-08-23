package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13574a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13575b;

    cm(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f13575b = startLiveFragmentDefault;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13574a, false, 2962, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13574a, false, 2962, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(this.f13575b.f8846c, (Throwable) obj);
    }
}
