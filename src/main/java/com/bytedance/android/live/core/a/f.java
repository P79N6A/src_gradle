package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;

public final /* synthetic */ class f implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7798a;

    /* renamed from: b  reason: collision with root package name */
    static final BiFunction f7799b = new f();

    private f() {
    }

    public final Object apply(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f7798a, false, 160, new Class[]{Object.class, Object.class}, Object.class)) {
            return Boolean.FALSE;
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f7798a, false, 160, new Class[]{Object.class, Object.class}, Object.class);
    }
}
