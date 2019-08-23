package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9836a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9837b;

    public r(Handler handler) {
        this.f9837b = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9836a, false, 4020, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9836a, false, 4020, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Handler handler = this.f9837b;
        b bVar = (b) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(31);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
