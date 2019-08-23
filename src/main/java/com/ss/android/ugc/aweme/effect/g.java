package com.ss.android.ugc.aweme.effect;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43744a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f43745b = new g();

    private g() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f43744a, false, 38560, new Class[]{Object.class}, Object.class)) {
            return ((EffectPointModel) obj).getKey();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f43744a, false, 38560, new Class[]{Object.class}, Object.class);
    }
}
