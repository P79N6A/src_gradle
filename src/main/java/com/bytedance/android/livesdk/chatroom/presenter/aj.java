package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.model.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class aj implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11219a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f11220b = new aj();

    private aj() {
    }

    public final Object apply(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f11219a, false, 5235, new Class[]{Object.class}, Object.class)) {
            return ((m.a) obj).f11140a;
        }
        return PatchProxy.accessDispatch(new Object[]{obj}, this, f11219a, false, 5235, new Class[]{Object.class}, Object.class);
    }
}
