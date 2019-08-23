package com.ss.android.ugc.aweme.photo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58727a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoModule f58728b;

    /* renamed from: c  reason: collision with root package name */
    private final String f58729c;

    s(PhotoModule photoModule, String str) {
        this.f58728b = photoModule;
        this.f58729c = str;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f58727a, false, 63598, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f58727a, false, 63598, new Class[0], Object.class);
        }
        PhotoModule photoModule = this.f58728b;
        String str = this.f58729c;
        photoModule.g.dismiss();
        photoModule.f3721e.a(str);
        return null;
    }
}
