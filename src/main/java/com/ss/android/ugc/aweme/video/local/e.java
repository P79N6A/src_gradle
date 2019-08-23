package com.ss.android.ugc.aweme.video.local;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76164a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76165b;

    /* renamed from: c  reason: collision with root package name */
    private final String f76166c;

    e(String str, String str2) {
        this.f76165b = str;
        this.f76166c = str2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f76164a, false, 89159, new Class[0], Object.class)) {
            return LocalVideoPlayerManager.a(this.f76165b, this.f76166c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76164a, false, 89159, new Class[0], Object.class);
    }
}
