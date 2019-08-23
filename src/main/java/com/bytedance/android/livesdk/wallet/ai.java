package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ai implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17941a;

    /* renamed from: b  reason: collision with root package name */
    private final ae f17942b;

    ai(ae aeVar) {
        this.f17942b = aeVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17941a, false, 14128, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17941a, false, 14128, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17942b.a((d) obj);
    }
}
