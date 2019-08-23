package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function4;
import java.util.List;

public final /* synthetic */ class q implements Function4 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7820a;

    /* renamed from: b  reason: collision with root package name */
    static final Function4 f7821b = new q();

    private q() {
    }

    public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2, obj3, obj4}, this, f7820a, false, 183, new Class[]{Object.class, Object.class, Object.class, Object.class}, Object.class)) {
            return (List) obj4;
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2, obj3, obj4}, this, f7820a, false, 183, new Class[]{Object.class, Object.class, Object.class, Object.class}, Object.class);
    }
}
