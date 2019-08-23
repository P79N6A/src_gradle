package com.bytedance.android.livesdk.feed.tab.b;

import com.bytedance.android.live.core.network.response.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class n implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14434a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f14435b = new n();

    private n() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f14434a, false, 8945, new Class[]{Object.class}, Object.class)) {
            return ((c) obj).f7867b;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f14434a, false, 8945, new Class[]{Object.class}, Object.class);
    }
}
