package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;
import java.util.List;

public final /* synthetic */ class r implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7822a;

    /* renamed from: b  reason: collision with root package name */
    static final BiFunction f7823b = new r();

    private r() {
    }

    public final Object apply(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f7822a, false, 184, new Class[]{Object.class, Object.class}, Object.class)) {
            return (List) obj2;
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f7822a, false, 184, new Class[]{Object.class, Object.class}, Object.class);
    }
}
