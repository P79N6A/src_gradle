package com.ss.android.ugc.aweme.base.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34999a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioControlView.a f35000b;

    b(AudioControlView.a aVar) {
        this.f35000b = aVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f34999a, false, 24950, new Class[0], Object.class)) {
            return this.f35000b.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f34999a, false, 24950, new Class[0], Object.class);
    }
}
