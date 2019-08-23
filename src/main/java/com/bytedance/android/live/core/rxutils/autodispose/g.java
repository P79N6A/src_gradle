package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;

public final /* synthetic */ class g implements ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8047a;

    /* renamed from: b  reason: collision with root package name */
    static final ae f8048b = new g();

    private g() {
    }

    public final CompletableSource c() {
        Object complete;
        if (PatchProxy.isSupport(new Object[0], this, f8047a, false, 678, new Class[0], CompletableSource.class)) {
            complete = PatchProxy.accessDispatch(new Object[0], this, f8047a, false, 678, new Class[0], CompletableSource.class);
        } else {
            complete = Completable.complete();
        }
        return (CompletableSource) complete;
    }
}
