package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;

public final /* synthetic */ class i implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7804a;

    /* renamed from: b  reason: collision with root package name */
    static final BiFunction f7805b = new i();

    private i() {
    }

    public final Object apply(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f7804a, false, 163, new Class[]{Object.class, Object.class}, Object.class)) {
            return obj2;
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f7804a, false, 163, new Class[]{Object.class, Object.class}, Object.class);
    }
}
