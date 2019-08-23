package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bk implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10433a;

    /* renamed from: b  reason: collision with root package name */
    private final InteractDialogSettingContract.View f10434b;

    bk(InteractDialogSettingContract.View view) {
        this.f10434b = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10433a, false, 4714, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10433a, false, 4714, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10434b.b((Throwable) obj);
    }
}
