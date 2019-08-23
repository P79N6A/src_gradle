package com.ss.android.ugc.aweme.effect;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43746a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f43747b = new h();

    private h() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f43746a, false, 38561, new Class[]{Object.class}, Object.class)) {
            return ((EffectPointModel) obj).getName();
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f43746a, false, 38561, new Class[]{Object.class}, Object.class);
    }
}
