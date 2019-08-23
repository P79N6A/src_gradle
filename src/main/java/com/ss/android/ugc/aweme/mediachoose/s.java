package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class s implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55320a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragmentB f55321b;

    s(VideoChooseFragmentB videoChooseFragmentB) {
        this.f55321b = videoChooseFragmentB;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f55320a, false, 58600, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f55321b.b((String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f55320a, false, 58600, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
