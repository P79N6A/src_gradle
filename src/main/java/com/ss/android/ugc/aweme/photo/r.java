package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58723a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoModule f58724b;

    /* renamed from: c  reason: collision with root package name */
    private final int f58725c;

    /* renamed from: d  reason: collision with root package name */
    private final String f58726d;

    r(PhotoModule photoModule, int i, String str) {
        this.f58724b = photoModule;
        this.f58725c = i;
        this.f58726d = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f58723a, false, 63597, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f58723a, false, 63597, new Class[0], Object.class);
        }
        PhotoModule photoModule = this.f58724b;
        int i = this.f58725c;
        String str = this.f58726d;
        if (i < 0) {
            photoModule.f3721e.a(null);
        } else {
            photoModule.f3721e.a(str);
        }
        return null;
    }
}
