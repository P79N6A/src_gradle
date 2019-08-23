package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.event.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class av implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11250a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11251b;

    av(au auVar) {
        this.f11251b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11250a, false, 5265, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11250a, false, 5265, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11251b.onEvent((ab) obj);
    }
}
