package com.bytedance.android.livesdk.chatroom.interact.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10275a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10276b = new e();

    private e() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10275a, false, 4612, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10275a, false, 4612, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
