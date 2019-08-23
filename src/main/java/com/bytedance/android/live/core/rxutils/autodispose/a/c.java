package com.bytedance.android.live.core.rxutils.autodispose.a;

import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;

public final class c implements ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8015a;

    /* renamed from: b  reason: collision with root package name */
    private final View f8016b;

    public final CompletableSource c() {
        if (!PatchProxy.isSupport(new Object[0], this, f8015a, false, 822, new Class[0], CompletableSource.class)) {
            return new b(this.f8016b);
        }
        return (CompletableSource) PatchProxy.accessDispatch(new Object[0], this, f8015a, false, 822, new Class[0], CompletableSource.class);
    }

    public c(View view) {
        this.f8016b = view;
    }
}
