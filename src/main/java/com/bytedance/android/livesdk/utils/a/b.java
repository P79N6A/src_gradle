package com.bytedance.android.livesdk.utils.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class b implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17544a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f17545b = new b();

    private b() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17544a, false, 13794, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f17544a, false, 13794, new Class[]{Object.class}, Object.class);
        } else if (a.f17541b == null || a.f17541b.f17542c == null) {
            return Boolean.FALSE;
        } else {
            return Boolean.valueOf(a.f17541b.f17542c.a());
        }
    }
}
