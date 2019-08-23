package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bs implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11956a;

    /* renamed from: b  reason: collision with root package name */
    private final bn f11957b;

    bs(bn bnVar) {
        this.f11957b = bnVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11956a, false, 5861, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11956a, false, 5861, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bn bnVar = this.f11957b;
        a.a(6, "LinkInRoomAudioWaitingDialog", ((Throwable) obj).getStackTrace());
        bnVar.f11945e = false;
    }
}
