package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;

public final /* synthetic */ class h implements ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8049a;

    /* renamed from: b  reason: collision with root package name */
    static final ae f8050b = new h();

    private h() {
    }

    public final CompletableSource c() {
        Object complete;
        if (PatchProxy.isSupport(new Object[0], this, f8049a, false, 679, new Class[0], CompletableSource.class)) {
            complete = PatchProxy.accessDispatch(new Object[0], this, f8049a, false, 679, new Class[0], CompletableSource.class);
        } else {
            complete = Completable.complete();
        }
        return (CompletableSource) complete;
    }
}
