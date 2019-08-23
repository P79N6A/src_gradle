package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class gl implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10752a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10753b;

    gl(int i) {
        this.f10753b = i;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10752a, false, 4995, new Class[]{Object.class}, Object.class)) {
            return Long.valueOf(((long) this.f10753b) - ((Long) obj).longValue());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f10752a, false, 4995, new Class[]{Object.class}, Object.class);
    }
}
