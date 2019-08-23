package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class y implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10822a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10823b;

    y(int i) {
        this.f10823b = i;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10822a, false, 4660, new Class[]{Object.class}, Object.class)) {
            return Long.valueOf(((long) this.f10823b) - ((Long) obj).longValue());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f10822a, false, 4660, new Class[]{Object.class}, Object.class);
    }
}
