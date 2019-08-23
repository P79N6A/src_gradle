package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public final class o extends c<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9605a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f9606b;

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9605a, false, 3684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9605a, false, 3684, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9606b != null) {
            this.f9606b.dispose();
        }
    }

    public final void a(@NonNull Object obj, @NonNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{obj, fVar2}, this, f9605a, false, 3683, new Class[]{Object.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, fVar2}, this, f9605a, false, 3683, new Class[]{Object.class, f.class}, Void.TYPE);
            return;
        }
        if (d.a(fVar2.f20640a) == null) {
            d();
        }
        TTLiveSDKContext.getHostService().k().a(fVar2.f20640a, i.a().a(ac.a((int) C0906R.string.deu)).a()).subscribe((Observer<? super T>) new Observer<com.bytedance.android.live.base.model.user.i>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9607a;

            public final void onComplete() {
            }

            public final void onSubscribe(Disposable disposable) {
                o.this.f9606b = disposable;
            }

            public final void onError(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f9607a, false, 3686, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f9607a, false, 3686, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                o.this.b(th2);
            }

            public final /* synthetic */ void onNext(Object obj) {
                com.bytedance.android.live.base.model.user.i iVar = (com.bytedance.android.live.base.model.user.i) obj;
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f9607a, false, 3685, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar}, this, f9607a, false, 3685, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE);
                    return;
                }
                o.this.c();
            }
        });
    }
}
