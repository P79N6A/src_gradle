package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bi implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10429a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractDialogSettingContract.View f10430b;

    bi(InteractDialogSettingContract.View view) {
        this.f10430b = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10429a, false, 4711, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10429a, false, 4711, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10430b.a((Throwable) obj);
    }
}
