package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69461a;

    /* renamed from: b  reason: collision with root package name */
    private final String f69462b;

    b(String str) {
        this.f69462b = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f69461a, false, 78542, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f69461a, false, 78542, new Class[0], Object.class);
        }
        return a.I.a(this.f69462b);
    }
}
