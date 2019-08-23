package com.bytedance.android.livesdk.chatroom.end;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10109a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10110b = new h();

    private h() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10109a, false, 4253, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10109a, false, 4253, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
