package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9832a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9833b;

    p(Handler handler) {
        this.f9833b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9832a, false, 4018, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9832a, false, 4018, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9833b;
        b bVar = (b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
