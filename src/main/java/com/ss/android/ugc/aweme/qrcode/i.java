package com.ss.android.ugc.aweme.qrcode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63488a;

    /* renamed from: b  reason: collision with root package name */
    private final File f63489b;

    i(File file) {
        this.f63489b = file;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f63488a, false, 70399, new Class[0], Object.class)) {
            return g.a(this.f63489b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f63488a, false, 70399, new Class[0], Object.class);
    }
}
