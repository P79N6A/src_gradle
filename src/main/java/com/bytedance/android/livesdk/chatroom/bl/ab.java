package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ab implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9764a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9765b;

    public ab(Handler handler) {
        this.f9765b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9764a, false, 4031, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9764a, false, 4031, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9765b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(32));
        }
    }
}
