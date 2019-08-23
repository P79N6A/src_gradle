package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class m implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55305a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragment f55306b;

    m(VideoChooseFragment videoChooseFragment) {
        this.f55306b = videoChooseFragment;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f55305a, false, 58571, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f55306b.b((String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f55305a, false, 58571, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
