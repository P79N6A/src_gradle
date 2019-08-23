package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ap implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10388a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractDialogPKSettingContract.View f10389b;

    ap(InteractDialogPKSettingContract.View view) {
        this.f10389b = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10388a, false, 4687, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10388a, false, 4687, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10389b.b((Throwable) obj);
    }
}
