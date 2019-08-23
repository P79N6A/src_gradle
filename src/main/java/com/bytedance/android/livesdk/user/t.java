package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17507a;

    /* renamed from: b  reason: collision with root package name */
    private final l f17508b;

    t(l lVar) {
        this.f17508b = lVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17507a, false, 13578, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17507a, false, 13578, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l lVar = this.f17508b;
        User user = (User) obj;
        lVar.f17469e.onNext(user);
        lVar.a((i) user);
    }
}
