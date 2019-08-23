package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;

public final /* synthetic */ class f implements ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8045a;

    /* renamed from: b  reason: collision with root package name */
    public static final ae f8046b = new f();

    private f() {
    }

    public final CompletableSource c() {
        Object complete;
        if (PatchProxy.isSupport(new Object[0], this, f8045a, false, 677, new Class[0], CompletableSource.class)) {
            complete = PatchProxy.accessDispatch(new Object[0], this, f8045a, false, 677, new Class[0], CompletableSource.class);
        } else {
            complete = Completable.complete();
        }
        return (CompletableSource) complete;
    }
}
