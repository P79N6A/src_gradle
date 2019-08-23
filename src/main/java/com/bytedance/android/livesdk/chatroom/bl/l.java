package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9822a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9823b;

    public l(Handler handler) {
        this.f9823b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9822a, false, 4014, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9822a, false, 4014, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9823b;
        d dVar = (d) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(18);
            obtainMessage.obj = dVar.f7871b;
            handler.sendMessage(obtainMessage);
        }
    }
}
