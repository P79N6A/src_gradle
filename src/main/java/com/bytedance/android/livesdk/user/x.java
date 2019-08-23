package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class x implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17515a;

    /* renamed from: b  reason: collision with root package name */
    private final l f17516b;

    x(l lVar) {
        this.f17516b = lVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17515a, false, 13582, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17515a, false, 13582, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l lVar = this.f17516b;
        i iVar = (i) obj;
        lVar.f17469e.onNext(iVar);
        lVar.f17466b = iVar;
    }
}
