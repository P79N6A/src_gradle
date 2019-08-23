package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ag implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17937a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f17938b;

    ag(ae aeVar) {
        this.f17938b = aeVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17937a, false, 14126, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17937a, false, 14126, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17938b.b((d) obj);
    }
}
