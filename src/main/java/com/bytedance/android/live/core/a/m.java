package com.bytedance.android.live.core.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;
import java.util.List;

public final /* synthetic */ class m implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7816a;

    /* renamed from: b  reason: collision with root package name */
    static final BiFunction f7817b = new m();

    private m() {
    }

    public final Object apply(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f7816a, false, 181, new Class[]{Object.class, Object.class}, Object.class)) {
            return (List) obj2;
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f7816a, false, 181, new Class[]{Object.class, Object.class}, Object.class);
    }
}
