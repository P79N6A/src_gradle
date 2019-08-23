package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function3;

public final /* synthetic */ class h implements Function3 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7802a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7803b;

    h(long j) {
        this.f7803b = j;
    }

    public final Object apply(Object obj, Object obj2, Object obj3) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj, obj2, obj3}, this, f7802a, false, 162, new Class[]{Object.class, Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3}, this, f7802a, false, 162, new Class[]{Object.class, Object.class, Object.class}, Object.class);
        }
        Long l = (Long) obj3;
        if (System.currentTimeMillis() - l.longValue() <= this.f7803b && System.currentTimeMillis() >= l.longValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
