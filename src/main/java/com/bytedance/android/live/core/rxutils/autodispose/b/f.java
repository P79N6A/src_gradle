package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import java.util.Comparator;

public final /* synthetic */ class f implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8021a;

    /* renamed from: b  reason: collision with root package name */
    private final Comparator f8022b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f8023c;

    f(Comparator comparator, Object obj) {
        this.f8022b = comparator;
        this.f8023c = obj;
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f8021a, false, 830, new Class[]{Object.class}, Boolean.TYPE)) {
            return this.f8022b.compare(obj, this.f8023c) >= 0;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f8021a, false, 830, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
