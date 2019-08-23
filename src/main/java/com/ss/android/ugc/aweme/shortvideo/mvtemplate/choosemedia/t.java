package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class t implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68632a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter f68633b;

    t(MvImageChooseAdapter mvImageChooseAdapter) {
        this.f68633b = mvImageChooseAdapter;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f68632a, false, 78017, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return this.f68633b.a((String) obj, (Long) obj2, (Integer) obj3);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f68632a, false, 78017, new Class[]{Object.class, Object.class, Object.class}, Object.class);
    }
}
