package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10796a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractDialogButtonContract.View f10797b;

    m(InteractDialogButtonContract.View view) {
        this.f10797b = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10796a, false, 4641, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10796a, false, 4641, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10797b.a((Throwable) obj);
    }
}