package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class x implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9849a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9850b;

    public x(Handler handler) {
        this.f9850b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9849a, false, 4027, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9849a, false, 4027, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9850b;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = dVar.f7871b;
            handler.sendMessage(obtainMessage);
        }
    }
}
