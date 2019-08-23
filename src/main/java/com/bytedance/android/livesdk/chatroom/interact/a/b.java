package com.bytedance.android.livesdk.chatroom.interact.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class b implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10268a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10269b;

    b(a aVar) {
        this.f10269b = aVar;
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f10268a, false, 4609, new Class[]{Object.class}, Object.class)) {
            return Long.valueOf(((long) this.f10269b.f10265c) - ((Long) obj).longValue());
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f10268a, false, 4609, new Class[]{Object.class}, Object.class);
    }
}
