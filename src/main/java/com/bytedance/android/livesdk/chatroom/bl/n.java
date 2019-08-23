package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9826a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9827b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9828c;

    n(Handler handler, int i) {
        this.f9827b = handler;
        this.f9828c = i;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9826a, false, 4016, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9826a, false, 4016, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9827b;
        int i = this.f9828c;
        b bVar = (b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
