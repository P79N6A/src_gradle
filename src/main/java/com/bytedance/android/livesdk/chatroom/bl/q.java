package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9834a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9835b;

    q(Handler handler) {
        this.f9835b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9834a, false, 4019, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9834a, false, 4019, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9835b;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }
}
