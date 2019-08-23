package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class g implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7800a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f7801b = new g();

    private g() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f7800a, false, 161, new Class[]{Object.class}, Object.class)) {
            return Integer.valueOf(obj.hashCode());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f7800a, false, 161, new Class[]{Object.class}, Object.class);
    }
}
