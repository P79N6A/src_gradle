package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class aw implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11252a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11253b;

    aw(int i) {
        this.f11253b = i;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f11252a, false, 5266, new Class[]{Object.class}, Object.class)) {
            return Integer.valueOf((int) (((long) this.f11253b) - ((Long) obj).longValue()));
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f11252a, false, 5266, new Class[]{Object.class}, Object.class);
    }
}
