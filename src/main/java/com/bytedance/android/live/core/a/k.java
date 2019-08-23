package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class k implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7812a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f7813b = new k();

    private k() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f7812a, false, 179, new Class[]{Object.class}, Object.class)) {
            return Integer.valueOf(obj.hashCode());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f7812a, false, 179, new Class[]{Object.class}, Object.class);
    }
}
