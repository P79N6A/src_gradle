package com.bytedance.android.livesdk.widget.a;

import com.bytedance.android.livesdk.widget.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class c implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18394a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f18395b = new c();

    private c() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f18394a, false, 14819, new Class[]{Object.class}, Object.class)) {
            return ((a.b) obj).f18390a;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f18394a, false, 14819, new Class[]{Object.class}, Object.class);
    }
}
