package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class u implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17509a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f17510b = new u();

    private u() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f17509a, false, 13579, new Class[]{Object.class}, Object.class)) {
            return (User) ((d) obj).f7871b;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f17509a, false, 13579, new Class[]{Object.class}, Object.class);
    }
}
