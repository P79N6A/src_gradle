package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class s implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17505a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f17506b = new s();

    private s() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f17505a, false, 13577, new Class[]{Object.class}, Object.class)) {
            return (User) ((d) obj).f7871b;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f17505a, false, 13577, new Class[]{Object.class}, Object.class);
    }
}
