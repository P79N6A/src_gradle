package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class w implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17513a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f17514b = new w();

    private w() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f17513a, false, 13581, new Class[]{Object.class}, Object.class)) {
            return (i) ((d) obj).f7871b;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f17513a, false, 13581, new Class[]{Object.class}, Object.class);
    }
}
