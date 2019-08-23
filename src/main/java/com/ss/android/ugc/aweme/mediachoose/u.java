package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class u implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55326a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoChooseFragmentB f55327b;

    u(VideoChooseFragmentB videoChooseFragmentB) {
        this.f55327b = videoChooseFragmentB;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f55326a, false, 58602, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f55327b.a((String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f55326a, false, 58602, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
