package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;

public final /* synthetic */ class i implements ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8051a;

    /* renamed from: b  reason: collision with root package name */
    static final ae f8052b = new i();

    private i() {
    }

    public final CompletableSource c() {
        Object complete;
        if (PatchProxy.isSupport(new Object[0], this, f8051a, false, 680, new Class[0], CompletableSource.class)) {
            complete = PatchProxy.accessDispatch(new Object[0], this, f8051a, false, 680, new Class[0], CompletableSource.class);
        } else {
            complete = Completable.complete();
        }
        return (CompletableSource) complete;
    }
}
