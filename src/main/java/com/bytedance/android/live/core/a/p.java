package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class p implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7818a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f7819b = new p();

    private p() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f7818a, false, 182, new Class[]{Object.class}, Object.class)) {
            return Integer.valueOf(((String) obj).hashCode());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f7818a, false, 182, new Class[]{Object.class}, Object.class);
    }
}
