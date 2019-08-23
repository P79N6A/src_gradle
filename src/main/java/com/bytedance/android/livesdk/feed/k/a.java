package com.bytedance.android.livesdk.feed.k;

import com.bytedance.android.live.base.model.user.l;
import com.bytedance.android.livesdk.feed.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Flowable;
import org.a.c;

public final class a implements com.bytedance.android.livesdk.feed.e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14216a;

    public final Flowable<l> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f14216a, false, 8959, new Class[0], Flowable.class)) {
            return new Flowable<l>() {
                public final void subscribeActual(c<? super l> cVar) {
                }
            };
        }
        return (Flowable) PatchProxy.accessDispatch(new Object[0], this, f14216a, false, 8959, new Class[0], Flowable.class);
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14216a, false, 8960, new Class[0], Boolean.TYPE)) {
            return b.c().l().a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14216a, false, 8960, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
