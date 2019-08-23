package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class gd implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10736a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10737b;

    gd(int i) {
        this.f10737b = i;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10736a, false, 4987, new Class[]{Object.class}, Object.class)) {
            return Long.valueOf(((long) this.f10737b) - ((Long) obj).longValue());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f10736a, false, 4987, new Class[]{Object.class}, Object.class);
    }
}
