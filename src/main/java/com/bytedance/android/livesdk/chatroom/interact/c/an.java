package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class an implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10384a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractDialogPKSettingContract.View f10385b;

    an(InteractDialogPKSettingContract.View view) {
        this.f10385b = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10384a, false, 4684, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10384a, false, 4684, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10385b.a((Throwable) obj);
    }
}
