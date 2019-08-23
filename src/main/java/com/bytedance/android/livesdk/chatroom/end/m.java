package com.bytedance.android.livesdk.chatroom.end;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10122a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10123b = new m();

    private m() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10122a, false, 4280, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10122a, false, 4280, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
