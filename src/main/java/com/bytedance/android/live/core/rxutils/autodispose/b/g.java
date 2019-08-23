package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class g implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8024a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8025b;

    g(Object obj) {
        this.f8025b = obj;
    }

    public final boolean test(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f8024a, false, 831, new Class[]{Object.class}, Boolean.TYPE)) {
            return obj2.equals(this.f8025b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f8024a, false, 831, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
