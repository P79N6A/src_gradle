package com.bytedance.android.live.core.rxutils.rxlifecycle.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8117a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8118b;

    b(Object obj) {
        this.f8118b = obj;
    }

    public final boolean test(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f8117a, false, 860, new Class[]{Object.class}, Boolean.TYPE)) {
            return obj2.equals(this.f8118b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f8117a, false, 860, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
